import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {



        Estudante estudante1 = new Estudante();
        estudante1.nome = "Rodrigo";

        Estudante estudante2 = new Estudante();
        estudante2.nome = "Ana";

        Estudante estudante3 = new Estudante();
        estudante3.nome = "Pedro";

        ArrayList lista = new ArrayList<Estudante>();
        lista.add(estudante1);
        lista.add(estudante2);
        lista.add(estudante3);

        Turma turma1 = new Turma();
        turma1.codigo = "T01";
        turma1.estudantes = new ArrayList<Estudante>();
        turma1.estudantes.add(estudante1);
        turma1.estudantes.add(estudante2);
        turma1.estudantes.add(estudante3);

        for (Estudante estudante : turma1.estudantes) {
            System.out.println(estudante.nome);
        }

        /*
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(10);
        lista.add(15);
        lista.add(1200);
        lista.add(131313);
        lista.add(0);
        lista.add(4);

        //lista.remove(3);

        System.out.println(lista.get(3));

        for (int numero : lista) {
            System.out.println(numero);
        }

        /*
        System.out.println("Cadastro de estudantes");
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o número de estudantes para cadastrar:");
        int qtdEstudantes = Integer.parseInt(leitor.nextLine());

        Estudante[] estudantes = new Estudante[qtdEstudantes];

        int qtdCadastrados = 0;
        while (qtdCadastrados != qtdEstudantes) {
        Estudante estudante = new Estudante();

        System.out.println("Digite o nome do estudante");        
        estudante.nome = leitor.nextLine();

        System.out.println("Digite o telefone do estudante");        
        estudante.telefone = leitor.nextLine();

        System.out.println("Digite o endereço do estudante");
        estudante.endereco = leitor.nextLine();

        System.out.println("Digite o responsável do estudante");
        estudante.responsavel = leitor.nextLine();

        estudantes[qtdCadastrados] = estudante;
        qtdCadastrados++;        
    }

    for(Estudante e : estudantes) {
        System.out.println("Nome: " +e.nome);
        System.out.println("Telefone: " +e.telefone);
        System.out.println("Endereço: " +e.endereco);
        System.out.println("Responsável: " +e.responsavel);
    }

        /*
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
