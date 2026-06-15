---
semana: 11
tema: SQL básico
estado: pendiente
---

# Semana 11 — SQL: Bases de datos relacionales

> Tiempo estimado: 5–6 horas
> Herramienta: DBeaver Community (gratuito) o MySQL Workbench

---

## ¿Qué es una base de datos?

Una base de datos guarda información de forma organizada para que pueda buscarse, actualizarse y eliminarse fácilmente. Es como una hoja de Excel muy poderosa.

**SQL** (Structured Query Language) es el lenguaje para hablar con una base de datos.

---

## Tablas, filas y columnas

Una **tabla** organiza datos en filas y columnas, igual que Excel:

| id | nombre | edad | email |
|----|--------|------|-------|
| 1 | Jess | 22 | jess@email.com |
| 2 | Carlos | 30 | carlos@email.com |

- **Columnas** = atributos (nombre, edad, email)
- **Filas** = registros (cada persona)
- **id** = clave primaria (identifica cada fila de forma única)

---

## Crear una tabla

```sql
CREATE TABLE estudiantes (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(100) NOT NULL,
    edad INT,
    email VARCHAR(200) UNIQUE,
    promedio DECIMAL(4,2)
);
```

- `INT` — número entero
- `VARCHAR(n)` — texto de hasta n caracteres
- `DECIMAL(4,2)` — número con 2 decimales (ej: 9.85)
- `NOT NULL` — campo obligatorio
- `AUTO_INCREMENT` — el id se asigna automáticamente
- `UNIQUE` — no se pueden repetir valores

---

## INSERT — agregar datos

```sql
INSERT INTO estudiantes (nombre, edad, email, promedio)
VALUES ('Jessica Escalona', 22, 'jess@email.com', 9.2);

INSERT INTO estudiantes (nombre, edad, email, promedio)
VALUES ('Carlos Pérez', 30, 'carlos@email.com', 8.5);
```

---

## SELECT — consultar datos

```sql
-- Todos los registros, todas las columnas
SELECT * FROM estudiantes;

-- Solo algunas columnas
SELECT nombre, email FROM estudiantes;

-- Con condición
SELECT * FROM estudiantes WHERE edad > 20;

-- Ordenar resultados
SELECT * FROM estudiantes ORDER BY nombre ASC;
SELECT * FROM estudiantes ORDER BY promedio DESC;

-- Limitar resultados
SELECT * FROM estudiantes LIMIT 5;
```

---

## WHERE — filtros

```sql
SELECT * FROM estudiantes WHERE promedio >= 9.0;
SELECT * FROM estudiantes WHERE nombre = 'Jessica Escalona';
SELECT * FROM estudiantes WHERE edad BETWEEN 20 AND 30;
SELECT * FROM estudiantes WHERE nombre LIKE 'Jes%';   -- empieza con "Jes"
SELECT * FROM estudiantes WHERE nombre LIKE '%Escalona';  -- termina con "Escalona"
```

---

## UPDATE — actualizar datos

```sql
UPDATE estudiantes
SET promedio = 9.5
WHERE id = 1;

-- ¡SIEMPRE usar WHERE en UPDATE! Sin WHERE, actualiza TODOS los registros
```

---

## DELETE — eliminar datos

```sql
DELETE FROM estudiantes WHERE id = 2;

-- ¡SIEMPRE usar WHERE en DELETE! Sin WHERE, elimina TODOS los registros
```

---

## Funciones de agregación

```sql
SELECT COUNT(*) FROM estudiantes;              -- cuántos hay
SELECT AVG(promedio) FROM estudiantes;         -- promedio general
SELECT MAX(promedio) FROM estudiantes;         -- el más alto
SELECT MIN(promedio) FROM estudiantes;         -- el más bajo
SELECT SUM(promedio) FROM estudiantes;         -- suma
```

---

## A recordar

- `CREATE TABLE` — crear tablas
- `INSERT INTO` — agregar datos
- `SELECT ... FROM ... WHERE` — consultar datos
- `UPDATE ... SET ... WHERE` — modificar datos
- `DELETE FROM ... WHERE` — eliminar datos
- **Siempre usar `WHERE` en UPDATE y DELETE** para no afectar toda la tabla

---

[[03_Practicas/semana-11]]
