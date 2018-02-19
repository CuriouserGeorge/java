/* 
  This program changes the case of all the characters entered (lower to upper, upper to lower). It terminates when it reaches a period. 
*/


class CaseChanger{
  public static void main(String args[])
    throws java.io.IOException {
    
    int choice;
    int number_of_changes = 0;
    String return_string = "";

    
    System.out.println("Enter characters, program will end when a period is pressed.");
    
    choice = System.in.read();
    
    while((char)choice != '.'){
      
      if('a' <= choice && choice <= 'z'){
        
        return_string += (char)(choice - 32);
        number_of_changes++;
        
      }else if( 'A' <= choice && choice <= 'Z'){
        
        return_string += (char)(choice + 32);
        number_of_changes++;
        
      }else return_string += (char)choice;
        
      
      
      
      choice = System.in.read();
    }
    
    System.out.println(return_string);
  } 
}