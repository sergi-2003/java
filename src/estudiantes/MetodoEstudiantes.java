package estudiantes;

import javax.swing.JOptionPane;

public class MetodoEstudiantes {
	String nombres []; 
	int n = 0;
	int edad [];
	int valida = 0;
	
	
public void iniciar() {
	String menu = "MENU ESTUDIANTES\n";
	menu += "1. Registrar\n";
	menu += "2. Imprimir\n";
	menu += "3. promedio de edades\n";
	menu += "4. estuidiantes mayores de edad\n";
	menu += "5. estudiantes menores de edad\n";
	menu += "6. Buscar por nombre\n";
	menu += "7. buscar estudiantes por edad \n";
	menu += "8. Salir\n";
	menu += " Ingrese una ópcion\n";
	
	int opc = 0;
	do {
		opc = Integer.parseInt(JOptionPane.showInputDialog(menu));
		validarOpciones(opc);
	} while (opc!=8);
}
public void validarOpciones (int opc) {
	switch (opc) {
	case 1:
		valida = 1;
		registrarEstudiantes();
		break;
	case 2:
		if(nombres!= null) {
			imprimirEstudiantes();
		}else {
			System.out.println("No existe el codigo! ");
		}
		break;
	case 3:
		if(nombres!= null) {
			promedioEdad();
		}else {
			System.out.println("No existe el codigo! ");
		}
		break;
	case 4 : 
		if(nombres!= null) {
			promedioEdad();
		}else {
			estudiantesMayores();
		}
		break ;
	case 5 :
		if(nombres!= null) {
			menorDeEdad();
		}else {
			System.out.println("No existe el codigo! ");
		}
		break;
	case 6 :
		if(nombres!= null) {
			buscarEstudiantePorNombre();
		}else {
			System.out.println("No existe el codigo! ");
		}
		break;
	case 7 :
		if(nombres!= null) {
			buscarEstudiantePorEdad();
		}else {
			System.out.println("No existe el codigo! ");
		}
		break;
	case 8 :
		JOptionPane.showInternalMessageDialog(null,"termino el programa");
		break;
	default:
		JOptionPane.showInternalMessageDialog(null, "no existe el codigo");
		break;
	}
}
public void registrarEstudiantes () {
	n = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero de estudiantes"));
	nombres = new String[n];
	edad = new int [n];
	
	for (int i = 0; i < nombres.length; i++) {		
		nombres [i] = JOptionPane.showInputDialog("Ingrese su nombre");
		edad [i] = Integer.parseInt(JOptionPane.showInputDialog("ingresa la edad"));
	}
	
}
public void imprimirEstudiantes () {
	JOptionPane.showConfirmDialog(null,nombres);
	for (int i = 0; i < nombres.length; i++) {
		JOptionPane.showConfirmDialog(null,"estudiante "+nombres[i]+" de edad "+edad[i]);
	}
}
public void promedioEdad () {
	int suma = 0;
	int promedio = 0;
	
    for (int i = 0; i < n; i++) {
       suma += edad[i];
    }
    
  
    promedio = suma / n;
    
    JOptionPane.showConfirmDialog(null,"El promedio de edades es: " + promedio);
}
public void estudiantesMayores () {
	int mayor = 18 ;
	for (int i = 0; i < edad.length; i++) {
		if(edad[i] >=(mayor)) {
			JOptionPane.showConfirmDialog(null,"El estudiante mayor de edad " + nombres[i] + " tiene " + edad[i] + " años");		
		}
	}
}
public void menorDeEdad () {
	for (int i = 0; i < edad.length; i++) {
		if (edad[i] <= 17) {
			 System.out.println("El estudiante menor de edad " + nombres[i] + " tiene " + edad[i] + " años");
		}
	}
}
public void buscarEstudiantePorNombre () {
	int contador = 0;
	String nombreBuscar = JOptionPane.showInputDialog("ingrese el nombre a buscar");
	
	for (int i = 0; i < nombres.length; i++) {
		if(nombres[i].equalsIgnoreCase(nombreBuscar)) {
			JOptionPane.showConfirmDialog(null,"Lo encontro en la pos: "+i);
			contador ++;
		}
	}
	
	if (contador>0) {
		JOptionPane.showConfirmDialog(null, "encontro a  "+contador+" veces");
	}else {
		System.out.println("No se encontro el nombre "+nombreBuscar);
	}
}

public void buscarEstudiantePorEdad() {
	int Buscaredad = Integer.parseInt(JOptionPane.showInputDialog("ingresa la edad del estudiante a buscar"));
	
	for (int i = 0; i < edad.length; i++) {
		if(edad[i]==Buscaredad) {
			JOptionPane.showConfirmDialog(null, "la edad ingresada "+edad[i]+" corresponde a los alumnos "+nombres[i]);
		}
	}

}


}
