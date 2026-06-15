---
semana: 12
tema: SQL avanzado + Proyecto Final
estado: pendiente
---

# Semana 12 — SQL avanzado + Proyecto Integrador

> Tiempo estimado: 6–8 horas (proyecto final)
> Al terminar: `bash scripts/push.sh "semana-12 proyecto-final"`

---

## SQL avanzado — JOIN

Un `JOIN` combina datos de dos o más tablas relacionadas. Es como unir dos hojas de Excel por una columna en común.

### Estructura de ejemplo

```sql
-- Tabla estudiantes
CREATE TABLE estudiantes (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(100),
    carrera_id INT
);

-- Tabla carreras
CREATE TABLE carreras (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(100),
    duracion_anios INT
);
```

### INNER JOIN — solo registros que coinciden

```sql
SELECT e.nombre, c.nombre AS carrera, c.duracion_anios
FROM estudiantes e
INNER JOIN carreras c ON e.carrera_id = c.id;
```

### LEFT JOIN — todos los de la izquierda, aunque no tengan coincidencia

```sql
SELECT e.nombre, c.nombre AS carrera
FROM estudiantes e
LEFT JOIN carreras c ON e.carrera_id = c.id;
-- Incluye estudiantes aunque no tengan carrera asignada (carrera = NULL)
```

---

## GROUP BY — agrupar resultados

```sql
-- Cuántos estudiantes hay por carrera
SELECT carrera_id, COUNT(*) AS total_estudiantes
FROM estudiantes
GROUP BY carrera_id;

-- Con JOIN para ver el nombre de la carrera
SELECT c.nombre, COUNT(e.id) AS total, AVG(e.promedio) AS promedio_carrera
FROM carreras c
LEFT JOIN estudiantes e ON c.id = e.carrera_id
GROUP BY c.id, c.nombre;
```

---

## HAVING — filtrar grupos (como WHERE pero para grupos)

```sql
-- Solo carreras con más de 10 estudiantes
SELECT carrera_id, COUNT(*) AS total
FROM estudiantes
GROUP BY carrera_id
HAVING total > 10;
```

---

## Proyecto Final — Sistema de Tienda

Diseña una base de datos para una tienda pequeña con estas tablas:

```sql
CREATE TABLE categorias (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(100)
);

CREATE TABLE productos (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(200),
    precio DECIMAL(10,2),
    stock INT DEFAULT 0,
    categoria_id INT,
    FOREIGN KEY (categoria_id) REFERENCES categorias(id)
);

CREATE TABLE clientes (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(100),
    email VARCHAR(200) UNIQUE
);

CREATE TABLE ventas (
    id INT PRIMARY KEY AUTO_INCREMENT,
    cliente_id INT,
    fecha DATETIME DEFAULT NOW(),
    total DECIMAL(10,2),
    FOREIGN KEY (cliente_id) REFERENCES clientes(id)
);

CREATE TABLE detalle_venta (
    id INT PRIMARY KEY AUTO_INCREMENT,
    venta_id INT,
    producto_id INT,
    cantidad INT,
    precio_unitario DECIMAL(10,2),
    FOREIGN KEY (venta_id) REFERENCES ventas(id),
    FOREIGN KEY (producto_id) REFERENCES productos(id)
);
```

---

## A recordar

- `JOIN` combina datos de múltiples tablas
- `INNER JOIN` solo trae filas que coinciden en ambas tablas
- `LEFT JOIN` trae TODOS los de la izquierda (con o sin coincidencia derecha)
- `GROUP BY` agrupa filas con el mismo valor
- `HAVING` filtra grupos (después de GROUP BY)
- `FOREIGN KEY` crea relaciones entre tablas

---

[[03_Practicas/semana-12]]
