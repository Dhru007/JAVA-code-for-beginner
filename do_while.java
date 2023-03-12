import java.util.Scanner;
public class do_while {

		public static void main(String args[])
		{
			int x;
			System.out.println("enter the number: ");
			Scanner obj=new Scanner(System.in);
			
			x=obj.nextInt();
			do {
				System.out.println(x+"");
				x++;
			}
			while(x<=10);
			obj.close();
		}
	}



