package views;
import controllers.ClienteController;
import controllers.ProdutoController;
import controllers.VendedorController;
import utils.Console;


public class Inicio {
    public static void main(String[] args) {
        int menu=0;
        ClienteController clienteController = new ClienteController();
        ProdutoController ProdutoController = new ProdutoController();
        
        do{
        System.out.println("1 - Cadastrar cliente \n");
        System.out.println("2 - Listar cliente \n");
        System.out.println("3 - Cadastrar produtos \n");
        System.out.println("4 - Listar produtos \n");
        System.out.println("5 - Cadastrar Vendedor \n");
        System.out.println("6 - Listar venda \n");
        System.out.println("0 - Sair \n");
        menu = Console.readInt("\n Informe o valor: ");
        // Cliente cliente = new Cliente();
        // Console.readstring ("frase que vai aparecer na tela"); 
        //  > lê a resposta dada pra frase que vai aparecer na tela
        // e a guarda a informação

       
        
        switch(menu){
            case 0:
            System.out.println("\n ------Sair ------");
            
            case 1:
            clienteController.renderizar();
            break;

            case 2:
            clienteController.listar();
            break;
            
            case 3:
            ProdutoController.renderizar();
            break;

            case 4:
            ProdutoController.listar();
            break;

            case 5:
            VendedorController vendedorController = new VendedorController();
            vendedorController.cadastrar();
            break;
            
            case 6:
            System.out.println("\n ------Listar vendas ------");
            default: 
            System.out.println("\n ------Opção inválida ------");
            break;
        }
    }while (menu !=0);
    
}}
