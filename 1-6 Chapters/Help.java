/* 
  3-1 Java help system takes input char and returns information
*/


class Help{
  public static void main(String args[])
    throws java.io.IOException {
    char choice, ignore;
    
    do{
    System.out.println("help on:");
    System.out.println("  1. if");
    System.out.println("  2. switch");
    System.out.println("Choose one:");
   
    choice = (char) System.in.read();
    
      do{
        ignore = (char) System.in.read();
        
      } while (ignore != '\n');
      
    } while ( choice < '1' | choice > '2');
    switch(choice){
        
        case'1':
          System.out.println("The if:\n");
          System.out.println("if(condition) statement;");
          System.out.println("else statement;");
          break;
        case'2':
          System.out.println("The switch:\n");
          System.out.println("switch(expression) {");
          System.out.println("  case constant:");
          System.out.println("    statement sequence");
          System.out.println("    break;");
          System.out.println("    // ...");
          System.out.println("}");
          break;
        default:
          System.out.println("Selection not found.");
        
        
    }
   
      
    
    
  }
}