package Aula02;

import Aula02.cliente.Cliente;
import Aula02.cliente.Endereco;


public class Delivery {
    public static void main(String[] args){
        Cliente cliente1 = new Cliente("João", "jpni@gmail.com", "11994577384");


        Endereco endereco1 = new Endereco("Rua Jose", "123", "Algumnis", "Saosao", "230498392");
        endereco1.mostrarCompleto();
    }
}
