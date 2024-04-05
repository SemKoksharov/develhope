package designPatterns.build;

public class Main {
    public static void main(String[] args) {
        Person p1 = PersonBuilder.builder()
                .setName("Adolf")
                .setSurname("Hitler")
                .setAge(666)
                .setTelephoneNumber("228 - 14 - 88")
                .setAddress("Cimitero")
                .build();

        Person p2 = PersonBuilder.builder()
                .setName("Benito")
                .setSurname("Mussolini")
                .build();

        System.out.println(p1);
        System.out.println();
        System.out.println(p2);
    }
    }
