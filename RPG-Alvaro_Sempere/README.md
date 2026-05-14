# La Herencia Maldita ⚔️

Proyecto final de curso — 1º DAW  
**Empresa:** LaHontanillaSoft S.L.

## Descripción

Refactorización completa de un videojuego RPG en Java. Se partió de un código legado
desorganizado y se rediseñó desde cero aplicando principios de **Programación Orientada
a Objetos**: herencia, polimorfismo y encapsulación.

## Estructura del proyecto

```
src/
├── Personaje.java      # Clase abstracta padre
├── Guerrero.java       # Subclase con fuerza y furia
├── Mago.java           # Subclase con inteligencia y mana
├── Arma.java           # Clase asociada (relación tiene-un)
├── Main.java           # Historia interactiva con JOptionPane
└── PersonajeTest.java  # Tests unitarios con JUnit 5
```

## Cómo compilar y ejecutar

```bash
# Compilar
javac *.java

# Ejecutar
java Main

# Generar JAR ejecutable
jar cfm LaHerenciaMaldita.jar MANIFEST.MF *.class
```

O hacer doble clic en el archivo `.jar` desde el escritorio.

## Tests

Tres tests JUnit 5 en verde:

| Test | Qué comprueba |
|---|---|
| `testGuerreroAtaca` | El daño se calcula correctamente (fuerza × 2) |
| `testVidaNoNegativa` | La vida nunca baja de 0 aunque el daño la supere |
| `testCreacion` | El personaje nace con los valores correctos |

## Control de versiones

- Rama principal: `main`
- Rama de refactorización: `refactoring` (mergeada)
- Mínimo 5 commits con mensajes descriptivos

## Tecnologías

- Java SE 17
- JUnit 5
- VS Code + Extension Pack for Java
- Git / GitHub
