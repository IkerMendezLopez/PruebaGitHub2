package ejercicios1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class OperFicheros {
	public static long CompruebaTamanio(String s) {

		long longitud = -10;
		try {
			FileInputStream fis = null;
			try {
				File f = new File(s);
				fis = new FileInputStream(f);
				longitud = f.length();
			} catch (FileNotFoundException e) {
				System.err.println("No encuentra el fichero");
			} finally {
				if (fis != null) {
					fis.close();
				}
			}
		} catch (IOException e) {
			System.err.println("No se puede abrir el fichero");
		}

		return longitud;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Nombre de fichero:");
		CompruebaTamanio(Consola.leeString());
	}

}
