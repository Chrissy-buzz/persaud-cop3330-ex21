package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scan1 = new Scanner(System.in);
        System.out.print("Please enter the number of the month: ");
        int number = scan1.nextInt();
        switch (number){
            case 1:
                System.out.print("The name of the month is January");
                break;
            case 2:
                System.out.print("The name of the month is February");
                break;
            case 3:
                System.out.print("The name of the month is March");
                break;
            case 4:
                System.out.print("The name of the month is April");
                break;
            case 5:
                System.out.print("The name of the month is May");
                break;
            case 6:
                System.out.print("The name of the month is June");
                break;
            case 7:
                System.out.print("The name of the month is July");
                break;
            case 8:
                System.out.print("The name of the month is August");
                break;
            case 9:
                System.out.print("The name of the month is September");
                break;
            case 10:
                System.out.print("The name of the month is October");
                break;
            case 11:
                System.out.print("The name of the month is November");
                break;
            case 12:
                System.out.print("The name of the month is December");
                break;
            default:
                System.out.print("Invalid month");
                break;
        }
    }
}
