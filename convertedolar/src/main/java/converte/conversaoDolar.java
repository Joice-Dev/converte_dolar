
package converte;

import javax.swing.JOptionPane;


public class conversaoDolar {
    
    public static void main (String[]args){
     String moeda;
     moeda = JOptionPane.showInputDialog("Por favor, escolha uma das opções:"
             + "\n1  *Converter Dólar em Reais."
             + "\n2  *Sair");
         
      int opcao;
     opcao = Integer.parseInt(moeda);
     
     if (opcao == 1){
     String valor;
     valor = JOptionPane.showInputDialog("Por favor, digite o valor em Dólares que você deseja converter:");
     double valorReal = Double.parseDouble(valor);
     final double dolar = 5.03; 
     double valorConvertido = valorReal*dolar;
     String mensagem;
     mensagem = "O valor convertido em Reais, é de: "+valorConvertido;
     JOptionPane.showMessageDialog(null,mensagem);
     }else {
     System.exit(0);
     
     }
     
    
}
    
}    







//