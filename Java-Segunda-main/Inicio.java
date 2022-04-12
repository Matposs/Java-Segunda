import java.util.ArrayList;

public class Inicio {
    public static void main(String[] args) {
        int menu=0;
        int i=0;
        Cliente cliente;
        ArrayList <Cliente> clientes = new ArrayList <Cliente> ();
        
        do{
        System.out.println("1 - Cadastrar cliente \n");
        System.out.println("2 - Listar cliente \n");
        // System.out.println("3 - Cadastrar produtos \n");
        // System.out.println("4 - Listrar produtos \n");
        // System.out.println("5 - Registrar venda \n");
        // System.out.println("6 - Listar venda \n");
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
            System.out.println("\n ------Cadastrar cliente ------");
            cliente = new Cliente();
            cliente.setNome(Console.readString("\n Informe o nome: "));
            cliente.setCpf(Console.readString("\n Informe o CPF: "));
            clientes.add(cliente);
            System.out.println("----- Cliente Cadastrado -----");
            break;
            case 2:
            System.out.println("\n ------Listar clientes ------");
            for (i = 0; i < clientes.size(); i++){
                
                System.out.println("\n Nome " + clientes.get(i).getNome() + "\n CPF" + clientes.get(i).getCpf());
               
                // System.out.println (clientes.get(i));
            }
            break;
            case 3:
            // System.out.println("\n ------Cadastrar produtos ------");
            // break;
            // case 4:
            // System.out.println("\n ------Listar produtos ------");
            // break;
            // case 5:
            // System.out.println("\n ------Registrar venda ------");
            // break;
            // case 6:
            // System.out.println("\n ------Listar vendas ------");
            default: 
            System.out.println("\n ------Opção inválida ------");
            break;
        }
    }while (menu !=0);
    
}}
