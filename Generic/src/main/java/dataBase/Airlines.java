package dataBase;
public class Airlines {
    public static String From ;
    public static String to ;
    public Airlines(String location, String destination) {
        this.From= location;
        this.to=destination;
    }



    public static String getFrom() {
        return From;
    }

    public static void setFrom(String from) {
        From = from;
    }

    public static String getTo() {
        return to;
    }

    public static void setTo(String to) {
        dataBase.Airlines.to = to;
    }

}