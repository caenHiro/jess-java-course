---
semana: 9
tema: Interfaces y Abstracción
estado: pendiente
---

# Práctica — Semana 9: Interfaces y Abstracción

> Guarda tu código en: `codigo/semana-09/`
> Al terminar: `bash scripts/push.sh "semana-09 interfaces"`

---

## Ejercicio 1 — Sistema de pagos (obligatorio)

Crea una interfaz `MetodoPago` con los métodos:
- `boolean pagar(double cantidad)` — devuelve true si el pago fue exitoso
- `String obtenerNombre()` — nombre del método de pago

Luego implementa 3 clases que usen esta interfaz:
- `PagoTarjeta` — siempre acepta el pago (simula éxito)
- `PagoEfectivo` — recibe cuánto efectivo tiene el cliente, valida si alcanza
- `PagoTransferencia` — siempre acepta el pago pero imprime "Procesando transferencia..."

En `Main.java`, crea un array de `MetodoPago[]` con uno de cada tipo y procesa un pago de $500 con cada uno.

_Tu código:_

---

## Ejercicio 2 — Clase abstracta Vehículo (obligatorio)

Crea una clase abstracta `Vehiculo` con:
- Atributos: `marca`, `modelo`, `velocidadMaxima`
- Método concreto: `mostrarInfo()` — imprime todos los atributos
- Método abstracto: `calcularConsumo(double km)` — consume X litros por km

Implementa:
- `Auto` — consume 0.08 litros/km
- `Camion` — consume 0.25 litros/km
- `Moto` — consume 0.04 litros/km

_Tu código:_

---

## Reflexión

**¿Cuál es la diferencia entre interfaz y clase abstracta?**

_Tu respuesta:_

**¿Por qué no puedes hacer `new MetodoPago()`?**

_Tu respuesta:_

**¿En qué situación usarías una interfaz en lugar de herencia?**

_Tu respuesta:_
