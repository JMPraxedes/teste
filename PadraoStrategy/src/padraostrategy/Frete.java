
package padraostrategy;

public class Frete {
    public static final int SUDESTE = 1;
    public static final int SUL = 2;
    public static final int CENTROESTE = 3;
    public static final int NORDESTE = 4;
    public static final int NORTE = 5;
    
    protected double freteBasico = 10;
    protected int regiao;
    protected double valorCompra;
    protected boolean promocao = false;
    protected CalculaFrete estrategiaDeCalculo;
    
    public Frete(int regiao, double valorCompra, boolean promocao){
        this.freteBasico = freteBasico;
        this.valorCompra = valorCompra;
        this.promocao = promocao;
        
        switch (regiao){
            case SUDESTE:
                estrategiaDeCalculo = new CalculoValorMaisFreteDesconto();
                regiao = SUDESTE;
                break;
            case SUL:
                estrategiaDeCalculo = new CalculoValorMaisFreteDesconto();
                regiao = SUL;
                break;
            case CENTROESTE:
                estrategiaDeCalculo = new CalculoValorMaisFrete();
                regiao = CENTROESTE;
                break;
            case NORDESTE:
                estrategiaDeCalculo = new CalculoValorMaisFrete();
                regiao = NORDESTE;
                break;
            case NORTE:
                estrategiaDeCalculo = new CalculoValorMaisFrete();
                regiao = NORTE;
                break;  
            default:
                throw new RuntimeException("Região não encontrada :/");
        }
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public double freteBasico() {
        return freteBasico;
    }

    double estrategiaDeCalculo() {
        return estrategiaDeCalculo.calcularValorCompraComFrete(this);
    }

    boolean getPromocao() {
        return promocao;
    }
    
   
}


