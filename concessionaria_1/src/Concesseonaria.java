
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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
    public Map<String, Integer> conteggioPerMarca(){
        //ho creato nuova mappa (String, Integer), la chiamo "conteggio"
        Map<String, Integer> conteggio = new HashMap<>();
        // cicliamo sulla lista di tutti Auto che abbiamo
        for (Auto auto : lista ){
            // Otteniamo marca di auto corrente.
            String marca = auto.getMarca();
            // Aggiungiamo una voce alla mappa "conteggio", dove la chiave è la marca dell'auto,
            // e il valore è il numero di auto di quella marca nella collezione.
            // Se la marca è già presente nella mappa, aumentiamo il numero di 1.
            // In caso contrario, se la marca non è stata trovata, aggiungiamo una nuova voce con un conteggio di 1.
            conteggio.put(marca, conteggio.getOrDefault(marca, 0)+1);
        }
        return conteggio;
    }
}

