package ejerciciouno;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

    public class ListarPersonasMainiMatias {
        public static void main(String[] args) {

            Persona mati = new Persona("Matias", "Maini");
            Persona juli = new Persona("Julio", "Berni");
            Persona nico = new Persona("Nico", "Jones");
            Persona lean = new Persona("Leandro", "Galtieri");
            Persona axel = new Persona("Axel", "Kicillof");
            Persona nair = new Persona("Nair", "Menem");

            //creo a lista de personas
            List<Persona> personas = new ArrayList<>(Arrays.asList(mati, juli, nico, lean, axel, nair));

            //muestro titulo
            System.out.println("Todas las Personas : ") ;

            for (Persona persona : personas) {
                System.out.println(persona.toString());
            }

            //muestro titulo y ordeno por nombre
            System.out.println(" ////////////////////////////////// Personas ordenadas por nombre ////////////////////////////////// ") ;

            personas.stream().sorted(Comparator.comparing(Persona::getNombre)).forEach(System.out::println);

            //muestro titulo y ordeno por apellido
            System.out.println("////////////////////////////////// Personas ordenadas por apellido //////////////////////////////////") ;
            personas.stream().sorted(Comparator.comparing(Persona::getApellido)).forEach(System.out::println);


            //muestro titulo y ordeno por apellido inverso
            System.out.println(" //////////////////////////////////     Personas ordenadas por apellido inversamente //////////////////////////////////") ;
            personas.stream().sorted(Comparator.comparing(Persona::getApellido).reversed()).forEach(System.out::println);

        }
    }
