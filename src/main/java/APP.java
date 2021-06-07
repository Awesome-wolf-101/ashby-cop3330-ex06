/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Joshua Ashby
 */
import java.util.Calendar;
import java.util.Scanner;

public class APP {


    public static void main(String[] args) {

        System.out.println("What is your current age?");
        Scanner sc = new Scanner(System.in);
        String CurAge = sc.nextLine();
        System.out.println("At what age would you like to retire?");
        String RetAge = sc.nextLine();
        int CurAgeInt = Integer.parseInt(CurAge);
        int RetAgeInt = Integer.parseInt(RetAge);
        int YearsToRet = RetAgeInt - CurAgeInt;
        int CurrentYear = Calendar.getInstance().get(Calendar.YEAR);
        int HowLong = CurrentYear + YearsToRet;

        System.out.println("You have "+ YearsToRet + " years left until you can retire.");
        System.out.println("It's "+ CurrentYear + ", so you can retire in " + HowLong + ".");


    }
}
