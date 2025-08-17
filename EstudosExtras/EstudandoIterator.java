import java.util.ArrayList;
import java.util.Iterator;

public class EstudandoIterator{
    public static void main(String args[]){
        
        //Declaração dos meus carros
        var car1 = new Carro("HB20", "prata");
        var car2 = new Carro("Kadett", "vinho");
        var car3 = new Carro("F8","vermelho");
        var car4 = new Carro("Fit", "preto");
        //ArrayList com meus carros
        //Carro meusCarros[] = {car1,car2,car3,car4}; Descobri que com Array Normal é impossível remover um elemento.
        ArrayList<Carro> meusCarros = new ArrayList<>();
        meusCarros.add(car1);
        meusCarros.add(car2);
        meusCarros.add(car3);
        meusCarros.add(car4);
        
        // Percorre a lista de carros e remove com segurança os carros vermelhos usando Iterator
        for (Iterator<Carro> it = meusCarros.iterator(); it.hasNext(); ) {
        var selecionado = it.next(); // pega próximo elemento
        if (selecionado.cor.equals("vermelho")) {
        it.remove(); // remove com segurança
    }
}

        //For-each para printar
        for(var selecionado: meusCarros){
            System.out.println(selecionado.modelo + " na cor " + selecionado.cor);

        }
    }
}

class Carro{
    //Atributos
    String modelo;
    String cor;

    //Construtor
    Carro(String modelo, String cor){
        this.modelo = modelo;
        this.cor = cor;
    }
    
}
