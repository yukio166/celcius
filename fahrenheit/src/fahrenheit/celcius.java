package fahrenheit;

import javax.swing.JOptionPane;
public class celcius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] resposta ={"para celcius","para fahrenheit","cancela"};
		int op=JOptionPane.showOptionDialog(null,"qual sera a conversao ?", "converter", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, resposta,resposta[0]);
		switch (op) {
		case 0:
			String f = JOptionPane.showInputDialog("qual é a temperatura em fahrenheit?");
			int fa = Integer.parseInt(f);
			double cel;
			cel= ((fa - 32) / 1.8);
			JOptionPane.showConfirmDialog(null,"a temperatura eh " + cel+"°C",null,JOptionPane.CLOSED_OPTION);
			break;
		case 1:
			String c = JOptionPane.showInputDialog("qual é a temperatura em celcius?");
			int celc = Integer.parseInt(c);
			double fah;
			fah=1.8 * celc + 32;
			JOptionPane.showConfirmDialog(null,"a temperatura eh " + fah+"°F",null,JOptionPane.CLOSED_OPTION);
			break;
		default:
			System(0);			
			break;
		}{
		
		}
	}

	private static void System(int i) {
		// TODO Auto-generated method stub
		
	}

}
