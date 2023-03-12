import java.util.Arrays;
import java.util.Scanner;
public class array1D {
	public static void main(String[] args) {
		int a[]=new int[10];
		Scanner obj =new Scanner(System.in);
		
		//a[]=s.nextInt();
		System.out.println("enter the array element: ");
		for (int i=0;i<10;i++) {
			a[i]=obj.nextInt();
			
		}
		Arrays.sort(a);
		System.out.println("sort array element: ");
		for (int j=0;j<10;j++) {
			System.out.print(a[j]+" ");}
       /* for(int b : a) {
			System.out.print(b+" ");
		}*/
		
		/*int x[]= {0,1,2,3,4,5,6,7,8,9};//a[10] 1D array
		// for each loop
		for(int y : x)          
		{
			System.out.print(y+" ");
		}*/
		obj.close();
	}

}
