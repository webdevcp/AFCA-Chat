public class BehindTheScenesMessage extends Message {
    public static int WHOISHERE = 0, LOGIN = 1, LOGOUT = 2, READRECEIPT = 3;
    private int type;
    private String content;

    public void BehindTheScenesMessage(Person sendPerson, Object content) {
        sender = sendPerson;
        this.content = (String) content;
        status = NOTSENT;
    }

    public void BehindTheScenesMessage(Person sendPerson, Object content, int type) {
        sender = sendPerson;
        this.content = (String) content;
        status = NOTSENT;
        this.type = type;
    }

    //getters
    public int getType() {
        return type;
    }

    public String getContent() {
        return content;
    }
}