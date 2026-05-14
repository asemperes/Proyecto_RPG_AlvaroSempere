import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null,
            "⚔️  LA HERENCIA MALDITA  ⚔️\n\nUna historia de héroes y villanos...",
            "Bienvenido", JOptionPane.INFORMATION_MESSAGE);

        // Crear personajes
        Guerrero guerrero = new Guerrero("Aragorn", 100, 5, 15, 15);
        Mago mago = new Mago("Gandalf", 80, 7, 20, 10);

        // Equipar armas
        Arma espada = new Arma("Espada Legendaria", 5, "Espadón");
        Arma baston = new Arma("Bastón Arcano", 8, "Báculo");
        guerrero.setArma(espada);
        mago.setArma(baston);

        JOptionPane.showMessageDialog(null,
            "Los héroes se preparan para la batalla:\n\n" +
            "🗡️  " + guerrero + "\n   Arma: " + guerrero.getArma() + "\n\n" +
            "🔮  " + mago + "\n   Arma: " + mago.getArma(),
            "Personajes", JOptionPane.INFORMATION_MESSAGE);

        // Combate
        Guerrero enemigo = new Guerrero("Orco Jefe", 30, 3, 8, 8);

        JOptionPane.showMessageDialog(null,
            "¡Aparece un enemigo!\n\n👹 " + enemigo,
            "¡Combate!", JOptionPane.WARNING_MESSAGE);

        guerrero.atacar(enemigo);
        mago.atacar(enemigo);

        JOptionPane.showMessageDialog(null,
            "Resultado tras el ataque:\n\n👹 " + enemigo +
            (enemigo.getVida() == 0 ? "\n\n¡El enemigo ha sido derrotado!" : "\n\n¡El enemigo sigue en pie!"),
            "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
}
