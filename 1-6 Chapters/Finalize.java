/* 
  A large number of objects are created in order to trigger the garbage collection and the finalize method to be triggered.
  
  Finalize has been deprecated so this doesn't compile
*/

class FDemo{
  int x;
  
  FDemo(int i){
    x = i;
  }
  
  //called when object is recycled
  protected void finalize(){
    System.out.println("Finalizing " + x);
  }
  
  // generates an object that is immediately destroyed
  void generator(int i){
    FDemo o = new FDemo(i);
  }
}

class Finalize{
  public static void main(String args[]){
    int count;
    
    FDemo ob = new FDemo(0);
    
    /* generate a large number of objects to trigger garbage collection */
  
  
  for( count = 0; count < 100000; count++)
    ob.generator(count);
  }
}