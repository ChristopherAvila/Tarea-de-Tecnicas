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

}
