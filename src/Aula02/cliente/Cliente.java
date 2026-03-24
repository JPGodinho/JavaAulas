package Aula02.cliente;

public class Cliente {
    private String id;
    private String nome;
    private String email;
    private String telefone;

    public Cliente(String nome, String email, String telefone){

        this.id = java.util.UUID.randomUUID().toString();
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;

        System.out.println("Cliente criado: " + nome);
    }

    public String getId(){
        return this.id;
    }

    public String getNome() {
        return this.nome;
    }

    public String getTelefone() {
        return this.telefone;
    }
}
