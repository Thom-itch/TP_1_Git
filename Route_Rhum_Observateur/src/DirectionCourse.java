import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class DirectionCourse implements Observable { // Implémente l'interface Observable pour la gestion des observateurs


    List<Observateur> listObservateurs; // Liste des observateurs enregistrés
    List<Abandon> listAbandons; // Liste des abandons enregistrés

    /**
     * Inialise les listes d'observateurs et d'abandons
     **/
    public DirectionCourse() {
        listObservateurs = new LinkedList<>(); // Liste pour stocker les observateurs
        listAbandons = new LinkedList<>(); // Liste pour stocker les abandons
    }

    /**
     * Enregistre un observateur
     **/
    public void enregistreObservateur(Observateur o) {
        listObservateurs.add(o); // Ajoute l'observateur à la liste
    }

    /**
     * Desenregistre un observateur
     **/
    @Override
    public void desenregistreObservateur(Observateur o) { // Retire un observateur de la liste
        listObservateurs.remove(o); // Supprime l'observateur donné
    }

    /**
     * Notifie tous les observateurs enregistres des changements
     **/
    public void informeObservateurs() {
        for (Observateur o : listObservateurs) { // Parcourt la liste des observateurs
            o.actualise(this); // Appelle la méthode actualise pour chaque observateur
        }
    }

    /**
     * Renvoie le dernier abandon enregistre dans la liste
     * @return listAbandons
     **/
    public Abandon getDernierAbandon() {
        return listAbandons.get(listAbandons.size() - 1); // Retourne le dernier élément de la liste
    }

    /**
     * Renvoie le dernier abandon enregistré dans la liste
     **/
    public void simulation(HashSet<Abandon> lesAbandons) {
        for (Iterator<Abandon> i = lesAbandons.iterator(); i.hasNext();) { // Parcourt l'ensemble des abandons
            Abandon abandon = i.next(); // Récupère l'abandon courant
            listAbandons.add(abandon); // Ajoute l'abandon à la liste
            informeObservateurs(); // Notifie tous les observateurs de cet abandon
            System.out.println(abandon); // Affiche les détails de l'abandon
            try {
                Thread.sleep(2 * 1000); // Pause de 2 secondes entre les abandons
            } catch (InterruptedException e) { // Gère les exceptions liées au thread
                throw new RuntimeException(e); // Relance une exception en cas d'erreur
            }
        }
    }
}