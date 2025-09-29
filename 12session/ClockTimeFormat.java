public class ClockTimeFormat
{
   private int hour;
   private int minute;
   private int second;

   private boolean timeFormat24;

   // 3-argument constructor
   public ClockTimeFormat(int hour, int min, int sec)
   {
      // the class has a set method that does exactly
      // what I need, so no need to implement everything twice
      setTime(hour, min, sec);
      
      //as default set the clock to 24 hour format
      timeFormat24 = true;
   }

   // 1-argument constructor
   public ClockTimeFormat(int timeInSeconds)
   {
      // we got a set method for this too now
      setTime(timeInSeconds);
      
      //as default set the clock to 24 hour format
      timeFormat24 = true;
   }

   // 1-argument copy constructor
   public ClockTimeFormat(ClockTimeFormat obj)
   {
      hour = obj.hour;
      minute = obj.minute;
      second = obj.second;
     
      //as default set the clock to 24 hour format
      timeFormat24 = obj.timeFormat24;
   }

   // no-arg constructor
   public ClockTimeFormat()
   {
      hour = 0;
      minute = 0;
      second = 0;
      
      //as default set the clock to 24 hour format
      timeFormat24 = true;
   }

   // get method for hour
   public int getHour()
   {
      return hour;
   }

   // get method for minute
   public int getMinute()
   {
      return minute;
   }

   // get method for second
   public int getSecond()
   {
      return second;
   }

   // get method for timeFormat24
   public boolean isTimeFormat24()
   {
      return timeFormat24;
   }
   
   // set method for all three time fields
   public void setTime(int hour, int min, int sec)
   {
      this.hour = hour;
      minute = min;
      second = sec;
   }

   // sets the fields based on the time given as seconds
   public void setTime(int timeInSeconds)
   {
      hour = timeInSeconds / 3600;
      timeInSeconds -= 3600 * hour;

      minute = timeInSeconds / 60;
      timeInSeconds -= 60 * minute;

      second = timeInSeconds;
   }
   
   // set method for timeFormat24
   public void setTimeFormat(int hourFormat)
   {
      if(hourFormat == 12)
      {
         timeFormat24 = false;
      }
      else if(hourFormat == 24)
      {
         timeFormat24 = true;
      }
   }
   
   // returns the time converted to the total seconds
   public int convertToSeconds()
   {
      return hour * 3600 + minute * 60 + second;
   }

   // static method that converts an hour, minute, and second to the total seconds
   public static int convertToSec(int hour, int min, int sec)
   {
      return hour * 3600 + min * 60 + sec;
   }

   // adds 1 second to the time
   public void tic()
   {
      second++;
      
      if(second>59)
      {
         second=0;
         minute++;
         
         if(minute>59)
         {
            minute=0;
            hour++;
            
            if(hour>23)
            {
               hour=0;
            }
         }
      }
   }

   // returns whether the time is before the time in the Clock object
   // given as argument
   public boolean isBefore(ClockTimeFormat time)
   {
      return convertToSeconds() < time.convertToSeconds();
   }

   // returns the number of seconds between the time and the time in the Clock
   // object given as argument
   public int timeInSecondsTo(ClockTimeFormat time)
   {
      if(isBefore(time))
      {
         return time.convertToSeconds() - convertToSeconds();
      }
      else
      {
         return 24 * 3600 - (convertToSeconds() - time.convertToSeconds());
      }
   }

   // returns the time difference between the time and the time in the Clock
   // object given as argument as a Clock object
   public ClockTimeFormat timeTo(ClockTimeFormat time)
   {
      return new ClockTimeFormat(timeInSecondsTo(time));
   }

   // returns the time as a String in the format hh:mm:ss
   // as either 24 hour format or 12 hour format
   public String toString()
   {
     /*  Long version */
            
     /* String time = "";
      
      if(timeFormat24)
      {
         if(hour < 10)
         {
            time += "0";
         }   
         time += hour + ":";
      }
      else //12 hour format
      {
         if(hour == 0) // 0 should be shown as 12 AM
         {
            time += "12:";
         }
         else
         {
            if(hour < 10 || hour>12 && hour-12<10) // hour is in the range from 1 to 9 in either AM or PM
            {
               time += "0";
            }
            
            if(hour<=12)
            {
               time += hour + ":";
            }
            else // hours 13-23 should be shown as 1-11, just PM
            {
               time += hour-12 + ":";
            }  
         }
      }
          
      if(minute < 10)
      {
         time += "0";
      }
      time += minute + ":";

      if(second < 10)
      {
         time += "0";
      }
      time += second;
      
      if(!timeFormat24) //add either AM or PM at the end of the string
      {
         if(hour<12)
         {
            time += " AM";
         }
         else
         {
            time += " PM";
         }
      }
      
      return time; */
      
     
      /*  Shorter version */
      
      String str = "";
      
      if(timeFormat24)
      {
         str = String.format("%02d:%02d:%02d", hour, minute, second); //the static format method in the String class can also be used to always have the ints with 2 digits
      }
      else
      {
         if(hour == 0) // 0 should be shown as 12 AM
         {
            str = String.format("%02d:%02d:%02d", 12, minute, second);
         }
         else if(hour <= 12)
         {
            str = String.format("%02d:%02d:%02d", hour, minute, second);
         }
         else // hours 13-23 should be shown as 1-11, just PM
         {
            str = String.format("%02d:%02d:%02d" , hour-12, minute, second);
         }
         
         if(hour<12)
         {
            str +=" AM";
         }
         else
         {
            str += " PM";
         }
      }
      
      return str;
   }

   // returns whether the object given as argument is identical to
   // the current one
   public boolean equals(Object obj)
   {
      if (obj == null || getClass() != obj.getClass())
      {
         return false;
      }

      ClockTimeFormat other = (ClockTimeFormat) obj;
      return hour == other.hour && minute == other.minute
            && second == other.second && timeFormat24 == other.timeFormat24;
   }

   // returns a new Clock object identical to the current one
   public ClockTimeFormat copy()
   {
      ClockTimeFormat temp = new ClockTimeFormat(hour, minute, second);
     
      // timeFormat24 is not in the constructor, so it's necessary to set 
      // it after making the object
      if(!timeFormat24)
      {
         temp.setTimeFormat(12);
      }
      return temp;
   }
}
