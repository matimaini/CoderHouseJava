import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Cliente mati = new Cliente("Matias", 25);
        Cliente nico = new Cliente("Nicolas", 45);
        Cliente lean = new Cliente("Leandro", 15);
        Cliente axel = new Cliente("Queen Axel Elizabeth", 96);
        Cliente nair = new Cliente("Nair", 30);
        Cliente julio = new Cliente("Julio", 25);
        Cliente pablo = new Cliente("Pablo", 49);
        Cliente analia = new Cliente("Analia", 42);
        Cliente paula = new Cliente("Paula", 47);
        Cliente franco = new Cliente("Franco", 17);


        //Creo la lista de clientes y filtro de 30 a 50 años
        List<Cliente> clientes = new ArrayList<>(Arrays.asList(mati, nico, lean, axel, nair,julio,pablo,analia,paula,franco)).stream()
                .filter(c -> c.getEdad() >= 30 && c.getEdad() <= 50)
                .collect(Collectors.toList());
        System.out.println("Clientes entre 30 y 50 años: ");
        clientes.forEach(System.out::println);

        List<Cliente> clientes2 = new ArrayList<>(Arrays.asList(mati, nico, lean, axel, nair,julio,pablo,analia,paula,franco)).stream()
                .filter(c -> c.getEdad() % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Clientes con edad par: ");
        clientes2.forEach(System.out::println);
//CLIENTES MAXIMO 5
        List<Cliente> clientes3 = new ArrayList<>(new ArrayList<>(Arrays.asList(mati, nico, lean, axel, nair,julio,pablo,analia,paula,franco)));
        System.out.println("Clientes hasta 5 //////////////////////////////////////// : ");
        for (Integer i = 0; i < 5; i++) {
         System.out.println(clientes3.get(i).toString());
        }


    }
}