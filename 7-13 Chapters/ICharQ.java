//character queue interface.

public interface ICharQ{
  //put char into the queue
  void put(char ch) throws QueueFullException;
  
  //get char from queue.
  char get() throws QueueEmptyException;
  
}