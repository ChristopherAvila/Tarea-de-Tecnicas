package poofiguras;

import javax.swing.JOptionPane;

public class Figuras {

    public void cuadrado() {
        int lado, area;

        lado = Integer.parseInt(JOptionPane.showInputDialog("Digite el lado del cuadrado"));
        area = lado * lado;
        JOptionPane.showMessageDialog(null, "El area del cuadrado es :" + area);

    }
    public void triangulo(){
     double base, altura,area;

        base = Integer.parseInt(JOptionPane.showInputDialog("Digite la base del triangulo"));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite la altura del triangulo"));
        area=(base*altura)/2;
        JOptionPane.showMessageDialog(null, "El area del triangulo es :"+area);
        
    }
       public void circulo(){
     double circunferencia,radio,area;
     double pi=3.14;
        circunferencia = Integer.parseInt(JOptionPane.showInputDialog("Digite la circunferencia del circulo"));
        radio=(circunferencia*pi)/2;
        area=(pi*Math.pow(radio,radio))/2;
        JOptionPane.showMessageDialog(null, "El area del circulo  es :"+area);
        
    }

}
