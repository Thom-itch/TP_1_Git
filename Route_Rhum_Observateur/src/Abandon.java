public class Abandon { // Déclaration de la classe Abandon


    String nomVoilier; // Nom du voilier associé à l'abandon
    ClasseVoilier classeVoilier; // Classe du voilier (Enum définissant les catégories)
    String nomSkipper; // Nom du skipper


    /**
     * Initialise un objet Abandon avec des attributs specifiques
     * @param nomVoilier
     * @param classeVoilier
     * @param nomSkipper
     **/
    public Abandon(String nomVoilier, ClasseVoilier classeVoilier, String nomSkipper) {
        this.nomVoilier = nomVoilier; // Initialise l'attribut nomVoilier avec la valeur donnée
        this.classeVoilier = classeVoilier; // Initialise l'attribut classeVoilier
        this.nomSkipper = nomSkipper; // Initialise l'attribut nomSkipper
    }

    /**
     * Recupere la classe du voilier
     * @return classeVoilier
     **/
    public ClasseVoilier getClasseVoilier() {
        return classeVoilier; // Renvoie l'attribut classeVoilier
    }

    /**
     * Represente l'objet sous forme de chaine de caractere
     * @return nomVoilier
     * @return classeVoilier
     * @return nomSkipper
     **/
    public String toString() {
        // Renvoie une description complète de l'abandon
        return "---- Nom voilier : " + nomVoilier + " ---- " + "Classe voilier : " + classeVoilier + " ---- " + "Nom skipper : " + nomSkipper;
    }
}



//1- Qui est le sujet obervé ? Un instance de DirectionCourse
//2- Qui est abservable ?
//3- Qui est observateur ? Les 6 instances de Catégorie
//4- Qui implémente Observable ? La classe DirectionCourse
//5- Qui implémente Observateur ? La classe Catégorie