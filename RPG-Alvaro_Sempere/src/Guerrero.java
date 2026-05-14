/**
 * Clase que representa un guerrero.
 * Extiende Personaje y tiene fuerza y furia como atributos únicos.
 */
public class Guerrero extends Personaje {

    /** Fuerza del guerrero, usada para calcular el daño. */
    private int fuerza;

    /** Furia acumulada en combate. */
    private int furia;

    /**
     * Constructor del guerrero.
     * @param nombre  Nombre del guerrero.
     * @param vida    Vida inicial.
     * @param nivel   Nivel inicial.
     * @param fuerza  Fuerza base del guerrero.
     * @param furia   Furia inicial del guerrero.
     */
    public Guerrero(String nombre, int vida, int nivel, int fuerza, int furia) {
        super(nombre, vida, nivel);
        this.fuerza = fuerza;
        this.furia  = furia;
    }

    /**
     * El guerrero ataca haciendo daño = fuerza * 2.
     * @param enemigo Personaje que recibe el ataque.
     */
    @Override
    public void atacar(Personaje enemigo) {
        int dano = this.fuerza * 2;
        enemigo.recibirDano(dano);
        System.out.println(getNombre() + " ataca con fuerza bruta! Daño: " + dano);
    }

    public int getFuerza() { return fuerza; }
    public void setFuerza(int fuerza) { this.fuerza = fuerza; }

    public int getFuria() { return furia; }
    public void setFuria(int furia) { this.furia = furia; }
}