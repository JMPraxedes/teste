/*
Tarefa Padrão Estrategy
Alunos: Alisson, Arthur e Júlio

O algorítmo de Cálculo de Frete funciona numa situação hipotética, 
onde existem fretes promocionais e fretes normais. Sobre os valores
dos fretes, existe um valor básico que será somado a valores condicionais, baseados 
na região de destino e no valor total da compra (podendo ter insenção ou acréscimo).
*/

package padraostrategy;

public class PadraoStrategy {

    public static void main(String[] args) {
        Frete umFrete = new Frete(Frete.SUDESTE, 250, false);
        System.out.println(umFrete.estrategiaDeCalculo());
       
        Frete umFrete1 = new Frete(Frete.NORDESTE, 300, false);
        System.out.println(umFrete1.estrategiaDeCalculo());
        
        Frete umFrete2 = new Frete(Frete.SUL, 250, true);
        System.out.println(umFrete2.estrategiaDeCalculo());
        
        Frete umFrete3 = new Frete(Frete.NORTE, 250, false);
        System.out.println(umFrete3.estrategiaDeCalculo());
        
        Frete umFrete4 = new Frete(Frete.CENTROESTE, 100, false);
        System.out.println(umFrete4.estrategiaDeCalculo());
        
        Frete umFrete5 = new Frete(Frete.NORDESTE, 450, true);
        System.out.println(umFrete5.estrategiaDeCalculo());  
    }
    
}

