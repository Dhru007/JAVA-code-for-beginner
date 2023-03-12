import java.util.Scanner;
public class while_loop {
	public static void main(String[] args) {
		int a,t,x;
		System.out.print("enter the starting point of loop: ");
		Scanner z=new Scanner(System.in);
		
	   Scanner obj=new Scanner(System.in);
	   
		Scanner myobj=new Scanner(System.in);
	
	   // System.out.println("enter the times of repetation: ");	
	    t=obj.nextInt();
	    System.out.print("enter the end point of loop: ");
	    x=z.nextInt();
		while(t<=x) {
			System.out.print("enter the  number for multiplication");
			a=myobj.nextInt();
			System.out.println(a + "*" + t + "=" + a*t);
			//System.out.println(a);
			t++;
		}
				
		obj.close();
		myobj.close();
		z.close();
	}

}
