package Grafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.Panel;
import java.net.URL;
import java.awt.Button;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.List;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;

public class PrincipalMon extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrincipalMon frame = new PrincipalMon();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PrincipalMon() {
		setAutoRequestFocus(false);
		setFont(new Font("Dialog", Font.PLAIN, 16));
		setType(Type.UTILITY);
		setTitle("Metro Monterrey");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(280, 30, 794, 691);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		String [] Estaciones = new String [55];
		
		Estaciones [0] = "Estaciones";
		Estaciones [1]= "Talleres";
		Estaciones [2]= "San Bernabe";
		Estaciones [3]= "Unidad Modelo";
		Estaciones [4]= "Aztlan";
		Estaciones [5]= "Penitenciaria";
		Estaciones [6]= "Alfonso Reyes";
		Estaciones [7]= "Mitras";
		Estaciones [8]= "Simon Bolivar";
		Estaciones [9]= "Hospital";
		Estaciones [10]= "Edison";
		Estaciones [11]= "Central";
		Estaciones [12]= "Cuauhtemoc";
		Estaciones [13]= "Del Golfo";
		Estaciones [14]= "Felix U.Gomez";
		Estaciones [15]= "Parque Fundidora";
		Estaciones [16]= "Y Griega";
		Estaciones [17]= "Eloy Carvazos";
		Estaciones [18]= "Lerdo de tejada";
		Estaciones [19]= "Exposicion";
		Estaciones [20]= "Sendero";
		Estaciones [21]= "Santiago Tapia";
		Estaciones [22]= "San Nicolas";
		Estaciones [23]= "Anahuac";
		Estaciones [24]= "Universidad";
		Estaciones [25]= "Ninos Heroes";
		Estaciones [26]= "Regina";
		Estaciones [27]= "General Anaya";
		Estaciones [28]= "Alameda";
		Estaciones [29]= "Fundadores";
		Estaciones [30]= "Padre Mier";
		Estaciones [31]= "General I. Zaragoza";
		Estaciones [32]= "Santa Lucia";
	    Estaciones [33]= "Adolfo Prieto";
	    Estaciones [34]= "Conchello";
	    Estaciones [35]= "Violeta";
	    Estaciones [36]= "Ruiz Cortines";
	    Estaciones [37]= "Los Angeles";
	    Estaciones [38]= "Hospital Metropolitano";
		
		JComboBox comboSalidas = new JComboBox();
		comboSalidas.setBounds(166, 580, 185, 25);
		contentPane.add(comboSalidas);
		
		JComboBox comboLlegadas = new JComboBox();
		comboLlegadas.setBounds(478, 580, 185, 25);
		contentPane.add(comboLlegadas);
		
		for(int i = 1; i <= 38;i++){
			comboSalidas.addItem(Estaciones[i]);
			comboLlegadas.addItem(Estaciones[i]);
		}
		
		JLabel lblSalida = new JLabel("Salida");
		lblSalida.setFont(new Font("Segoe Print", Font.BOLD, 16));
		lblSalida.setBounds(104, 586, 91, 14);
		contentPane.add(lblSalida);
		
		JLabel lblLlegada = new JLabel("Llegada");
		lblLlegada.setFont(new Font("Segoe Print", Font.BOLD, 16));
		lblLlegada.setBounds(399, 581, 91, 25);
		contentPane.add(lblLlegada);
		
		Button Ruta = new Button("Ruta");
		Ruta.setForeground(Color.BLACK);
		Ruta.setFont(new Font("Segoe Print", Font.BOLD, 15));
		Ruta.setBackground(Color.LIGHT_GRAY);
		Ruta.addActionListener(
	   	         new ActionListener() {  // clase interna anónima
	   	            // terminar la aplicación cuando el usuario haga clic en elementoSalir
	   	            public void actionPerformed( ActionEvent evento )
	   	            {
	   	            	String salida = comboSalidas.getSelectedItem().toString();
	   	            	String llegada = comboLlegadas.getSelectedItem().toString();	   	            	         	
	   	            	AA AEstrella = new AA(salida,llegada);
	   	            	JFrame.setDefaultLookAndFeelDecorated(false);
	   	            	Dibujo aplicacion = new Dibujo(AEstrella.recorridoOptimo());
	   	            }
	   	         }  // fin de la clase interna anónima    	 
	   	      ); // fin de la llamada a addActionListener
		Ruta.setBounds(214, 622, 321, 30);
		contentPane.add(Ruta);
		
		JButton mapa = new JButton("Aceptar");
		mapa.setIcon(new ImageIcon(PrincipalMon.class.getResource("/Grafica/mapa.jpg")));
		mapa.setBounds(10, 11, 770, 558);
		contentPane.add(mapa);

	}
}
