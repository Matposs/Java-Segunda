import java.util.ArrayList;

public class Inicio {
    public static void main(String[] args) {
        int menu=0;
        do{
        System.out.println("1 - Cadastrar cliente \n");
        System.out.println("2 - Listar cliente \n");
        System.out.println("3 - Cadastrar produtos \n");
        System.out.println("4 - Listrar produtos \n");
        System.out.println("5 - Registrar venda \n");
        System.out.println("6 - Listar venda \n");
        System.out.println("0 - Sair \n");
        menu = Console.readInt("Informe o valor");
        // Cliente cliente = new Cliente();
        // ArrayList <Cliente> clientes = new ArrayList<Cliente>();
        
        switch(menu){
            case 0:
            System.out.println("\n ------Sair ------");
            case 1:
            System.out.println("\n ------Cadastrar cliente ------");
            break;
            case 2:
            System.out.println("\n ------Listar clientes ------");
            break;
            case 3:
            System.out.println("\n ------Cadastrar produtos ------");
            break;
            case 4:
            System.out.println("\n ------Listar produtos ------");
            break;
            case 5:
            System.out.println("\n ------Registrar venda ------");
            break;
            case 6:
            System.out.println("\n ------Listar vendas ------");
            default: 
            System.out.println("\n ------Opção inválida ------");
            break;
        }
    }while (menu !=0);
    
}}
