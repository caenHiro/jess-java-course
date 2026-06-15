---
semana: 10
tema: Excepciones y Colecciones
estado: pendiente
---

# Semana 10 — Excepciones y Colecciones (ArrayList, HashMap)

> Tiempo estimado: 4–5 horas
> Al terminar: `bash scripts/push.sh "semana-10 excepciones-colecciones"`

---

## Excepciones — manejar errores con elegancia

Una **excepción** es un error que ocurre mientras el programa corre. Sin manejo, el programa se detiene bruscamente. Con `try/catch`, puedes controlar qué pasa cuando algo sale mal.

```java
try {
    // código que podría fallar
    int resultado = 10 / 0;
} catch (ArithmeticException e) {
    // qué hacer si falla
    System.out.println("Error: " + e.getMessage());
} finally {
    // esto SIEMPRE se ejecuta, falle o no
    System.out.println("Fin del intento");
}
```

---

## Tipos de excepciones comunes

| Excepción | Cuándo ocurre |
|-----------|--------------|
| `ArithmeticException` | División entre 0 |
| `NullPointerException` | Usar un objeto que es null |
| `ArrayIndexOutOfBoundsException` | Índice fuera del rango del array |
| `NumberFormatException` | Convertir texto no numérico a número |
| `IllegalArgumentException` | Argumento inválido |

---

## Lanzar tu propia excepción

```java
public static double dividir(double a, double b) {
    if (b == 0) {
        throw new IllegalArgumentException("No se puede dividir entre 0");
    }
    return a / b;
}

// En main:
try {
    System.out.println(dividir(10, 0));
} catch (IllegalArgumentException e) {
    System.out.println("Error: " + e.getMessage());
}
```

---

## ArrayList — listas dinámicas

Un `ArrayList` es como un array pero puede crecer y achicarse. Úsalo cuando no sabes cuántos elementos vas a guardar.

```java
import java.util.ArrayList;

ArrayList<String> nombres = new ArrayList<>();

nombres.add("Jess");          // agregar
nombres.add("Carlos");
nombres.add("María");

System.out.println(nombres.get(0));    // "Jess" — obtener por índice
System.out.println(nombres.size());   // 3 — cuántos elementos
nombres.remove("Carlos");             // eliminar por valor
nombres.remove(0);                    // eliminar por índice

// Recorrer:
for (String nombre : nombres) {
    System.out.println(nombre);
}
```

---

## HashMap — pares clave-valor

Un `HashMap` guarda datos como pares: "clave" → "valor". Como un diccionario.

```java
import java.util.HashMap;

HashMap<String, Integer> edades = new HashMap<>();

edades.put("Jess", 22);       // agregar
edades.put("Carlos", 30);

System.out.println(edades.get("Jess"));      // 22
System.out.println(edades.containsKey("Carlos")); // true
edades.remove("Carlos");

// Recorrer:
for (String nombre : edades.keySet()) {
    System.out.println(nombre + ": " + edades.get(nombre));
}
```

---

## A recordar

- `try/catch` captura errores sin que el programa explote
- `finally` se ejecuta siempre (útil para cerrar conexiones)
- `throw` lanza una excepción manualmente
- `ArrayList` = lista dinámica (crece y achica sola)
- `HashMap` = diccionario clave-valor

---

[[03_Practicas/semana-10]]
