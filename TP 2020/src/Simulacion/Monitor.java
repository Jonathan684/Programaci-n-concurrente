package Simulacion;

public class Monitor {
	//Campos
	RDP red;
	//Mutex mutex (Garantiza exclusion mutua para cada hilo) 
	//Vector de Variable de condicion ( colas de hilos igual a cantidad de transiciones de rdp) 
	
	///Constructor
	public Monitor() {
		imprimir();
		red = new RDP(); ///se creo la red ()	
	}
     ////////////////////Metodos
	 /*@brief
     * Este metodo dispara una transicion de la rdp indicada por parametro, teniendo en cuenta el modo indicado por parametro
     * y recalcula el vector de sensibilizadas tambien tiene en cuenta si la transicion a disparar esta o no sensibilizada.
     *@param n_T : numero de transicion. 
     *@param flag indica el modo de disparo: 
     *			 -true : modo de disparo explicito, modifica el vector de marcado actual VMA
     *           -false : modo de disparo implicito, no modifica el vector de marcado actual VMA
     *@return : -0 retorna 0 si el disparo no es exitoso. 
     *          -1 retorna 1 si el disparo no es exitoso.
     */
	public boolean disparar(int n_transicion , boolean modo_de_disparo)
	{   
		/// Exclusion mutua
		System.out.print("\nDisparo :T"+ n_transicion);
			if(!esta_Sensibilizada(n_transicion)) {
				System.out.println("\nno esta sensibilizada");	
			return false;	
			}
			 
		red.Disparar(n_transicion, modo_de_disparo);
		red.Calcular_VE();
		System.out.println("\n----------------------------------------------------------------------------------------------------------------------");
			return true;
	}
	/*brief
	 -get_tokens_place (recibice por parametro el numero de la plaza)
	*/
	public void get_tokens_place(int n_place) {
		//red.Numero_de_plazas()
		System.out.println("\nTOKENS EN LA PLAZA" + red.numero_de_Tokens(n_place));
		
	}
	
	/*
	 * @brief
	 * Este metodo devuelve verdadero si la transicion esta sensibilizada y devuelve falso si no lo esta. 
	 * @param n_T : transicion que se desesa saber si esta sensibilizada . 
	  */
   public boolean esta_Sensibilizada(int transicion) {
	   
	   if(red.Habilitada(transicion) == true)
	   {
		   return true;
	   }
	   else return false;
   }
	void imprimir() {
			System.out.println("----------------------------------MONITOR----------------------------------");
     }  
}
