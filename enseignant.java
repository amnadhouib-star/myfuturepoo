import java.util.Scanner;

public class enseignant {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int code_E;
        String libelle_matiere;
        int nbetudiant;
        int choix;

        System.out.println("Veuillez saisir le code :");
        code_E = sc.nextInt();
        sc.nextLine();

        System.out.println("Veuillez saisir LIBELLE MATIERE :");
        libelle_matiere = sc.nextLine();

        System.out.println("Veuillez saisir nbetudiant :");
        nbetudiant = sc.nextInt();

        do {
            System.out.println("1. Afficher les details enseignant");
            System.out.println("2. Quitter");
            choix = sc.nextInt();

            switch (choix) {
                case 1:
                    System.out.println(code_E + " "+ libelle_matiere + " "+ nbetudiant);
                    break;

                case 2:
                    System.out.println("BYYEEE");
                    break;

                default:
                    System.out.println("Choix invalide");
            }

        } while (choix != 2);

        sc.close();
    }
}