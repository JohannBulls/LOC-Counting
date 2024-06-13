Para incluir la información sobre el diagrama de clases y detallar las clases presentes en el proyecto en tu README, puedes seguir esta estructura:

---

# LOC Counting Application

This project provides a command-line utility to count lines of code (LOC) and physical lines in source code files.

## Diagrama de Clases

El diagrama de clases se encuentra en [Class Diagram](src/test/resources/Class_Diagram.asta).

### Clases y Descripción

1. **App**:
   - Clase principal que contiene el método `main` para ejecutar el programa.
   - Utiliza `FileUtil` y `LineCounter` para contar líneas físicas y de código.

2. **FileUtil**:
   - Proporciona métodos estáticos para obtener una lista de archivos que coinciden con un patrón dado.

3. **LineCounter**:
   - Interfaz que define métodos para contar líneas físicas y de código (LOC).
   - Implementada por `LineCounterImpl`.

4. **LineCounterImpl**:
   - Implementación concreta de la interfaz `LineCounter`.
   - Proporciona métodos concretos para contar líneas físicas y de código (LOC) de un archivo.

5. **LineCounterTest**:
   - Contiene pruebas automatizadas para validar la funcionalidad de `LineCounter` y `LineCounterImpl`.

## Getting Started

These instructions will help you get a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

To build and run this project, ensure you have the following installed:

- Java Development Kit (JDK) 8 or higher
- Apache Maven
- Git
- JUnit (for testing)

### Installing

Follow these steps to get a development environment running:

1. Clone the repository to your local machine:

   ```
   git clone https://github.com/your/loc-counting.git
   ```

2. Navigate into the project directory:

   ```
   cd loc-counting
   ```

3. Compile the project using Maven:

   ```
   mvn compile
   ```

### Running the tests

To run the automated tests for this system:

```
mvn test
```

### Break down into end to end tests

The tests validate the accuracy of the line counting functionality on various types of source code files.

```
Example: The testCountLOC method checks if the LOC count matches the expected value.
```

### And coding style tests

Coding style tests ensure that the source code adheres to defined coding standards.

```
Example: The testCountPhysicalLines method verifies the accuracy of physical line counting.
```

## Deployment

To deploy this application on a live system:

1. **Ensure all dependencies are installed:**

   - Java Runtime Environment (JRE) 8 or higher

2. **Compile the project:**

   ```
   mvn clean package
   ```

3. **Run the application:**

   ```
   java -jar target/loc-counting.jar <parameter> <filename>
   ```

   Replace `<parameter>` with `phy` for physical lines or `loc` for lines of code, and `<filename>` with the path to the source code file.

## Built With

- [Java](https://www.java.com/) - Programming language
- [Apache Maven](https://maven.apache.org/) - Dependency Management

## Versioning

We use [Git](https://git-scm.com/) for version control.

## Authors

- Johann Amaya Lopez - *JohannBulls* - [JohannBulls GitHub](https://github.com/JohannBulls)

See also the list of [contributors](https://github.com/your/loc-counting/contributors) who participated in this project.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE.txt) file for details.

---

Incluyendo esta sección en tu README, proporcionas una visión general clara de las clases involucradas en el proyecto y dónde encontrar el diagrama de clases correspondiente. Ajusta las URLs y los detalles según corresponda a tu proyecto específico.