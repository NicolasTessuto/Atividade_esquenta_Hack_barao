import java.util.Scanner;

public class testeClasses {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.print("Favor informe o Local em que voce encontrou o animal: ");
        String localExemplo = sc.nextLine();

        System.out.print("Favor informe a data e a hora em que voce encontrou o animal: ");
        String dataExemplo = sc.nextLine();

        System.out.print("Favor informe alguma informação sobre o animal: ");
        String observacaoExemplo = sc.nextLine();

        System.out.print("Favor informe a URL da imagem do animal: ");
        String imagemExemplo = sc.nextLine();
    }
}