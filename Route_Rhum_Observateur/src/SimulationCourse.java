import java.util.HashSet;


public class SimulationCourse {


    public static void main(String[] args) {

        HashSet<Abandon> lesAbandons = new HashSet<>();
        lesAbandons.add(new Abandon("Nexans - Art et Fenetres", ClasseVoilier.IMOCA, "Filbert"));
        lesAbandons.add(new Abandon("LEYTON", ClasseVoilier.Class40, "Octave"));
        lesAbandons.add(new Abandon("Bella Donna - Race For Pure Ocean", ClasseVoilier.ANY, "Ruel"));
        lesAbandons.add(new Abandon("Altays - Better Water", ClasseVoilier.IMOCA, "Balthazar"));

        DirectionCourse directionCourse = new DirectionCourse();
        Categorie categorie = new Categorie(ClasseVoilier.IMOCA);
        directionCourse.enregistreObservateur(categorie);
        directionCourse.simulation(lesAbandons);
        System.out.println(categorie);

        DirectionCourse directionCourse2 = new DirectionCourse();
        Categorie categorie2 = new Categorie(ClasseVoilier.ANY);
        directionCourse2.enregistreObservateur(categorie2);
        directionCourse2.simulation(lesAbandons);
        System.out.println(categorie2);
    }
}
