package edu.hw2.task3;

public final class PopularCommandExecutor {
    private final ConnectionManager manager;
    private final int maxAttempts;

    public PopularCommandExecutor(ConnectionManager manager, int maxAttempts) {
        this.manager = manager;
        this.maxAttempts = maxAttempts;
    }

    public void updatePackages() {
        tryExecute("apt update && apt upgrade -y");
    }

    public void tryExecute(String command) throws ConnectionException {
        for (int attempts = 1; attempts <= maxAttempts; attempts++) {
            try {
                manager.getConnection().execute(command);
                return;
            } catch (ConnectionException e) {
                if (attempts >= maxAttempts) {
                    throw new ConnectionException("Failed to execute the command (number of attempts exceeded)", e);
                }
            }
        }
    }
}
