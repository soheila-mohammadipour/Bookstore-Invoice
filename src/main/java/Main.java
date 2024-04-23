import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double Gesamtpreis =0d;
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Bitte schreiben Ihr Name:");
            String name=scanner.next();
            System.out.println("Bitte schreiben die Anzahl der Bücher:");
            int counter = scanner.nextInt();


            for (int i=0;i<counter;i++){
                System.out.println("Bitte schreiben der Name des Buch:");
                String buch= scanner.next();
                System.out.println("Bitte schreiben die preis des Buch:");
                int preis= scanner.nextInt();

                Gesamtpreis +=preis;

            }

        }catch (Exception e){
            System.out.println("Bitte schreiben das richtige Info.");
        }
        System.out.println("  Ihr Gesamtpreis:" +  Gesamtpreis);
        System.out.println(" Sie mussen bezahlen:" +  Gesamtpreis);

    }
}
