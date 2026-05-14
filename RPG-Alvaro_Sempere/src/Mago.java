/**
 * Clase que representa un mago
 * Extiende Personaje y tiene inteligencia y mana como atributos únicos.
 */
public class Mago extends Personaje {

    /** Inteligencia del mago, influye en el daño mágico. */
    private int inteligencia;

    /** Maná disponible para lanzar hechizos. */
    private int mana;

    /**
     * Constructor del mago.
     * @param nombre       Nombre del mago.
     * @param vida         Vida inicial.
     * @param nivel        Nivel inicial.
     * @param inteligencia Inteligencia base del mago.
     * @param mana         Maná inicial del mago.
     */
    public Mago(String nombre, int vida, int nivel, int inteligencia, int mana) {
        super(nombre, vida, nivel);
        this.inteligencia = inteligencia;
        this.mana         = mana;
    }

    /**
     * El mago ataca haciendo daño = inteligencia + mana.
     * @param enemigo Personaje que recibe el ataque.
     */
    @Override
    public void atacar(Personaje enemigo) {
        int dano = this.inteligencia + this.mana;
        enemigo.recibirDano(dano);
        System.out.println(getNombre() + " lanza un hechizo! Daño: " + dano);
    }

    public int getInteligencia() { return inteligencia; }
    public void setInteligencia(int inteligencia) { this.inteligencia = inteligencia; }

    public int getMana() { return mana; }
    public void setMana(int mana) { this.mana = mana; }
}