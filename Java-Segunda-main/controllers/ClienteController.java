package controllers;
import java.util.ArrayList;
import models.Cliente;
import utils.Console;

public class ClienteController {

    Cliente cliente;
    private ArrayList <Cliente> clientes = new ArrayList<Cliente> ();
    int i; 



    public void renderizar(){
        System.out.println("\n  ------ Cadastrar cliente ------ ");
        cliente = new Cliente();
        cliente.setNome(Console.readString("\n Informe o nome: "));
        cliente.setCpf(Console.readString("\n Informe o CPF: "));
        clientes.add(cliente);
        System.out.println("----- Cliente Cadastrado -----"); 
    }
    public void listar(){
        System.out.println("\n ------Lista de Clientes ------ ");
        for (i = 0; i < clientes.size(); i++){
                
        System.out.println("\n Nome: " + clientes.get(i).getNome() + "\n CPF: " + clientes.get(i).getCpf());
    }
    
}}
