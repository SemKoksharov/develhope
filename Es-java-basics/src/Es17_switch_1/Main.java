package Es17_switch_1;

public class Main {
    public static void main(String args[]){
        int numeroDiGiorno = 8;
        System.out.println("Numero di giorno: " + numeroDiGiorno);
        System.out.println("Vuol dire che oggi " + nomeDiGiorno(numeroDiGiorno));
    }
    public static String nomeDiGiorno(int numeroDiGiorno){
        String result = "";

        switch (numeroDiGiorno) {
            case 1:
                result = "Lunedi";
                break;
            case 2:
                result = "Martedi";
                break;
            case 3:
                result = "Mercoledi";
                break;
            case 4:
                result = "Giovedi";
                break;
            case 5:
                result = "Venerdi";
                break;
            case 6:
                result = "Sabato";
                break;
            case 7:
                result = "Domenica";
                break;
            default:
                result = "HAI UN ERRORE! TRA 10 SECONDI IL TUO PC SI ESPLODERA!";
                break;
        }
        return result;
    }

}
