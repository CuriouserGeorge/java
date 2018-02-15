/*

  computes the distance to an object based on the time taken for an echo to return.
  
*/


class Sound{
  public static void main(String args[]){
    double dist, time_interval;
    
    time_interval = 10;
    
    dist = (time_interval * 1100)/2;
    
    System.out.println("The object is " + dist + "feet away.");
    
  
  }


}