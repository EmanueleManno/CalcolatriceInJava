import java.util.InputMismatchException;
import java.util.Scanner;

public class calcolatrice {

    public static void main(String[] args) {
        Scanner scelta = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        double pnum, snum, risultato;
        double sc;
        boolean continua = true;

        System.out.println("Ciao! Questa è la calcolatrice!");

        while (continua) {
            // Messaggi Iniziali
            System.out.println("1 - Addizione");
            System.out.println("2 - Sottrazione");
            System.out.println("3 - Moltiplicazione");
            System.out.println("4 - Divisione");
            System.out.println("Quale operazione desidera svolgere egregio?");

            // Scelta con controllo input
            sc = getValidDouble(scelta);

            switch ((int) sc) {
                case 1:
                    System.out.println("Inserisci il primo numero: ");
                    pnum = getValidDouble(input);

                    System.out.println("Inserisci il secondo numero: ");
                    snum = getValidDouble(input);

                    risultato = pnum + snum;
                    System.out.println("Il risultato dell'addizione è " + risultato);
                    break;

                case 2:
                    System.out.println("Inserisci il primo numero: ");
                    pnum = getValidDouble(input);

                    System.out.println("Inserisci il secondo numero: ");
                    snum = getValidDouble(input);

                    risultato = pnum - snum;
                    System.out.println("Il risultato della sottrazione è " + risultato);
                    break;

                case 3:
                    System.out.println("Inserisci il primo numero: ");
                    pnum = getValidDouble(input);

                    System.out.println("Inserisci il secondo numero: ");
                    snum = getValidDouble(input);

                    risultato = pnum * snum;
                    System.out.println("Il risultato della moltiplicazione è " + risultato);
                    break;

                case 4:
                    System.out.println("Inserisci il primo numero: ");
                    pnum = getValidDouble(input);

                    System.out.println("Inserisci il secondo numero: ");
                    snum = getValidDouble(input);

                    // Gestione divisione per zero
                    if (snum != 0) {
                        risultato = pnum / snum;
                        System.out.println("Il risultato della divisione è " + risultato);
                    } else {
                        System.out.println("Errore: Divisione per zero non permessa.");
                    }
                    break;

                default:
                    System.out.println("Opzione non valida. Per favore seleziona un'opzione valida.");
                    continue; // Richiede un'altra operazione se l'opzione non è valida
            }

            // Chiedi all'utente se vuole eseguire un'altra operazione
            System.out.println("Vuoi eseguire un'altra operazione? (Sì/No)");
            String risposta = scelta.next().trim().toLowerCase();
            if (risposta.equals("no") || risposta.equals("n")) {
                continua = false;
                System.out.println("Arrivederci caro utente, ci vediamo la prossima volta!");
            }
        }

        // Chiudi gli scanner
        scelta.close();
        input.close();
    }

    // Metodo per ottenere un numero valido
    private static double getValidDouble(Scanner scanner) {
        while (true) {
            try {
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Errore: Per favore inserisci un numero valido.");
                scanner.next(); // Consuma l'input non valido
            }
        }
    }
}
