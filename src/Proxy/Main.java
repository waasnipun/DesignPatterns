package Proxy;

import java.util.Objects;

interface DatabaseExecuter{
    public void executeDatabase(String query) throws Exception;
}

// Can perform any query
class DatabaseExecuterImpl implements DatabaseExecuter{

    @Override
    public void executeDatabase(String query) throws Exception {
        System.out.println("Going to execute Query " + query);
    }
}

//Controlling the access of the query
class DatabaseExecuterProxy implements DatabaseExecuter{
    boolean ifAdmin;
    DatabaseExecuterImpl dbExecuter;

    public DatabaseExecuterProxy(String name, String password){
        if(Objects.equals(name, "Admin") && Objects.equals(password, "Admin@123")){
            ifAdmin = true;
        }
        dbExecuter = new DatabaseExecuterImpl();
    }

    @Override
    public void executeDatabase(String query) throws Exception {
        if(ifAdmin){
            dbExecuter.executeDatabase(query);
        }else{
            if(query.equals("DELETE")){
                throw new Exception("DELETE not allowed for non admin users");
            }
            else{
                dbExecuter.executeDatabase(query);
            }
        }
    }
}

public class Main {
    public static void main(String[] args) throws Exception {

        DatabaseExecuter nonAdminExecuter = new DatabaseExecuterProxy("NonAdmin", "Admin@123");
        nonAdminExecuter.executeDatabase("ADD");

        DatabaseExecuter adminExecuter = new DatabaseExecuterProxy("Admin", "Admin@123");
        adminExecuter.executeDatabase("DELETE");
    }
}