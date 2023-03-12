import java.util.Scanner;

public class array2D {
	public static void main(String[] args) {
	int a[][]=new int[3][3];
	System.out.print("enter the 2D array element: ");
	Scanner obj=new Scanner(System.in);
	
	//a[][]=obj.nextInt();
	for (int i=0;i<3;i++) {
		System.out.print("i");
		for(int j=0;j<3;j++) {
			System.out.print("j");
			a[i][j]=obj.nextInt();
		}
	}
	System.out.print("\n2D array element\n");
    for (int i=0;i<3;i++) {
		
		for(int j=0;j<3;j++) {
			System.out.print(a[i][j]+" ");
		}
		System.out.println( );
	}
    //System.out.println("");
    obj.close();
	}
}
