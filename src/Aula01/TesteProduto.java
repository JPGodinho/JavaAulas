package Aula01;

public class TesteProduto {
    public static void main(String[] args) {
        Produto produto1 = new Produto();

        produto1.nome = "pizza calabresa";
        produto1.preco = 12.5;
        produto1.estoque = 1;

        produto1.exibir();
    }
}
