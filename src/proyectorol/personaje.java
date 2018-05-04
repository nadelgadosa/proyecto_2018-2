package proyectorol;
public class personaje {
    String nombre, clase, raza, trasfondo, personalidad;
    int nivel, xpPoints, heallPoints, iniciativa, fuerza, inteligencia, carisma, destreza, sabiduria, velocidad, armadura;
    items equipo [], objetos [];
    Habilidad habilidades [];

    @Override
    public String toString() {
        return super.toString(); 
    }
    
    public personaje() {
    }
    public personaje(String nombre, String clase, String raza, String trasfondo, String personalidad, int nivel, int xpPoints, int heallPoints, int iniciativa, int fuerza, int inteligencia, int carisma, int destreza, int sabiduria, int velocidad, int armadura, items[] equipo, items[] objetos, Habilidad[] habilidades) {
        this.nombre = nombre;
        this.clase = clase;
        this.raza = raza;
        this.trasfondo = trasfondo;
        this.personalidad = personalidad;
        this.nivel = nivel;
        this.xpPoints = xpPoints;
        this.heallPoints = heallPoints;
        this.iniciativa = iniciativa;
        this.fuerza = fuerza;
        this.inteligencia = inteligencia;
        this.carisma = carisma;
        this.destreza = destreza;
        this.sabiduria = sabiduria;
        this.velocidad = velocidad;
        this.armadura = armadura;
        this.equipo = equipo;
        this.objetos = objetos;
        this.habilidades = habilidades;
    }
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getClase() {
        return clase;
    }
    public void setClase(String clase) {
        this.clase = clase;
    }
    public String getRaza() {
        return raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }
    public String getTrasfondo() {
        return trasfondo;
    }
    public void setTrasfondo(String trasfondo) {
        this.trasfondo = trasfondo;
    }
    public String getPersonalidad() {
        return personalidad;
    }
    public void setPersonalidad(String personalidad) {
        this.personalidad = personalidad;
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
    public int getVelocidad() {
        return velocidad;
    }
    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    public int getArmadura() {
        return armadura;
    }
    public void setArmadura(int armadura) {
        this.armadura = armadura;
    }
    public items[] getEquipo() {
        return equipo;
    }
    public void setEquipo(items[] equipo) {
        this.equipo = equipo;
    }
    public items[] getObjetos() {
        return objetos;
    }
    public void setObjetos(items[] objetos) {
        this.objetos = objetos;
    }
    public Habilidad[] getHabilidades() {
        return habilidades;
    }
    public void setHabilidades(Habilidad[] habilidades) {
        this.habilidades = habilidades;
    }
    }
