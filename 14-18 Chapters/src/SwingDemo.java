//simple swing program

import javax.swing.*;

class SwingDemo{

    SwingDemo() {
        //create jframe container
        JFrame jfrm = new JFrame("A simple swing application");

        //set initial state
        jfrm.setSize(500, 500);

        //TERminate the program when the user closes the application
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //create a label
        JLabel jlab = new JLabel("Swing defines the modern java gui");
        //text-based label
        jfrm.add(jlab);

        //display the frame
        jfrm.setVisible(true);
    }

    public static void main(String args[]){
        //create the frame
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                new SwingDemo();
            }
        });
    }
}

