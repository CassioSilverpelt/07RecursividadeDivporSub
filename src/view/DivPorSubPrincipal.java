package view;
import javax.swing.JOptionPane;
import controller.DivPorSubController;

public class DivPorSubPrincipal {
	public static void main(String[] args) {
		DivPorSubController divCon = new DivPorSubController();
		int a = Integer.parseInt(JOptionPane.showInputDialog("Insira o Dividendo: "));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Insira o Divisor: "));
				
		System.out.println("O resultado dessa divis�o �: " + divCon.divPorSub(a, b) + " com o resto " + (a%b));
	}
}
