import java.util.ArrayList;

public class Show {
    public String title;
    public int duration;
    public Director director;
    public ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    @Override
    public String toString() {
        return "Show{" +
                "Режиссер = '" + director + '\'' +
                '}';
    }

    public void printListOfActors() {
        System.out.println("Актеры " + title + ":");
        for (Actor actor : listOfActors) {
            System.out.println(actor);
        }
        System.out.println();

    }

    public void addActor(Actor actor) {
        if (listOfActors.contains(actor)) {
            System.out.println("Данный актер уже состоит в актерском составе спектакля.\n");
        } else {
            listOfActors.add(actor);
        }
    }

    public void replacementActor(Actor newActor, String surname) {
        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).getSurname().equals(surname)) {
                listOfActors.set(i, newActor);
                return;
            }
        }
        System.out.println("Актер с такой фамилией не найден.\n");
    }
}
