package java8features;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class HandlingDates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//current Date
		LocalDate currentDate=LocalDate.now();
		System.out.println("Current date :"+currentDate);
		
		//current Time
		LocalTime currentTime=LocalTime.now();
		System.out.println("Current time :"+currentTime);
		
		//Current date and time in one 
		LocalDateTime currentDateTime = LocalDateTime.now();
		System.out.println("Current Date & Time :"+currentDateTime);
		
		//Another Date means not current date
		LocalDate anotherDate=LocalDate.parse("2014-11-03");//setting in string format
		System.out.println("Another Date :"+anotherDate);
		
		LocalDate anotherDate2 = LocalDate.of(2010, 3, 12);//setting date by passing integers
		System.out.println("Another date using of() : " +anotherDate2);
		
		//retrieving yesterday and tomorrow's date
		LocalDate yesterday = currentDate.minusDays(1);
		System.out.println("Yesterday's Date :" +yesterday);
		
		LocalDate tomorrow = currentDate.plusDays(1);
		System.out.println("Tomorrow's Date :" +tomorrow);
		
		//checking leap year
		System.out.println("Is leap year? :" +currentDate.isLeapYear());
		
		//changing date-time format
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");//setting pattern
		String formattedDate = currentDateTime.format(formatter);
		System.out.println("Formatted Date :" +formattedDate);
		
		Month month=currentDateTime.getMonth();
		int day = currentDateTime.getDayOfMonth();
		int year= currentDateTime.getYear();
		
		int hour= currentDateTime.getHour();
		int min= currentDateTime.getMinute();
		int ss= currentDateTime.getSecond();
		
		System.out.println("Date is :" +day+"/"+month+"/"+year+" "+hour+":"+min+":"+ss);
		
		
		//Handling Zones
		ZonedDateTime current=ZonedDateTime.now();
		System.out.println("\n current date and time :"+current);
		System.out.println("\n current zone :"+current.getZone());
		
		ZoneId tokyo = ZoneId.of("Asia/Tokyo");
		
		
		ZonedDateTime tokyoZone=current.withZoneSameInstant(tokyo);
		System.out.println("\n tokyo zone :"+tokyoZone);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
