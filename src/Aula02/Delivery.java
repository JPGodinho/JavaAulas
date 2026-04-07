package Aula02;

import Aula02.cliente.Cliente;
import java.util.Scanner;


public class Delivery {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Bem vindo ao sistema");
        Cliente cliente = cadastrarCliente();
    }

    static  Cliente cadastrarCliente(){
        System.out.println("Iniciando cadastro de cliente");
        System.out.println("Digite o nome do cliente");
        String nome = scanner.nextLine();

        System.out.println("Digite o email");
        String email = scanner.nextLine();

        System.out.println("Digite o Telefone");
        String telefone = scanner.nextLine();
        return new Cliente(nome, email, telefone);
    };
}
