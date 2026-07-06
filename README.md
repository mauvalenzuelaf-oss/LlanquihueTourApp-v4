![Duoc UC](https://www.duoc.cl/wp-content/uploads/2022/09/logo-0.png)
# 🧠 Semana 7 - Evaluación Formativa N° 5 – Desarrollo Orientado a Objetos I

## 👤 Autor del proyecto
- **Nombre completo:** Mauricio Francisco Valenzuela Fuentes
- **Carrera:** Analista Programador Computacional
- **Sede:** Online

---

## 📘 Descripción general del sistema

Este proyecto corresponde a la *Evaluación Formativa Nº 5* de la asignatura *Desarrollo Orientado a Objetos I*.

Se trata de una nueva ampliación de *LlanquihueTourApp*, orientada a la aplicación de polimorfismo, colecciones y sobrescritura de métodos en Java.

El sistema representa diferentes servicios turísticos ofrecidos por la empresa Llanquihue Tour mediante una jerarquía compuesta por una superclase y tres subclases.

El sistema se construye a partir de una clase general llamada `ServicioTuristico`, que contiene los atributos compartidos por todos los servicios:

```plaintext
nombre
duracionHoras
```

A partir de esta clase se crean tres subclases especializadas:

1. `RutaGastronomica`
2. `PaseoLacustre`
3. `ExcursionCultural`

Cada subclase hereda los atributos comunes de `ServicioTuristico` e incorpora un atributo específico relacionado con su tipo de actividad.

La superclase define el método `mostrarInformacion()`, que presenta los datos generales de un servicio turístico. Posteriormente, cada subclase sobrescribe este método mediante la anotación `@Override`, agregando la información específica correspondiente a su tipo de servicio.

La clase `GestorServicios` crea una colección polimórfica de tipo `List<ServicioTuristico>` que contiene dos objetos de cada subclase.

Finalmente, la clase `Main` recibe y recorre esta colección mediante un ciclo `for-each` y llama al método `mostrarInformacion()` desde referencias de tipo `ServicioTuristico`. Durante la ejecución, Java selecciona automáticamente la versión sobrescrita del método según el tipo real de cada objeto, demostrando el funcionamiento del polimorfismo.

---

## 🧱 Estructura general del proyecto

```plaintext
📁 LlanquihueTourApp-v4/
│
├── 📁 src/
│   │
│   ├── 📁 data/
│   │   └── GestorServicios.java
│   │
│   ├── 📁 model/
│   │   ├── ServicioTuristico.java
│   │   ├── RutaGastronomica.java
│   │   ├── PaseoLacustre.java
│   │   └── ExcursionCultural.java
│   │
│   └── 📁 ui/
│       └── Main.java
│
├── 📄 .gitignore
│
├── 📄 LlanquihueTourApp.iml
│
└── 📄 README.md

```
---

## 🧩 Organización por paquetes

### 1. model

Contiene las clases que representan los servicios turísticos del sistema.

```plaintext
ServicioTuristico.java:
Superclase que contiene los atributos comunes nombre y duracionHoras. También define el método mostrarInformacion() con una implementación general.

RutaGastronomica.java:
Subclase que representa una actividad gastronómica e incorpora el atributo numeroDeParadas y sobrescribe el método mostrarInformacion().

PaseoLacustre.java:
Subclase que representa una actividad de navegación e incorpora el atributo tipoEmbarcacion y sobrescribe el método mostrarInformacion().

ExcursionCultural.java:
Subclase que representa una actividad cultural e incorpora el atributo lugarHistorico y sobrescribe el método mostrarInformacion().
```

### 2. data

Contiene la clase encargada de crear y almacenar los servicios turísticos.

```plaintext
GestorServicios.java:
Crea una colección polimórfica List<ServicioTuristico> mediante una implementación ArrayList.
```

Los métodos de esta clase devuelven objetos declarados como `ServicioTuristico`, aunque internamente crean instancias de las distintas subclases.

### 3. ui

Contiene la clase principal del programa.

```plaintext
Main.java:
Solicita a GestorServicios la colección de servicios turísticos, la recorre mediante un ciclo for-each y llama al método mostrarInformacion() desde referencias de tipo ServicioTuristico.
```
---

## ⚙️ Instrucciones para clonar y ejecutar el proyecto

1. Clona el repositorio desde GitHub:

```plaintext
git clone https://github.com/mauvalenzuelaf-oss/LlanquihueTourApp-v4.git
```

2. Abre IntelliJ IDEA.

3. Selecciona la opción `Open`.

4. Busca y selecciona la carpeta descargada:

```plaintext
LlanquihueTourApp-v4
```

5. Verifica que el código fuente se encuentre en la carpeta:

```plaintext
src
```

6. Confirma que dentro de `src` se encuentren los paquetes:

```plaintext
data
model
ui
```

7. Abre la clase principal:

```plaintext
src/ui/Main.java
```
8. Ejecuta el método `main`.

9. Revisa la salida generada en la consola.

---

## 🖥️ Ejemplo abreviado de salida esperada por consola

```plaintext
=== SERVICIOS TURÍSTICOS LLANQUIHUE TOUR ===
-----------------------------
Ruta gastronómica
Nombre: En búsqueda del kuchen más grande del mundo
Duración: 4 horas
Número de paradas: 5
-----------------------------
Ruta gastronómica
Nombre: Sabores del Lago Llanquihue
Duración: 3 horas
Número de paradas: 4
-----------------------------
Paseo lacustre
Nombre: Paseo Lacustre en Pijamas
Duración: 2 horas
Tipo de embarcación: Catamarán
-----------------------------
Paseo lacustre
Nombre: Navegación por el Lago Todos los Santos
Duración: 5 horas
Tipo de embarcación: Lancha
-----------------------------
Excursión cultural
Nombre: Ruta de los Colonos Alemanes
Duración: 2 horas
Lugar histórico: Museo Colonial Alemán de Frutillar
-----------------------------
Excursión cultural
Nombre: Ruta patrimonial diurna
Duración: 3 horas
Lugar histórico: Iglesia del Sagrado Corazón
```
---
**Repositorio GitHub:** https://github.com/mauvalenzuelaf-oss/LlanquihueTourApp-v4

**Fecha de entrega:** 06/07/2026
