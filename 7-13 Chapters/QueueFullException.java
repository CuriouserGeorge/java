//an exceptio for queue-full errors

public class QueueFullException extends Exception {
  int size;
  
  QueueFullException(int s){ size = s;}
  
  public String tostring(){
    return "\nQueue is full. Maximum size is " + size;
  }
}