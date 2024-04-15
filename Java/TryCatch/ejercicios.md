# Ejercicios

5. Implementa un programa amb tres funcions:

- void imprimeixPositiu(int p): Imprimeix el valor p. Llança una ‘Exception’ si p < 0

- void imprimeixNegatiu(int n): Imprimeix el valor n. Llança una 'Exception' si p >= 0

- La funció main per fer proves. Pots cridar a les dues funcions diverses vegades amb diferents valors, fer un bucle per demanar valors per teclat i passar-los a les funcions, etc. Maneja les possibles excepcions.

<br>

6. Implementa un programa anomenat CalcularDensitat que demane a l'usuari que escriga un pes (en grams) i un volum (en litres). Aleshores, el programa ha de generar la densitat, que es calcula dividint pes/volum. El programa ha de captar tots els tipus d'excepcions possibles: NumberFormatException i ArithmeticException sempre que es puguen llançar. Només podeu utilitzar el mètode Scanner.nextLine per obtenir l'entrada de l'usuari en aquest exercici.

<br>

7. Crea un programa anomenat WaitApp amb una funció anomenada esperaSegons que rebrà un nombre de segons (enter) com a paràmetre. Internament, aquesta funció cridarà al mètode Thread.sleep per posar en pausa el programa el nombre de segons donat (aquesta funció funciona amb mil·lisegons, de manera que haureu de convertir els segons en mil·lisegons quan la crideu). Com que el mètode sleep pot llançar un element InterruptedException, haureu de tractar-lo. En aquest cas, se vos demana que llenceu l'excepció del mètode esperaSegons i que la detecteu al mètode principal, que cridarà a esperaSegons amb el nombre de segons especificat per l'entrada d'usuari. Després d'esperar el nombre especificat de segons, el programa demanarà un missatge "Finalitzar" abans d'eixir. També haureu de tractar altres tipus d'excepcions possibles.
