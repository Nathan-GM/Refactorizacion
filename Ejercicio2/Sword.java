package Ejercicio2;

public class Sword {
    private double swordpower;
    private String swordname;
    private double sworddefense;

    /**
     * Constructor de la espada sin cargar
     */
    public Sword() {
        this.swordname = "ESP Inicial";
        this.swordpower = 1.0d;
        this.sworddefense = 0.0d;
    }

    /**
     * Constructor de la espada sobrecargado.
     * No permite defenderse con ella.
     * @param swordpower Potencia de la espada creada
     * @param swordname  Nombre de la espada creada.
     */
    public Sword(double swordpower, String swordname) {
        this.swordpower = swordpower;
        this.swordname = swordname;
        this.sworddefense = 0;
    }

    /**
     * Constructor de la espada sobrecargada.
     * Permite la defensa con la misma.
     * @param swordpower Potencia de la espada al atacar.
     * @param swordname Nombre de la espada.
     * @param sworddefense Potencia de la espada al defenderse.
     */
    public Sword(double swordpower, String swordname, double sworddefense) {
        this.swordpower = swordpower;
        this.swordname = swordname;
        this.sworddefense = sworddefense;
    }

    /**
     * Método para defenderse con la espada si esta lo permite.
     * @param w Guerrero que va a defenderse.
     */
    public void defensa(Warrior w) {
        w.setLife(w.getLife() - getSworddefense());
    }

    // Getters y Setters.
    public double getSwordpower() {
        return swordpower;
    }

    public void setSwordpower(double swordpower) {
        this.swordpower = swordpower;
    }

    public String getSwordname() {
        return swordname;
    }

    public void setSwordname(String swordname) {
        this.swordname = swordname;
    }

    public double getSworddefense() {
        return sworddefense;
    }

    public void setSworddefense(double sworddefense) {
        this.sworddefense = sworddefense;
    }

}
