import java.io.*;

public class TextMessage extends Message implements Serializable {
    private String content;

//    public void TextMessage(Person sendPerson, Object content) {
//        sender = sendPerson;
//        this.content = (String) content;
//        status = NOTSENT;
//    }

    TextMessage(Person sendPerson, String content) {
        sender = sendPerson;
        this.content = content;
        status = NOTSENT;
    }

    //getters
    @Override
    public String getContent() {
        return content;
    }



}