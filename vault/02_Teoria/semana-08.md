---
semana: 8
tema: Herencia y Polimorfismo
estado: pendiente
---

# Semana 8 — Herencia y Polimorfismo

> Tiempo estimado: 5–6 horas
> Al terminar: `bash scripts/push.sh "semana-08 herencia"`

---

## ¿Qué es la herencia?

La herencia permite crear una clase nueva basada en una ya existente. La clase nueva ("hijo") hereda todos los atributos y métodos de la clase original ("padre") y puede agregar los suyos o modificar los heredados.

**Analogía:** Tú heredas rasgos de tus padres (ojos, estatura). Tienes sus características base, pero también tienes las tuyas propias. Igual pasa en POO.

```
Animal (padre)
├── Perro (hijo) — hereda de Animal, agrega ladrido()
├── Gato (hijo) — hereda de Animal, agrega ronronear()
└── Pájaro (hijo) — hereda de Animal, agrega volar()
```

---

## Crear herencia con extends

```java
// Clase padre
public class Animal {
    protected String nombre;
    protected String especie;

    public Animal(String nombre, String especie) {
        this.nombre = nombre;
        this.especie = especie;
    }

    public void comer() {
        System.out.println(nombre + " está comiendo.");
    }

    public void dormir() {
        System.out.println(nombre + " está durmiendo.");
    }
}

// Clase hijo
public class Perro extends Animal {
    private String raza;

    public Perro(String nombre, String raza) {
        super(nombre, "Canis lupus");   // llama al constructor del padre
        this.raza = raza;
    }

    public void ladrar() {
        System.out.println(nombre + " dice: ¡Guau!");
    }
}
```

---

## super — llamar al padre

`super` sirve para:
- Llamar al constructor del padre: `super(nombre, especie)`
- Llamar a un método del padre: `super.comer()`

---

## Polimorfismo — @Override

Un hijo puede **sobreescribir** un método del padre para que haga algo diferente:

```java
public class Animal {
    public void hacerSonido() {
        System.out.println("...");   // sonido genérico
    }
}

public class Perro extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("¡Guau!");   // sonido específico del perro
    }
}

public class Gato extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("¡Miau!");
    }
}
```

```java
// En main:
Animal[] animales = {new Perro("Rex"), new Gato("Luna"), new Perro("Max")};

for (Animal a : animales) {
    a.hacerSonido();   // cada uno hace SU sonido — polimorfismo!
}
// ¡Guau!
// ¡Miau!
// ¡Guau!
```

Polimorfismo = el mismo método (`hacerSonido`) hace cosas diferentes según el objeto.

---

## ¿Cuándo usar herencia?

Cuando hay una relación "ES UN":
- Un Perro **es un** Animal ✅ → herencia correcta
- Un Auto **tiene un** Motor ❌ → no es herencia, es composición (un atributo)

---

## A recordar

- `extends` crea una clase hijo que hereda del padre
- El hijo tiene todos los atributos y métodos del padre, más los suyos
- `super(...)` llama al constructor del padre (siempre primera línea)
- `@Override` sobreescribe un método del padre
- Polimorfismo: el mismo método, comportamiento diferente según el objeto

---

[[03_Practicas/semana-08]]
