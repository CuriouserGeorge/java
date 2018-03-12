/*
    16-1
    Swing-based file comparison utility

 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;


class SwingFC implements ActionListener {

    JTextField jtfFirst;
    JTextField jtfSecond;

    JButton jbtnComp;

    JLabel jlabFirst, jlabSecond;
    JLabel jlabResult;

    SwingFC(){
        JFrame jfrm = new JFrame("Compar Files");

        jfrm.setLayout(new FlowLayout());

        jfrm.setSize(200, 190);

        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jtfFirst = new JTextField(14);
        jtfSecond = new JTextField(14);

        //set action commands for the text fields
        jtfFirst.setActionCommand("fileA");
        jtfSecond.setActionCommand("fileB");

        JButton jbtnComp = new JButton("compare");

        jbtnComp.addActionListener(this);

        //labels
        jlabFirst = new JLabel("First file:");
        jlabSecond = new JLabel("Second file");
        jlabResult = new JLabel("");

        //add components
        jfrm.add(jlabFirst);
        jfrm.add(jtfFirst);
        jfrm.add(jlabSecond);
        jfrm.add(jtfSecond);
        jfrm.add(jbtnComp);
        jfrm.add(jlabResult);

        //display frame
        jfrm.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        int i=0, j=0;

        //confirm file names have been entered
        if(jtfFirst.getText().equals("")){
            jlabResult.setText("First file name missing.");
            return;
        }
        if(jtfSecond.getText().equals("")){
            jlabResult.setText("Second file name missing.");
            return;
        }

        //compare files. use try-with-resources to manage the files

        try(FileInputStream f1 = new FileInputStream(jtfFirst.getText());
            FileInputStream f2 = new FileInputStream(jtfSecond.getText())) {

            //check contents of each file
            do {
                i = f1.read();
                j = f2.read();
                if(i != j) break;

            }while( i != -1 && j != -1);

            if(i != j)
                jlabResult.setText("files are not the same.");
            else
                jlabResult.setText("files compare equal.");
        }catch(IOException exc){
            jlabResult.setText("file error");
        }
    }

    public static void main(String args[]){
        SwingUtilities.invokeLater(new Runnable() {

            public void run() {
                new SwingFC();
            }
        });
    }



}
