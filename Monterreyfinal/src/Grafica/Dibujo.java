package Grafica;
import  java.awt.*;
import java.awt.event.*;
import java.util.List;

import javax.swing.*;
 
public class Dibujo extends Frame{
	
   private JTextArea areaTexto1;

   
   // configurar GUI
   public Dibujo(List<Pixel> lista){
      super( "Camino �ptimo" );    
 
// establecer men� Archivo y sus elementos de men�
      Menu menuArchivo = new Menu( "Archivo" );
 
      // establecer elemento de men� Acerca de...
      MenuItem elementoAcerca = new MenuItem( "Acerca de..." );
      menuArchivo.add( elementoAcerca );
      elementoAcerca.addActionListener(
 
         new ActionListener() {  // clase interna an�nima
 
            // mostrar cuadro de di�logo de mensaje cuando el usuario seleccione Acerca de...
            public void actionPerformed( ActionEvent evento )
            {
               JOptionPane.showMessageDialog( Dibujo.this,
                  "Este software fue dise�ado por: \n Luis Dom�nguez L�pez\nOscar Millie Serrano " +
                  "\n David Vicente Rinc�n\n Jose Alberto Buenavida Carmona",
                  "Acerca de", JOptionPane.PLAIN_MESSAGE );
            }
 
         }  // fin de la clase interna an�nima
 
      ); // fin de la llamada a addActionListener
 
      // establecer elemento de men� Salir
      MenuItem elementoSalir = new MenuItem( "Salir" );
      menuArchivo.add( elementoSalir );
      elementoSalir.addActionListener(
 
         new ActionListener() {  // clase interna an�nima
 
            // terminar la aplicaci�n cuando el usuario haga clic en elementoSalir
            public void actionPerformed( ActionEvent evento )
            {
              // System.exit( 0 );
            	setVisible(false);
            }
 
         }  // fin de la clase interna an�nima
 
      ); // fin de la llamada a addActionListener
 
      // crear barra de men�s y adjuntarla a la ventana 
      MenuBar barra = new MenuBar();
      setMenuBar( barra );
      barra.add( menuArchivo );   
 
      // Clase anidada que permite terminar la ejecuci�n de la animaci�n
      this.addWindowListener(
        // Definici�n de la clase an�nima para controlar el cierre de
        // la ventana
        new WindowAdapter() {
          public void windowClosing( WindowEvent evt ) {
            // Se concluye el programa
           // System.exit( 0 );
        	  setVisible(false);
          }
        } );
      

    //////////////////////////////////////
      setBounds(170, 50, 983, 616);
      setLocation(170, 50);
      setSize( 983, 616 );
      setVisible(true);
      
    String cadena = "";
    for (int i = lista.size()-1; i >-1 ;i--){
  	  cadena = cadena + lista.get(i).getNombre() + "\n";
      if (i > 0){
    		cadena = cadena + "            | ("+lista.get(i-1).getLinea()+")\n";
    	  }
      }

    // establecer areaTexto1
    areaTexto1 = new JTextArea( cadena, 700, 300 );
    add( new JScrollPane( areaTexto1 ) );

   } // fin del constructor
 

}