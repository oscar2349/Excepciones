package Excepciones;

import java.io.IOException;

import javax.swing.JOptionPane;

public class Comprobar_mail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String el_mail=JOptionPane.showInputDialog("Introduce mail");
		
		try {
			examina_mail(el_mail);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("dirreccion no valida");
		}
		
		
		
		
		
	}
static void examina_mail(String mail) throws IOException {
	
	int arroba=0;
	boolean punto = false;
	
	if (mail.length()<=3) {//para lanzar una excepcion, en el punto, una excepcion cualquiera
		
		throw new ArrayIndexOutOfBoundsException ();//no coresponde la excepcion con el error es 
		//solo un ejemplo
		
		
		
		
		
		
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
		
	
	


