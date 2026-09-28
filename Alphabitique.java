import java.util.Scanner;

public class Alphabitique {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int cin;
        String nom;
        String prenom;
        int ncompte;
        int choix;

        final float PLAFOND_RETRAIT = 500.00f;

        System.out.println("Veuillez saisir CIN :");
        cin = sc.nextInt();

        System.out.println("Veuillez saisir nom :");
        nom = sc.next();

        System.out.println("Veuillez saisir prenom :");
        prenom = sc.next();

        System.out.println("Veuillez saisir numero de compte :");
        ncompte = sc.nextInt();

        do {

            System.out.println("1. Consulter compte");
            System.out.println("2. Deposer montant");
            System.out.println("3. Retirer montant");
            System.out.println("4. Quitter");

            choix = sc.nextInt();

            switch (choix) {

                case 1:
                    System.out.println(nom + " " + prenom + " " + cin);
                    System.out.println(ncompte);
                    System.out.println("Solde");
                    System.out.println(PLAFOND_RETRAIT);
                    break;
            }

        } while (choix != 4);

        sc.close();
    }
}
