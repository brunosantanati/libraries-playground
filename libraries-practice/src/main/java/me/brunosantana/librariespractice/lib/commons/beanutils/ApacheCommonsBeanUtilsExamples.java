package me.brunosantana.librariespractice.lib.commons.beanutils;

import me.brunosantana.librariespractice.lib.commons.lang.Person;
import org.apache.commons.beanutils.BeanUtils;

public class ApacheCommonsBeanUtilsExamples {

    public String testCopyProperties() {
        try {
            Person p = new Person("Bruno", 37);
            Employee e = new Employee();
            BeanUtils.copyProperties(e, p);
            return e.toString();
        } catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

}
