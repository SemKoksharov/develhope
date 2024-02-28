package Es1_GetSet_Student;

public class Main {
    public static void main(String[] args) {
        Student vasiliyPetrov = new Student("Vasiliy", "Petrov", 666);
        Student annaKurochkina = new Student("Anna", "Kurochkina", 88);

        System.out.println("Student card Vasily"+"\nName: "+ vasiliyPetrov.getName()+"\nSurname: "+ vasiliyPetrov.getSurname() + "\nID: "+ vasiliyPetrov.getId());
        System.out.println("\nStudent card Anna"+"\nName: "+ annaKurochkina.getName()+"\nSurname: "+ annaKurochkina.getSurname() + "\nID: "+ annaKurochkina.getId());

        vasiliyPetrov.setId(6254);
        System.out.println("\nStudent ID Vasily was changed to: " + vasiliyPetrov.getId());
        System.out.println("\nStudent card Vasily"+"\nName: "+ vasiliyPetrov.getName()+"\nSurname: "+ vasiliyPetrov.getSurname() + "\nID: "+ vasiliyPetrov.getId());
    }



}
