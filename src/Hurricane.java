import java.util.Scanner;

public class Hurricane {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("How fast was the wind blowing?");
        int windSpeed = scan.nextInt();

        // An in statement with only one line of code to run
        // does not require braces

        if (windSpeed < 65)
            System.out.println("Get over it. That was not a hurricane");

            else if (windSpeed < 96)
            System.out.println("It was a class 1 hurricane");
            else if (windSpeed < 111)
                System.out.println("It was class 2 hurricane");
                else if (windSpeed < 155);
                System.out.println("It was a class 4 hurricane");

                {
                    // since the else has multiple lines of code to run
                    // we use braces {} to wrap them in a code block
            System.out.println("It was a class 5 hurricane");
            System.out.println("Class 5 is the most severe hurricane");
            System.out.println("Hurricane Katrina was class 5");
        }


        }
}
