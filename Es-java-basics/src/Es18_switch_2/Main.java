
package Es18_switch_2;

public class Main {
    public static void main(String args[]){
        char tipoDiOperazione = 's';
        System.out.println("Carattere: " + tipoDiOperazione);
        System.out.println("Tipo di operazione `e " + nomeDiOperazione(tipoDiOperazione));
    }
    public static String nomeDiOperazione(char tipoDiOperazione){
        String result = "";

        switch (tipoDiOperazione) {
            case '+':
                result = "Addizione.";
                break;
            case '-':
                result = "Sottrazione.";
                break;
            case '*':
                result = "Moltiplicazione.";
                break;
            case '/':
                result = "Divizione.";
                break;
            case '%':
                result = "Divisione con il resto.";
                break;
            default:
                result = "sconosciuto.\nHAI UN ERRORE! TRA 10 SECONDI IL TUO PC SI ESPLODERA!";
                break;
        }
        return result;
    }

}
