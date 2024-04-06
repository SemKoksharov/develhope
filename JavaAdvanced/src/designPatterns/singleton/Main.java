package designPatterns.singleton;

/*
Crea una classe User che abbia i parametri privati nome ed età e i getter e setter
All'interno di User ci sarà anche una funzione che stampi a video
le informazioni di età e il nome.
Creare 2 oggetti User di cui creerà un'istanza.
Del primo si stamperanno le informazioni di default, del secondo
si cambieranno le informazioni e poi si stamperanno a video

 */
public class Main {
    public static void main(String[] args) {

        //user che ha nome e eta di default!
        User user = User.getUser();

        //controllo
        System.out.println("user default  " + user.printUserData() + "\n");

        //imposto dati di user1
        User user1 = User.getUser();
        user1.setName("Uncane");
        user1.setAge(20);

        //stampando tutti due casi controllo che `e la stessa istanza!
        System.out.println("user1 " + user1.printUserData());
        System.out.println("user " + user.printUserData() + "\n");

        //camibio dati di user
        user.setAge(70);
        user.setName("Cavallovecchio");

        //controllo di nuovo!
        System.out.println("user " + user.printUserData());
        System.out.println("user1 " + user1.printUserData());
    }
}
