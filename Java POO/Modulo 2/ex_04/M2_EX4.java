import javax.swing.JOptionPane;

public class M2_EX4 {

    public static void main(String[] args) {
        String a = JOptionPane.showInputDialog("Lado do Quadrado");
        int base_quadrado;
        base_quadrado = Integer.parseInt(a);

        int area_quadrado = (base_quadrado * base_quadrado);

        System.out.println("A Area do Quadrado é:" + area_quadrado);

    }

}
