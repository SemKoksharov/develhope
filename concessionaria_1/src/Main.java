//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
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

        }
    }
