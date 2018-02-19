/*
  using recursion to generate a factorial
*/

class factorial{
  private int result, i;

  
  int intFact(int a){
      if(a == 1){
        return 1;
      }
      else{
        
        result = a*intFact(a-1);
      }
    
    return result;
  }
}



class Recursion{
  public static void main(String args[]){
    factorial f = new factorial();
    
    System.out.println("The factorial of 5 is: " + f.intFact(5));
    
  }
}