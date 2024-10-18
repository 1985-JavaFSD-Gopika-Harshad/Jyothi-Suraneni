package Revature;
/*Swap Method
Write a generic method swap that takes an array of any type 
and swaps the first and last elements of the array. 
Demonstrate its functionality with a sample array.
*/
public class ArrayProgram {
	public static <T> void swapArray(T[] a) {
		for(int i=0;i<a.length;i++) {
			T temp;
			if(i==0) {
				temp=a[i];
				a[i]=a[a.length-1];
				a[a.length-1]=temp;
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

	public static void main(String[] args) {
		Integer[] a= {1,2,3,4,5};
		swapArray(a);

	}

}
