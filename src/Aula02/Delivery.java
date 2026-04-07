package Aula02;

import Aula02.cliente.Cliente;

import java.util.Scanner;
import Aula02.cliente.Cliente;


public class Delivery {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Seja bem vindo!");

//        Cliente joao = new Cliente("João", "jpni@gmail.com", "11994577384");
//        Endereco endereco1 = new Endereco("Rua Jose", "123", "Algumnis", "Saosao", "230498392");
//        System.out.println("Entrega em: " + endereco1.mostrarCompleto());

        Cliente cliente = Delivery.cadastrarCliente();
    }

    static cadastrarCliente(){
        System.out.println("Iniciando cadastro de cliente");
        System.out.println("Digite o nome do cliente");
        String nome = scanner.nextLine();
        System.out.println("Digite o email do cliente");
        String email = scanner.nextLine();
        System.out.println("Digite o telefone do cliente");
        String telefone = scanner.nextLine();

        return new Cliente(nome, email, telefone);

    }
}
