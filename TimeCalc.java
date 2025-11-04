public class TimeCalc {
    public static void main(String[] args) 
    {
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int minutesToAdd = Integer.parseInt(args[1]);
        int hoursToAdd = 0;
        String underTenMinutes, underTenHours;

        while (minutesToAdd > 60)
        {
            minutesToAdd -= 60;
            hoursToAdd++;
        }

        if (minutesToAdd + minutes < 60)
        {
            minutes += minutesToAdd;
        }
        else 
        {
            hoursToAdd++;
            minutes -= 60;
            minutes += minutesToAdd;
        }
        while (hoursToAdd + hours > 23)
        {
            hoursToAdd -= 24;
        }
        hours += hoursToAdd;
        if (minutes < 10 && hours < 10)
		{
			underTenMinutes = "0" + minutes;
            underTenHours = "0" + hours;
            System.out.println(underTenHours + ":" + underTenMinutes);
		}
        else 
        {
        if (hours < 10)
        {
            underTenHours = "0" + hours;
            System.out.println(underTenHours + ":" + minutes);
        }
        if (minutes < 10)
        {
            underTenMinutes = "0" + hours;
            System.out.println(hours + ":" + underTenMinutes);
        }
    }
        if (minutes >= 10 && hours >= 10)
        {
            System.out.println(hours + ":" + minutes);
        }
    }
}
