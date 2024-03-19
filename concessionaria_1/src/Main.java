public class Main {
    public static void main(String[] args) {
        Concesseonaria concesseonaria = new Concesseonaria("Auto World");
        Auto auto = new Auto("Opel", "Astra", 999.24);
        concesseonaria.addAuto(auto);
        concesseonaria.cercaAuto("AsTrA");
        concesseonaria.eliminaAuto(auto);
        concesseonaria.stampaAuto();
        Auto auto1 = new Auto("Toyota", "Corolla");
        concesseonaria.addAuto(auto1);
        concesseonaria.addAuto(auto);
        concesseonaria.stampaAuto();
        concesseonaria.eliminaAuto(auto);
        concesseonaria.cercaAuto("ToyOta");
        System.out.println(concesseonaria.conteggioPerMarca());
        concesseonaria.addAuto(auto);
        System.out.println(concesseonaria.conteggioPerMarca());
        Auto auto2 = new Auto("Opel", "Corsa");
        concesseonaria.addAuto(auto2);
        System.out.println(concesseonaria.conteggioPerMarca());
    }
}
