---
semana: 9
tema: Interfaces y Abstracción
estado: pendiente
---

# Semana 9 — Interfaces y Clases Abstractas

> Tiempo estimado: 4–5 horas
> Al terminar: `bash scripts/push.sh "semana-09 interfaces"`

---

## ¿Qué es una interfaz?

Una interfaz es como un **contrato**. Dice: "cualquier clase que quiera ser X, debe implementar estos métodos".

**Analogía:** Un enchufe es una interfaz. No importa si es una lámpara, una televisión o un cargador — todos deben respetar el mismo "contrato" (dos patas con cierto tamaño). La toma de corriente no sabe ni le importa qué hay del otro lado, solo que cumple el contrato.

---

## Crear e implementar una interfaz

```java
// Definir la interfaz (el "contrato")
public interface Imprimible {
    void imprimir();   // solo la firma, sin implementación
    String obtenerResumen();
}

// Implementar la interfaz
public class Factura implements Imprimible {
    private double total;

    public Factura(double total) {
        this.total = total;
    }

    @Override
    public void imprimir() {
        System.out.println("=== FACTURA ===");
        System.out.println("Total: $" + total);
    }

    @Override
    public String obtenerResumen() {
        return "Factura por $" + total;
    }
}
```

---

## Una clase puede implementar varias interfaces

```java
public interface Vendible {
    double getPrecioVenta();
}

public interface Almacenable {
    int getStock();
    void reducirStock(int cantidad);
}

// Implementa ambas interfaces
public class Producto implements Vendible, Almacenable {
    private String nombre;
    private double precio;
    private int stock;

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    @Override
    public double getPrecioVenta() { return precio; }

    @Override
    public int getStock() { return stock; }

    @Override
    public void reducirStock(int cantidad) {
        if (stock >= cantidad) stock -= cantidad;
    }
}
```

---

## Clases abstractas — a medio camino entre clase e interfaz

Una clase abstracta no puede instanciarse (no puedes hacer `new ClaseAbstracta()`). Puede tener métodos con implementación Y métodos abstractos (sin implementación).

```java
public abstract class Figura {
    protected String color;

    public Figura(String color) {
        this.color = color;
    }

    // Método abstracto: cada hijo DEBE implementarlo
    public abstract double calcularArea();

    // Método concreto: todos los hijos lo heredan igual
    public void mostrarColor() {
        System.out.println("Color: " + color);
    }
}

public class Circulo extends Figura {
    private double radio;

    public Circulo(String color, double radio) {
        super(color);
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}
```

---

## ¿Interfaz o clase abstracta?

| | Interfaz | Clase abstracta |
|---|----------|----------------|
| Implementación de métodos | No (solo firmas) | Sí (puede mezclar) |
| Atributos | No (solo constantes) | Sí |
| Herencia múltiple | Sí (una clase implementa varias) | No (solo una) |
| Relación | "puede hacer X" | "es un tipo de X" |

---

## A recordar

- Una interfaz define QUÉ debe hacerse, no CÓMO
- `implements` para interfaces, `extends` para herencia/clase abstracta
- Una clase puede implementar múltiples interfaces
- Las clases abstractas tienen el `abstract` en su declaración y no pueden instanciarse

---

[[03_Practicas/semana-09]]
