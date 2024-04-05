package designPatterns.build;

public class PersonBuilder {
    private String name;
    private String surname;
    private int age;
    private String telephoneNumber;
    private String address;

    public PersonBuilder(){}

    public static   PersonBuilder builder(){
        return new PersonBuilder();
    }

    public String getName() {
        return name;
    }

    public PersonBuilder setName(String name) {
        this.name = name;
        return  this;
    }

    public String getSurname() {
        return surname;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return  this;
    }

    public int getAge() {
        return age;
    }

    public PersonBuilder setAge(int age) {
        this.age = age;
        return  this;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public PersonBuilder setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
        return  this;
    }

    public String getAddress() {
        return address;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return  this;
    }

    public Person build(){
        return new Person(this);
    }
}
