/* 
  Generates all the prime numbers from 2, 100
*/


class PrimeNumberGen {
  public static void main(String args[]){
    
    for(int i = 2; i <= 100; i++){
      
      boolean isPrime = true;
      for(int factor = (int) Math.sqrt(i); factor >= 2; factor--){
        
        if((factor != 0) && i % factor == 0){
          
          isPrime = false;
        } 
        
      }
      if(isPrime) System.out.println(i);
        
        
      
    }
  }
}