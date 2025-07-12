/*
    @author Jessye
 */

public class PrimeiraClasse{

    public static void main(String args[]){
        System.out.println("Oiee Jessye");

        Cliente C1 = new Cliente();
        
        c1.cadastrarEndereco("Rua 2");
        c1.setID(1);
        System.out.println(c1.getID());
        System.out.println(c1.getEndereco());

        c1.imprimirEndereco()
        String J = retornarNomeCliente();
        System.out.println(J);
        System.out.println(getValorTotal());
    }
}