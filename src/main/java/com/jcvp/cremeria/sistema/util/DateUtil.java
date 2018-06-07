package com.jcvp.cremeria.sistema.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

    private static DateFormat formatShortDate = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");

    private static DateFormat formatDate = new SimpleDateFormat("MM/dd/yyyy");

    public static String formatShorDate(Date date){

        if(date==null){
            return "";
        }

        return formatShortDate.format(date);
    }
}
