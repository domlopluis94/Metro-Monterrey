
package Grafica;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import jdd.graph.Edge;

import Arbol.Arbol;
import Grafo.*;

public class AA {

	private Grafo grafo;
	Nodo salida;
	Nodo llegada;

	public AA(String salida, String llegada){


		grafo = new Grafo(true);

		// Creacion de la linea de metro
		Nodo Talleres , San_Bernabe , Unidad_Modelo, Aztlan, Penitenciaria, Alfonso_Reyes , Mitras , Simon_Bolivar, Hospital , Edison , Central , Cuauhtemoc , Del_Golfo , Felix_U_Gomez ,
		Parque_Fundidora, Y_Griega, Eloy_Carvazos, Lerdo_de_tejada , Exposicion, Sendero , Santiago_Tapia, San_Nicolas , Anahuac , Universidad , Ninos_heroes , Regina , General_Anaya ,
		Alameda , Fundadores , Padre_Mier , General_I_Zaragoza, Santa_Lucia, Adolfo_Prieto, Conchello, Violeta, Ruiz_Cortines, Los_Angeles, Hospital_Metropolitano;


		Talleres = grafo.addNode("Talleres", -7,-10);
		San_Bernabe = grafo.addNode("San Bernabe", -6,-8);
		Unidad_Modelo = grafo.addNode("Unidad Modelo", -4,-7);
		Aztlan = grafo.addNode("Aztlan", -3,-6);
		Penitenciaria = grafo.addNode("Penitenciaria", -2,-5);
		Alfonso_Reyes = grafo.addNode("Alfonso Reyes", -1,-5);
		Mitras = grafo.addNode("Mitras", 0,-5);
		Simon_Bolivar = grafo.addNode("Simon Bolivar", 1,-5);
		Hospital = grafo.addNode("Hospital", 3,-5);
		Edison = grafo.addNode("Edison", 3,-3);
		Central = grafo.addNode("Central", 3,-2);
		Cuauhtemoc = grafo.addNode("Cuauhtemoc", 3,0);
		Del_Golfo = grafo.addNode("Del Golfo", 3,2);
		Felix_U_Gomez = grafo.addNode("Felix U.Gomez", 3,3);
		Parque_Fundidora = grafo.addNode("Parque Fundidora", 3,4);
		Y_Griega = grafo.addNode("Y Griega", 3,7);
		Eloy_Carvazos = grafo.addNode("Eloy Carvazos", 4,8);
		Lerdo_de_tejada = grafo.addNode("Lerdo de tejada", 4,10);
		Exposicion = grafo.addNode("Exposicion", 4,11);
		Sendero = grafo.addNode("Sendero", -9,1);
		Santiago_Tapia = grafo.addNode("Santiago Tapia", -7,1);
		San_Nicolas = grafo.addNode("San Nicolas", -6,1);
		Anahuac = grafo.addNode("Anahuac", -5,1);
		Universidad = grafo.addNode("Universidad", -3,1);
		Ninos_heroes = grafo.addNode("Ninos Heroes", -1,1);
		Regina = grafo.addNode("Regina", 0,0);
		General_Anaya = grafo.addNode("General Anaya", 1,0);
		Alameda = grafo.addNode("Alameda", 5,0);
		Fundadores = grafo.addNode("Fundadores", 7,0);
		Padre_Mier = grafo.addNode("Padre Mier", 8,1);
		General_I_Zaragoza = grafo.addNode("General I. Zaragoza", 8,2);
		Santa_Lucia = grafo.addNode("Santa Lucia", 7,3);
		Adolfo_Prieto= grafo.addNode("Adolfo Prieto", 5,3);
		Conchello = grafo.addNode("Conchello", 1,3);
		Violeta = grafo.addNode("Violeta", 0,4);
		Ruiz_Cortines = grafo.addNode("Ruiz Cortines", -2,5);
		Los_Angeles = grafo.addNode("Los Angeles", -3,6);
		Hospital_Metropolitano = grafo.addNode("Hospital Metropolitano", -4,7);
		
		//Estaciones
		
		//Trayectos
		// Linea 1
		grafo.addEdge (Talleres,San_Bernabe, 0.75, "Linea-1");
		grafo.addEdge (San_Bernabe, Unidad_Modelo, 1.00,"Linea-1");
		grafo.addEdge (Unidad_Modelo, Aztlan, 1.30, "Linea-1");
		grafo.addEdge (Aztlan, Penitenciaria, 1.10, "Linea-1");
		grafo.addEdge (Penitenciaria, Alfonso_Reyes, 0.80, "Linea-1");
		grafo.addEdge (Alfonso_Reyes,Mitras, 1.10, "Linea-1");
		grafo.addEdge (Mitras,Simon_Bolivar, 0.80, "Linea-1");
		grafo.addEdge (Simon_Bolivar, Hospital, 0.80, "Linea-1");
		grafo.addEdge (Hospital,Edison, 1.50, "Linea-1");
		grafo.addEdge (Edison,Central, 0.95, "Linea-1");
		grafo.addEdge (Central, Cuauhtemoc, 0.70, "Linea-1");
		grafo.addEdge (Cuauhtemoc,Del_Golfo, 1.10, "Linea-1");
		grafo.addEdge (Del_Golfo, Felix_U_Gomez, 1.00, "Linea-1");
		grafo.addEdge (Felix_U_Gomez,Parque_Fundidora, 0.85, "Linea-1");
		grafo.addEdge (Parque_Fundidora, Y_Griega, 0.90, "Linea-1");
		grafo.addEdge (Y_Griega, Eloy_Carvazos, 1.80, "Linea-1");
		grafo.addEdge (Eloy_Carvazos, Lerdo_de_tejada, 1.40, "Linea-1");
		grafo.addEdge (Lerdo_de_tejada , Exposicion, 0.70, "Linea-1");

		// Linea 2
		grafo.addEdge (Sendero, Santiago_Tapia, 1.10, "Linea-2");
		grafo.addEdge (Santiago_Tapia, San_Nicolas, 0.80, "Linea-2");
		grafo.addEdge (San_Nicolas , Anahuac, 1.50, "Linea-2");
		grafo.addEdge (Anahuac, Universidad, 2.40, "Linea-2");
		grafo.addEdge (Universidad, Ninos_heroes, 1.00, "Linea-2");
		grafo.addEdge (Ninos_heroes, Regina, 1.00, "Linea-2");
		grafo.addEdge (Regina, General_Anaya, 1.30, "Linea-2");
		grafo.addEdge (General_Anaya, Cuauhtemoc, 1.33, "Linea-2");
		grafo.addEdge (Cuauhtemoc, Alameda, 1.10, "Linea-2");
		grafo.addEdge (Alameda, Fundadores, 0.55, "Linea-2");
		grafo.addEdge (Fundadores, Padre_Mier, 0.75, "Linea-2");
		grafo.addEdge (Padre_Mier, General_I_Zaragoza, 0.55, "Linea-2");
		
		//Linea 3
		grafo.addEdge (General_I_Zaragoza, Santa_Lucia, 1.10, "Linea-3");
		grafo.addEdge (Santa_Lucia, Adolfo_Prieto, 0.80, "Linea-3");
		grafo.addEdge (Adolfo_Prieto, Felix_U_Gomez, 1.50, "Linea-3");
		grafo.addEdge (Felix_U_Gomez, Conchello, 1.40, "Linea-3");
		grafo.addEdge (Conchello, Violeta, 1.10, "Linea-3");
		grafo.addEdge (Violeta, Ruiz_Cortines, 2.40, "Linea-3");
		grafo.addEdge (Ruiz_Cortines, Los_Angeles, 1.44, "Linea-3");
		grafo.addEdge (Los_Angeles, Hospital_Metropolitano, 1.00, "Linea-3");
		
		
		
		Iterator<Edge> l = grafo.getMap().get(salida).iterator();
		boolean cond = true;
		Edge tramo;
		while(l.hasNext() && cond){
			tramo = l.next();
			if(((Nodo)tramo.n1).getNombre() == salida){
				this.salida = (Nodo)tramo.n1;
				cond = false;
			}
		} //while
		

		Iterator<Edge> s = grafo.getMap().get(llegada).iterator();
		cond = true;
		while(s.hasNext() && cond){
			tramo = s.next();
			if(((Nodo)tramo.n1).getNombre() == llegada){
				this.llegada = (Nodo)tramo.n1;
				cond = false;
			}
		}
	}

	public List<Pixel> recorridoOptimo(){
		String linea = "";
		String lineaA = "Linea0";
		Arbol arbol = new Arbol(salida, llegada, grafo);
		List<Nodo> camino = arbol.recorridoObtimo(arbol.CalcularRecorrido());
		List<Pixel> recorrido = new ArrayList<Pixel>();
		Iterator<Nodo> iterador = camino.iterator();
		Iterator<Nodo> iterador2 = camino.iterator();
		iterador2.next();
		while(iterador.hasNext()){
			Nodo nodo = iterador.next();
			Nodo nodo2;
			if (iterador2.hasNext()){
				nodo2 = iterador2.next();
				Iterator<Edge> l = grafo.getMap().get(nodo.getNombre()).iterator();
				boolean cond = true;
				Edge tramo;
				while(l.hasNext() && cond){
					tramo = l.next();
					if(((Nodo)tramo.n2).getNombre() == nodo2.getNombre()){
						if (cond && linea == lineaA){
							linea = tramo.getLabel();
							cond = false;
						}
						else linea = tramo.getLabel();
					}
				}
				lineaA=linea;
			}
			else linea = "";
			Pixel pixel = new Pixel(nodo.getX(),nodo.getY(),nodo.getNombre(),linea);
			recorrido.add(pixel);
		}
		return recorrido;
	}



}