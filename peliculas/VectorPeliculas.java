package src.peliculas;

import src.tienda.*;

public class VectorPeliculas{
	private Pelicula[] peliculas = new Pelicula[50];
	private int nextcode;

	public VectorPeliculas(){
		nextcode = 1;
	}

	public void nuevaspelis(String nombrepeli, int aniopeli, String categoria){
		if (nextcode > 50){
			System.out.println("Limite de stock alcanzado");
		}
		else {
			Pelicula[(nextcode-1)] = new Pelicula(nextcode, nombrepeli, aniopeli, categoria);
		}
		nextcode++;
	}

	public void nuevaspelis(){
		String nombrepeli = IngresoDatos.getTexto("Ingrese el nombre de la Pelicula");
		int aniopeli = IngresoDatos.getEnteroo("Ingrese el año de la Pelicula ingresada", false);
		String categoria = IngresoDatos.getTexto("Ingrese la categoria de la Pelicula");
		nuevaspelis(nombrepeli, aniopeli, categoria);
	 	}


    // fin agregar peliculas


	public void mostrarpeliculas(){
		System.out.println("\n Peliculas en stock de la tienda memorabilia");
		for (int i = 0; i<(nextcode-1); i++){
			System.out.println("-"+i+""+peliculas[i].getmuestra());
			//System.out.println("-"+i+") "+clientes[i].getId() + " nombre "+clientes[i].getNombre()+ " telefono "+clientes[i].getTelefono());
		}
		System.out.println("\n\n");
	}


    //Ordenamiento

    public void ordenpelis(boolean ascendentee){
    	boolean cambio = true;

    	for (int i = 1; i< (nextcode-1); i++){
    		for (int j = 0; j< (nextcode-1-i); j++){
    			if (ascendentee)
    				cambio= (peliculas[j].getNombre().compareTo(peliculas[j+1]).getNombre() > 0);
    			else 
                    cambio= (peliculas[j].getNombre().compareTo(peliculas[j+1].getNombre()) < 0 );
    			
    			if (cambio ){
    				peliculas aux = peliculas[j];
    				peliculas [j] = peliculas[j+1];
    				peliculas[j+1] = aux;
    			}	
    		}
    		
    	}
   }
}
   