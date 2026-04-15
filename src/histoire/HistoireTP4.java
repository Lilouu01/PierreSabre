package histoire;


import personnages.Commerçant;
import personnages.Humain;
import personnages.Ronin;
import personnages.Yakuza;

public class HistoireTP4 {

    public static void main(String[] args) {

        // --- Partie 1 : Humain ---
        Humain prof = new Humain("Prof", "kombucha", 54);
        prof.direBonjour();
        prof.acheter("une boisson", 12);
        prof.boire();
        prof.acheter("un jeu", 2);
        prof.acheter("un kimono", 50);

        System.out.println();

        // --- Partie 2.1 : Commerçant ---
        Commerçant marco = new Commerçant("Marco", 20);
        marco.direBonjour();
        marco.seFaireExtorquer();
        marco.recevoir(15);
        marco.boire();

        System.out.println();

        // --- Partie 2.2 : Yakuza ---
        Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
        yaku.direBonjour();
        yaku.extorquer(marco);

        System.out.println();

        // --- Partie 2.3 : Ronin ---
        Ronin roro = new Ronin("Roro", "shochu", 60);
        roro.direBonjour();
        roro.donner(marco);

        System.out.println();

        // --- Partie 3 : Duel (réputation yakuza = 0, ronin doit gagner) ---
        roro.provoquer(yaku);

        System.out.println();

        // --- Partie 3 : Duel avec réputation yakuza = 4 (ronin perd) ---
        // Pour tester ce cas, décommenter les lignes suivantes et modifier
        // l'initialisation de la réputation dans Yakuza à 4 :
        // roro.provoquer(yaku);
    }
}