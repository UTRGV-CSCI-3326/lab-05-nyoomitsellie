import java.util.Scanner;
public class Input {
   
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // float num;
        // num = scanner.nextFloat();

        String userName;
        System.out.print("Enter name: ");
        userName = scanner.nextLine();

        int userAge;
        System.out.print("Enter age: ");
        userAge = scanner.nextInt();

        double userWeight;
        System.out.print("Enter weight: ");
        userWeight = scanner.nextDouble();

        boolean ifSmoke;
        System.out.print("User smokes? (True/False): ");
        ifSmoke = scanner.nextBoolean();
        System.out.println("");

        System.out.println("User's Name: " + userName);
        System.out.println("User's age: " + userAge);
        System.out.println("User's weight: " + userWeight);
        System.out.println("Does the user smoke?: " + ifSmoke);

    }
}
