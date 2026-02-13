package DesignPrinciple;

class MySQLDatabase {
    public void connect() {
        System.out.println("Connected to MySQL");
    }
}

class Application {
    private MySQLDatabase database = new MySQLDatabase();

    public void start() {
        database.connect();
    }
}

public class TightCouplingExample {
    public static void main(String[] args) {
        Application app = new Application();
        app.start();
    }
}

