---
semana: 4
tema: Ciclos
estado: pendiente
---

# Práctica — Semana 4: Ciclos

> Guarda tu código en: `codigo/semana-04/`
> Al terminar: `bash scripts/push.sh "semana-04 ciclos"`

---

## Ejercicio 1 — Tabla de multiplicar (obligatorio)

Archivo: `codigo/semana-04/TablaMultiplicar.java`

El programa debe:
1. Pedir al usuario un número
2. Imprimir la tabla de multiplicar de ese número (del 1 al 10)

Ejemplo para el número 7:
```
Tabla del 7:
7 x 1 = 7
7 x 2 = 14
...
7 x 10 = 70
```

_Tu código:_
import java.util.Scanner;  
public class TablaMultiplicar {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
    // Pedir al usuario un número
    System.out.print(" Ingresa un número: ");
    int num = sc.nextInt();
    System.out.println("Tabla del " + num + ": ") ;
    for (int i = 1; i <= 10; i++) {
    System.out.println( num + " x " + i + " = " + i * num);
}
     }
}

---

## Ejercicio 2 — Suma del 1 al N (obligatorio)

Archivo: `codigo/semana-04/SumaN.java`

El programa debe:
1. Pedir un número N al usuario
2. Calcular la suma de todos los números del 1 hasta N
3. Imprimir el resultado

Ejemplo con N=5: `1 + 2 + 3 + 4 + 5 = 15`

_Tu código:_
import java.util.Scanner;

  

public class Suma {

    public static void main(String[] args) throws Exception {

       Scanner sc = new Scanner(System.in);

    // Pedir al usuario un número

    System.out.print(" Ingresa un número: ");

    int num = sc.nextInt();

    int sum = 0;

    for (int i = 1; i <= num; i++) {

    sum = sum + i;  

}

System.out.println("Sumatoria = " + sum);

    }

  

}

---

## Ejercicio 3 — Adivina el número (reto)

Archivo: `codigo/semana-04/AdivinaNumero.java`

El programa tiene un número secreto (puedes elegirlo tú, ej. 42).

El programa debe:
1. Pedir al usuario que adivine el número
2. Decirle si el número secreto es mayor o menor que su intento
3. Repetir hasta que adivine
4. Al final, mostrar cuántos intentos le tomó

Pista: usa `do-while`.

_Tu código:_

---

## Reflexión

**¿Cuál ciclo usaste en cada ejercicio? ¿Por qué ese?**

_Tu respuesta:_

**¿Qué es un "ciclo infinito"? ¿Lo experimentaste?**

_Tu respuesta:_

**¿Pudiste hacer el reto? ¿Qué fue lo más difícil?**

_Tu respuesta:_
