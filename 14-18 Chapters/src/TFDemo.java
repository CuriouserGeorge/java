import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class TFDemo implements ActionListener {

    JTextField jtf;
    JButton jbtnRev;
    JLabel jlabPrompt, jlabContents;

    TFDemo(){

        //create jframe
        JFrame jfrm = new JFrame("Use a text field");

        //specify flow layout
        jfrm.setLayout(new FlowLayout());

        //give initial size
        jfrm.setSize(240,120);

        //terminate the program when user closes
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //create a text field
        jtf = new JTextField(10);

        //set action commands for text field
        jtf.setActionCommand("myTF");

        //create reverse button.
        JButton jbtnRev = new JButton("reverse");

        //add action listeners
        jtf.addActionListener(this);
        jbtnRev.addActionListener(this);

        //create the labels
        jlabPrompt = new JLabel("Enter Text: ");
        jlabContents = new JLabel("");

        //add the components to the content pane.
        jfrm.add(jlabPrompt);
        jfrm.add(jtf);
        jfrm.add(jbtnRev);
        jfrm.add(jlabContents);

        //display frame
        jfrm.setVisible(true);
    }

    //handle events
    public void actionPerformed(ActionEvent ae){

        if(ae.getActionCommand().equals("reverse")){
            //reverse button was pressed
            String orgStr = jtf.getText();
            String revString = "";

            //reverse the string
            for(int i = orgStr.length() -1; i>=0; i--)
                revString += orgStr.charAt(i);

            //store in text field
            jtf.setText(revString);
        } else{
            jlabContents.setText("You pressed ENTER. Text is: " + jtf.getText());
        }


    }
    public static void main(String args[]){
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                new TFDemo();
            }
        });
    }
}
