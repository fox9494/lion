package org.lion.core.utils;

import org.junit.Test;

import java.util.Date;

/**
 * Created by chenll on 2016/12/28.
 */
public class DateTimeUtilTest {

    @Test
    public void str2DateTest(){
        System.out.println(DateTimeUtil.str2Date("2016-12-13 12:45:58","yyyy-MM-dd HH:mm:ss"));
    }

    @Test
    public void date2StrTest(){
        System.out.println(DateTimeUtil.date2Str(new Date(),"yyyy-MM-dd HH:mm:ss"));
    }
}
