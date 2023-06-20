import java.util.Scanner;

/**
 * Write a description of class farmacia here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class farmacia
{
    public static void main (String args[]){
        
        Scanner scn = new Scanner(System.in);
        
        String[] identificaciones = new String[50];
        String[] nombres = new String[50]; 
        String[] sucursales = new String[50];
        double[] comprauno = new double[50];
        double[] comprados = new double[50];
        double[] compratres = new double[50];
        String identificacion, nombre, sucursal;
        int numClientes, i;
        double compra1, compra2, compra3, promedio = 0;
        
        System.out.println("Digite el numero de clientes");
        numClientes = scn.nextInt();
        
        for(i=0; i < numClientes; i++){
            System.out.println("Digite la identificacion del cliente");
            identificacion = scn.next();
            System.out.println(identificacion);
            System.out.println("Digite el nombre del cliente");
            nombre = scn.next();
            System.out.println(nombre);
            System.out.println("Digite la sucursal del cliente");
            sucursal = scn.next();
            System.out.println(sucursal);
            System.out.println("Digite la compra uno del clientes");
            compra1 = scn.nextInt();
            System.out.println(compra1);
            System.out.println("Digite la compra dos del clientes");
            compra2 = scn.nextInt();
            System.out.println(compra2);
            System.out.println("Digite la compra tres del clientes");
            compra3 = scn.nextInt();
            System.out.println(compra3);
            
            identificaciones[i] = identificacion;
            nombres[i] = nombre;
            sucursales[i] = sucursal;
            comprauno[i] = compra1;
            comprados[i] = compra2;
            compratres[i] = compra3;
        }
        for(i=0; i < numClientes; i++){
            promedio = promedio + ((comprauno[i] + comprados[i] + compratres[i])/3)/numClientes;
        }
        System.out.println("El promedio es: " + promedio);

    }
}
