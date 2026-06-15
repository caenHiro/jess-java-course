---
semana: 11
tema: SQL básico
estado: pendiente
---

# Práctica — Semana 11: SQL básico

> Guarda tus scripts en: `codigo/semana-11/`
> Archivos: `01_crear_tablas.sql`, `02_insertar_datos.sql`, `03_consultas.sql`
> Al terminar: `bash scripts/push.sh "semana-11 sql-basico"`

---

## Setup

Instala DBeaver Community (gratuito en dbeaver.io) y conéctate a una base de datos MySQL local.

Crea primero la base de datos:
```sql
CREATE DATABASE mi_escuela;
USE mi_escuela;
```

---

## Ejercicio 1 — Crear tablas e insertar datos (obligatorio)

Archivo: `codigo/semana-11/01_crear_y_insertar.sql`

Crea la tabla `estudiantes` con los campos:
- `id` (clave primaria auto-incremental)
- `nombre` (texto, obligatorio)
- `edad` (entero)
- `carrera` (texto)
- `promedio` (número con 2 decimales)
- `fecha_ingreso` (fecha)

Luego inserta al menos 8 estudiantes con datos variados (diferentes carreras, promedios entre 6 y 10).

_Tu código:_

---

## Ejercicio 2 — Consultas con SELECT y WHERE (obligatorio)

Archivo: `codigo/semana-11/02_consultas.sql`

Escribe una consulta para cada uno de estos casos:

1. Ver todos los estudiantes
2. Ver solo nombre y promedio, ordenados de mayor a menor promedio
3. Ver estudiantes con promedio mayor o igual a 9.0
4. Ver estudiantes de la carrera "Ingeniería en Sistemas" (o la que hayas creado)
5. Ver cuántos estudiantes hay en total (`COUNT`)
6. Ver el promedio general de todos los estudiantes (`AVG`)
7. Ver el estudiante con el promedio más alto
8. Ver estudiantes cuyo nombre contiene la letra "a" (usa `LIKE`)

_Tu código:_

---

## Ejercicio 3 — UPDATE y DELETE (obligatorio)

Archivo: `codigo/semana-11/03_actualizar_eliminar.sql`

1. Actualiza el promedio de UN estudiante específico
2. Cambia la carrera de dos estudiantes
3. Elimina un estudiante por su id

_Tu código:_

---

## Reflexión

**¿Por qué es importante el `WHERE` en UPDATE y DELETE?**

_Tu respuesta:_

**¿Qué hace `AUTO_INCREMENT`?**

_Tu respuesta:_

**¿Cuál es la diferencia entre `=` y `LIKE` en el WHERE?**

_Tu respuesta:_
