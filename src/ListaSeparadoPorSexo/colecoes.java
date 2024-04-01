package ListaSeparadoPorSexo;

public class colecoes {
    public static void main(String args[]){
        System.out.println("Bem vindo!!");
       grupoSexoMasculino();
       grupoSexoFeminino();


    }
    private static void grupoSexoMasculino() {
        System.out.println("\n***** Lista sexo masculino *****");

        String aluno1 = "Carlos Hnrrique sexo  M ";
        String aluno2 = "Daniel Paiva sexo  M ";

        String[] alunos2 = aluno2.split(" ", 5);
        System.out.println(("\nNome: " + alunos2[0]));
        System.out.println(("Sobre nome: " + alunos2[1]));
        System.out.println(("Sexo: " + alunos2[4]));


        String[] alunos1 = aluno1.split(" ", 5);
        System.out.println(("\nNome: " + alunos1[0]));
        System.out.println(("Sobre nome: " + alunos1[1]));
        System.out.println(("Sexo: " + alunos1[4]));


    }
    private static void grupoSexoFeminino(){
        System.out.println("\n***** Lista Sexo Feminino *****");

        String aluno1 = "Sabrina Souza sexo  F ";
        String aluno2 = "Tais Melo sexo  F ";


        String[] alunos1 = aluno1.split(" ", 5);
        System.out.println(("\nNome: " + alunos1[0]));
        System.out.println(("Sobre nome: " + alunos1[1]));
        System.out.println(("Sexo: " + alunos1[4]));


        String[] alunos2 = aluno2.split(" ", 5);
        System.out.println(("\nNome: " + alunos2[0]));
        System.out.println(("Sobre nome: " + alunos2[1]));
        System.out.println(("Sexo: " + alunos2[4]));


    }
}
