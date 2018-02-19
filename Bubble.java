/* 
  Bubble sorting algorithm for sorting an array of numbers.
*/



class Bubble{
  public static void main(String args[]){
    int a,b,t;
    int size;
    int nums[]= {12, -4 , 100, 123, 54, -1023, 96};
    
    size = 7; //number of items to sort
      
    //print original array
    
    System.out.print("the original array is:");
    for(int i=0; i<size; i++){
      System.out.print(nums[i] + ", ");
    }
    System.out.println();
    
    //bubble sort
    for(a=1; a< size; a++)
      for(b=size-1; b>= a; b--){
        if(nums[b-1] > nums[b]){
          t = nums[b-1];
          nums[b-1] = nums[b];
          nums[b] = t;
        }
        
      }
    //print sorted array
    
    System.out.print("the sorted array is:");
    for(int i=0; i<size; i++){
      System.out.print(nums[i] + ", ");
    }
    System.out.println();
  }
}