package com.guweibit.utils;

import com.guweibit.entity.T_Order;
import com.guweibit.service.T_OrderService;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtils {
    public static String dateFormatToString(Date date){
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            if (null!=date){
                return sdf.format(date);
            }
            return date+"";
    }

}
