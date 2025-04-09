# 🦁 Zoológico - Sistema de Gestión de Animales

Proyecto de programación orientado a objetos que simula la administración de animales dentro de un zoológico. Implementado en Java con uso de clases, herencia, enumeraciones, interfaces y manejo de excepciones.

## 📋 Funcionalidades

- Registrar animales (mamíferos, aves, reptiles).
- Asignar dieta (herbívoro, carnívoro, omnívoro).
- Vacunar animales según especie.
- Evitar duplicados mediante validaciones.
- Mostrar lista de animales registrados.

## 🧠 Conceptos aplicados

- POO: herencia, polimorfismo, encapsulamiento.
- Interfaces (`Vacunar`).
- Enumeraciones (`Dieta`).
- Manejo de excepciones personalizadas:
  - `AnimalVacunadoException`
  - `NoVacunasReptilException`
  - `AnimalRepetidoException`

## 🧱 Estructura de clases

- `Animal` (clase abstracta)
  - `Mamifero`
  - `Ave`
  - `Reptil`
- `Zoologico` (gestor de animales)
- `Dieta` (enum)
- `Vacunar` (interface)
- Excepciones personalizadas

## 🚀 Cómo ejecutar

1. Cloná el repositorio:
   ```bash
   git clone https://github.com/thomi344/zoologico.git
   cd zoologico
