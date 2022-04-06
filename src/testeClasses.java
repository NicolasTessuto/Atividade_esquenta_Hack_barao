import java.util.Scanner;

public class testeClasses {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);


        System.out.print("Favor informe o Local em que voce encontrou o cão: ");
        String localExemplo = sc.nextLine();
        System.out.print("Favor informe alguma informação sobre o animal: ");
        String observacaoExemplo = sc.nextLine();

        chamadoCaoEncontrado chamadoCaoEncontrado = new chamadoCaoEncontrado(localExemplo,observacaoExemplo);


    }
}