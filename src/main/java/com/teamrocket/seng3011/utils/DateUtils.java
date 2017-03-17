package com.teamrocket.seng3011.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by JHXSMatthew on 17/3/17.
 */
public class DateUtils {
    private static DateFormat formatymd = new SimpleDateFormat("yyyy-MM-dd");
    private static DateFormat formatym = new SimpleDateFormat("yyyy-MM");

    public static String dateToStringYM(Date date){
        return formatym.format(date);
    }

    public static String dateToStringYMD(Date date){
        return formatymd.format(date);
    }

    public static Date stringToDateYM(String date) throws ParseException {
        return formatym.parse(date);
    }

    public static Date stringToDateYMD(String date) throws ParseException {
        return formatymd.parse(date);
    }



}
