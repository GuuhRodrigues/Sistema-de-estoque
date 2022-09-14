import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class TrabalhoJatiboca {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int opcao,opcaoM;
        double estoqJ, estoqP, saldoAtJ, saldoAtP;

        System.out.print("Entre com o estoque inicial de açucar empresa 1 - Jatiboca: ");
        estoqJ=ler.nextDouble();
        System.out.print("Entre com o estoque inicial de açucar empresa 2 - Pontal: ");
        estoqP=ler.nextDouble();
        saldoAtJ=estoqJ;
        saldoAtP=estoqP;
        do{
            System.out.println("");
            System.out.println("-----------------------------------------------");
            System.out.println("O que deseja fazer: ");
            System.out.println("            1 - Entrada de Estoque");
            System.out.println("            2 - Saída de Estoque");
            System.out.println("            3 - Transferência de Estoque");
            System.out.println("            4 - Consulta de Estoque");
            System.out.println("            5 - Finalizar");
            System.out.print("            Opção -> ");
            opcaoM=ler.nextInt();
            System.out.println("");

            if(opcaoM==1){
                System.out.println("Qual empresa: ");
                System.out.println("     1 - Jatiboca");
                System.out.println("     2 - Pontal");
                System.out.print("Opção -> ");
                opcao=ler.nextInt();
                System.out.println("");

                if(opcao==1){
                    System.out.print("Qual a quantidade de Entrada de açúcar em Jatiboca -> ");
                    estoqJ=ler.nextDouble();
                    System.out.println("");
                    saldoAtJ+=estoqJ;
                    System.out.print("Estoque Atualizado em Jatiboca -> "+saldoAtJ+" Kg");
                }
                else if(opcao==2){
                    System.out.print("Qual a quantidade de Entrada de açúcar em Pontal -> ");
                    estoqP=ler.nextDouble();
                    System.out.println("");
                    saldoAtP+=estoqP;
                    System.out.println("Estoque Atualizado em Pontal -> "+saldoAtP+" Kg");
                }
                else {
                    System.out.println("Opção inválida, digite somente 1 ou 2 ");
                }
            }
            if(opcaoM==2){
                System.out.println("Qual empresa: ");
                System.out.println("     1 - Jatiboca");
                System.out.println("     2 - Pontal");
                System.out.print("Opção -> ");
                opcao=ler.nextInt();
                System.out.println("");

                if (opcao==1){
                    System.out.print("Qual a quantidade de Saída de açúcar em Jatiboca -> ");
                    estoqJ=ler.nextDouble();
                    System.out.println("");
                    if(saldoAtJ<estoqJ){
                        System.out.println("Estoque insuficiente para esta quantidade de saída");
                        System.out.print("Estoque existente em Jatiboca -> "+saldoAtJ+" Kg");
                    }
                    else{
                        saldoAtJ-=estoqJ;
                        System.out.print("Estoque atualizado em Jatiboca -> "+saldoAtJ+" Kg");
                    }
                }
                else if (opcao==2){
                    System.out.print("Qual a quantidade de Saída de açúcar em Pontal -> ");
                    estoqP=ler.nextDouble();
                    System.out.println("");
                    if(saldoAtP<estoqP){
                        System.out.println("Estoque insuficiente para esta quantidade de saída");
                        System.out.print("Estoque existente em Pontal -> "+saldoAtP+" Kg");
                    }
                    else{
                        saldoAtP-=estoqP;
                        System.out.print("Estoque atualizado em Pontal -> "+saldoAtP);
                        System.out.print(" Kg");
                    }
                }
                else{
                    System.out.println("Opção inválida, digite somente 1 ou 2");
                }
            }
            if(opcaoM==3){
                System.out.println("Qual empresa: ");
                System.out.println("     1 - Jatiboca -> Pontal");
                System.out.println("     2 - Pontal -> Jatiboca");
                System.out.print("Opção -> ");
                opcao=ler.nextInt();
                System.out.println("");

                if(opcao==1){
                    System.out.print("Quantidade de tranferência de açúcar - Jatiboca para Pontal -> ");
                    estoqJ=ler.nextDouble();
                    System.out.println("");
                    if(saldoAtJ<estoqJ){
                        System.out.println("Impossível transferir de Jatiboca para Pontal, estoque insuficiente!");
                        System.out.print("Estoque atualizado em Jatiboca -> "+saldoAtJ+" Kg");
                        System.out.println("");
                        System.out.println("Estoque atualizado em Pontal -> "+saldoAtP+" Kg");
                    }
                    else{
                        saldoAtJ-=estoqJ;
                        saldoAtP+=estoqJ;
                        System.out.println("Transferência realizada!");
                        System.out.print("Estoque atualizado em Jatiboca -> "+saldoAtJ+" Kg");
                        System.out.println("");
                        System.out.println("Estoque atualizado em Pontal -> "+saldoAtP+" Kg");
                    }
                }
                else if(opcao==2){
                    System.out.print("Quantidade de transferência de açúcar - Pontal para Jatiboca -> ");
                    estoqP= ler.nextDouble();
                    System.out.println("");
                    if(saldoAtP<estoqP){
                        System.out.println("Impossível transferir de Pontal para Jatiboca, estoque insuficiente!");
                        System.out.print("Estoque atualizado em Jatiboca -> "+saldoAtJ+" Kg");
                        System.out.println("");
                        System.out.println("Estoque atualizado em Pontal -> "+saldoAtP+" Kg");
                    }
                    else{
                        saldoAtP-=estoqP;
                        saldoAtJ+=estoqP;
                        System.out.println("Transferência realizada!");
                        System.out.print("Estoque atualizado em Jatiboca -> "+saldoAtJ+" Kg");
                        System.out.println("");
                        System.out.println("Estoque atualizado em Pontal -> "+saldoAtP+" Kg");
                    }
                }
                else{
                    System.out.println("Opção inválida, digite somente 1 ou 2");
                }

            }
            if(opcaoM==4){
                System.out.println("Estoque em Jatiboca -> "+saldoAtJ);
                System.out.print("Estoque em Pontal -> "+saldoAtP);
            }
        }
        while(opcaoM!=5);
        System.out.println("Sistema Finalizado");
        System.out.println("Bom dia e bom trabalho !!");
    }
}
