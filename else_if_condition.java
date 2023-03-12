import java.util.Scanner;
public class else_if_condition {
    public static void main(String[] args) {
        int number;
        System.out.print("enter the number: ");
        Scanner obj = new Scanner(System.in);
        
        try {
            number = obj.nextInt();
            if (number > 0) {
                System.out.println("The number is positive.");
            } else if (number < 0) {
                System.out.println("The number is negative.");
            } else {
                System.out.println("The number is 0.");
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter an integer value.");
        }
        obj.close();
    }
}

