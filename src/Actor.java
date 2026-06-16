import java.util.Objects;

public class Actor extends Person {
    public int height;

    public Actor(String name, String surname, Gender gender, int height) {
        super(name, surname, gender);
        this.height = height;
    }

    @Override
    public String toString() {
       /*Стандартный вариант применять не стал, т.к. выглядит неудобно
         return "Actor{" +
                "Имя = '" + name + '\'' +
                ", Фамилия = '" + surname + '\'' +
                ", Рост = " + height +
                '}';
        */
        return name + ' ' +
                 surname + ' ' +
                "(" + height +
                ')';
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Actor actor = (Actor) o;
        return (height == actor.height)
                && name.equals(actor.name)
                && surname.equals(actor.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, name, surname);
    }
}
