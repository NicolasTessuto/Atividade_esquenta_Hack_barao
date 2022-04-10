import java.util.Scanner;
import java.util.Random;

public class testeClasses {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        Random random = new Random();

        int selecUser;

            System.out.print("Digit [1] - Caso tenha encontrado um animal perdido\nDigite [2] - Caso tenha perdido um animal\n");
            selecUser = sc.nextInt();

        if(selecUser == 1) {
            chamadoAnimalEncontrado chamadoAnimalEncontrado = new chamadoAnimalEncontrado();
            chamadoAnimalEncontrado.setFoto("www.URLexemplo.com.br");
            chamadoAnimalEncontrado.setCodChamado(random.nextInt(1000));
            System.out.println("Favor informe o Local em que voce encontrou o animal: ");
            chamadoAnimalEncontrado.setLocal(sc.next());
            System.out.println("Favor descreva o animal ou alguma obsercação importante: ");
            chamadoAnimalEncontrado.setDescricao(sc.next());

        }
        else if(selecUser == 2){
            chamadoAnimalPerdido chamadoAnimalPerdido = new chamadoAnimalPerdido();
            chamadoAnimalPerdido.setFoto("www.URLexemplo.com.br");
            chamadoAnimalPerdido.setCodChamado(random.nextInt(1000));
            System.out.print("Favor informe o Local em que voce perdeu o animal: ");
            System.out.print("\n");
            chamadoAnimalPerdido.setLocal(sc.next());
            System.out.print("Favor descreva o animal ou alguma obsercação importante: ");
            chamadoAnimalPerdido.setDescricao(sc.next());
        }
        else{
            System.out.println("Opção inválida");
        }
    }
}