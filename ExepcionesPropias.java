package Excepciones;
import javax.swing.JOptionPane;


public class ExepcionesPropias {

	
public static void main(String[] args) {
	
		String el_mail=JOptionPane.showInputDialog("Introduce mail");
		
		try {
			examina_mail(el_mail);
		} catch (longitud_erronea e) {
			System.out.println(e);
}
		
}


static void examina_mail (String mail) throws longitud_erronea{//metodo recibe un parametro
	
	int arroba=0;
	boolean punto = false;
	
	if (mail.length()<=3) {//para lanzar una excepcion, en el punto, una excepcion cualquiera
				
		//throw new ArrayIndexOutOfBoundsException ();//no coresponde la excepcion con el error es 
		//solo un ejemplo lanzar la excepcion usando cualquier constructor de la clase creada
		
		throw new longitud_erronea("ingrese un mail valido");//indico la clase del error para que se valla al catch
		
		
				
	}
	for (int i = 0; i < mail.length(); i++) {
		
		if(mail.charAt(i)=='@'){
			arroba ++;
		}
		
		if(mail.charAt(i)=='.') {
			
			punto=true;
		}
	}
	
	if (arroba==1 && punto==true) {
		
		System.out.println("Es correcto");
	}
		
	
		else {
			
			System.out.println("Incorrecto");
			
		}
}
}


//	creo la clase de mi excepcion propia

class longitud_erronea extends Exception{
	
	public longitud_erronea(){}
	
	public longitud_erronea(String msj_error) {
	super(msj_error);// llamar al constructor de la clase padre
}
	
}
