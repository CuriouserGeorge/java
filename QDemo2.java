/*
  6-2
  This program creates a queue class with put and get functions
  
  editted so some methods and values are private
  Uses separate constructor classes and methods to demonstrate overloading in java.
  
*/

class Queue{
  
  private char q[]; 
  private int putloc, getloc;
  
  //constructor
  Queue(int size){
    q = new char[size];
    putloc = getloc = 0;
    
  }
  
  Queue(Queue ob){
    putloc = ob.putloc;
    getloc = ob.getloc;
    q = new char[ob.q.length];
    
    //copy elements
    for(int i=getloc; i< putloc; i++)
      q[i] = ob.q[i];
    
  }
  
  //queue for a character array
  Queue(char a[]){
    putloc = 0;
    getloc = 0;
    q= new char[a.length];
    
    for(int i=0; i<a.length; i++) put(a[i]);
  }
  
  //put char into the queue
  void put(char ch){
    if(putloc == q.length){
      System.out.println(" - Queue is full.");
      return;
    }
    q[putloc++] = ch;
  }
  
  //get character from queue
  char get(){
    if(getloc == putloc){
        System.out.println(" - Queue is empty.");
        return (char) 0;
    }
    return q[getloc++];
  }
}

//testing/demonstrating queue class

class QDemo2 {
  public static void main(String args[]){
    Queue bigQ = new Queue(100);
    Queue smallQ = new Queue(4);
    char ch;
    int i;
    
    System.out.println("using bigQ to store alphabet");
    for(i=0; i<26; i++){
      bigQ.put( (char) ('A'+ i));
    }
    
    //retrive and print elements from bigQ
    System.out.println("The elements of bigQ are:");
    for(i=0; i<26; i++){
      ch = bigQ.get();
      if(ch != (char) 0) System.out.print(ch);
    }
    
    System.out.print("\n");
  
    System.out.println("using samll q to generate errors");

    for(i=0; i < 26; i++){
      System.out.println("Attempting to store " + (char) ('Z' - i));

      smallQ.put((char) ('z' - i));

      System.out.println();
    
    }
    System.out.println();
  }
}