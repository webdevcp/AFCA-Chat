public class TextMessage extends Message {
    private String content;

//    public void TextMessage(Person sendPerson, Object content) {
//        sender = sendPerson;
//        this.content = (String) content;
//        status = NOTSENT;
//    }

    public void TextMessage(Person sendPerson, String content) {
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