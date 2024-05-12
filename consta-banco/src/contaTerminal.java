import java.util.Scanner;

public class contaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        double saldo = 15;

        System.out.println("Digite o valor para saque: ");
        double valorSolicitado = scanner.nextDouble();

        if(saldo >= valorSolicitado) {

            saldo -= valorSolicitado;

        } else if (valorSolicitado == 0){
            
            System.out.println("Valor precisa ser maior que zero.");
            
        } else {
            
            System.out.println("Saldo insuficiente para saque.");
        }


        System.out.println("Saldo atual: " + saldo);
    }
}
