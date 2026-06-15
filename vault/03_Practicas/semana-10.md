---
semana: 10
tema: Excepciones y Colecciones
estado: pendiente
---

# Práctica — Semana 10: Excepciones y Colecciones

> Guarda tu código en: `codigo/semana-10/`
> Al terminar: `bash scripts/push.sh "semana-10 excepciones"`

---

## Ejercicio 1 — Calculadora segura (obligatorio)

Archivo: `codigo/semana-10/CalculadoraSegura.java`

Crea una calculadora que pida dos números y la operación (+, -, *, /). Usa `try/catch` para manejar:
- División entre 0
- Si el usuario escribe algo que no es número (`NumberFormatException`)
- Cualquier otro error inesperado

El programa no debe explotar aunque el usuario escriba basura.

_Tu código:_

---

## Ejercicio 2 — Lista de tareas con ArrayList (obligatorio)

Archivo: `codigo/semana-10/ListaTareas.java`

Crea un programa con menú (do-while + switch) que permita:
1. Agregar tarea
2. Ver todas las tareas
3. Eliminar tarea por número
4. Salir

Usa un `ArrayList<String>` para guardar las tareas.

_Tu código:_

---

## Ejercicio 3 — Agenda con HashMap (reto)

Archivo: `codigo/semana-10/Agenda.java`

Crea una agenda usando `HashMap<String, String>` donde la clave es el nombre de la persona y el valor es su teléfono.

El programa debe permitir:
- Agregar contacto
- Buscar por nombre
- Eliminar contacto
- Ver todos los contactos

_Tu código:_

---

## Reflexión

**¿Qué pasa si no manejas una excepción?**

_Tu respuesta:_

**¿Cuál es la diferencia entre un array normal y un ArrayList?**

_Tu respuesta:_

**¿En qué situación usarías HashMap en lugar de ArrayList?**

_Tu respuesta:_
