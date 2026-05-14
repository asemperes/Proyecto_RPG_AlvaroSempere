/**
 * Clase que representa un arma que puede equipar un personaje.
 */
public class Arma {

    /** Nombre del arma. */
    private String nombre;

    /** Daño base del arma. */
    private int dano;

    /** Tipo de arma (espada, báculo, arco...). */
    private String tipo;

    /**
     * Constructor del arma.
     * @param nombre Nombre del arma.
     * @param dano   Daño base.
     * @param tipo   Tipo de arma.
     */
    public Arma(String nombre, int dano, String tipo) {
        this.nombre = nombre;
        this.dano   = dano;
        this.tipo   = tipo;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getDano() { return dano; }
    public void setDano(int dano) { this.dano = dano; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    @Override
    public String toString() {
        return nombre + " [" + tipo + "] - Daño: " + dano;
    }
}