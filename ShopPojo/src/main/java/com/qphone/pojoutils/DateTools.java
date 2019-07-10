package com.qphone.pojoutils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTools {
    /**
     * 处理时间，返回字符串
      * @param date
     * @return
     */
    public static String dateFormat(Date date){
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-DD HH:mm:ss");
        return simpleDateFormat.format(date);
    }
}
