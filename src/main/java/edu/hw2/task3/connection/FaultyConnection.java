package edu.hw2.task3.connection;

import edu.hw2.task3.Connection;
import edu.hw2.task3.ConnectionException;
import java.util.Random;

public class FaultyConnection implements Connection {
    private final static int ALL_ATTEMPTS = 10;
    private final static int FAILED_ATTEMPTS = 3;

    @Override
    public void execute(String command) {
        Random rand = new Random();
        if (rand.nextInt(ALL_ATTEMPTS) < FAILED_ATTEMPTS) {
            throw new ConnectionException();
        }
        System.out.println("FaultyConnection: " + command);
    }

    @Override
    public void close() throws Exception {
    }
}
