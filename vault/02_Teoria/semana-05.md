---
semana: 5
tema: Arrays y Strings
estado: pendiente
---

# Semana 5 — Arrays y Strings

> Tiempo estimado: 4–5 horas
> Al terminar: `bash scripts/push.sh "semana-05 arrays-strings"`

---

## Arrays — listas de valores

Un array es como una lista de cajas numeradas, todas del mismo tipo.

```java
// Crear un array de 5 enteros
int[] calificaciones = {85, 92, 78, 95, 88};

// Acceder a un elemento (los índices empiezan en 0)
System.out.println(calificaciones[0]);   // 85 — primer elemento
System.out.println(calificaciones[4]);   // 88 — quinto elemento

// Cuántos elementos tiene
System.out.println(calificaciones.length);   // 5
```

**Importante:** los índices empiezan en `0`, no en `1`. Un array de 5 elementos tiene índices 0, 1, 2, 3, 4.

### Recorrer un array con for

```java
String[] frutas = {"manzana", "naranja", "uva", "mango"};

for (int i = 0; i < frutas.length; i++) {
    System.out.println(frutas[i]);
}

// Forma más moderna (for-each):
for (String fruta : frutas) {
    System.out.println(fruta);
}
```

### Crear array sin valores iniciales

```java
int[] numeros = new int[5];   // array de 5 enteros, todos en 0
numeros[0] = 10;
numeros[1] = 20;
// etc.
```

---

## Strings — trabajar con texto

Los Strings tienen métodos útiles:

```java
String nombre = "jessica escalona";

System.out.println(nombre.length());           // 16 — cuántos caracteres
System.out.println(nombre.toUpperCase());      // JESSICA ESCALONA
System.out.println(nombre.toLowerCase());      // jessica escalona
System.out.println(nombre.contains("jessica")); // true
System.out.println(nombre.replace("jessica", "Jess")); // Jess escalona
System.out.println(nombre.trim());             // quita espacios al inicio y fin
System.out.println(nombre.charAt(0));          // 'j' — primer caracter
System.out.println(nombre.substring(0, 7));    // jessica — parte del texto
```

### Comparar Strings

```java
String a = "hola";
String b = "hola";

// NO uses == para comparar Strings
if (a.equals(b)) {
    System.out.println("Son iguales");
}

// Para ignorar mayúsculas/minúsculas:
if (a.equalsIgnoreCase("HOLA")) {
    System.out.println("También son iguales");
}
```

---

## Ejemplo completo

```java
public class ListaCompras {
    public static void main(String[] args) {
        String[] productos = {"leche", "pan", "huevos", "manzanas"};
        double[] precios = {25.0, 15.0, 45.0, 35.0};

        double total = 0;
        System.out.println("=== Lista de compras ===");
        for (int i = 0; i < productos.length; i++) {
            System.out.println(productos[i] + ": $" + precios[i]);
            total += precios[i];
        }
        System.out.println("Total: $" + total);
    }
}
```

---

## A recordar

- Un array guarda múltiples valores del mismo tipo en una sola variable
- Los índices empiezan en `0`
- `array.length` te dice cuántos elementos tiene
- Los Strings tienen métodos: `length()`, `toUpperCase()`, `contains()`, `substring()`, etc.
- Para comparar Strings usa `.equals()`, no `==`

---

[[03_Practicas/semana-05]]
