package Calc;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" 1 - plus , 2 - minus , 3 - multiply , 4 - division , 5 - power , 6 - factorial");

        System.out.println("Matematik amalni kirg'izing: ");
        int amal = scanner.nextInt();



        switch (amal) {
            case 1 -> Plus();
            case 2 -> Minus(scanner);
            case 3 -> Multiply(scanner);
            case 4 -> Division(scanner);
            case 5 -> Power(scanner);
            case 6 -> Factorial(scanner);
        };

    }

    public static void Plus() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Raqamlar sonini kirg'izing: ");
        int number = scanner.nextInt();

        double sum = 0;
        int i = 0;
        while (i<number){
            System.out.println((i+1) + " - sonni kiritng: " );
            int son = scanner.nextInt();
            sum+=son;
            i++;

        }
        System.out.println("Jami sonlar yig'indisi: " + sum);
    }

    public static void Minus(Scanner scanner) {


        System.out.println("Ayriluvchni kiriting: ");
        double a = scanner.nextDouble();
        System.out.println("Ayiruvchini kiriting: ");
        double b = scanner.nextDouble();

        double result = a - b;
        System.out.println("Natija: " + result);


    }

    public static double Multiply(Scanner scanner) {
        System.out.println("Raqamlar sonini kirg'izing: ");
        int number = scanner.nextInt();

        double multiply = 1;
        int i = 0;
        while (i<number){
            System.out.println((i+1) + " - sonni kiritng: " );
            int son = scanner.nextInt();
            multiply*=son;
            i++;

        }
        System.out.println("Jami sonlar yig'indisi: " + multiply);


        return multiply;
    }

    public static double Division(Scanner scanner) {

        System.out.println("Bo'linuvchini kiriting: ");
        int a = scanner.nextInt();

        int b;
        do {
            System.out.println("Bo'luvchini kiriting: ");
            b = scanner.nextInt();

            if (b > a) {
                System.out.println("Xato: bo'luvchi bo'linuvchidan katta bo'lmasin! Qayta kiriting.");
            }

        } while ( b > a);

        double result = (double) a / b;

        if (a % b == 0) {
            System.out.println("Natija: " + result);
        } else {
            System.out.println("Natija: " + a / b + " , qoldiq: " + a % b);
        }

        return result;
    }

    public static int Power(Scanner scanner){

        System.out.println("Sonni kiriting: ");
        int base = scanner.nextInt();

        System.out.println("Sonni darajasini kiriting: ");
        int exp = scanner.nextInt();

        int result = powerRecursive(base,exp);
        System.out.println("Natija = " + result);
        return result;
    }

    public static int powerRecursive(int base , int exp) {
        if (exp == 0) return 1;
        return base * powerRecursive(base , exp-1);

    }

    public static int Factorial(Scanner scanner){

        System.out.println("Sonni kiriting: ");
        int numb = scanner.nextInt();

        int result = recFactorial(numb);
        System.out.println("Factorial natijasi = " + result);
        return result;

    }
    public static int recFactorial(int numb) {
        if (numb <= 1) return 1;
        return numb * recFactorial(numb - 1);
    }

    }







