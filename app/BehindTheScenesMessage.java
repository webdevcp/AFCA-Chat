public class BehindTheScenesMessage {
    public static int WHOISHERE = 0, LOGIN = 1, LOGOUT = 2, READRECEIPT = 3;
    private int type;
    private String content;

    //getters
    public int getType() {
        return type;
    }

    public String getContent() {
        return content;
    }
}