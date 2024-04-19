# Ejercicios

5. Implementa un programa amb tres funcions:

- void imprimeixPositiu(int p): Imprimeix el valor p. Llança una ‘Exception’ si p < 0

- void imprimeixNegatiu(int n): Imprimeix el valor n. Llança una 'Exception' si p >= 0

- La funció main per fer proves. Pots cridar a les dues funcions diverses vegades amb diferents valors, fer un bucle per demanar valors per teclat i passar-los a les funcions, etc. Maneja les possibles excepcions.

<br>

6. Implementa un programa anomenat CalcularDensitat que demane a l'usuari que escriga un pes (en grams) i un volum (en litres). Aleshores, el programa ha de generar la densitat, que es calcula dividint pes/volum. El programa ha de captar tots els tipus d'excepcions possibles: NumberFormatException i ArithmeticException sempre que es puguen llançar. Només podeu utilitzar el mètode Scanner.nextLine per obtenir l'entrada de l'usuari en aquest exercici.

<br>

7. Crea un programa anomenat WaitApp amb una funció anomenada esperaSegons que rebrà un nombre de segons (enter) com a paràmetre. Internament, aquesta funció cridarà al mètode Thread.sleep per posar en pausa el programa el nombre de segons donat (aquesta funció funciona amb mil·lisegons, de manera que haureu de convertir els segons en mil·lisegons quan la crideu). Com que el mètode sleep pot llançar un element InterruptedException, haureu de tractar-lo. En aquest cas, se vos demana que llenceu l'excepció del mètode esperaSegons i que la detecteu al mètode principal, que cridarà a esperaSegons amb el nombre de segons especificat per l'entrada d'usuari. Després d'esperar el nombre especificat de segons, el programa demanarà un missatge "Finalitzar" abans d'eixir. També haureu de tractar altres tipus d'excepcions possibles.

<br>

8. Implementa una classe Gat amb els atributs nom i edat, un constructor amb paràmetres, getters i setters, a més d'un mètode imprimir() per mostrar les dades d'un gat. El nom d'un gat ha de tenir com a mínim 3 caràcters i l'edat no pot ser negativa. Per això, tant al constructor com als setters, hauràs de comprovar que els valors siguen vàlids i llançar una ‘Exception’ si no ho són. Després, fes una classe principal amb main per fer proves: instància diversos objectes Gat i utilitza els seus setters, provant diferents valors (alguns vàlids i altres incorrectes). Maneja les excepcions.

<br>

9. Crea una còpia del programa anterior i modifica el main per fer el següent:
- Crea un ArrayList<Gat>. Després, utilitzant un bucle, demana a l'usuari que introdueisca les dades de 5 gats: utilitza un Scanner per demanar les dades, instància de l'objecte i guarda'l a l'ArrayList. Finalment, imprimeix la informació dels gats.
  Maneja les possibles excepcions de manera que a l'ArrayList només emmagatzemem objectes Gat vàlids i el bucle es repetisca fins a crear i emmagatzemar correctament 5 gats.

<br>

10. Declara una classe Client que represente un client d'un banc. Defineix els atributs i mètodes següents:

- atributs: nom i suma

- mètodes: constructor, depositar, extreure i imprimir.

Generar una excepció pròpia si s'intenta extreure més diners dels que té l'atribut 'suma' 
