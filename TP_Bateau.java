import java.util.Random;

public class TP_Bateau {

    static class Bateau {
        // Définition des attributs d'un bateau
        private int longueur;
        private int largeur;
        private int hauteur;
        private int tirantEau;
        private int propulsion;
        private int vitesse;
        private char categorie;
        private String matiereTransportee;
        private int nbPassagers;
        private double poidsMax;
        private int charge;
        private int membreEquipage;

        /////////////////////////////////////////////////////////////////////////////////
        // Constructeur avec paramètres qui appelle les mutateurs pour construire l'objet
        public Bateau(int longueur, int largeur, int hauteur, int tirantEau
        , int propulsion, int vitesse, char categorie, String matiereTransportee
        , int nbPassagers, double poidsMax, int charge, int membreEquipage)
        {
            this.longueur = longueur;
            this.largeur = largeur;
            this.hauteur = hauteur;
            this.tirantEau = tirantEau;
            this.propulsion = propulsion;
            this.vitesse = vitesse;
            this.categorie = categorie;
            this.matiereTransportee = matiereTransportee;
            this.nbPassagers = nbPassagers;
            this.poidsMax = poidsMax;
            this.charge = charge;
            this.membreEquipage = membreEquipage;
            System.out.println("Constructeur bateau OK");
        }
        // Liste des getters (accesseurs)
        public int getLongueur()
        {
            return longueur;
        }
        public int getLargeur()
        {
            return largeur;
        }
        public int getHauteur()
        {
            return hauteur;
        }
        public int gettirantEau()
        {
            return tirantEau;
        }
        public int getpropulsion()
        {
            return propulsion;
        }
        public int getvitesse()
        {
            return vitesse;
        }
        public char getcategorie()
        {
            return categorie;
        }
        public String getmatiereTransportee()
        {
            return matiereTransportee;
        }
        public int getnbPassagers()
        {
            return nbPassagers;
        }
        public double getpoidsMax()
        {
            return poidsMax;
        }
        public int getcharge()
        {
            return charge;
        }
        public int getmembreEquipage()
        {
            return membreEquipage;
        }
        // Fin des getteurs
        //////////////////////////////////
        // Liste des setteurs (mutateurs)
        public void setLongueur( int longueur)
        {
            this.longueur = longueur;
            // echo 'longueur ';
        }
        public void setLargeur( int largeur)
        {
            this.largeur = largeur;
            // echo 'largeur ';
        }
        public void setHauteur( int hauteur)
        {
            this.hauteur = hauteur;
            // echo 'hauteur ';
        }
        public void settirantEau( int tirantEau)
        {
            this.tirantEau = tirantEau;
            // echo 'tirantEau ';
        }
        public void setpropulsion( int propulsion)
        {
            this.propulsion = propulsion;
            // echo 'propulsion ';
        }
        public void setvitesse( int vitesse)
        {
            this.vitesse = vitesse;
            // echo 'vitesse ';
        }
        public void setcategorie( char categorie)
        {
            this.categorie = categorie;
            // echo 'categorie ';
        }
        public void setmatiereTransportee( String matiereTransportee)
        {
            this.matiereTransportee = matiereTransportee;
            // echo 'matiereTransportee ';
        }
        public void setnbPassagers( int nbPassagers)
        {
            this.nbPassagers = nbPassagers;
            // echo 'nbPassagers ';
        }
        public void setpoidsMax( double poidsMax)
        {
            this.poidsMax = poidsMax;
            // echo 'poidsMax ';
        }
        public void setcharge( int charge)
        {
            this.charge = charge;
            // echo 'charge ';
        }
        public void setmembreEquipage( int membreEquipage)
        {
            this.membreEquipage = membreEquipage;
            // echo 'membreEquipage ';
        }
        // Fin des setteurs
        ///////////////////
        // Méthodes Principales
        public void afficheCaracteristiquesBateau(Bateau unbateau)
        {
            System.out.println("Caractéristique du bateau :");
            System.out.println("La longueur du navire est "+unbateau.getLongueur()+" metres");
            System.out.println("La largeur du navire est "+unbateau.getLargeur()+" metres");
            System.out.println("La hauteur du navire est "+unbateau.getHauteur()+" metres");
            System.out.println("Le tirant d'eau du navire est "+unbateau.gettirantEau()+" metres");
            System.out.println("La propulsion du navire est "+unbateau.getpropulsion()+" chevaux");
            System.out.println("La vitesse du navire est "+unbateau.getvitesse()+" noeuds");
            switch (unbateau.getcategorie()) {
                case 'A':
                    System.out.println("Catégorie : " + unbateau.getcategorie() + " Bateau de type Tanker");
                    break;
                case 'B':
                    System.out.println("Catégorie : " + unbateau.getcategorie() + " Bateau de type Catamaran");
                    break;
                case 'C':
                    System.out.println("Catégorie " + unbateau.getcategorie() + " Bateau de type Cargo, ou Caboteur, ou Péniche");
                    break;
                case 'D':
                    System.out.println("Catégorie " + unbateau.getcategorie() + " Bateau de type Plaisancier");
                    break;
                default: System.out.println("Type de catégorie non prévue");
                    break;
            }
            System.out.println("Les matières transportées du navire est "+unbateau.getmatiereTransportee());
            System.out.println("Le nombre de passagers du navire est "+unbateau.getnbPassagers());
            System.out.println("Le poids maximale du navire est "+unbateau.getpoidsMax()+" tonnes");
            System.out.println("La charge du navire est "+unbateau.getcharge()+" tonnes");
            System.out.println("Le nombre de membre d'équipage du navire est "+unbateau.getmembreEquipage());
        }

        public int calculerChargeBateau(Bateau unbateau, int chargetotale)
        {
            Random random = new Random();
            unbateau.charge = chargetotale+random.nextInt(10000);
            return this.charge;
        }

        public int calculNbPassager(Bateau unbateau, int passagers)
        {
            Random random = new Random();
            int nbPassagers = random.nextInt(15);
            return this.nbPassagers;
        }

        public int trouverEquipage(Bateau unbateau, int equipage)
        {
            Random random = new Random();
            int membreEquipage = random.nextInt(1,20);
            return this.membreEquipage;
        }

        public void afficherBateauPret(Bateau unbateau)
        {
            System.out.println("Bateau prêt à prendre la mer");
        }
    }
    //Création de la classe fille relative au Tanker
    static class Tanker extends Bateau {
        public Tanker(int longueur, int largeur, int hauteur, int tirantEau
        , int propulsion, int vitesse, char categorie, String matiereTransportee
        , int nbPassagers, double poidsMax, int charge, int membreEquipage) {
            super (longueur, largeur, hauteur, tirantEau, propulsion, vitesse,
            categorie, matiereTransportee, nbPassagers, poidsMax, charge, membreEquipage);
        }
        //Méthode relative au Tanker
        public void traiterTanker(Tanker unbateau)
        {
            while(unbateau.getcharge()<(unbateau.getpoidsMax()*0.95)) {
                int unecharge = unbateau.getcharge();
                unbateau.calculerChargeBateau(unbateau, unecharge);
                System.out.println("Tanker en cours de chargement, la charge calculée est de " + unecharge + ";");
                unecharge = unbateau.getcharge()+unecharge;
            }
            System.out.println("Le bateau a une charge actuelle de " + unbateau.getcharge() + " tonnes pour un poids maximum autorisé de " + unbateau.getpoidsMax() + ".");
        }
    }
    //Création de la classe fille relative au Catamaran
    static class Catamaran extends Bateau {
        public Catamaran(int longueur, int largeur, int hauteur, int tirantEau
        , int propulsion, int vitesse, char categorie, String matiereTransportee
        , int nbPassagers, double poidsMax, int charge, int membreEquipage) {
            super (longueur, largeur, hauteur, tirantEau, propulsion, vitesse,
            categorie, matiereTransportee, nbPassagers, poidsMax, charge, membreEquipage);
        }
        //Méthode relative au Catamaran
        public void chargerMembresEquipages(Catamaran unbateau, int nbrMembresEquipages)
        {
            unbateau.trouverEquipage(unbateau, 8);
            int nbP = unbateau.getmembreEquipage();
            if ((nbP >= 1)&(nbP<=7)) {
                System.out.println("Les membres d'équipage sont composés de " + nbP + " personnes.");
                System.out.println("Le bateau est prêt à partir.");
            }
            else {
                System.out.println("Le nombre des membres de l'équipage est de zéro : départ impossible.");
            }
        }
    }
    //Création de la classe fille relative au Cargo
    static class Cargo extends Bateau {
        public Cargo(int longueur, int largeur, int hauteur, int tirantEau
        , int propulsion, int vitesse, char categorie, String matiereTransportee
        , int nbPassagers, double poidsMax, int charge, int membreEquipage) {
            super (longueur, largeur, hauteur, tirantEau, propulsion, vitesse,
            categorie, matiereTransportee, nbPassagers, poidsMax, charge, membreEquipage);
        }
        //Méthode relative au Cargo
        public void traiterCargoFretMixte(Bateau unbateau)
        {
            unbateau.calculNbPassager(unbateau, 9);
            if ((unbateau.getnbPassagers()>=0)&(unbateau.getnbPassagers()<=12)) {
                System.out.println("Le nombre de passagers est de " + unbateau.getnbPassagers());
            }
            else {
                System.out.println("Nombre de passagers incorrect : " + unbateau.getnbPassagers());
            }
            double denreesechemax = unbateau.getpoidsMax()*0.60;
            double denreeliquidemax = unbateau.getpoidsMax()*035;
            int denreeseche = 0;
            int denreeliquide = 0;
            while ((denreeseche<denreesechemax)&(denreeliquide<denreeliquidemax)) {
                denreeseche = unbateau.calculerChargeBateau(unbateau, denreeseche);
                denreeliquide = unbateau.calculerChargeBateau(unbateau, denreeliquide);
            }
            System.out.println("Le bateau contient " +denreeseche+" tonnes de denrées sèches et " +denreeliquide+ " tonnes de denrées liquides.");
            unbateau.afficherBateauPret(unbateau);
        }
    }
    //Création de la classe fille relative au Plaisancier
    static class Plaisancier extends Bateau {
        private int poidsLege;
        private int poidsNonGere;
        public Plaisancier(int longueur, int largeur, int hauteur, int tirantEau
        , int propulsion, int vitesse, char categorie, String matiereTransportee
        , int nbPassagers, double poidsMax, int charge, int membreEquipage, int poidsLege, int poidsNonGere) {
            super (longueur, largeur, hauteur, tirantEau, propulsion, vitesse,
            categorie, matiereTransportee, nbPassagers, poidsMax, charge, membreEquipage);

            this.poidsLege = poidsLege;
            this.poidsNonGere = poidsNonGere;
            System.out.println("Constructeur Plaisancier OK");
        }
        //Getters du Plaisancier
        public int getpoidsLege()
        {
            return poidsLege;
        }
        public int getpoidsNonGere()
        {
            return poidsNonGere;
        }
        //Setters du Plaisancier
        public void setpoidsLege( int poidsLege)
        {
            this.poidsLege = poidsLege;
            // echo 'vitesse ';
        }
        public void setpoidsNonGere( int poidsNonGere)
        {
            this.poidsNonGere= poidsNonGere;
            // echo 'vitesse ';
        }
        //Méthodes relatives au Plaisancier
        public void afficherCaracteristiquesPlaisancier(Bateau unbateau) {
            unbateau.afficheCaracteristiquesBateau(unbateau);
            System.out.println("Le Plaisancier contient " +poidsLege+" tonnes en guise de poids Lège et " +poidsNonGere+ " tonnes en guise de poids non Géré.");
        }
        public void chargerNbPassagers(Bateau unbateau) {
            unbateau.calculNbPassager(unbateau, 12);
        }
    }
    // Début du programme principal.
    public static void main(String[] args) {
        //instancier le nouveau bateau
        Catamaran unbateau = new Catamaran(18, 5, 20, 1, 3000, 25, 'B', "Vivre", 10, 7000,2000, 0);
        unbateau.afficheCaracteristiquesBateau(unbateau);
        unbateau.chargerMembresEquipages(unbateau, 0);
    }
}