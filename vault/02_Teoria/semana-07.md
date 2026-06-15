---
semana: 7
tema: Clases y Objetos
estado: pendiente
---

# Semana 7 — Clases y Objetos (POO básico)

> Tiempo estimado: 5–6 horas (el salto más importante del curso)
> Al terminar: `bash scripts/push.sh "semana-07 clases-objetos"`

---

## El gran salto: Programación Orientada a Objetos

Hasta ahora, tu código era una lista de instrucciones. Con POO, tu código modela **cosas del mundo real**.

**Analogía:** Una **clase** es como un molde de galletas. Un **objeto** es cada galleta que haces con ese molde. Todas tienen la misma forma (mismos atributos y métodos), pero valores diferentes.

Ejemplo:
- Clase `Persona` → atributos: nombre, edad, email
- Objeto: `Persona jess = new Persona("Jess", 22, "jess@email.com")`
- Objeto: `Persona carlos = new Persona("Carlos", 30, "carlos@email.com")`

---

## Crear una clase

```java
// Archivo: Persona.java
public class Persona {
    // Atributos — los datos que tiene cada persona
    String nombre;
    int edad;
    String email;

    // Constructor — cómo se crea una persona nueva
    public Persona(String nombre, int edad, String email) {
        this.nombre = nombre;
        this.edad = edad;
        this.email = email;
    }

    // Métodos — lo que puede hacer una persona
    public void saludar() {
        System.out.println("Hola, soy " + nombre + " y tengo " + edad + " años.");
    }

    public boolean esMayorDeEdad() {
        return edad >= 18;
    }
}
```

---

## Usar la clase (crear objetos)

```java
// Archivo: Main.java
public class Main {
    public static void main(String[] args) {
        // Crear objetos con "new"
        Persona jess = new Persona("Jess", 22, "jess@email.com");
        Persona carlos = new Persona("Carlos", 30, "carlos@email.com");

        // Usar sus métodos
        jess.saludar();
        carlos.saludar();

        // Acceder a sus atributos
        System.out.println(jess.nombre);   // Jess
        System.out.println(carlos.edad);   // 30

        System.out.println(jess.esMayorDeEdad());   // true
    }
}
```

---

## ¿Qué es `this`?

`this` se refiere al objeto actual. Se usa en el constructor para distinguir el parámetro del atributo cuando tienen el mismo nombre:

```java
public Persona(String nombre, int edad) {
    this.nombre = nombre;   // this.nombre = atributo / nombre = parámetro
    this.edad = edad;
}
```

---

## Getters y Setters (encapsulamiento)

Es buena práctica proteger los atributos con `private` y crear métodos para acceder a ellos:

```java
public class Producto {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // Getter — obtener el valor
    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }

    // Setter — cambiar el valor (con validación si se necesita)
    public void setPrecio(double precio) {
        if (precio > 0) {
            this.precio = precio;
        }
    }
}
```

---

## Ejemplo completo — Cuenta bancaria

```java
public class CuentaBancaria {
    private String titular;
    private double saldo;

    public CuentaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Depósito: $" + cantidad + " — Saldo: $" + saldo);
        }
    }

    public void retirar(double cantidad) {
        if (cantidad > saldo) {
            System.out.println("Fondos insuficientes");
        } else {
            saldo -= cantidad;
            System.out.println("Retiro: $" + cantidad + " — Saldo: $" + saldo);
        }
    }

    public double getSaldo() { return saldo; }
    public String getTitular() { return titular; }
}
```

---

## A recordar

- Una **clase** define la estructura: atributos + métodos
- Un **objeto** es una instancia de la clase (creado con `new`)
- El **constructor** se llama automáticamente al crear un objeto
- `this` se refiere al objeto actual
- `private` protege los atributos — usa getters/setters para acceder

---

[[03_Practicas/semana-07]]
