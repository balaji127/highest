import java.util.*;
class Highest{
	 public static void main(String args[]){
		   int n,max;                        //declaring variables for entering the size & another temp variable to store array value 
		Scanner s = new Scanner(System.in);  //declaring scanner class to allow the user to give the size of the array dynamically
		   System.out.println("enter the size of the array");
		     n=s.nextInt();        
	   int a[] = new int[n]; //passing the size variables to integer array
	     System.out.println("Enter the array elements");
	  for(int i=0;i<n;i++){    
		  a[i] = s.nextInt();
	  }
	  max=a[0];
	  for(int j=0; j<n;j++)
	  {
		  if(max<a[j])   
			  {
				  max = a[j];
			  }
		  }
                      System.out.println("Maximum Value"+" "+max);
	  }
	 }
	 