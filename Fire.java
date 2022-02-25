package be.intecbrussel;

public class Fire extends Pokemon{

    private String newAttack;


    public Fire() {
    }

    public Fire(String newAttack) {
        this.newAttack = newAttack;
    }

    public Fire(String name, int age, boolean evolution, PokemonColor color, PokemonGender gender, String newAttack) {
        super(name, age, evolution, color, gender);
        this.newAttack = newAttack;
    }

    public void getNewAttack() {
        System.out.println("Dragon Fire");
    }

    public void setNewAttack(String newAttack) {
        // here i set a custom attack with a sys out
        System.out.println("Dragon Breath");
    }



    // Custom ToString gemaakt
    @Override
    public String toString() {
        return "Charmander is very young, he is: " +getAge()+ " years old. " + " He speaks gibberish but i think that he is trying to tell me his name, he repeats : " +getName()+ "! after every sentence. " + " He has a beautiful skin colour that glows bright " +getColor()+ "!" +getGender();
    }
}
