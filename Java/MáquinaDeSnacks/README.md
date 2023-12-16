Dissenyeu un programa per a una màquina de venda de  sancks. Cada llepolia té un nom i un preu (pots utilitzar este codi).

Suposeu que tenen una quantitat inicial que al principi serà de 5.

String[][] nomSnack = {
{"KitKat", "Chicles de fresa", "Lacasitos", "Palotes"},
{"Kinder Bueno", "Bolsa variada Haribo", "Chetoos", "Twix"},
{"Kinder Bueno", "M&M'S", "Papa Delta", "Chicles de menta"},
{"Lacasitos", "Crunch", "Milkybar", "KitKat"}
};

double[][] preu = {
{1.1, 0.8, 1.5, 0.9},
{1.8, 1, 1.2, 1},
{1.8, 1.3, 1.2, 0.8},
{1.5, 1.1, 1.1, 1.1}
};

Creeu un menú, on cada opció de menú ha de ser una funció. Les funcions han de ser tan genèriques com siga possible. També pots crear altres funcions que cregues necessàries.

El menú de l'aplicació serà:

	1) Demanar snack: demanarà la posició del snack que vullgues. Aquesta màquina té snacks a cada posició, identificats per la seua fila i columna, que serà el que introduisca l'usuari en demanar un snack.
Per exemple si l'usuari tecleja 20 significa que està demanant el snack que està a la fila 2 columna 0.
Quan no hi haja més llepolies ho ha d'indicar a l'usuari. Només es pot demanar un snack cada vegada que s'entra a aquest opció i suposarem que l'usuari sempre té diners. Recorda de disminuir la quantitat de demanar.

	2) Mostrar snacks: mostra tots els snacks disponibles. Mostrarà el codi que ha d'introduir l'usuari, el nom i el preu. La quantitat no es mostrarà.

	3) Omplir snacks: aquesta és una funció exclusiva d'un tècnic per la qual cosa ens demanarà una contrasenya, si l'usuari escriu “MaquinetaDAW”, vos demanarà la posició del snack i 			la quantitat.

	4) Apagar màquina: ix del programa, abans d'eixir mostrarà les vendes totals (quantitat) durant l'execució del programa.
