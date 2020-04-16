package com.avic.qf.pattern.singleton.test;


import com.avic.qf.pattern.singleton.threadlocal.ThreadLocalSingleton;
import org.apache.ibatis.executor.ErrorContext;
import org.springframework.beans.factory.config.AbstractFactoryBean;

/**
 * Created by LiBo.
 */
public class ThreadLocalSingletonTest {

    public static void main(String[] args) {
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());

        Thread t1 = new Thread(new ExectorThread());
        Thread t2 = new Thread(new ExectorThread());
        t1.start();
        t2.start();
        System.out.println("End");
    }
}
