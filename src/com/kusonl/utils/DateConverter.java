package com.kusonl.utils;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConverter implements Converter<String, Date> {
    @Override
    public Date convert(String source) {

        /*DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime parse = LocalDateTime.parse(source, dateTimeFormatter);
        // 获取时间地区ID
        ZoneId zoneId = ZoneId.systemDefault();
        ZonedDateTime zonedDateTime = parse.atZone(zoneId);
        Date date = Date.from(zonedDateTime.toInstant());

        if (date != null) {
            return date;
        }*/

        Date parse = null;
        try {
            parse = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(source);
        } catch (ParseException e) {
            e.printStackTrace();
        }


        return parse;
    }
}
