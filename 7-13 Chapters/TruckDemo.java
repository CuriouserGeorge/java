/*
  7-1 Extending the vehicle class
*/

class Vehicle {   
  private int passengers; // number of passengers   
  private double fuelCapacity;    // fuel capacity in liters  
  private double kmperliter;        // fuel consumption 
  
  // This is a constructor for Vehicle. 
  Vehicle(int p, double f, double m) { 
    passengers = p; 
    fuelCapacity = f; 
    kmperliter = m; 
  } 
 
  // Return the range.  
  double range() {  
    return kmperliter * fuelCapacity;  
  }  
  
  // Compute fuel needed for a given distance. 
  double fuelneeded(double miles) {  
    return  miles / kmperliter;  
  }  
}   

//extending the existing class

class Truck extends Vehicle{
  private int cargocap; // cargo capacity
  
    //constructor
  Truck(int p, int f, int m , int c){
    /* initialize using vehicle constructor */
    super(p, f, m);
    
    cargocap = c;
  }
  
  //Accessor methods for cargocap
  int getCargo() { return cargocap; }
  void putCargo(int c ){ cargocap = c;}
}

class TruckDemo {   
  public static void main(String args[]) {   
 
    //construct new trucks
    Truck semi = new Truck(2, 200, 7 , 44000);
    Truck pickup =  new Truck(3, 28, 15, 2000);
    double litres;
    int dist = 252;
    
    litres = semi.fuelneeded(dist);
    
    System.out.println("Semi can carry " + semi.getCargo() + " kg.");
    System.out.println("To go " + dist + " miles semi needs " + litres  + "litres of fuel.\n");
      
    litres = pickup.fuelneeded(dist);
    
    System.out.println("Pickup can carry " + pickup.getCargo() + " kg.");
    System.out.println("To go " + dist + " miles Pickup needs " + litres  + "litres of fuel.\n");
    
    
    
    
  }   
}

