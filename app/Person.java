public class Person {
    public String email;
    public String username;
    public String hashedPassword;

    public Person(String name){
        this.username = name;
    }

    public Person(){
        this("Anon");
    }

}
