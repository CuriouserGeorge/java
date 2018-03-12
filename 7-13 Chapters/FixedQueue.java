class FixedQueue implements ICharQ {
  private char q[];
  private int putloc, getloc;
  
  //Construct an empty queue givne its size.
  public FixedQueue(int size){
    q = new char[size];
    putloc = getloc = 0;
  }
  
  //put char into queue
  public void put(char ch)
    throws QueueFullException{
    
    if(putloc == q.length){
      throw new QueueFullException(q.length);
      }
    
    q[putloc++] = ch;
    
  }
  
  //get char from queue.
  public char get()
    throws QueueEmptyException{
    
    if(getloc == putloc){
      throw new QueueEmptyException();

    }
    
    return q[getloc++];
    
  }

}