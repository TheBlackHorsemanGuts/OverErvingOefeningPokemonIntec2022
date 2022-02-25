package be.intecbrussel;

public class Water extends Fire{

    private String numberInPokedex;


    public Water() {
    }

    public Water(String numberInPokedex) {
        this.numberInPokedex = numberInPokedex;
    }

    public Water(String newAttack, String numberInPokedex) {
        super(newAttack);
        this.numberInPokedex = numberInPokedex;
    }

    public Water(String name, int age, boolean evolution, PokemonColor color, PokemonGender gender, String newAttack, String numberInPokedex) {
        super(name, age, evolution, color, gender, newAttack);
        this.numberInPokedex = numberInPokedex;
    }


    public String getNumberInPokedex() {
        return numberInPokedex;
    }

    public void setNumberInPokedex(String numberInPokedex) {
        this.numberInPokedex = numberInPokedex;
    }


    @Override
    public String toString() {
        return "Water{" +
                "numberInPokedex=" + numberInPokedex +
                '}';
    }




}
