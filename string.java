//import java.util.String;
public class string {
	public static void main(String[] args) {
		// string  is immutable (can't change)
		String a = "hello"; 
		String b = new String("hello");
		
		System.out.println(a);
		System.out.println(b);
		if (a.equals(b)) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
		String c=a.concat(" world");
		System.out.println(c);
	}

}
