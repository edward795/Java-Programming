import javax.xml.crypto.Data;

class Database{
    private static Database dbobj;

    private Database(){

    }

    public static Database getInstance(){
        if(dbobj==null){
            dbobj=new Database();
        }

        return dbobj;
    }

    public void getConnectionStatus(){
        System.out.println("Connected to Database");
    }
}

public class SingletonClass {
    public static void main(String[] args){
       Database db1;
       db1=Database.getInstance();
       db1.getConnectionStatus();
    }
}
