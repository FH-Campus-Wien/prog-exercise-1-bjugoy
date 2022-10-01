package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    Scanner scanner = new Scanner(System.in);

    //todo Task 1
    public void sayHelloWorld(){
        System.out.println("Hello World!");
    }

    //todo Task 2
    public void helloRobot(){
        System.out.println("0123456789012345678901");
        System.out.println("         __");
        System.out.println(" _(\\    |@@|");
        System.out.println("(__/\\__ \\--/ __");
        System.out.println("   \\___|----|  |   __");
        System.out.println("       \\ }{ /\\ )_ / _\\");
        System.out.println("       /\\__/\\ \\__O (__");
        System.out.println("      (--/\\--)    \\__/");
        System.out.println("      _)(  )(_");
        System.out.println("     `---''---`");
    }

    //todo Task 3
    public void sumOfLiterals(){
        char a = 'Z';
        int b = 0xface; //0x --> hexadecimal
        int c = 012; //0 --> octal
        long d = 80L;
        float e = 44e-1f;
        float f = 5.5f;
        double g = 8.88e1;
        double h = 99.9;

        int z = (int)d;
        int y = (int)e;
        int x = (int)f;
        int w = (int)g;
        int v = (int)h;

        int sum = a+b+c+z+y+x+w+v;

        System.out.println(sum);

    }

    //todo Task 4
    public void addTwoNumbers(){

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = a+b;

        System.out.println(c);

    }

    //todo Task 5
    public void swapTwoNumbers(){

        System.out.println("Before Swap:");
        System.out.print("x: ");
        int x = scanner.nextInt();
        System.out.print("y: ");
        int y = scanner.nextInt();

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("After Swap:");
        System.out.println("x: "+x);
        System.out.println("y: "+y);


    }

    //todo Task 6
    public void compareTwoNumbers(){

            System.out.print("n1: ");
            int n1 = scanner.nextInt();
            System.out.print("n2: ");
            int n2 = scanner.nextInt();

            if(n1>n2) {
                System.out.println("n1 > n2");
            } else if(n2>n1){
                System.out.println("n2 > n1");
            } else {
                System.out.println("n1 == n2");
            }

        }



    //todo Task 7
    public void ratingSalesPerson(){
        int x;
        
        System.out.print("Enter annual Revenue: ");
        x = scanner.nextInt();
        
        if( x < 0||x >= 100000){
            System.out.println("Invalid Revenue");
        } else if (0 <= x && x <20000){
            System.out.println("Poor Sales Revenue");
        } else if(20000 <= x && x <50000){
            System.out.println("Average Sales Revenue");
        } else if(50000 <= x && x <80000){
            System.out.println("Good Sales Revenue");
        } else if(80000 <= x && x <100000){
            System.out.println("Excellent Sales Revenue");
        }
    }

    //todo Task 8
    public void getCommissionRate() {
        int x;

            System.out.print("Enter CommissionClass: ");
            x = scanner.nextInt();

            switch (x) {
                case 1:
                    System.out.println("Your Commission Rate was set to 0.01");
                    break;
                case 2:
                    System.out.println("Your Commission Rate was set to 0.02");
                    break;
                case 3:
                    System.out.println("Your Commission Rate was set to 0.03");
                    break;
                case 4:
                    System.out.println("Your Commission Rate was set to 0.04");
                    break;
                default:
                    System.out.println("Your Commission Rate was set to 0.0" );
                    break;


            }


    }

    //todo Task 9
    public void leapyear(){

        int year;

        System.out.print("Year: ");
        year = scanner.nextInt();

        if(year % 4 == 0 && year % 400 == 0){
            System.out.println("Leapyear");
        } else if (year % 100 == 0 && year % 400 != 0) {
            System.out.println("Not a Leapyear");
        } else System.out.println("Not a Leapyear");

    }

    //todo Task 10
    public void transposedNumbers(){

        int transposed = 0;
        int number;
        int max = 999;

        System.out.print("Number: ");
        number = scanner.nextInt();

            if(number<=max) {
                while (number != 0) {

                    int rest = number % 10; //rest (letzte ziffer) wird herausgehoben
                    transposed = transposed * 10 + rest; // *10 --> macht platz für nächste ziffer (rest)
                    number = number / 10; //letzte ziffer verschwindet für die nächste schleife

                }

                System.out.println(transposed);
            }

    }


    public static void main(String[] args){
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}