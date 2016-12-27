package org.lion.core.utils;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.Date;

/**
 * 使用fastjson工具包
 * Created by chenll on 2016/12/27.
 */
public class JsonUtil {

    public static class A{
        private int age;

        private String name;

        public A() {
        }

        public A(int age, String name) {
            this.age = age;
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
    public static void main(String[] args) {
        System.out.println("json:"+obj2Json(new A(20,"chenlile")));
        A a = json2Obj("{\"age\":21,\"name\":\"zj\"}", A.class);

        System.out.println("json:"+obj2Json(new A(20,"chenlile")));
    }

    /**
     * 对象转json字符串
     * @param obj
     * @return
     */
    public static String obj2Json(Object obj){
        return JSON.toJSONString(obj);
    }

    /**
     * json字符串转对象
     * @param str
     * @param clazz
     * @param <T>
     * @return
     */
    public  static <T>  T json2Obj(String str,Class<T> clazz){
        return JSON.parseObject(str,clazz);
    }



}
