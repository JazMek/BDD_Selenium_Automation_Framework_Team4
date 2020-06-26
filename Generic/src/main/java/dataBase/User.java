package dataBase;

public class User {
    String stName;
    String stID;
    String stDOB;

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    String item;
    public User(){}


    public User(String item) {
        this.item = item;
    }


    public User(String stName, String stID){
        this.stName = stName;
        this.stID = stID;
    }
    public User(String stName, String stID, String stDOB){
        this.stName = stName;
        this.stID = stID;
        this.stDOB = stDOB;

    }
    public String getStName() {
        return stName;
    }

    public void setStName(String stName) {
        this.stName = stName;
    }

    public String getStID() {
        return stID;
    }

    public void setStID(String stID) {
        this.stID = stID;
    }

    public String getStDOB() {
        return stDOB;
    }

    public void setStDOB(String stDOB) {
        this.stDOB = stDOB;
    }
}
