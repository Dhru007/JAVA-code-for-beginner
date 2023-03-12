import java.util.Scanner;
public class nested_if_else {
public static void main(String[] args)
{   int age;
    String state;
	System.out.println("enter the age: ");
	java.util.Scanner obj=new Scanner(System.in);
	
	age=obj.nextInt();
	System.out.println("age is: "+age);
	System.out.println("enter the state: ");
	java.util.Scanner myobj=new Scanner(System.in);
	
	state=myobj.nextLine();
	System.out.println("state is: "+state);
	if (state.equals("Delhi")) {
		System.out.println("vote in your state");
		if(age>=18) {
			System.out.println("eligable for vote");
		}
		else {
			System.out.println("your age is not eligable for vote");
			
		}
		
	}
	else {
		System.out.println("voting in yours state in next year");
		if(age>=18) {
			System.out.println("eligable for vote");
		}
		else {
			System.out.println("your age is not eligable for vote");
			obj.close();
			myobj.close();
		}
	}
	
	

 }
}
