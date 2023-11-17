
import java.util.Scanner;
import java.util.Arrays;

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
        // System.out.println("What operation do you want to perform ");
        // String operation = scanner.nextLine();
        // scanner.nextLine();

        // System.out.println("Enter your first number ");
        // double firstNumber = scanner.nextDouble();
        // scanner.nextLine();

        // System.out.println("Enter your second number ");
        // double secondNumber = scanner.nextDouble();

        // if (operation.equals("sum")) {
        // System.out.printf("%f + %f = %f", firstNumber,
        // secondNumber, firstNumber + secondNumber);
        // }
        // scanner.close();

        // ? SWITCH CASES
        // switch (operation) {
        // case "sum":
        // System.out.printf("%f + %f = %f", firstNumber,
        // secondNumber, firstNumber + secondNumber);

        // break;

        // default:
        // System.out.printf("%s is not a support operation",
        // operation);
        // }
        // scanner.close();

        // ? ARRAYS
        int[] vowels = { 1, 2, 3, 4, 5 };
        // char vowels[] = new char[5];
        // vowels[0] = 'a';
        // vowels[1] = 'e';
        // vowels[2] = 'i';
        // vowels[3] = 'o';
        // vowels[4] = 'u';

        // TODO Best way to copy an array, because of its reference
        // int copyOfVowels[] = Arrays.copyOf(vowels, vowels.length);

        // Arrays.fill(vowels, 0);
        // // Arrays.sort(vowels, 1, 4);
        // System.out.println(Arrays.toString(copyOfVowels));
        // System.out.println(Arrays.toString(vowels));
        // System.out.println(Arrays.toString(vowels)); // representation of an array in
        // string
        // ?LOOPS DO, WHILE
        // int number = 5;
        // int multiplier = 1;

        // ! at least se ejecuta una vez
        // do {
        // System.out.printf("%d x %d = %d \n", number, multiplier,
        // number * multiplier);
        // multiplier++;
        // } while (multiplier <= 10);

        // while (multiplier <= 10) {
        // System.out.printf("%d x %d = %d \n", number, multiplier,
        // number * multiplier);
        // multiplier++;
        // }
    }
}
