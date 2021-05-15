
package folhapgtoheranca;

import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        String tipoFunc[]={"Funcionário","Funcionário Comissionado"};
        
        String nome=JOptionPane.showInputDialog(null, "Nome do funcionário: ","Exemplo Herança",3);
        String carteiraTrab=JOptionPane.showInputDialog(null, "Carteira de trabalho nº: ","Exemplo Herança",3);
        double salarioBase=Double.parseDouble(JOptionPane.showInputDialog(null,"Salário base: ",
                                                                            "Exemplo Herança",3));
        
        String tipoFuncUsr=(String)JOptionPane.showInputDialog(null,"Selecione a opção desejada:",
                                                                                                    "Exemplo Herança", 3, null, tipoFunc,tipoFunc[0]);
        
        if (tipoFuncUsr.equals(tipoFunc[0])){
            Funcionario funcionario = new Funcionario(nome, carteiraTrab,salarioBase);
            JOptionPane.showMessageDialog(null,funcionario.dadosFuncionario(),"Exemplo Herança",
                                                                                                  JOptionPane.INFORMATION_MESSAGE); //ou 1
        }else{
            double vendas=Double.parseDouble(JOptionPane.showInputDialog(null,"Total vendido:","Exemplo Herança",3));
            double percComissao=Double.parseDouble(JOptionPane.showInputDialog(null,"% de comissão:","Exemplo Herança",3));
            FuncionarioComissionado funcComissionado = new FuncionarioComissionado(nome,carteiraTrab,salarioBase,
                                                                                                                                            vendas,percComissao);
            JOptionPane.showMessageDialog(null,funcComissionado.dadosFuncionario(),"Exemplo Herança",
                                                                                                  JOptionPane.INFORMATION_MESSAGE); //ou 1
        }
        
        System.exit(0);
        
    }
    
}
