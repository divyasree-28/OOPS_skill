package OOPS_Skill;

import java.time.LocalDateTime;

public class DateExample {
    public static void main(String[] args) {
        LocalDateTime currentDateTime = LocalDateTime.now();

        System.out.println("Current date and time: " + currentDateTime);
        System.out.println("Month: " + currentDateTime.getMonthValue());
        System.out.println("Year: " + currentDateTime.getYear());
        System.out.println("Minutes: " + currentDateTime.getMinute());
        System.out.println("Hours: " + currentDateTime.getHour());
    }
}