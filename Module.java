import java.util.Scanner;

public class Module {
    public static void main (String[] args) {
        System.out.println("Enter a module code:");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.print("input " + input + " > Output ");
        switch(input) {
            case "CSC1002":
                System.out.println("Mathematics 1");
                break;
            case "CSC1003":
                System.out.println("Programming Methodology");
                break;
            case "CSC1009":
                System.out.println("Object-Oriented Programming");
                break;
            case "CSC2901":
                System.out.println("Effective Communication");
                break;
        }
        sc.close();
    }
}

