import java.sql.Time;

public class CheckTime {
private int hour;
private int minute;
private int second;
	
	CheckTime(){		
		hour = 0;
		minute = 0;
		second = 0;
	}
	CheckTime(int h, int m, int s) {
		hour = h;
		minute = m;
		second = s;
	}
	
	 void setHour(int h) {hour = h; }
	 void setMinute(int m) { minute = m; }
	 void setSecond(int s) { second = s;}
	
	 int getHour() {return hour; }
	 int getMiunte() { return minute; }
	 int getSecond() {return second; }
	 void Display() 
	 {
		 System.out.println(hour + ":" + minute +":"+second);
	 }
	 void DisplayAM() {
		 if(hour > 12) 
			 System.out.println(hour-12 + ": " +minute + ": " +second+ " PM");
		 
		 else if(hour< 12)
		 System.out.println(hour + ": " +minute + ": " +second+ " AM");
		 else 
			 System.out.println(hour + ": " +minute + ": " +second+ " PM");
		 }
	 void increment() {
		 second++;
		 if (second == 60) {
			 minute++;
			 second =0;
			 if(hour == 24) hour = 0;
		 }
	 }
	 boolean EqualTo(CheckTime t) {
		 if(hour == t.hour && minute == t.minute && second == t.second)
			 return true;
		 else return false;
	 }
	 boolean Greater(CheckTime t) {
		 if (hour > t.hour || (hour == t.hour && minute > t.minute) || (hour > t.hour && minute > t.minute && second> t.second))
		 {
			 return true;
			
		}
		 else return false;
	 }
	 boolean LessThan(CheckTime t) {
		 if (hour < t.hour || (hour < t.hour && minute < t.minute) || (hour < t.hour && minute < t.minute && second < t.second))
		 {
			 return true;
			
		}
		 else return false;
	 }
}
