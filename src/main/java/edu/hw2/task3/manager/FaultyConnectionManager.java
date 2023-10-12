package edu.hw2.task3.manager;

import edu.hw2.task3.Connection;
import edu.hw2.task3.ConnectionManager;
import edu.hw2.task3.FaultyConnection;

public class FaultyConnectionManager implements ConnectionManager {
    @Override
    public Connection getConnection() {
        return new FaultyConnection();
    }
}
