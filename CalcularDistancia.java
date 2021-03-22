import javax.swing.*;

public class CalcularDistancia {


    public static void main(String[] args) {


        double x1;
        double x2;
        double y1;
        double y2;

        x1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor de X1"));
        y1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor de Y1"));

        x2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor de X2"));
        y2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor de Y2"));

        double d = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));

        System.out.println("La distancia es: " + d);


    }


}
