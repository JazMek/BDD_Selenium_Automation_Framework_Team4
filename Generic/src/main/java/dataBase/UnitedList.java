package dataBase;

public class UnitedList {
    String from;
    String to;
    String month;
    String Adults;
    String Seniors;
    String Children1;
    String Children2;

    String from1;
    String to1;
    int month1;
    int Adults1;
    int Seniors1;
    int Children11;
    int Children21;


    public UnitedList(String from, String to, String month, String Adults, String Seniors, String Children1, String Children2){
        this.from = from;
        this.to = to;
        this.month= month;
        this.Adults= Adults;
        this.Seniors= Seniors;
        this.Children1= Children1;
        this.Children2= Children2;


    }

    public String getFrom1() {
        return from1;
    }

    public String getTo1() {
        return to1;
    }

    public int getMonth1() {
        return month1;
    }

    public int getAdults1() {
        return Adults1;
    }

    public int getSeniors1() {
        return Seniors1;
    }

    public int getChildren11() {
        return Children11;
    }

    public int getChildren21() {
        return Children21;
    }

    public UnitedList(String from1, String to1, int month1, int Adults1, int Seniors1, int Children11, int Children21){
        this.from1 = from1;
        this.to1= to1;
        this.month1= month1;
        this.Adults1= Adults1;
        this.Seniors1= Seniors1;
        this.Children11= Children11;
        this.Children21= Children21;


    }
    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public String getMonth() {
        return month;
    }

    public String getAdults() {
        return Adults;
    }

    public String getSeniors() {
        return Seniors;
    }

    public String getChildren1() {
        return Children1;
    }

    public String getChildren2() {
        return Children2;
    }




}
