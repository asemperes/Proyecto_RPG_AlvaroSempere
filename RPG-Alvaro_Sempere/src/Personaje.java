public class Personaje {
    // Malas prácticas: Variables de una letra, sin encapsular (private) y todo mezclado.
    String n;
    int v;
    int niv;
    int t; // Tipo: 1 = Guerrero, 2 = Mago
    int energiaExtra; // Mezcla de furia y mana en una sola variable

    // Constructor sin documentar y con parámetros incomprensibles
    public Personaje(String a, int b, int c, int d, int e) {
        n = a;
        v = b;
        niv = c;
        t = d;
        energiaExtra = e;
    }

    // Método espagueti: mezcla la lógica de guerreros y magos en el mismo sitio
    public void atacar(Personaje enemigo) {
        int d = 0;
        if (this.t == 1) {
            d = this.niv * 2;
        } else if (this.t == 2) {
            d = this.niv + this.energiaExtra;
        }
        enemigo.recibirDano(d);
    }

    // BUG CRÍTICO (Para la Fase 3): La vida puede bajar a números negativos
    public void recibirDano(int dano) {
        this.v = this.v - dano;
    }

    // Método para JUnit
    public int getVida() {
        return this.v;
    }
}