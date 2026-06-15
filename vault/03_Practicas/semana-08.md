---
semana: 8
tema: Herencia y Polimorfismo
estado: pendiente
---

# Práctica — Semana 8: Herencia y Polimorfismo

> Guarda tu código en: `codigo/semana-08/`
> Al terminar: `bash scripts/push.sh "semana-08 herencia"`

---

## Ejercicio 1 — Zoológico virtual (obligatorio)

Crea los archivos en `codigo/semana-08/`:

**Clase padre `Animal`:**
- Atributos: `nombre`, `especie`
- Constructor con ambos atributos
- Métodos: `comer()`, `dormir()`, `hacerSonido()` (que imprima "...")

**Clases hijo:**
- `Perro` — sobreescribe `hacerSonido()` para imprimir "¡Guau!" y agrega método `buscarPelota()`
- `Gato` — sobreescribe `hacerSonido()` para imprimir "¡Miau!" y agrega método `ronronear()`
- `Pajaro` — sobreescribe `hacerSonido()` para imprimir "¡Pío!" y agrega método `volar()`

**En Main.java:**
- Crea al menos un objeto de cada tipo
- Llama a `hacerSonido()` en todos — demuestra el polimorfismo

_Tu código:_

---

## Ejercicio 2 — Figuras geométricas (obligatorio)

**Clase padre `Figura`:**
- Atributo: `color` (String)
- Método: `calcularArea()` que devuelva 0.0

**Clases hijo:**
- `Circulo` — atributo `radio`, sobreescribe `calcularArea()` (PI × radio²)
- `Rectangulo` — atributos `base` y `altura`, sobreescribe `calcularArea()`
- `Triangulo` — atributos `base` y `altura`, sobreescribe `calcularArea()` (base × altura / 2)

**En Main.java:**
- Crea una figura de cada tipo
- Imprime el área de cada una

Pista: `Math.PI` es el valor de π en Java.

_Tu código:_

---

## Reflexión

**¿Cuándo conviene usar herencia?**

_Tu respuesta:_

**¿Qué es polimorfismo? Exprésalo con tus palabras.**

_Tu respuesta:_

**¿Para qué sirve `super(...)` en el constructor hijo?**

_Tu respuesta:_
