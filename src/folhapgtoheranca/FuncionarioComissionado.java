package folhapgtoheranca;

public class FuncionarioComissionado extends Funcionario {

    //Atributos 
    private double totalDeVenda;
    private double percentualDeComissao;

    //Construtores
    public FuncionarioComissionado(String nome, String carteiraDeTrabalho, double salarioBase,
                                                       double totalDeVenda, double percentualDeComissao) {
        super(nome, carteiraDeTrabalho, salarioBase);
        this.totalDeVenda = totalDeVenda;
        this.percentualDeComissao = percentualDeComissao;
    }
    
     public FuncionarioComissionado(String nome, String carteiraDeTrabalho,
                                                       double totalDeVenda, double percentualDeComissao) {
        super(nome, carteiraDeTrabalho);
        this.totalDeVenda = totalDeVenda;
        this.percentualDeComissao = percentualDeComissao;
    }

    public double getTotalDeVenda() {
        return totalDeVenda;
    }

    public void setTotalDeVenda(double totalDeVenda) {
        this.totalDeVenda = totalDeVenda;
    }

    public double getPercentualDeComissao() {
        return percentualDeComissao;
    }

    public void setPercentualDeComissao(double percentualDeComissao) {
        this.percentualDeComissao = percentualDeComissao;
    }
    
     public double calculaSalarioTotal(){
         double salarioTotal=getSalarioBase()+(totalDeVenda*percentualDeComissao/100);
         return salarioTotal;
     }

    @Override
     public String dadosFuncionario(){
         return super.dadosFuncionario()+
                 "\nTotal vendido R$ "+totalDeVenda+
                 "\nComissão (%): "+percentualDeComissao+
                 "\nSalário total R$ "+calculaSalarioTotal();
     }
}
