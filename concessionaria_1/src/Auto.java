public class Auto {
    private String marca;
    private String modello;
    private double prezzo;

    public Auto(String marca, String modello, double prezzo) {
        this.marca = marca;
        this.modello = modello;
        this.prezzo = prezzo;
    }

    public Auto(String marca, String modello) {
        this.marca = marca;
        this.modello = modello;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "marca='" + marca + '\'' +
                ", modello='" + modello + '\'' +
                ", prezzo=" + prezzo +
                '}';
    }
}
