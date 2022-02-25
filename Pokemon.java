package be.intecbrussel;

public class Pokemon {

    private String name;
    private int age;
    private boolean evolution;
    private PokemonColor color;
    private PokemonGender gender;


    public Pokemon() {
    }


    public Pokemon(String name, int age, boolean evolution, PokemonColor color, PokemonGender gender) {
        this.name = name;
        this.age = age;
        this.evolution = evolution;
        this.color = color;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public boolean isEvolution() {
        return evolution;
    }

    public void setEvolution(boolean evolution) {
        this.evolution = evolution;
    }


    public PokemonColor getColor() {
        return color;
    }

    public void setColor(PokemonColor color) {
        this.color = color;
    }

    public PokemonGender getGender() {
        return gender;
    }

    public void setGender(PokemonGender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", evolution=" + evolution +
                ", color=" + color +
                ", gender=" + gender +
                '}';
    }
}
