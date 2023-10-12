package edu.hw2.task3.manager;

import edu.hw2.task3.Connection;
import edu.hw2.task3.ConnectionManager;
import edu.hw2.task3.connection.FaultyConnection;

public class FaultyConnectionManager implements ConnectionManager {
    private Connection connection;

    @Override
    public Connection getConnection() {
        if (connection == null) {
            connection = new FaultyConnection();
        }
        return connection;
    }
}
