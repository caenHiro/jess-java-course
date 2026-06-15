---
semana: 6
tema: Métodos
estado: pendiente
---

# Práctica — Semana 6: Métodos

> Guarda tu código en: `codigo/semana-06/`
> Al terminar: `bash scripts/push.sh "semana-06 metodos"`

---

## Ejercicio 1 — Calculadora con métodos (obligatorio)

Archivo: `codigo/semana-06/CalculadoraMetodos.java`

Toma tu calculadora de la semana 2 y refactorízala: en lugar de hacer los cálculos dentro del `main`, crea métodos separados para cada operación:
- `sumar(double a, double b)`
- `restar(double a, double b)`
- `multiplicar(double a, double b)`
- `dividir(double a, double b)` — con manejo de división entre 0

_Tu código:_

---

## Ejercicio 2 — Validador de contraseña (obligatorio)

Archivo: `codigo/semana-06/ValidadorContrasena.java`

Crea un método `boolean esContrasenaValida(String contrasena)` que devuelva `true` si:
- Tiene al menos 8 caracteres
- Tiene al menos una letra mayúscula

Pista: `contrasena.length()` y un ciclo con `Character.isUpperCase(c)`.

_Tu código:_

---

## Ejercicio 3 — Número primo (reto)

Archivo: `codigo/semana-06/EsPrimo.java`

Crea un método `boolean esPrimo(int n)` que devuelva `true` si el número es primo.

Luego en `main`, imprime todos los números primos del 1 al 50.

Pista: un número primo solo es divisible entre 1 y él mismo.

_Tu código:_

---

## Reflexión

**¿Qué ventaja tiene usar métodos en lugar de escribir todo en el main?**

_Tu respuesta:_

**¿Cuál es la diferencia entre un método void y uno que devuelve int?**

_Tu respuesta:_

**¿Pudiste hacer el validador de contraseña? ¿Cómo lo resolviste?**

_Tu respuesta:_
