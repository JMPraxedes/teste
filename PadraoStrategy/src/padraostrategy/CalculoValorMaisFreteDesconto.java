
package padraostrategy;

public class CalculoValorMaisFreteDesconto implements CalculaFrete {

   @Override
    public double calcularValorCompraComFrete(Frete umFrete) {
        if(umFrete.getPromocao() == false){
            if(umFrete.getValorCompra() > 149.9 && umFrete.getValorCompra() < 300){
                return umFrete.freteBasico();
            }
            else if(umFrete.getValorCompra() >= 300){
                return 0;
            }
                    
            return umFrete.freteBasico() + 15;
        }
        return 0; 
    }
    
}
