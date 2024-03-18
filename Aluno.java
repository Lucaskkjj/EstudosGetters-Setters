import java.util.Scanner;
public class Aluno {

    String nome;
    int idade;
    String matricula;


    public static void main(String[] args){

        Aluno a1 = new Aluno();


        a1.Nomes("Ricardo");
        a1.Idades(16);
        a1.Matriculas("NP-001");
        a1.Print();




    }


    public void Nomes(String nome){

        this.nome = nome;
    }


    public void Idades(int idade){

        this.idade = idade;
    }

    public void Matriculas(String matricula){

        this.matricula = matricula;
    }

    public String getNome(){
        return this.nome;

    }

    public int getIdade(){
        return this.idade;

    }

    public String getMatricula(){
        return this.matricula;

    }

    public void Print() {

    System.out.println("\n Seu nome é: " + getNome() + "\n Sua idade é: " +  getIdade() + "\n Seu número de matrícula: " + getMatricula());


    }

    }



