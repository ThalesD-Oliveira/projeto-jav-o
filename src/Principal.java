import java.util.Scanner;

public class Principal {



   
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();
        Turma turma1 = new Turma(); //turma 1 é uma referencia, que aponta para um objeto = ponteiro
        Turma turma2 = new Turma();

        estudante1.nome = "Rodrigo";
        estudante1.telefone = "123456";
        estudante1.endereco = "Rua xpto";

        estudante2.nome = "Maria";
        estudante2.telefone = "998877";
        estudante2.endereco = "Quadra 1 numero 3";

        turma1.codigo = "T01";
        turma1.finalizada = true;
        
        turma2.codigo = "T02";
        turma2.finalizada = false;

        System.out.println(estudante2.nome);
        System.out.println(estudante2.telefone);
        System.out.println(estudante2.endereco);
        System.out.println(turma1.codigo);
        System.out.println(turma1.finalizada);

        /*
        System.out.println("Boas vindas ao sistema de gestão escolar!");


         
        Scanner leitor = new Scanner(System.in);
        
        
        System.out.println("Digite o nome do estudante: ");
        String nome = leitor.nextLine();

        System.out.println("Digite a idade do estudante: ");
        int idade = leitor.nextInt();

        byte b = 10;
        float altura = 1.70F;

        int opcao = 0;
        double somatorio = 0.0;
        double quantidadeNotas = 0;
        boolean tirouZero = false;

        while (opcao != -1) {
        System.out.println("Digite a nota do estudante: ");
        double nota = leitor.nextDouble();

        if (nota == 0) {
            tirouZero = true;
        }

        //somatorio = somatorio + nota
        somatorio += nota;
        //quantidadeNotas += 1;
        quantidadeNotas++;

        System.out.println("Digite -1 caso não queira mais digitar notas ou 0 caso deseje informar mais notas)");
        opcao = leitor.nextInt();
        }


        Double media = somatorio / quantidadeNotas;

        System.out.println("Media do estudante: " +media);

        //&& --> significa 'e'
        //|| --> significa 'ou'
        //tirouZero == false
        if (media >= 7 && !tirouZero) {
            System.out.println("Estudante aprovado!");
        }
        else {
            System.out.println("Estudante reprovado!");
            boolean aprovado = false;
        }


        System.out.println();
        /*
        boolean passou = nota >= 7.0;


        if (nota == 10) {
            System.out.println("Parabéns! Prova gabaritada!");
        }

        if(passou) {        
            System.out.println("O estudante: " +nome +" passou com nota: " +nota);
    }
        else
        {        
            System.out.println("O estudante: " +nome +" reprovou com nota: " +nota);
    }
*/


    }
 
}
