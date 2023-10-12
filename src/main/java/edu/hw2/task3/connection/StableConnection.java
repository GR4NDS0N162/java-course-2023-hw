package edu.hw2.task3.connection;

import edu.hw2.task3.Connection;

public class StableConnection implements Connection {
    @Override
    public void execute(String command) {
        System.out.println("StableConnection: " + command);
    }

    @Override
    public void close() {
        System.out.println("StableConnection closed");
    }
}
