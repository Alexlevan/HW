package hw1;

import java.util.Scanner;

public class HW_1 {
    public static void main(String[] args) {
        int day;
        int month;
        int year = 2019;
            System.out.println("Введите день");
            Scanner sc = new Scanner(System.in);
            day = sc.nextInt();
            System.out.println("Введите месяц");
            month = sc.nextInt();
            System.out.println(countNextDay(day, month, year));

    }

    private static String countNextDay(int day, int month, int year) {
        int newDay = ++day;
        int newMonth = month;
        int newYear = year;
        if (day >= 28 && month==2 ){
            newDay = 1;
            newMonth = ++month;
            newYear = year;
        } else if (day >= 31 && (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)){
            newDay = 1;
            newMonth = ++month;
            newYear = year;
        }else if(day >= 30 && (month == 4 || month == 6 || month == 9 || month == 11)){
            newDay = 1;
            newMonth = ++month;
            newYear = year;
        } else{

        }

        return dateFormat(newDay, newMonth, newYear);
    }

    private static String dateFormat(int day, int month, int year) {

        return day + "." + month + "." + year;
    }


}
