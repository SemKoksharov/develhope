package Esercizio_1_GetSet_Student;

public class Student {
    private String name;
    private String surname;
    private int id;

    public Student(String name, String surname, int id){
        this.name = name;
        this.surname = surname;
        this.id = id;
    }
    public String getName(){
        return name;
    }

    public String getSurname(){
        return surname;
    }

    public int getId(){
        return id;
    }

    public void setName(){
        this.name = name;
    }

    public void setSurname(){
        this.surname = surname;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "##Student's id card##" +
                "\nname: " + name +
                "\nsurname: " + surname +
                "\nid: " + id ;
    }
}
