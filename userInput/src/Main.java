import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name ?");
        String name = scanner.nextLine();

        System.out.println("What is your age?");
        int age = scanner.nextInt();

        scanner.nextLine();

        System.out.println("What is your favourite food");
        String food = scanner.nextLine();

        System.out.println("Your name is " + name);
        System.out.println("Your age is " + age);
        System.out.println("Your favourite food is " + food);

    }

}