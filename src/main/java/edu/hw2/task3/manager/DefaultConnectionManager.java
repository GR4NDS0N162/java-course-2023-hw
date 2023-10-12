package edu.hw2.task3.manager;

import edu.hw2.task3.Connection;
import edu.hw2.task3.ConnectionManager;
import edu.hw2.task3.connection.FaultyConnection;
import edu.hw2.task3.connection.StableConnection;
import java.util.Random;

public class DefaultConnectionManager implements ConnectionManager {
    private final static int ALL_CONNECTIONS = 10;
    private final static int FAULTY_CONNECTIONS = 3;
    private Connection connection;

    @Override
    public Connection getConnection() {
        if (connection == null) {
            Random rand = new Random();
            connection = rand.nextInt(ALL_CONNECTIONS) < FAULTY_CONNECTIONS
                         ? new FaultyConnection()
                         : new StableConnection();
        }
        return connection;
    }
}
