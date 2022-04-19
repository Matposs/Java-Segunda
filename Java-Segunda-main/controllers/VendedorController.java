package controllers;
import java.util.ArrayList;
import utils.Console;
import models.Funcionario;

public class VendedorController {
    
    Funcionario funcionario;
    private ArrayList <Funcionario> funcionarios = new ArrayList<Funcionario>();

    public void cadastrar() {
            System.out.println("\n ------Cadastrar vendedor ------");
            funcionario = new Funcionario();
            funcionario.setNome(Console.readString("\n Informe o nome: "));
            funcionario.setCpf(Console.readString("\n Informe o CPF: "));
            funcionario.setId(Console.readString("\n Informe o ID: "));
            funcionarios.add(funcionario);
            System.out.println("\n ------ Vendedor Cadastrado! ------ ");
    }


}
