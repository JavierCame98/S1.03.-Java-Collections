# S1.03.-Java-Collections

## Statment: 
Exercici 1 — Duplicats
En aquest exercici faràs servir dues de les col·leccions més habituals de Java: ArrayList i HashSet. Practicaràs com afegir i modificar elements, i observaràs com es comporten aquestes col·leccions davant la presència de duplicats. Enunciat Crea una classe anomenada Month amb un atribut name, que emmagatzemi el nom del mes. Afegeix 11 objectes Month a un ArrayList, deixant fora "Agost". Insereix aquest mes a la posició corresponent i comprova que l’ordre dels mesos és correcte. Converteix després l’ArrayList en un HashSet i verifica que no es permeten duplicats. Finalment, recorre la col·lecció amb un bucle for i amb un Iterator.

Exercici 2 — ListIterator
Aquest exercici et permet practicar la manipulació de llistes i l’ús de ListIterator. Enunciat Crea i emplena una List<Integer>. Crea una segona llista i insereix-hi els mateixos elements però en ordre invers. Utilitza un ListIterator per llegir els elements de la primera i afegir-los a la segona.

Exercici 3 — Capital Game
En aquest exercici posarem en pràctica la lectura de fitxers, l’ús de col·leccions com HashMap i la interacció amb l’usuari mitjançant un petit joc de preguntes. A partir del fitxer countries.txt (consulta l’apartat de recursos), que conté parelles de país i capital separades per comes, el programa ha de llegir totes les dades i emmagatzemar-les en un HashMap<String, String>, on la clau és el nom del país i el valor, la seva capital. Un cop carregades les dades, el programa demanarà el nom de l’usuari/ària i començarà el joc. El funcionament consisteix a realitzar 10 preguntes, escollint aleatòriament 10 països diferents del HashMap. En cada ronda, es mostrarà el nom d’un país i l’usuari/ària haurà d’introduir el nom de la seva capital. Si la resposta és correcta (tenint en compte majúscules i minúscules si cal), es sumarà un punt a la seva puntuació. Al final de les 10 preguntes, es mostrarà la puntuació total obtinguda. En finalitzar les 10 preguntes, el programa guardarà el nom de l’usuari/ària i la seva puntuació en un fitxer anomenat classificacio.txt.

## Functionalities
Collections Handling: Use of ArrayList, HashSet, and HashMap.
Duplicate Management: Demonstration of how HashSet prevents duplicates.
Advanced Iteration: Implementation of Iterator and ListIterator to traverse and manipulate collections.
Data Persistence: Reading data from a file (countries.txt) and writing results to another file (classificacio.txt).
User Interaction: Implementation of an interactive game (Capital Game) with console input and output.

## Technologies
This project is fully implemented in Java and uses its standard libraries.
Frontend: N/A (Console/Backend Project)
Backend: Java (Use of Java Collections Framework, java.io, and java.util)
Database/Storage: Plain text files (.txt).

## Installation and Execution
To run these exercises, you only need the Java Development Kit (JDK) installed.
Clone the repository
Ensure the countries.txt file is in the classpath or the application's root folder for Exercise 3.
From an IDE like IntelliJ or Eclipse, run the main class of each exercise and check t src foulder to see the code.
These exercises are direct demonstrations. They do not include formal unit tests (JUnit).
