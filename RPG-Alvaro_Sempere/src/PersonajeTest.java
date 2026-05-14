

/**
 * Tests unitarios para verificar la lógica del juego.
 */
public class PersonajeTest {

    /**
     * Comprueba que el daño del guerrero se calcula correctamente: fuerza * 2.
     */
    @Test
    public void testGuerreroAtaca() {
        Guerrero guerrero = new Guerrero("TestGuerrero", 100, 1, 10, 5);
        Mago enemigo      = new Mago("Enemigo", 100, 1, 5, 5);

        guerrero.atacar(enemigo);

        // Daño esperado: 10 * 2 = 20 → vida restante = 80
        assertEquals(80, enemigo.getVida(), "La vida del enemigo debería ser 80 tras recibir 20 de daño");
    }

    private void assertEquals(int i, int vida, String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'assertEquals'");
    }

    /**
     * Comprueba que la vida nunca baja de 0 aunque el daño supere la vida.
     */
    @Test
    public void testVidaNoNegativa() {
        Guerrero guerrero = new Guerrero("TestGuerrero", 5, 1, 50, 0);
        Mago enemigo      = new Mago("Enemigo", 5, 1, 5, 5);

        // El guerrero hace 50*2=100 de daño, pero el enemigo solo tiene 5 de vida
        guerrero.atacar(enemigo);

        assertEquals(0, enemigo.getVida(), "La vida no puede ser negativa, debe quedar en 0");
    }

    /**
     * Comprueba que al crear un personaje, su vida es la correcta.
     */
    @Test
    public void testCreacion() {
        Guerrero guerrero = new Guerrero("Nuevo", 100, 1, 10, 5);

        assertEquals(100, guerrero.getVida(), "El guerrero debe nacer con 100 de vida");
        assertEquals("Nuevo", guerrero.getNombre(), "El nombre debe coincidir con el del constructor");
    }

    private void assertEquals(String string, String nombre, String string2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'assertEquals'");
    }
}