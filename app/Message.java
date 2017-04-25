import java.util.*;
import java.io.*;

public abstract class Message implements Serializable {
    public static int NOTSENT = 0, SENTNOTRECEIVED = 1, RECEIVEDNOTREAD = 2, READ = 3;
    protected Person sender;
    protected List receivers = new ArrayList();
    protected Object content;
    protected int status;

    public void Message(Person sendPerson, Object content) {
        sender = sendPerson;
        this.content = content;
        status = NOTSENT;
    }


    //getters
    public Person getSender() {
        return sender;
    }

    public Object getContent() {
        return content;
    }

    public int getStatus() {
        return status;
    }

    //setters
    public void setStatus(int newStatus) {
        status = newStatus;
    }
}

