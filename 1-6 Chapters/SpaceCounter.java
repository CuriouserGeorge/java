/* 
  Program reads characters from keyboard untill a period is entered and returns the number of spaces entered. 
*/


class SpaceCounter{
  public static void main(String args[])
    throws java.io.IOException {
    
    char choice;
    int number_of_spaces = 0;
    
    System.out.println("Enter characters, program will end when a period is pressed.");
    
    choice = (char) System.in.read();
    while(choice != '.'){
      if(choice == ' ') number_of_spaces++;
          choice = (char) System.in.read();
    }
    
    System.out.println(number_of_spaces);
  } 
}