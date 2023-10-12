package edu.hw2.task3;

import java.util.Random;

public class DefaultConnectionManager implements ConnectionManager {
    private final static int ALL_CONNECTIONS = 10;
    private final static int FAULTY_CONNECTIONS = 3;

    @Override public Connection getConnection() {
        Random rand = new Random();
        return rand.nextInt(ALL_CONNECTIONS) < FAULTY_CONNECTIONS
               ? new FaultyConnection()
               : new StableConnection();
    }
}
