import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        int[] meu_array = new int[5];
       
        meu_array[0] = 10;
        meu_array[1] = 20;
        meu_array[2] = 30;
        meu_array[3] = 40;
        meu_array[4] = 50;
        
        int element0 = meu_array [0];
        int element1= meu_array [1];

        System.out.println(element0);
        System.out.println(element1);

        String[] lista_aluno = new String[5];

        lista_aluno[0] = "Pedro";
        lista_aluno[1] = "Mateus";
        lista_aluno[2] = "Aline";
        lista_aluno[3] = "Fabiana";
        lista_aluno[4] = "Fernanda";


        String[] Lista_cidades = {"Poa", "Suzano", "Ferraz"};
        System.out.println(Lista_cidades[2]);

        for (int i=0; i<lista_aluno.length; i++) {
            System.out.println(lista_aluno[i]);
        }

        for (int i=0; i<meu_array.length; i++) {
            System.out.println("Elemento " +  i  + " : " + meu_array[i]);
        }
        // transformando array int em string
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(array));
        
        //Tamanho da Array

        System.out.println("O tamanho da array é: " + array.length);
        
        // Função Clone (duas formas)
        String[] copia = Lista_cidades.clone();
        String[] copia_cidadeStrings = Lista_cidades;

        System.out.println(Arrays.toString(copia));
        System.out.println(Arrays.toString(copia_cidadeStrings));

        // recortando uma array

        String[] copia_sel = Arrays.copyOf(Lista_cidades, 2);

        System.out.println(Arrays.toString(copia_sel));

        // organizando elementos
        int[] nova_array = {5,6,7,8,9,0};
        Arrays.sort(nova_array);

        System.out.println(Arrays.toString(nova_array));

        // inserindo um valor igual em todas as posições

        int[] array_vazia = new int[5];
        System.out.println(":" + Arrays.toString(array_vazia));

        Arrays.fill(array_vazia,10);
        System.out.println(":"+ Arrays.toString(array_vazia));
        
        //Verificando se as arrays são iguais
        boolean resp = Arrays.equals(Lista_cidades, copia_cidadeStrings);

        System.out.println("São iguais " + resp);

        if(Arrays.equals(Lista_cidades, copia_cidadeStrings)){
            System.out.println("Elas são iguais");
        }else{
            System.out.println("Elas são diferentes");
        }

        // Pesquisando um elemento dentro de uma array

        int posicao = Arrays.binarySearch(Lista_cidades, "Suzano");

        System.out.println("Foi localizado na posição: " + posicao);

        





        


        }
}


