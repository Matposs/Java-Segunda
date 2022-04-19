package models;

public class Cliente {
   
   
    private String Nome;
    private String Cpf;
    
    public void setNome(String nome) {
    Nome = nome;
    }
    public String getNome() {
        return Nome;
    }
    public void setCpf(String cpf) {
        Cpf = cpf;
    }
    public String getCpf() {
        return Cpf;
    }

    @Override
    public String toString() {
        return "Nome " + Nome + "\n CPF " + Cpf;
    }
}

