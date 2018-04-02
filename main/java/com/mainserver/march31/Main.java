package com.mainserver.march31;

import com.mainserver.march31.db.DbAdapter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext ctx =
                new ClassPathXmlApplicationContext("spring-context.xml");

//        Student student1 = ctx.getBean(Student.class);
//        System.out.println(student1);

        DbAdapter dbAdapter = ctx.getBean(DbAdapter.class);
        dbAdapter.run();
    }

    public static int getRandomInt() {
        return 4;
    }

}