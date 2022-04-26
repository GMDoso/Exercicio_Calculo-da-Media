import java.util.Scanner; 
public class Exercise03 {
    public static void main(String[] args) {
    try (Scanner scan = new Scanner(System.in)) {
        System.out.print("Digite sua nota na AC1: ");
        double AC1 = scan.nextDouble();

        System.out.print("Digite sua nota na AC2: ");
        double AC2 = scan.nextDouble();

        System.out.print("Digite sua nota na AG: ");
        double AG = scan.nextDouble();

        System.out.print("Digite sua nota na AF: ");
        double AF = scan.nextDouble();

        double notaf = ( AC1 * 0.15 ) + (AC2 * 0.30) + (AG * 0.10) + (AF * 0.45);

        if (notaf >= 5) 
        { System.out.printf("Voce foi aprovado com " + notaf + " de media!"); }

        else 
        { System.out.printf("Voce foi reprovado, sua media foi " + notaf + "!"); }

    } 

    } 
}