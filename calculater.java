import java.util.Scanner;
public class calculater {
	public static void main(String[] args) {
		float a,b,d;
		int c;
		System.out.println("enter two number: ");
		Scanner obj=new Scanner(System.in);
		
		a=obj.nextFloat();
		Scanner myobj=new Scanner(System.in);
		myobj.close();
		b=myobj.nextFloat();
		
		System.out.println("chose the arithmetic operater: ");
		System.out.println("1=+,2=-,3=/,4=*,5=%");
		Scanner ch=new Scanner(System.in);
		ch.close();
		c=ch.nextInt();
		//Scanner sum=new Scanner(System.in);
		switch(c) {
		case 1 : d=a+b;
		System.out.println("addition: "+d);
		break;
		case 2 : d=a-b;
        System.out.println("subtraction: "+d);
        break;
		case 3 : d=a/b;
        System.out.println("divide: "+d);
        break;
		case 4 : d=a*b;
        System.out.println("multiplication: "+d);
        break;
		case 5 : d=a%b;
        System.out.println("modulus: "+d);
        break;
        default:
        	System.out.println("invalid choice...");
		}
		obj.close();
		myobj.close();
		
	}

}
