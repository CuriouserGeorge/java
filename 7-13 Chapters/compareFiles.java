/****
 10 - 1 this program compares the differences between 2 input files.
****/

import java.io.*;


public class compareFiles {
    public static void main(String args[]){
        int i=0, j=0;

        //make sure both files have been specified
        if(args.length !=2){
            System.out.println("Usage compareFiles f1 f2");
            return;
        }

        //compare the 2 files
        try(FileInputStream f1 = new FileInputStream(args[0]);
            FileInputStream f2 = new FileInputStream(args[1])){
            //compare each file
            do{
                i = f1.read();
                j = f2.read();
                if(i != j ) break;
                if(i != j) break;

            }   while(i != -1 && j != -1);

            if(i != j)
                System.out.println("files differ");
            else
                System.out.println("files are the same");
        }catch(IOException exc){
            System.out.println("I/O Error: " + exc);
        }

    }
}