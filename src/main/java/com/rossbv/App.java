package com.rossbv;

import java.util.Calendar;
import com.luckycatlabs.sunrisesunset.SunriseSunsetCalculator;
import com.luckycatlabs.sunrisesunset.dto.Location;

public class App 
{
    public static void main( String[] args )
    {
        Location location = new Location("51.3669", "0.7954");
        SunriseSunsetCalculator calculator = new SunriseSunsetCalculator(location, "Europe/London");
        
        String officialSunrise = calculator.getOfficialSunriseForDate(Calendar.getInstance());
        String officialSunset = calculator.getOfficialSunsetForDate(Calendar.getInstance());
        System.out.printf( "Sunrise: %s\n", officialSunrise );
        System.out.printf( "Sunset: %s\n", officialSunset );
    }
}
