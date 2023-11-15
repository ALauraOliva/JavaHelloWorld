
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // String name = "Andrea Laura";
        // String country = "Peru";
        // int age = 23;
        // String company = "Best Company";
        // double gpa = 3.8;
        // char percentSign = '%';
        // boolean amITellingTheTruth = true;
        // /*
        // * %s === String %d === int %f === double %c === char %b === boolean
        // */
        // String formattedString = String.format(
        // "My name is %s. I am from %s. I am %d years old. I work for %s. My GPA is %f.
        // I have attended 100%c of my university classes. These are all %b claims",
        // name, country, age, company, gpa, percentSign,
        // amITellingTheTruth);

        // System.out.println(formattedString);
        // System.out.println(formattedString.length());
        // System.out.println(name.toLowerCase());
        // System.out.println(name.toUpperCase());

        // String string1 = new String("abc");
        // String string2 = new String("abc");

        // System.out.println(string1 == string2);
        // System.out.println(string1.equals(string2));
        // System.out.println(name.contains("Laura"));

        // ? USER INPUTS
        // ---------------------------------------------------------------------------------------------------
        Scanner scanner = new Scanner(System.in);

        // System.out.print("What is your name ");
        // String namePrint = scanner.nextLine();

        // System.out.printf("Hello %s how old are you", namePrint);
        // int age = scanner.nextInt();
        // ! 1 int age = Integer.parseInt(scanner.nextLine) this is another
        // solution
        // scanner.nextLine(); //! 2 cleans the input buffer
        // System.out.printf(
        // "%d its an excellent age to start programming", age);

        // System.out.println("what language do you prefer");
        // String language = scanner.nextLine();
        // System.out.printf("%s is a very popular language", language);
        // scanner.close();

        // ? CONDITIONALS
        System.out.println("What operation do you want to perform ");
        String operation = scanner.nextLine();
        scanner.nextLine();

        System.out.println("Enter your first number ");
        double firstNumber = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Enter your second number ");
        double secondNumber = scanner.nextDouble();

        if (operation.equals("sum")) {
            System.out.printf("%f + %f = %f", firstNumber,
                    secondNumber, firstNumber + secondNumber);
        }
        scanner.close();
    }
}
