package be.intecbrussel;

public class PokedexApp {

    public static void main(String[] args) {


        Pokemon pokemon1 = new Pokemon();
        pokemon1.setAge(2);
        pokemon1.setName("Yumi");
        System.out.println(pokemon1);
        // Ik heb hier niet gespecifieerd of ze kan evolueren, haar kleur of gender dus de standaard waarde voor Boolean is false en null.






        //Andere manier om alle waarde te zetten in een constructor i.p.v van elke keer een .set waarde te gebruiken
        Electric pokemon2 = new Electric("Storm",10,true,PokemonColor.YELLOW,PokemonGender.FEMALE,true);
        System.out.println(pokemon2);
        pokemon2.talk();
        pokemon2.talk("Piiiiiiiiiiiikaaaaaaaaaaaachuuuuuuuuuu!!!!!!!");




        Fire pokemon3 = new Fire();
        pokemon3.setName("Vulcan");
        pokemon3.setAge(3);
        pokemon3.setEvolution(true);
        pokemon3.setColor(PokemonColor.ORANGE);
        pokemon3.setGender(PokemonGender.MALE);
        pokemon3.getNewAttack(); // Hier vraag ik naar de nieuwe attack


        System.out.println(pokemon3);



        // Met die methode kan ik zien als die 2 objecten een relatie hebben.
        System.out.println(pokemon2 instanceof Pokemon);


        Water pokemon4 = new Water();
        pokemon4.setNumberInPokedex("#009");

        //For those who want to know which Pokemon this is, you can look it up on google.


        System.out.println(pokemon4);

        






    }
}
