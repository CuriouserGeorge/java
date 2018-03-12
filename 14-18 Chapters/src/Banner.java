/*
    15-1 a banner applet

    create a thread that scrolls
    the message contained in the msg right
    to left across the applet's window.
 */
import java.awt.*;
import java.applet.*;
/*
<applet code="Banner" width=300 height=50>
</applet>
 */

public class Banner extends Applet implements Runnable{
    String msg = " Java rules the web ";
    Thread t;
    boolean stopFlag;

    //init t to null
    public void init(){
        t = null;
    }

    //start thread
    public void start(){
        t = new Thread(this);
        stopFlag = false;
        t.start();
    }


    //entry point for the thread that runs the banner
    public void run(){
        //redisplay banner
        for(;;){
            try{
                repaint();
                Thread.sleep(250);
                if(stopFlag)
                    break;
            } catch(InterruptedException exc) {}
        }
    }

    public void stop(){
        stopFlag = true;
        t = null;
    }

    public void paint(Graphics g){
        char ch;

        ch = msg.charAt(0);
        msg = msg.substring(1, msg.length());
        msg += ch;
        g.drawString(msg, 50, 30);
    }
}
