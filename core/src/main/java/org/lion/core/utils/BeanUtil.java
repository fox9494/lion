package org.lion.core.utils;

import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by DELL on 2016/12/27.
 */
public class BeanUtil {


    /**
     * 浅克隆
     * @param obj
     * @return
     */
    public static Object getCloneObje(Object obj) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        return BeanUtils.cloneBean(obj);
    }

    public static void copyProperties(Object target,Object orig) throws InvocationTargetException, IllegalAccessException {
        BeanUtils.copyProperties(target,orig);
    }
}
