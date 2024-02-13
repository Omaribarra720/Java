package ejemplo;
//Omar Antonio Ibarra Hernandez
import javax.swing.JFrame;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				
		JFrame ventana = new JFrame("Ejemplo");
		
		ventana.setVisible(true);
		
		ventana.setSize(500, 500);
		ventana.setLocation(100,100);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ventana.setLocationRelativeTo(ventana);
		ventana.setResizable(false);
		System.out.print("hola a todos");

	}

}

