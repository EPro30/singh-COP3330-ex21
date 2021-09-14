/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Riya Singh
 */

import java.util.Scanner;
public class exNumbersToNames {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of the month:");
        int mnth = sc.nextInt(); //Month input
        String str; //store the month name and use it for the output
        switch(mnth)
        {
            case 1:
                str = "January";
                break;
            case 2:
                str = "February";
                break;
            case 3:
                str = "March";
                break;
            case 4:
                str = "April";
                break;
            case 5:
                str = "May";
                break;
            case 6:
                str = "June";
                break;
            case 7:
                str = "July";
                break;
            case 8:
                str = "August";
                break;
            case 9:
                str = "September";
                break;
            case 10:
                str = "October";
                break;
            case 11:
                str = "November";
                break;
            case 12:
                str = "December";
                break;
            default:
                str = "NOT AVAILABLE (Invalid Month number)";
        }
        System.out.println("The name of the month is " + str + ".");
    }
}

