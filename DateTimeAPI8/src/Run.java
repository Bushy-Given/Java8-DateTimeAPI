import java.time.LocalDate;
import java.time.LocalDateTime;

public class Run {
    public static void main(String[] args){
        LocalDate date = LocalDate.now();//get the current Date
        LocalDate yestaday = date.minusDays(1);//subtract 1 day from current date
        LocalDate tomorrow = date.plusDays(1);//add 1 day to current date

        System.out.println("Today        :"+date);
        System.out.println("Yestaday     :"+yestaday);
        System.out.println("Tomorrow     :"+tomorrow);

        //isLeapYear()
        LocalDate d1 = LocalDate.of(2014,12,10);
        System.out.println(d1+" is a Leap Year? :" + d1.isLeapYear());

        LocalDate d2 = LocalDate.of(2016,10,5);
        System.out.println(d2+" is a Leap Year? :" + d2.isLeapYear());


        //atTime()
        LocalDate date3 = LocalDate.of(2017, 1, 13);
        LocalDateTime dateTime = date3.atTime(14, 29, 59);
        System.out.println(dateTime);
        System.out.println(date3.atTime(15, 30));

        //now i have to create more time methods


    }
}
