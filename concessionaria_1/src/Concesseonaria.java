
import java.util.Arrays;

public class Concesseonaria {
    private String nome;
    private Auto[] lista = new Auto[0];

    public Concesseonaria(String nome, Auto[] lista) {
        this.nome = nome;
        this.lista = lista;
    }

    public Concesseonaria(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Auto[] getLista() {
        return lista;
    }

    public void setLista(Auto[] lista) {
        this.lista = lista;
    }

    public void stampaAuto() {
        System.out.println("Auto in concessionaria " + this.getNome() + ":\n" + Arrays.toString(lista) + '\n');
    }

    public void addAuto(Auto auto) {
        Auto[] temp = new Auto[lista.length + 1];
        for (int i = 0; i < lista.length; i++) {
            temp[i] = lista[i];
        }
        temp[temp.length - 1] = auto;
        lista = temp;
        System.out.println("Auto aggiunto: " + auto.getMarca() + " " + auto.getModello());
    }

    public void eliminaAuto(Auto auto) {
        int ind = 0;
        Auto[] temp = new Auto[lista.length - 1];
        for (int i = 0; i < lista.length; i++) {
            if (!auto.equals(lista[i])) {
                temp[ind] = lista[i];
                ind++;
            }
        }
        lista = temp;
        System.out.println("Auto eliminato: " + auto.getMarca() + " " + auto.getModello());
    }

    public void cercaAuto(String s) {
        Auto[] result = new Auto[lista.length];
        int j = 0;
        for (int i = 0; i < lista.length; i++) {
            if (lista[i].getMarca().toLowerCase().contains(s.toLowerCase()) || lista[i].getModello().toLowerCase().contains(s.toLowerCase()))
            {
                result[j] = lista[i];
                j++;
            }
        }
        System.out.println("Auto trovati:\n" + Arrays.toString(result));
    }
    /*

Realizzare un metodo che permetta di rimuovere un auto dalla concessionaria
Realizzare un metodo che permetta di effettuare una ricerca delle auto presenti nella concessionaria in base alla marca.
Realizzare un metodo che non prende in input alcun parametro e restituisce una mappa che tiene traccia del conteggio delle auto presenti nella concessionaria in base alla marca.

     */
}

