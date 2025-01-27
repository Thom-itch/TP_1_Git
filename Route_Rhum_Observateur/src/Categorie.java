import java.util.ArrayList;
import java.util.List;


public class Categorie implements Observateur { // Implémente l'interface Observateur pour réagir aux notifications


    ClasseVoilier classeVoilier; // Définit la classe de voilier associée à cette catégorie
    List<Abandon> listAbandons; // Liste pour stocker les abandons correspondant à cette catégorie


    // Constructeur pour initialiser une catégorie avec une classe spécifique de voilier
    public Categorie(ClasseVoilier classeVoilier) {
        this.classeVoilier = classeVoilier; // Initialise l'attribut classeVoilier
        listAbandons = new ArrayList<>(); // Crée une liste vide pour les abandons
    }

    @Override
    public void actualise(Observable o) { // Méthode appelée pour notifier un changement de l'objet observé
        DirectionCourse directionCourse = (DirectionCourse) o; // Cast l'objet Observable en DirectionCourse
        Abandon abandon = directionCourse.getDernierAbandon(); // Récupère le dernier abandon signalé
        System.out.println("\n" + "actualise" + " " + abandon.getClasseVoilier() + this.classeVoilier);

        // Si la classe du voilier dans l'abandon correspond à celle de cette catégorie
        if (abandon.getClasseVoilier().equals(this.classeVoilier)) {
            listAbandons.add(abandon); // Ajoute l'abandon à la liste
        }
    }

    // Méthode toString pour représenter la catégorie sous forme de chaîne de caractères
    public String toString() {
        return "\n" + classeVoilier.toString() + " " + listAbandons.size() + "  " + listAbandons;
        // Fournit une représentation de la classe, du nombre d'abandons, et de leur liste
    }
}

