package Aula02.cliente;

public class Endereco {
    private final String rua;
    private final String numero;
    private final String bairro;
    private final String cidade;
    private final String cep;

    public Endereco(String rua, String numero, String bairro, String cidade, String cep){
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.cep = cep;

        System.out.println(mostrarCompleto());
    }

    public String getRua() {
        return this.rua;
    }

    public String getNumero() {
        return numero;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public String getCep() {
        return cep;
    }

    public String mostrarCompleto(){
        return rua +", "+numero+", "+bairro+", "+cidade+" -"+cep;
    }
}
