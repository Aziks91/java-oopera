import java.util.Objects;

public class Actor extends Person {
    private int height;

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
        return getName() + ' ' +
                 getSurname() + ' ' +
                "(" + height +
                ')' + ' ' + this.getClass().getSimpleName();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Actor actor = (Actor) o;
        return (height == actor.height)
                && getName().equals(actor.getName())
                && getSurname().equals(actor.getSurname());
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, getName(), getSurname());
    }
}
