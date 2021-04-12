package Programa;

import java.util.Scanner;

import Classes.Cliente;
import Classes.Conta;

public class Programa {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        Conta conta = new Conta();
        Cliente cliente = new Cliente("Sarah", conta);
        int opcao = -1;

        while (opcao != 0){
            exibeMenu();
            opcao = ler.nextInt();
            
        switch(opcao) {
            case 0:
          encerraPrograma();
              return;
            case 1:
          sacar(ler, cliente);
              break;
            case 2:
          depositar(ler, cliente);
              break;
            case 3:
          saldo(cliente);
              break;
              default:
                System.out.println("Operação inválida");
                
              
              }

            }

        }

    private static void encerraPrograma() {
      System.out.println("Encerrando o programa...");
    }

    private static void saldo(Cliente cliente) {
      cliente.exibirsaldo();
    }

    private static void depositar(Scanner ler, Cliente cliente) {
      double valor;
      System.out.println("Digite o valor a ser depositado:");
      valor = ler.nextDouble();
      cliente.depositar(valor);
    }

    private static void sacar(Scanner ler, Cliente cliente) {
      double valor;
      System.out.println("Digite o valor à ser sacado");
      valor = ler.nextDouble();
      cliente.sacar(valor);
    }

    private static void exibeMenu() {
      System.out.println("\n******************");
      System.out.println("1 - Saque");
      System.out.println("2 - Depósito");
      System.out.println("3 - Saldo");
      System.out.println("\nDigite a opção desejada:");
    }

        




   }
   






