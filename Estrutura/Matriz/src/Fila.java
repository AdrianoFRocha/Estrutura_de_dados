import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
       // pedagio();
       PriorityQueue<Carro> fila = new PriorityQueue<>();
       fila.add(new Carro("Uno", 2)); 
       fila.add(new Carro("Gol", 2));
       fila.add(new Carro("Ambulância", 1));
       fila.add(new Carro("Polícia", 1));
       
       
       // percorrer a fila de prioridade
       while ((!fila.isEmpty())) {
           Carro carro_removido =  fila.poll(); // removendo alguém da fila
           System.out.println("Carro removido: "+carro_removido.getModelo()); 
        
       }
       
    }

    public static void pedagio(){
        Queue<String> fila_carros = new LinkedList<>();
        fila_carros.offer("Uno");
        fila_carros.offer("Santana");
        fila_carros.offer("Gol G1");
        fila_carros.offer("Corsa");
        fila_carros.offer("Fusca");

        System.out.println("Situação da fila: "+fila_carros);

        //Realizando o atendimento do pedágio
        while (!fila_carros.isEmpty()) {
            String carro_removido = fila_carros.poll();
            System.out.println("Carro "+carro_removido+ " liberado no pedágio");
            
        }

    }

    public static void testeFila(){
        // criar uma fila para o pedágio

        //offer: ao inserir é consultado a capacidade da fila.
        //Caso a fila esteja cheia, não é inserido

        
        Queue<String> fila_carros = new LinkedList<>();
        fila_carros.offer("Uno");
        fila_carros.offer("Santana");
        fila_carros.offer("Fusca");

        //add: não consulta o tamanho da fila, em razão disso pode causar o overflow
        fila_carros.add("Gol G1");
        fila_carros.add("Corsa");

        //Contando os elementos
        System.out.println("Existe: "+fila_carros.size()+"carros");

        //vizualizar os elementos 
        for (String carro : fila_carros) {
            System.out.println(carro);
            
        }

        //Primeiro da fila
        System.out.println("Início: "+fila_carros.peek());
        
        //Ver todos
        System.out.println("Situação: "+fila_carros);
        
        //Remover o 1° elemento
        String car= fila_carros.poll();
        System.out.println("Carro removido: "+car);

        System.out.println("Situação: "+fila_carros);
    }
}
