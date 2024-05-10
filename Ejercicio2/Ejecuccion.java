package Ejercicio2;

public class Ejecuccion {


/*
 * https://www.auberginesolutions.com/blog/understanding-code-smells-types-refactoring-best-practices/
 * Punto 6, adecuado a este ejercicio
 */

 /*
  * Cosas que actualmente se tienen en cuenta:
  *     1. La espada permite defenderse.
  *     2. El escudo tiene en cuenta si permite curarse.
  *     3. Incrementos y decrementos de poder de espadas y escudos.
  */

    public static void main(String[] args) {
System.out.println("");
        Warrior w = new Warrior("Nathan");

        System.out.println(w.toString());
        System.out.println("Poder de ataque: " + w.attack());

        w.defense(w);

        Sword s = new Sword(666.0d, "Espada Demoniaca");

        System.out.println();

        Shield e = new Shield("Escudo roto", 0, false);

        System.out.println("Has obtenido la " + s.getSwordname());
        System.out.println("Tu escudo se ha transformado en " + e.getShieldname());

        w.setSword(s);
        w.setShield(e);
        
        System.out.println();
        System.out.println(w.toString());
        System.out.println("Potencia actual de ataque: " + w.attack());

        System.out.println();
        Shield e2 = new Shield("Escudo Sangriento", 0.25d, true);
        w.setShield(e2);

        System.out.println("Has obtenido el " + e.getShieldname());
        System.out.println("Al defenderte te curarás");

        w.defense(w);

        System.out.println();
        System.out.println(w.toString());

        s.setSworddefense(0.25d);
        e.setCurativo(false);
        w.setShield(e);

        System.out.println();
        System.out.println("¡Ahora puedes defenderte con tu espada!");
        w.defense(w);
        System.out.println("Poder de defensa de tu espada: " + s.getSworddefense());

        System.out.println();
        System.out.println(w.toString());

        
    }

}
