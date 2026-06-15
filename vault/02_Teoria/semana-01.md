---
semana: 1
tema: Variables y tipos de datos
estado: pendiente
---

# Semana 1 — ¿Qué es programar? Variables y tipos de datos

> Tiempo estimado: 3–4 horas repartidas en la semana
> Cuando termines, sube tu código con: `bash scripts/push.sh "semana-01 variables"`

---

## Antes de empezar

Instala las herramientas si aún no lo has hecho:
- Ver: [[01_Instalacion/01_Java]]
- Ver: [[01_Instalacion/02_VSCode]]

---

## ¿Qué es un programa?

Imagina que le explicas a alguien que nunca ha cocinado cómo hacer un café:
1. Pon agua a calentar
2. Cuando hierva, agrega el café
3. Revuelve 10 veces
4. Sirve en una taza

Eso es un **algoritmo** — instrucciones paso a paso para lograr algo. Un programa es exactamente eso, pero escrito en un lenguaje que la computadora entiende.

Java es uno de esos lenguajes.

---

## Tu primer programa

Crea una carpeta `codigo/semana-01/` y dentro un archivo `HolaMundo.java`:

```java
public class HolaMundo {
    public static void main(String[] args) {
        System.out.println("Hola, me llamo Jess!");
    }
}
```

Para ejecutarlo en VS Code: click derecho → "Run Java".

**Regla importante:** el nombre del archivo (`HolaMundo.java`) debe ser IGUAL al nombre que está después de `class` (`HolaMundo`). Java es muy sensible a esto.

---

## Variables — cajas con nombre

Una **variable** es como una caja con etiqueta. Dentro guardas un valor, y cada vez que necesitas ese valor, solo dices el nombre de la caja.

```java
int edad = 25;
```

Esto le dice a Java: "crea una caja llamada `edad`, que guarda un número entero, y pon `25` adentro".

### Los tipos de datos más comunes

| Tipo | Qué guarda | Ejemplo |
|------|-----------|---------|
| `int` | Número entero (sin decimales) | `int meses = 12;` |
| `double` | Número con decimales | `double precio = 99.50;` |
| `String` | Texto (siempre entre comillas) | `String nombre = "Jess";` |
| `boolean` | Solo `true` o `false` | `boolean activo = true;` |

### Reglas para nombrar variables

- Solo letras, números y guion bajo
- No pueden empezar con número
- Sin espacios ni acentos
- Usa nombres descriptivos: `precioTotal` en lugar de `p`

---

## Imprimir en pantalla

```java
System.out.println("Hola Mundo");   // imprime con salto de línea al final
System.out.print("Sin salto");      // imprime sin salto de línea

// Puedes mezclar texto y variables con +
String nombre = "Jess";
int edad = 22;
System.out.println("Me llamo " + nombre + " y tengo " + edad + " años.");
```

---

## Operaciones matemáticas

```java
int a = 10;
int b = 3;

System.out.println(a + b);  // Suma: 13
System.out.println(a - b);  // Resta: 7
System.out.println(a * b);  // Multiplicación: 30
System.out.println(a / b);  // División: 3 (¡ojo! solo da enteros)
System.out.println(a % b);  // Residuo: 1
```

> Si necesitas decimales en la división, usa `double`: `double resultado = 10.0 / 3;`

---

## Errores frecuentes (no te asustes, pasan siempre)

- **Olvidar el `;`** al final de cada línea — Java lo necesita
- **El texto sin comillas:** `"Jess"` no es lo mismo que `Jess` (sin comillas da error)
- **El nombre del archivo no coincide con el nombre de la clase** — deben ser iguales

---

## A recordar esta semana

- Todo programa Java tiene un método `main` — es donde empieza todo
- Las variables guardan valores que usas en el programa
- `System.out.println()` muestra cosas en pantalla
- Cada tipo de dato tiene su propósito: `int` para enteros, `double` para decimales, `String` para texto

---

## Siguiente paso

Cuando sientas que entendiste esto, ve a la nota de práctica:
[[03_Practicas/semana-01]]
