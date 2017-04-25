public class Person {
    public String email;
    public String username;
    public String hashedPassword;

    Person(String name){
        this.username = name;
    }

    Person(){
        this("Anon");
    }

}
