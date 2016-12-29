package org.lion.core.utils;

import static org.hamcrest.CoreMatchers.*;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by chenll on 2016/12/28.
 */
public class BeanUtilTest {

    public class Source{
        private int age;
        private String name;

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

    @Test
    public void testBeanCopy() throws InvocationTargetException, IllegalAccessException {
        Source source = new Source();
        source.setName("chenlile");
        source.setAge(35);
        Source target = new Source();
        BeanUtil.copyProperties(target,source);
        Assert.assertEquals(target.getAge(),source.getAge());
        Assert.assertEquals(target.getName(),source.getName());
    }
}
