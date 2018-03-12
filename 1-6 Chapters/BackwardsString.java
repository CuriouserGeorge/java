/*
  recursive method that displays the contents of a string backwards
*/

class strings{
  
  static void reverse(String str){
    
    if(str.isEmpty());
    else{
      System.out.print(str.charAt(str.length() - 1 ));
      str = str.substring(0, str.length() -1 );
      reverse(str);
    }
  }
}

class BackwardsString{
  public static void main(String args[]){
    strings.reverse("this is a test"); 
    
  }  
}