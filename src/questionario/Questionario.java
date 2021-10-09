package questionario;

import java.util.Scanner;

public class Questionario {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();
        System.out.println("seja bem-vindo ao questionario");
        System.out.println("Por favor, digite o seu nome");
        String nome = scan.nextLine().trim();
        pessoa.setNome(nome);

        System.out.println("qual a sua idade");
        String idade = scan.nextLine().trim();
        pessoa.setIdade(Integer.parseInt(idade));

        System.out.println("você possui carro? sim/nao");
        boolean hasCarro = scan.nextLine().trim().equals("sim");

        if (hasCarro) {
            System.out.println("qual é o modelo do seu carro");
            String modelo = scan.nextLine().trim();
            pessoa.getCarro().setModelo(modelo);
            System.out.println("qual o ano do seu carro?");
            String ano = scan.nextLine().trim();
            pessoa.getCarro().setAno(Integer.parseInt(ano));

        }
        String mensagem = "-----------\n"
                + "nome:" + pessoa.getNome()
                + "\n------------------\n"
                + "idade:" + pessoa.getIdade()
                + "\n------------------\n";

        if (pessoa.hasCarro()) {
            mensagem += "carro -> modelo: " + pessoa.getCarro().getModelo()
                    + "\n------------------\n"
                    + "carro->ano: " + pessoa.getCarro().getAno()
                    + "\n------------------\n";

        }

        System.out.println(mensagem);
    }

}
