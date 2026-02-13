package DesignPrinciple;

 interface Database{
    void connect();
 }

 class MySQLDatabase implements Database {
    public void connect() {
        System.out.println("Connected to MySQL");
    }
 }

class MongoDB implements Database {
    public void connect() {
        System.out.println("Connected to MongoDB");
    }
 }

class FirebaseDatabase implements Database {
    public void connect() {
        System.out.println("Connected to Firebase");
    }
 }


 class Application {
    private Database database;

    public Application(Database database) {
        this.database = database;
    }

    public void start() {
        database.connect();
    }
}

public class DependencyInjectionExample {
    public static void main(String[] args) {
        Database mysql = new MySQLDatabase();
        Database mongo = new MongoDB();
        Database firebase = new FirebaseDatabase();

        Application app1 = new Application(mysql);
        Application app2 = new Application(mongo);
        Application app3 = new Application(firebase);

        app1.start();
        app2.start();
        app3.start();   
    }
    
}
