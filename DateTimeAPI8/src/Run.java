import java.time.LocalDate;

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
    }
}
