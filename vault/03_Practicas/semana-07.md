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

```java
public class Persona {
    //atribitos
    private String nombre;
    private int  edad;
    private String ciudad;
    //Constructor
    public Persona (String nombre, int  edad,  String ciudad) {
        this.nombre = nombre;
        this.edad = edad;
        this.ciudad = ciudad;
    }
    public void saluda () {
        System.out.println("Hola mi nombre es " + nombre + " , tengo " + edad + " años y vivo en " + ciudad);
    }
    public boolean mayorDeEdad () {
        return edad >= 18;
    }
    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    public String getCiudad(){
        return ciudad;
    }
}



public class Main {

     public static void main(String[] args) throws Exception {

        Persona jess = new Persona( "Jess", 35, "Ciudad de Mexico");

        Persona carlos = new Persona( "Carlos", 34, "Ciudad de Mexico");

  

        jess.saluda();

        carlos.saluda();

  

        System.out.println(jess.getNombre() + " tiene " + jess.getEdad() + " años");

  

        if (jess.mayorDeEdad()) {

            System.out.println(jess.getNombre() + " es mayor de edad. ");

        }

    }

}

```

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
```java
public class Producto {

    //atribitos

    private  String nombre;

    private double precio;

    private String categoria;

  

    //Constructor

    public Producto(String nombre, double precio,  String categoria) {

        this.nombre = nombre;

        this.precio = precio > 0 ? precio : 0;

        this.categoria = categoria;

    }

  

    //Getter

    public String getNombre(){

        return nombre;

    }

    public double  getPrecio (){

        return precio;

    }

    public String getCategoria() {

        return categoria;

    }

  

    //Setter

    public void setPrecio(double  precio){

        if(precio > 0){

            this.precio = precio;

        }

    }

    //poner precio mas iva

    public double  precioConIva (double  precio){

        return precio * 1.16;

    }

  

    public  void mostrarInfo() {

        System.out.println("[ " + getCategoria() + " ]" + getNombre() + " - $" + getPrecio() + " precio con IVA " + precioConIva(getPrecio()) );

    }
}




public class Main2 {

    public static void main(String[] args) {

        Producto s = new Producto( " Frijol" , 56 , "Semillas" );

        Producto v = new Producto( " Lechuga" , 22, "Verdura" );

        Producto a = new Producto( " Boing" , 50 , "Bebida" );

  

        //Mostrar los productos

        System.out.println("=== Productos del tianguis ===");

        s.mostrarInfo();

        v.mostrarInfo();

        a.mostrarInfo();

  

        //Set es para modificar un valor

        v.setPrecio(33);

        System.out.println("Precio actualizado: ");

        v.mostrarInfo();

  

        a.setPrecio(-22);

        System.err.println("Precio actualizado:");

        a.mostrarInfo();

    }

  

}

```
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
