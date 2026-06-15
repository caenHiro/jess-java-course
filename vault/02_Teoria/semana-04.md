---
semana: 4
tema: Ciclos
estado: pendiente
---

# Semana 4 — Ciclos: for / while / do-while

> Tiempo estimado: 3–4 horas
> Al terminar: `bash scripts/push.sh "semana-04 ciclos"`

---

## ¿Para qué sirven los ciclos?

Imagina que tienes que escribir "Buenos días" 100 veces. Sin ciclos tendrías que escribir 100 líneas iguales. Con un ciclo, escribes las instrucciones UNA sola vez y le dices a Java cuántas veces repetirlas.

---

## El ciclo for — cuando sabes cuántas veces

Úsalo cuando sabes exactamente cuántas repeticiones necesitas.

```java
for (int i = 1; i <= 5; i++) {
    System.out.println("Repetición número " + i);
}
```

Salida:
```
Repetición número 1
Repetición número 2
Repetición número 3
Repetición número 4
Repetición número 5
```

Partes del `for`:
- `int i = 1` — variable contador, empieza en 1
- `i <= 5` — condición: mientras sea verdadera, sigue repitiendo
- `i++` — incrementa el contador en 1 cada vuelta (`i++` es lo mismo que `i = i + 1`)

---

## El ciclo while — mientras se cumpla algo

Úsalo cuando no sabes cuántas veces vas a repetir, pero sabes cuándo parar.

```java
int numero = 1;

while (numero <= 10) {
    System.out.println(numero);
    numero++;   // ¡MUY IMPORTANTE! Si no incrementas, es ciclo infinito
}
```

---

## El ciclo do-while — ejecuta al menos una vez

La diferencia con `while` es que el `do-while` revisa la condición DESPUÉS de ejecutar el bloque. Siempre se ejecuta al menos una vez.

Útil para menús y cuando le preguntas algo al usuario:

```java
import java.util.Scanner;

Scanner sc = new Scanner(System.in);
int numero;

do {
    System.out.print("Ingresa un número mayor que 0: ");
    numero = sc.nextInt();
} while (numero <= 0);

System.out.println("Ingresaste: " + numero);
```

Si el usuario pone un número negativo, vuelve a preguntar.

---

## break y continue

```java
for (int i = 1; i <= 10; i++) {
    if (i == 5) {
        break;   // sale del ciclo completamente cuando i llega a 5
    }
    System.out.println(i);
}
// Imprime: 1, 2, 3, 4

for (int i = 1; i <= 5; i++) {
    if (i == 3) {
        continue;  // salta esta vuelta (no imprime el 3)
    }
    System.out.println(i);
}
// Imprime: 1, 2, 4, 5
```

---

## ¿Cuál ciclo uso?

| Situación | Ciclo a usar |
|-----------|-------------|
| Sé exactamente cuántas veces | `for` |
| No sé cuántas veces, pero tengo condición | `while` |
| Quiero ejecutar al menos una vez | `do-while` |

---

## A recordar

- Los ciclos repiten código automáticamente
- `for` para cantidades conocidas, `while` para condiciones, `do-while` para "al menos una vez"
- Siempre asegúrate de que el ciclo tenga una condición de salida — si no, será infinito

---

## Siguiente paso

[[03_Practicas/semana-04]]
