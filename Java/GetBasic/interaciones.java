package Programacion.Java.GetBasic;

import java.util.Objects;

public class interaciones {
    public static void main(String[] args) {
        gato.main();
        String gen1 = gato.gen;

        gato.main();
        String gen2 = gato.gen;

        int bin = (int) (Math.random() * 2 + 0);
        /* INTERACIÓN ENTRE MACHOS */
        if(Objects.equals(gen1, "Macho") && Objects.equals(gen2, "Macho")) {
            if (bin == 1) {
                System.out.println("Los gatitos se pelean");
            } else if (bin == 0) {
                System.out.println("Parece que juegan entre si");
            }
        }

            /* INTERACIÓN ENTRE HEMBRAS */
            if(Objects.equals(gen1, "Hembra") && Objects.equals(gen2, "Hembra")) {
                if (bin == 1) {
                    System.out.println("Los gatitos juegan");
                } else if (bin == 0) {
                    System.out.println("Se miran entre si");
                }
            }


                /* INTERACIÓN ENTRE MACHO Y HEMBRA */
                if(Objects.equals(gen1, "Macho") && Objects.equals(gen2, "Hembra")) {
                    if (bin == 1) {
                        System.out.println("Uno de los gaticos se pone a hacer el payaso en frente del otro");
                    } else if (bin == 0) {
                        System.out.println("La gatica se va por pienso");
                    }
                }

                /* INTERACIÓN ENTRE HEMBRA Y MACHO */
                if(Objects.equals(gen1, "Hembra") && Objects.equals(gen2, "Macho")) {
                    if (bin == 1) {
                        System.out.println("La gatica se pone a jugar con el gatico");
                    } else if (bin == 0) {
                        System.out.println("El gatico se duerme");
                    }
                }

            }
        }
