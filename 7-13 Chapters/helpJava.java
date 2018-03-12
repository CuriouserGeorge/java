import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

class help{
    String helpfile;

    help(String fname){
        helpfile = fname;

    }


    boolean helpOn(String what){
        int ch;
        String topic, info;

        //open help file
        try(BufferedReader helpRdr = new BufferedReader(new FileReader(helpfile))){
            do{
                //read chars into a '#' is found
                ch = helpRdr.read();

                if(ch == '#'){
                    topic = helpRdr.readLine();
                    if(what.compareTo(topic) == 0){
                        do{
                           info = helpRdr.readLine();
                           if(info != null) System.out.println(info);
                        }while((info != null) && (info.compareTo("") !=  0));

                        return true;
                    }
                }
            }while(ch != -1);
        }catch(IOException exc){
            System.out.println(("error accessing help file"));
            return false;
        }
        return false; //not found
    }

    //get a help topic ⇟ ⇟
    String getSelection(){
        String topic = "";

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a topic: ");
        try{
            topic = br.readLine();
        }catch(IOException exc){
            System.out.println("error reading console.");
        }
        return topic;
    }
}



public class helpJava {
    public static void main(String args[]){
        help helpObj = new help("help.txt");
        String topic;

        System.out.println("Try the help system. " + "Enter 'stop to end.");
        do{
            topic = helpObj.getSelection();

            if(!helpObj.helpOn(topic))
                System.out.println("Topic not found.\n");
        }while(topic.compareTo("stop") != 0);
    }


}
