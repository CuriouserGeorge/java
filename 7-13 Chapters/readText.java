/*this file will read and output an input file

 */
import java.io.*;

public class readText {
    public static void main (String args[]){
        int i;
        FileInputStream fIn;

        //make sure file has been specified
        if(args.length != 1){
            System.out.println("Usage ShowFile File");
            return;
        }

        try{
           fIn = new FileInputStream(args[0]);
        }catch(FileNotFoundException exc){
            System.out.println("file not found");
            return;
        }

        //read bytes until EOF is encountered

        try{
            do{
                i = fIn.read();
                if(i != -1) System.out.print((char) i);
            }while(i != -1);
        } catch(IOException exc){
            System.out.println("error reading file");

        }finally {
            //close file
            try{
                fIn.close();
            } catch(IOException exc){
                System.out.println("Error closing file");
            }
        }


    }
}
