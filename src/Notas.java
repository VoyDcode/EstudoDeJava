import java.util.Scanner;

public class Notas {


    public static void main(String[] args) {
        int[] notas = new int[3];
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        float primeiraNota = leitor.nextInt();

        System.out.println("Digite a segunda nota: ");
        float segundaNota = leitor.nextInt();
        System.out.println("Digite a terceira nota: ");
        float terceiraNota = leitor.nextInt();

        float media = (primeiraNota + segundaNota + terceiraNota) / 3;


        if (media >= 7) {
            System.out.println("Aprovado");
        }else if(media >= 6){
            System.out.println("Aprovado");
        }else{
            System.out.println("Reprovado");
        }



        System.out.println(media);









    }
}
