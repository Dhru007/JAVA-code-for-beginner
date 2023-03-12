import java.util.Scanner;
public class for_loop {
	public static void main(String[] args) {
		float a;
		System.out.println("enter the number: ");
		Scanner obj=new Scanner(System.in);
		
		a=obj.nextFloat();
		for (int i=1;i<=10;i++) {
				System.out.println(a + "*" + i + "=" + a*i);
				}
		obj.close();
	}

}
