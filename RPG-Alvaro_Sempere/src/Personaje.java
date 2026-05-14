/**
 * Clase base que representa a un personaje del juego.
 * Guerrero y Mago heredan de esta clase.
 */
public abstract class Personaje {

    private String nombre;
    private int vida;
    private int vidaMaxima;
    private int nivel;
    private Arma arma;

    /**
     * @param nombre Nombre del personaje
     * @param vida   Vida inicial (también será la vida máxima)
     * @param nivel  Nivel del personaje
     */
    public Personaje(String nombre, int vida, int nivel) {
        this.nombre = nombre;
        this.vida = vida;
        this.vidaMaxima = vida;
        this.nivel = nivel;
    }

    /**
     * Cada subclase define cómo ataca.
     * @param enemigo El personaje que recibe el daño
     */
    public abstract void atacar(Personaje enemigo);

    /**
     * Reduce la vida del personaje. Nunca baja de 0.
     * @param dano Cantidad de daño recibido
     */
    public void recibirDano(int dano) {
        this.vida = this.vida - dano;
        if (this.vida < 0) {
            this.vida = 0;
        }
    }

    // Getters y Setters
    public String getNombre()       { return nombre; }
    public int getVida()            { return vida; }
    public int getVidaMaxima()      { return vidaMaxima; }
    public int getNivel()           { return nivel; }
    public Arma getArma()           { return arma; }
    public void setArma(Arma arma)  { this.arma = arma; }

    @Override
    public String toString() {
        return nombre + " | Vida: " + vida + "/" + vidaMaxima + " | Nivel: " + nivel;
    }
}
