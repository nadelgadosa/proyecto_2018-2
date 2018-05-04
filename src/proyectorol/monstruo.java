package proyectorol;
public class monstruo {
 private String nombre;
 private int nivel, xpPoints, heallPoints, iniciativa, fuerza, inteligencia, carisma, destreza, sabiduria;
 private Habilidad Habilidad1 = new Habilidad();
 private Habilidad Habilidad2 = new Habilidad();
 private Habilidad Habilidad3 = new Habilidad();

    public monstruo(String nombre, int nivel, int xpPoints, int heallPoints, int iniciativa, int fuerza, int inteligencia, int carisma, int destreza, int sabiduria) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.xpPoints = xpPoints;
        this.heallPoints = heallPoints;
        this.iniciativa = iniciativa;
        this.fuerza = fuerza;
        this.inteligencia = inteligencia;
        this.carisma = carisma;
        this.destreza = destreza;
        this.sabiduria = sabiduria;
    }

    @Override
    public String toString() {
        return "";
        }

 
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getNivel() {
        return nivel;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    public int getXpPoints() {
        return xpPoints;
    }
    public void setXpPoints(int xpPoints) {
        this.xpPoints = xpPoints;
    }
    public int getHeallPoints() {
        return heallPoints;
    }
    public void setHeallPoints(int heallPoints) {
        this.heallPoints = heallPoints;
    }
    public int getIniciativa() {
        return iniciativa;
    }
    public void setIniciativa(int iniciativa) {
        this.iniciativa = iniciativa;
    }
    public int getFuerza() {
        return fuerza;
    }
    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }
    public int getInteligencia() {
        return inteligencia;
    }
    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }
    public int getCarisma() {
        return carisma;
    }
    public void setCarisma(int carisma) {
        this.carisma = carisma;
    }
    public int getDestreza() {
        return destreza;
    }
    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }
    public int getSabiduria() {
        return sabiduria;
    }
    public void setSabiduria(int sabiduria) {
        this.sabiduria = sabiduria;
    }
    public Habilidad getHabilidad1() {
        return Habilidad1;
    }
    public void setHabilidad1(Habilidad Habilidad1) {
        this.Habilidad1 = Habilidad1;
    }
    public Habilidad getHabilidad2() {
        return Habilidad2;
    }
    public void setHabilidad2(Habilidad Habilidad2) {
        this.Habilidad2 = Habilidad2;
    }
    public Habilidad getHabilidad3() {
        return Habilidad3;
    }
    public void setHabilidad3(Habilidad Habilidad3) {
        this.Habilidad3 = Habilidad3;
    }
}
