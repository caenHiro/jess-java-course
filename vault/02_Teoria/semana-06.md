---
semana: 6
tema: Métodos
estado: pendiente
---

# Semana 6 — Métodos y funciones

> Tiempo estimado: 4–5 horas
> Al terminar: `bash scripts/push.sh "semana-06 metodos"`

---

## ¿Qué es un método?

Un método es un bloque de código con nombre que puedes reutilizar. En lugar de copiar y pegar el mismo código en varios lugares, lo escribes una vez en un método y lo "llamas" cuando lo necesites.

Piensa en un método como una receta guardada: en lugar de escribir los pasos de hacer café cada vez, guardas la receta con el nombre "hacerCafe" y la usas cuando la necesites.

---

## Crear y usar un método

```java
public class Saludos {

    // Definir el método
    public static void saludar(String nombre) {
        System.out.println("Hola, " + nombre + "!");
    }

    public static void main(String[] args) {
        // Llamar al método
        saludar("Jess");
        saludar("Carlos");
        saludar("Mamá");
    }
}
```

Salida:
```
Hola, Jess!
Hola, Carlos!
Hola, Mamá!
```

---

## Partes de un método

```java
public static int sumar(int a, int b) {
    return a + b;
}
```

- `public static` — por ahora siempre lo escribes así
- `int` — el tipo de dato que el método DEVUELVE (`void` si no devuelve nada)
- `sumar` — el nombre del método
- `(int a, int b)` — parámetros: datos que recibe el método
- `return a + b` — el valor que devuelve

---

## Métodos que no devuelven nada (void)

```java
public static void imprimirLinea() {
    System.out.println("--------------------");
}

// En main:
imprimirLinea();
System.out.println("Resultado: 42");
imprimirLinea();
```

---

## Métodos que devuelven un valor

```java
public static double calcularIVA(double precio) {
    return precio * 0.16;
}

public static double calcularTotal(double precio) {
    double iva = calcularIVA(precio);
    return precio + iva;
}

// En main:
double total = calcularTotal(100.0);
System.out.println("Total con IVA: $" + total);   // $116.0
```

---

## Buenas prácticas

- Un método debe hacer **una sola cosa** (si hace dos, crea dos métodos)
- El nombre debe describir qué hace: `calcularTotal`, `obtenerNombre`, `esValido`
- Los parámetros también deben tener nombres descriptivos

---

## Ejemplo completo

```java
public class Calculadora {

    public static double sumar(double a, double b) { return a + b; }
    public static double restar(double a, double b) { return a - b; }
    public static double multiplicar(double a, double b) { return a * b; }

    public static double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Error: no se puede dividir entre 0");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {
        System.out.println(sumar(10, 5));        // 15.0
        System.out.println(restar(10, 5));       // 5.0
        System.out.println(multiplicar(10, 5));  // 50.0
        System.out.println(dividir(10, 5));      // 2.0
    }
}
```

---

## A recordar

- Los métodos evitan repetir código
- `void` = no devuelve nada. Cualquier otro tipo = devuelve ese tipo
- `return` entrega el resultado y termina el método
- Los parámetros son los datos que el método necesita para trabajar

---

[[03_Practicas/semana-06]]
