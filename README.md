# Patrons de Construcció de Programari

## Descripció

Aquest projecte aprofundeix en els **patrons de construcció de programari** mitjançant la seva implementació en **Java** utilitzant **Gradle**. Cada nivell del projecte introdueix un patró de disseny diferent per demostrar com estructurar millor el codi i fer-lo més modular, reutilitzable i mantenible.

---

## Nivell 1 - Builder

### 🎯 Objectiu

Desenvolupar un sistema de gestió de comandes de pizzes utilitzant el **patró Builder**.

### 🧱 Estructura

- **Classe `Pizza`**: amb atributs `size` (mida), `dough` (massa) i `toppings` (ingredients).
- **Interfície `PizzaBuilder`**: defineix els mètodes per configurar les propietats de la pizza.
- **Constructors concrets**: implementacions com `HawaiianPizzaBuilder`, `VegetarianPizzaBuilder`, etc.
- **Classe `MestrePizzer`**: rep un `PizzaBuilder` i construeix una pizza específica.
- **Classe `Main`**: crea instàncies de builders i del pizzer per demostrar la construcció de diferents tipus de pizza.

---

## Nivell 2 - Observer

### 🎯 Objectiu

Implementar el patró **Observer** en un sistema de notificació de la borsa.

### 🧱 Estructura

- **Classe `AgentDeBorsa` (Observable)**: manté una llista d'observadors i notifica canvis en la borsa.
- **Classe `AgenciaBorsa` (Observer)**: s'inscriu per rebre notificacions.
- **Classe `Main`**: simula pujades i baixades de la borsa i la notificació a les agències.

---

## Nivell 3 - Callback

### 🎯 Objectiu

Simular una **passarel·la de pagament amb callbacks**.

### 🧱 Estructura

- **Interfície `PagamentCallback`**: defineix el mètode per efectuar un pagament.
- **Implementacions concretes**: per a targeta de crèdit, PayPal i compte bancari.
- **Classe `Passarel·laPagament`**: rep l'objecte de pagament i el processa invocant el callback.
- **Classe `BotigaSabates`**: invoca la passarel·la i gestiona la resposta.

---

## 🔧 Requeriments tècnics

- **Java 21**
- **Gradle** com a sistema de con
