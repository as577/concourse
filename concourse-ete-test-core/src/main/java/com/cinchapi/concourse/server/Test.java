package com.cinchapi.concourse.server;

import com.cinchapi.concourse.Concourse;

public class Test {
    
    public static void main(String...strings) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        ManagedConcourseServer server = ManagedConcourseServer.manageNewServer("0.4.4");
        server.start();
        Concourse concourse = server.connect();
        server.stop();
    }

}
