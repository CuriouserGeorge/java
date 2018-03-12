/*
  this program converts gallons to litres
  outputs result in a table
*/  
class GalToLit{
  
  public static void main (String args[]){
    
      double gallons, litres, ratio;
      int counter;
    
      ratio = 3.7854; // litres in a gallon
      gallons = 10; //starting gallons
       // conversion
      
      counter = 0;
    
      for(gallons = 1; gallons < 40; gallons++){
        
        litres = gallons * ratio;
        System.out.println(gallons + " gallons is " + litres + " litres");
        
        counter++;
        if(counter%10 == 0){
          
          System.out.println();
        }
      }
  }
}