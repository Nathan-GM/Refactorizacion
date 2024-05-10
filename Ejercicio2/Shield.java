package Ejercicio2;

public class Shield {
    private String shieldname;
    private double shieldpower;
    private boolean curativo;


    /**
     * Constructor del escudo sobrecargado
     * @param shieldname Indica el nombre del escudo obtenido
     * @param shieldpower Indica la potencia del escudo.
     */
    public Shield(String shieldname, double shieldpower, boolean curativo) {
        this.shieldname = shieldname;
        this.shieldpower = shieldpower;
        this.curativo = curativo;
    }

    /**
     * Constructor del escudo sin cargar.
     */
    public Shield() {
        this.shieldname = "ESC Inicial";
        this.shieldpower = 0.25d;
        this.curativo = false;
    }

    public void defense(Warrior w) {
        if (curativo) {
            w.setLife(w.getLife() + this.shieldpower);
        } else {
            w.setLife(w.getLife() - w.attack() * this.shieldpower);
        }
    }

    //Getters y Setters
    public String getShieldname() {
        return shieldname;
    }

    public void setShieldname(String shieldname) {
        this.shieldname = shieldname;
    }

    public double getShieldpower() {
        return shieldpower;
    }

    public void setShieldpower(double shieldpower) {
        this.shieldpower = shieldpower;
    }

    public boolean isCurativo() {
        return curativo;
    }

    public void setCurativo(boolean curativo) {
        this.curativo = curativo;
    }
}
