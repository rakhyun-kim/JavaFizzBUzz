import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Number ");
        int numbers = scanner.nextInt();

        if (numbers % 5 == 0 && numbers % 3 == 0)
            System.out.println("FizzBuzz");
        else if (numbers % 5 == 0)
            System.out.println("Fizz");
         else if (numbers % 3 == 0)
            System.out.println("Buzz");

            else
                System.out.println(numbers);

    }
}