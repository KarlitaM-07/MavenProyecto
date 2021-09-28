package biblioteca;

import java.util.Arrays;
import java.util.Scanner;

public class MainLibros {

	private static String opcion;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese libro ");
		
		Bibliotecario libro = new Bibliotecario("libro");
		libro.setCodigoLibro("LIB-34");
		libro.setNombreLibro("Programacion I");
		libro.setAutorLibro("Adam Bien");
		libro.setAñoPublicacion("2017");
		libro.setEstadoLibro("Disponible");
		libro.setFechaEntrega("null");

		Bibliotecario libro1 = new Bibliotecario("libro");
		libro1.setCodigoLibro("LIB-45");
		libro1.setNombreLibro("Programacion II");
		libro1.setAutorLibro("Adam Bien");
		libro1.setAñoPublicacion("2016");
		libro1.setEstadoLibro("Reservado");
		libro1.setFechaEntrega("15/03/2021");

		Bibliotecario libro2 = new Bibliotecario("libro");
		libro2.setCodigoLibro("LIB-34");
		libro2.setNombreLibro("Programacion III");
		libro2.setAutorLibro("Adam Bien");
		libro2.setAñoPublicacion("2016");
		libro2.setEstadoLibro("Prestado");
		libro2.setFechaEntrega("15/05/2021");
		
		
		System.out.println("Bibliotecario: "+ libro.getCodigoLibro()+ libro.getNombreLibro()+libro.getAutorLibro()+ libro.getAñoPublicacion()+ libro.getEstadoLibro()+ libro.getFechaEntrega());
		System.out.println("Bibliotecario: "+ libro1.getCodigoLibro()+ libro1.getNombreLibro()+libro1.getAutorLibro()+ libro1.getAñoPublicacion()+ libro1.getEstadoLibro()+ libro1.getFechaEntrega());
		System.out.println("Bibliotecario: "+ libro2.getCodigoLibro()+ libro2.getNombreLibro()+libro2.getAutorLibro()+ libro2.getAñoPublicacion()+ libro2.getEstadoLibro()+ libro2.getFechaEntrega());
		
		Bibliotecario codigoLibro[]=new Bibliotecario[20];
		codigoLibro[0]= libro;
		codigoLibro[1]= libro1;
		codigoLibro[3]= libro2;
		
		String  opcion1 = null;
		switch (opcion1) {
		case "1":
			System.out.println(" ingrese codigo de libro a reservar ");
			String reservaLibro=teclado.nextLine();
			System.out.println(" ingrese su cedula de estudiante ");
			String cedula=teclado.nextLine();
		
			for (int i = 0; i <= codigoLibro.length; i++) {
				Bibliotecario Libro = codigoLibro[i];
				boolean encontrar = libro.getCodigoLibro().contains(reservaLibro);
				boolean encontrar1 = libro1.getCedulaEstudiante().contains(cedula);
				
				if (encontrar == true) {
					boolean encontro2 = libro.getEstadoLibro().equals("Disponible");
					if (encontro2 == true) {
						libro.setEstadoLibro("Reservado");
						System.out.println("El libro esta disponible acerquese al mostrador por el ");
						
					} else {
						System.out.println("El libro solicitado No se encunetra dispoible");
					}
				}
			}
					break;
		
		
					int opcion=0;
					
					switch (opcion1) {
					case "b":
				System.out.println(" ingrese codigo de libro a reservar ");
				reservaLibro=teclado.nextLine();
				System.out.println(" ingrese su cedula de estudiante ");
				cedula=teclado.nextLine();
			
				for (int i = 0; i <= codigoLibro.length; i++) {
					Bibliotecario Libro = codigoLibro[i];
					boolean encontrar = libro.getCodigoLibro().contains(reservaLibro);
					boolean encontrar1 = libro1.getCedulaEstudiante().contains(cedula);
					
					if (encontrar == true) {
						boolean encontro2 = libro.getEstadoLibro().equals("Disponible");
						if (encontro2 == true) {
							libro.setEstadoLibro("Reservado");
							System.out.println("El libro esta disponible acerquese al mostrador por el ");
							
						} else {
							System.out.println("El libro solicitado No se encunetra dispoible");
						}
					}
				}
						break;
				
			case "2":
				System.out.println(" ingresar un libro ");
				System.out.println(" prestar un libro ");
				System.out.println(" determinar fecha de entrega ");
				opcion1 = teclado.nextLine();
				switch (opcion1) {
				case "a":
			
					System.out.println(" ingrese codigo de libro ");
					String codigo=teclado.nextLine();
					System.out.println(" ingrese nombre del libro ");
					String nombre=teclado.nextLine();
					System.out.println(" ingrese autor del libro ");
					String autor=teclado.nextLine();
					System.out.println(" ingrese año de publicacion  ");
					String anio=teclado.nextLine();
					System.out.println(" ingrese editorial de libro ");
					String editorial=teclado.nextLine();
					System.out.println(" ingrese cantidad de paginas del libro ");
					String cantidadpaginas=teclado.nextLine();
					System.out.println(" ingrese precio de libro ");
					String precio=teclado.nextLine();
					
					
					System.out.println(" Escoja tipo del libro ");
					System.out.println(" Libro para  trabajo ");
					System.out.println(" Libro para lectura ");

					for (int i = 0; i <= codigoLibro.length; i++) {
						Bibliotecario Libro = codigoLibro[i];
						boolean encontrar = libro.getCodigoLibro().contains("disponible");
						boolean encontrar1 = libro.getNombreLibro().contains(nombre);
						boolean encontrar2 = libro.getAutorLibro().contains(autor);
						boolean encontrar3 = libro.getAñoPublicacion().contains(anio);
						boolean encontrar4 = libro.getEditorial().contains(cantidadpaginas);
						boolean encontrar5 = libro.getPrecio().contains(precio);
						boolean encontrar6 = libro.getLibrotrabajo().contains(codigo);
						boolean encontrar7 = libro.getLibroLectura().contains(null);
						
						
						if (encontrar == true) {
							boolean encontro6 = libro.getLibrotrabajo().equals("Codigo autorizado");
							if (encontrar == true) {
								libro.setLibroLectura("Tiempo de lectura");
								System.out.println(" ingrese codigo autorizacion ");
								
							} else {
								System.out.println("Tiempo de lectura aproximado");
							}
						}
					}
					
							break;				
			
						case "b":
							System.out.println(" ingrese codigo de libro ");
							 codigo=teclado.nextLine();
						
							for (int i = 0; i <= codigoLibro.length; i++) {
								Bibliotecario Libro = codigoLibro[i];
								boolean encontrar = libro.getCodigoLibro().contains(codigo);
								
								if (encontrar == true) {
									boolean encontro2 = libro.getEstadoLibro().equals("Reservado");
									if (encontro2 == true) {
										libro.setEstadoLibro("Prestado");
										System.out.println("El libro a sido prestado ");
										
									} else {
										System.out.println("El libro No se puede prestar");
									}
								}
							}
									break;
									
									
									case "c":
									
									System.out.println("ingrese codigo libro");
									codigo=teclado.nextLine();
									System.out.println("ingrese cedula estudiante ");
									cedula=teclado.nextLine();
									for (int i = 0; i <= codigoLibro.length; i++) {
										Bibliotecario Libro = codigoLibro[i];
										boolean encontrar = libro.getCodigoLibro().contains(codigo);
										boolean encontrar1= libro.getCedulaEstudiante().contains(cedula);
										
										if (encontrar == true && encontrar1 ==true) {
											boolean encontro2 = libro.getEstadoLibro().equals("Reservado");
											if (encontro2 == true) {
												libro.setEstadoLibro("Prestado");
												System.out.println("El libro a sido prestado ");
												
											} else {
												System.out.println("El libro No se puede prestar");
											}
										}
									}
											break;
				
									
								
									

	}
			}
}
}
}		