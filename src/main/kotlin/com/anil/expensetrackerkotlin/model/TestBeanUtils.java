package com.anil.expensetrackerkotlin.model;

import org.apache.commons.beanutils.PropertyUtils;

import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

public class TestBeanUtils {
    public static void main(String[] args) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Student s = new Student();
        s.setName("test1");
        s.setAmt(100);
        s.setTotalAmt(BigDecimal.ONE);

        System.out.println(PropertyUtils.getProperty(s,"name"));
        System.out.println(PropertyUtils.getProperty(s,"amt"));
        System.out.println(PropertyUtils.getProperty(s,"totalAmt"));


    }
}
