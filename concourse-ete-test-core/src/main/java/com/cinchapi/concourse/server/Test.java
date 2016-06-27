package com.cinchapi.concourse.server;

import com.cinchapi.concourse.Concourse;

public class Test {
    
    public static void main(String...strings) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Class<?> clazz = Class.forName("com.cinchapi.concourse.Concourse$Client");
        Concourse concourse = Concourse.connect();
        //Object client = clazz.newInstance();
        System.out.println(concourse);
    }

}
