
public class icrement_decriment_operater {
	public static void main(String[] args) {
		int a=100;
		System.out.println(a++);
		System.out.println(++a);
		System.out.println(a--);
		System.out.println(--a);
		
		//assignment operater
		
		System.out.println(a+=10);
		System.out.println(a-=10);
		
		//ternary operater 
		int c=10,b=90;
		System.out.println(c<=b ? true:false );
		
		int x=50,y=400,z=300;
		int r = (x>y) ? (x>z ? x:z) : (y>z ? y:z);
		System.out.println(r);
		 
	}

}
