package designPatterns.build;

public class Person {

    private String name;
    private String surname;
    private int age;
    private String telephoneNumber;
    private String address;

    public Person(PersonBuilder builder) {
        this.name = builder.getName();
        this.surname = builder.getSurname();
        this.age = builder.getAge();
        this.telephoneNumber = builder.getTelephoneNumber();
        this.address = builder.getAddress();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    @Override
    public String toString() {
        return "Name= " + name + " Surname= " + surname +
                (age != 0 ? " Age= " + age : "") +
                (telephoneNumber != null ? " Tel. = " + telephoneNumber : "") +
                (address != null ? " Address= " + address : "");
    }

}
