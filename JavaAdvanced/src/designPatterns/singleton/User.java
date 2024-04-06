package designPatterns.singleton;

public class User {

    private static User user;
    private String name;
    private int age;

    //creando sto parametro controllo che `e sempre la stessa istanza!
    private static int userNumber = 0;


    public User() {
        this.name = "default name";
        this.age = 0;
        userNumber++;
    }

    public static User getUser() {
        if (user == null) {
            user = new User();
        }
        return user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String printUserData() {
        return "User " + userNumber +  " Name: " + name + " Age: " + age;
    }

}
