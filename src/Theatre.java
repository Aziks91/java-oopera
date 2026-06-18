import java.util.ArrayList;

public class Theatre {

    public static void main(String[] args) {
        Actor actor1 = new Actor("Иван", "Иванов", Gender.MALE, 170);
        Actor actor2 = new Actor("Екатерина", "Петрова", Gender.FEMALE, 160);
        Actor actor3 = new Actor("Сергей", "Сидоров", Gender.MALE, 175);

        Director director1 = new Director("Максим", "Копылов", Gender.MALE, 5);
        Director director2 = new Director("Мария", "Смирнова", Gender.FEMALE, 15);

        String musicAuthor1 = "Петр Петров";
        String choreographer1 = "Ольга Рыбакова";

        Show figaro = new Show("Женитьба Фигаро", 120 , director1, new ArrayList<>());
        Opera karmen = new Opera("Кармен", 150, director2, new ArrayList<>(), musicAuthor1,
                "тут будет описание оперы Кармен", 5);
        Ballet swanLake = new Ballet("Лебединое озеро", 160, director2, new ArrayList<>(),
                musicAuthor1, "тут будет описание балета Лебединое озеро", choreographer1);

        figaro.addActor(actor1);
        figaro.addActor(actor2);
        figaro.printListOfActors();

        karmen.addActor(actor2);
        karmen.addActor(actor3);
        karmen.printListOfActors();

        swanLake.addActor(actor1);
        swanLake.addActor(actor3);
        swanLake.printListOfActors();

        figaro.replacementActor(actor3, "Иванов");
        figaro.printListOfActors();

        karmen.replacementActor(actor1, "Ничаев");
        karmen.printListOfActors();

        karmen.printLibrettoText();
        swanLake.printLibrettoText();
    }
}
