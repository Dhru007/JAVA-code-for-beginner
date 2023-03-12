import java.util.Scanner;
public class condition_if {

	public static void main(String[] args) {
		int key;
		System.out.print("enter the security key: ");
		Scanner obj=new Scanner(System.in);
		
		key=obj.nextInt();
		if (key==1234) {
			System.out.println("hello world...");
			System.out.println("super");
			
		}
		else {
		System.out.println("key is wrong");
		}
		obj.close();

	}

}
