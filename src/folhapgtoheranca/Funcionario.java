
package folhapgtoheranca;

public class Funcionario {
    //Atributos
    private String nome;
    private String carteiraDeTrabalho;
    private double salarioBase;

    //Construtores sobrecarregados
    public Funcionario(String nome, String carteiraDeTrabalho, double salarioBase) {
        this.nome = nome;
        this.carteiraDeTrabalho = carteiraDeTrabalho;
        this.salarioBase = salarioBase;
    }

    public Funcionario(String nome, String carteiraDeTrabalho) {
        this.nome = nome;
        this.carteiraDeTrabalho = carteiraDeTrabalho;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCarteiraDeTrabalho() {
        return carteiraDeTrabalho;
    }

    public void setCarteiraDeTrabalho(String carteiraDeTrabalho) {
        this.carteiraDeTrabalho = carteiraDeTrabalho;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    
    public String dadosFuncionario(){
        return "Funcionário: "+nome+
                "\nCarteira de trabalho nº "+carteiraDeTrabalho+
                "\nSalário Base R$ "+salarioBase;
    }
    
}
