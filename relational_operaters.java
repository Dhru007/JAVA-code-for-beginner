import java.util.Scanner;
public class relational_operaters {
	public static void main(String[] args) {
		float a,b;
		int c;
		System.out.println("enter two number: ");
		Scanner obj=new Scanner(System.in);
		
		a=obj.nextFloat();
		Scanner myobj=new Scanner(System.in);
		
		b=myobj.nextFloat();
		System.out.println("chose the relational operater: ");
		System.out.println("1 >,2 <,3 ==,4 >=,5 <=,6 !=");
		Scanner ch=new Scanner(System.in);
		ch.close();
		c=ch.nextInt();
		switch (c) {
		case 1:
			System.out.println(a>b);
			break;
		case 2:
			System.out.println(a<b);
			break;
		case 3:
			System.out.println(a==b);
			break;
		case 4:
			System.out.println(a>=b);
			break;
		case 5:
			System.out.println(a<=b);
			break;
		case 6:
			System.out.println(a!=b);
			break;	
		default:
			System.out.println("invalid input...");
			
		}
		
		obj.close();
		myobj.close();
	}

}
