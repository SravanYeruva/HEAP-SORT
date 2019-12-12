//coded by Sravan yeruva
import java.util.Scanner;
public class heapsort 
{ 
	public void sort(int array[]) 
	{ 
		int n = array.length; 
    //coded by Sravan yeruva
		for (int i = n / 2 - 1; i >= 0; i--) 
			heapify(array, n, i); 
		for (int i=n-1; i>=0; i--) 
		{ 
			int temp = array[0]; 
			array[0] = array[i]; 
      //coded by Sravan yeruva
			array[i] = temp; 
			heapify(array, i, 0); 
		} 
	} 
	void heapify(int array[], int n, int i) 
  //coded by Sravan yeruva
	{ 
		int largest = i; 
		int l = 2*i + 1;
		int r = 2*i + 2; 
		if (l < n && array[l] > array[largest]) 
			largest = l; 
      //coded by Sravan yeruva
		if (r < n && array[r] > array[largest]) 
			largest = r;  
		if (largest != i) 
		{ 
			int swap = array[i]; 
      //coded by Sravan yeruva
			array[i] = array[largest]; 
			array[largest] = swap; 
			heapify(array, n, largest);
      //coded by Sravan yeruva
		} 
	} 
	
	public static void main(String args[]) 
	{ 
Scanner object2 = new Scanner(System.in);
//coded by Sravan yeruva
System.out.println("Please Enter the size of the array");
int a = object2.nextInt();
		int array[] = new int[a];
System.out.println("Enter array of " + a + " elements");
//coded by Sravan yeruva
for (int j = 0 ; j < a ; j++)
{
int w = object2.nextInt();
array[j] = w;
} 
		heapsort object = new heapsort(); 
    //coded by Sravan yeruva
		object.sort(array); 
		System.out.println("Sorted array is"); 
		for (int i=0; i<a; ++i) 
    //coded by Sravan yeruva
			System.out.print(array[i]+" "); 
		System.out.println(); 
		
	} 
} 
