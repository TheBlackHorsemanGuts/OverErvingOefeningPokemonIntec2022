package be.intecbrussel;

public class Electric extends Pokemon{

    private boolean friendly;

    public Electric() {
    }

    public Electric(boolean friendly) {
        this.friendly = friendly;
    }

    public Electric(String name, int age, boolean evolution, PokemonColor color, PokemonGender gender, boolean friendly) {
        super(name, age, evolution, color, gender);
        this.friendly = friendly;
    }

    public void talk (){
        System.out.println("Pika Pika !!!!");

    }

    public void talk(String anger){
        System.out.println(anger);
    }


}
