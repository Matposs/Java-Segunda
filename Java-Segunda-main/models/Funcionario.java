package models;

public class Funcionario {
        private String Nome;
        private String Cpf;
        private String Id;
        public String getNome() {
            return Nome;
        }
        public void setNome(String nome) {
            Nome = nome;
        }
        public String getCpf() {
            return Cpf;
        }
        public void setCpf(String cpf) {
            Cpf = cpf;
        }
        public String getId() {
            return Id;
        }
        public void setId(String id) {
            Id = id;
        }
        @Override
        public String toString() {
            return "Nome " + Nome + "\n CPF " + Cpf + "\n ID" + Id;
        }
    }


