---
semana: 7
tema: Clases y Objetos
estado: pendiente
---

# Práctica — Semana 7: Clases y Objetos

> Guarda tu código en: `codigo/semana-07/`
> Al terminar: `bash scripts/push.sh "semana-07 clases"`

---

## Ejercicio 1 — Clase Persona (obligatorio)

Archivos: `codigo/semana-07/Persona.java` y `Main.java`

Crea la clase `Persona` con:
- Atributos: `nombre` (String), `edad` (int), `ciudad` (String)
- Constructor que reciba los 3 atributos
- Método `saludar()` que imprima "Hola, soy [nombre], tengo [edad] años y vivo en [ciudad]"
- Método `esMayorDeEdad()` que devuelva `true` si la edad es >= 18

En `Main.java`, crea al menos 2 objetos Persona y prueba todos los métodos.

_Tu código:_

---

## Ejercicio 2 — Clase Producto con IVA (obligatorio)

Archivos: `codigo/semana-07/Producto.java` y `Main2.java`

Crea la clase `Producto` con:
- Atributos privados: `nombre`, `precio` (double), `categoria`
- Constructor con los 3 atributos
- Getters para todos los atributos
- Setter para `precio` (validar que sea mayor que 0)
- Método `calcularPrecioConIVA()` que devuelva el precio × 1.16
- Método `mostrarInfo()` que imprima toda la información del producto

_Tu código:_

---

## Ejercicio 3 — Cuenta bancaria (reto)

Archivo: `codigo/semana-07/CuentaBancaria.java` y `BancoMain.java`

Crea la clase `CuentaBancaria` con:
- Atributos privados: `titular` (String), `saldo` (double), `numeroCuenta` (String)
- Métodos: `depositar(double)`, `retirar(double)`, `getSaldo()`, `mostrarResumen()`
- `retirar` debe validar que hay suficiente saldo

Crea 2 cuentas en `BancoMain.java` y simula algunas transacciones.

_Tu código:_

---

## Reflexión

**¿Cuál es la diferencia entre una clase y un objeto?**

_Tu respuesta:_

**¿Para qué sirve el constructor?**

_Tu respuesta:_

**¿Por qué hacemos los atributos `private`?**

_Tu respuesta:_

**¿Cuál fue el ejercicio más difícil y por qué?**

_Tu respuesta:_
