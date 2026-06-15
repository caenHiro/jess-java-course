---
semana: 12
tema: Proyecto Final — Sistema de Tienda
estado: pendiente
---

# Práctica — Semana 12: Proyecto Final

> Guarda todo en: `codigo/semana-12/`
> Al terminar: `bash scripts/push.sh "semana-12 proyecto-final COMPLETADO"`

---

## Proyecto: Sistema de Tienda

Este es tu proyecto de cierre. Vas a crear desde cero la base de datos de una tienda pequeña con todo lo que aprendiste.

---

## Parte 1 — Base de datos (SQL)

Archivo: `codigo/semana-12/01_tienda_ddl.sql`

Crea las siguientes tablas con sus relaciones:
- `categorias` (id, nombre)
- `productos` (id, nombre, precio, stock, categoria_id → FK a categorias)
- `clientes` (id, nombre, email)
- `ventas` (id, cliente_id → FK, fecha, total)
- `detalle_venta` (id, venta_id → FK, producto_id → FK, cantidad, precio_unitario)

Archivo: `codigo/semana-12/02_tienda_datos.sql`

Inserta datos de prueba:
- Al menos 4 categorías
- Al menos 12 productos (3 por categoría)
- Al menos 5 clientes
- Al menos 3 ventas con sus detalles

---

## Parte 2 — Consultas con JOIN (SQL)

Archivo: `codigo/semana-12/03_tienda_consultas.sql`

Escribe las siguientes consultas:

1. Listar todos los productos con el nombre de su categoría
2. Ver los productos con stock menor a 5 (alerta de inventario)
3. Ver las ventas con el nombre del cliente y el total
4. Ver el detalle de una venta específica (producto, cantidad, precio, subtotal)
5. Ver cuántos productos hay por categoría
6. Ver el cliente que más ha gastado (total acumulado de sus ventas)
7. Ver los 5 productos más vendidos (por cantidad total)

---

## Parte 3 — Clase Java conectada a MySQL (opcional/reto)

Archivo: `codigo/semana-12/ProductoDAO.java`

Si quieres conectar Java con la BD:

```java
import java.sql.*;

public class ProductoDAO {
    private static final String URL = "jdbc:mysql://localhost:3306/mi_tienda";
    private static final String USER = "root";
    private static final String PASS = "tu_password";

    public static void main(String[] args) throws Exception {
        Connection conn = DriverManager.getConnection(URL, USER, PASS);
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM productos");

        while (rs.next()) {
            System.out.println(rs.getString("nombre") + " - $" + rs.getDouble("precio"));
        }
        conn.close();
    }
}
```

---

## Reflexión final del curso

**¿Qué fue lo que más te gustó aprender en estos 90 días?**

_Tu respuesta:_

**¿Qué fue lo más difícil y cómo lo superaste?**

_Tu respuesta:_

**¿Qué quieres aprender después?**

_Tu respuesta:_

**¿Sientes que puedes leer código Java de alguien más y entender qué hace?**

_Tu respuesta:_

---

> Felicidades por completar el curso. Este es solo el comienzo.
