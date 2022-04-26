import java.util.Scanner; 
public class Exercise03JOKER {
    public static void main(String[] args) {
    try (Scanner scan = new Scanner(System.in)) {
        System.out.print("Digite sua nota na AC1: ");
        float AC1 = scan.nextFloat();

        System.out.print("Digite sua nota na AC2: ");
        float AC2 = scan.nextFloat();

        System.out.print("Digite sua nota na AG: ");
        float AG = scan.nextFloat();

        System.out.print("Digite sua nota na AF: ");
        float AF = scan.nextFloat();

        float notaf = (float) (( AC1 * 0.15 ) + (AC2 * 0.30) + (AG * 0.10) + (AF * 0.45));

        if (notaf >= 5) 
        { System.out.printf("Voce foi aprovado com " + notaf + " de media!"); }

        else 
        { System.out.printf("Voce foi reprovado, sua media foi " + notaf + "!"); }

    } 

    } 
}