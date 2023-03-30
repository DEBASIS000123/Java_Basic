import java.util.Scanner;
public class Bubble_sort {

	public static void main(String[] args) {
		
		//Bubble Sort
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		int arr[]=new int [n];
		System.out.println("Enter the array elements :");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			
		}
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;;
				}
			}
		}
		System.out.println("Array elements are in increasing order");
		for(int i:arr)
			System.out.print(i+" ");
	}
}
