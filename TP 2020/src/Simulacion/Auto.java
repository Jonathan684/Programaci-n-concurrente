package Simulacion;

public class Auto implements Runnable {

	//Campos
     private Monitor monitor;
     private int calle_entrada;
     private int calle_salida;
     private int Piso;
     //int[] Secuencia;
     
     
     
	public Auto(Monitor monitor,int c_entrada){
			this.monitor=monitor;
		    calle_entrada = c_entrada;
		    calle_salida=1;
    }
	
	public void run() {
		
		/*for(int i=0 ; i<Secuencia.length;i++) {
		red.disparar(Secuencia[i] , true);
		}*/
		
		//red.get_tokens_place(19);
	   // System.out.println("\nMetodo Run");
		// TODO Auto-generated method stub
	   //	red.disparar(10,true);
		Entrar(); 
 		Estacionar();
		Pagar();
		Salir();
		
		
	}
	/*@brieft Descripcion
 	 * Este metodo dispara la primera transicion de la red llamada calle de entrada
 	 */
	public void Entrar() {
		//T0 T1 T2 - Tres Lugares
		switch(calle_entrada)
		{
			case 1: //Calle 1
				
				if(monitor.disparar(0,true)==false)
				{
					//Dormir Sleep()
					System.out.println("Dormir");
				}
				break;
			
			case 2: //Calle 2
				if(monitor.disparar(1,true)==false)
				{
					//Dormir Sleep()
					System.out.println("Dormir");
				}
				break;
			
			case 3: //Calle 3
				if(monitor.disparar(2,true)==false)
				{
					//Dormir Sleep()
					System.out.println("Dormir");
				}
				break;
			
				default: System.out.println("ERROR DE CALLE DE ENTRADA.");
		}
		
	}
	/*@brieft Descripcion
 	 * Este metodo dispara las transiciones de la barrera, la calle de entrada a los pisos,
 	 * la rampa en el caso de que se haya llenado  el piso 1 y la transicion de estacionar en cada piso.
 	 */
	public void Estacionar () {
		//T3 T5 T4
		Piso = 1;
		switch(calle_entrada)
		{
			case 1: //Calle 1
				
				if(monitor.disparar(3,true)==false)
				{
					//Dormir Sleep()
					System.out.println("Dormir");
				}
				break;
			
			case 2: //Calle 2
				if(monitor.disparar(5,true)==false)
				{
					//Dormir Sleep()
					System.out.println("Dormir");
				}
				break;
			
			case 3: //Calle 3
				if(monitor.disparar(4,true)==false)
				{
					//Dormir Sleep()
					System.out.println("Dormir");
				}
				break;
			
				default: System.out.println("ERROR EN LA BARRERA.");
		}
		
		//T6
		if(monitor.disparar(6,true)==false) {
		     	//Dormir Sleep()
			//T7
			if(monitor.disparar(7,true)==false) {
				System.out.println("Dormir");
			}
			//T9
			if(monitor.disparar(9,true)==false) {
				System.out.println("Dormir");
			}			
			Piso=2;
		}
	}
	/*@brieft Descripcion
 	 * En este metodo se disparan las siguientes transiciones: 
 	 *                                                       la transicion de la rampa en el caso de que un auto salga del piso 2
 	 *                                                       o la transicion de salida del piso 1 y las trasicones de calles de salida.
 	 *                                                   
 	 *                                                       
 	 */
	public void Pagar() {
		//T8 T10 T11 T12 T13
		switch(Piso)
		{
			case 1: //Calle 1
				
				if(monitor.disparar(8,true)==false)
				{
					//Dormir Sleep()
					System.out.println("Dormir");
				}
				break;
			
			case 2: //Calle 2
				if(monitor.disparar(10,true)==false)
				{
					//Dormir Sleep()
					System.out.println("Dormir");
				}
				if(monitor.disparar(11,true)==false)
				{
					//Dormir Sleep()
					System.out.println("Dormir");
				}
				
				break;
		}
		
		Piso= 1;
	   // calle_salida=1;
		switch(calle_salida)
		{
		case 1:
			if(monitor.disparar(12,true)==false)
			{
				//Dormir Sleep()
				System.out.println("Dormir");
			}
			
			break;
		case 2:
			if(monitor.disparar(13,true)==false)
			{
				//Dormir Sleep()
				System.out.println("Dormir");
			}
			
			break;
		}
	}
	/*@brieft Descripcion
 	 * Este metodo dispara la transicion de salida del auto elegidad en el campo calle_de_salida.
 	 */
	public void Salir() {
		//T14 T15
		switch(calle_salida)
		{
		case 1:
			if(monitor.disparar(14,true)==false)
			{
				//Dormir Sleep()
				System.out.println("Dormir");
			}
			
			break;
		case 2:
			if(monitor.disparar(15,true)==false)
			{
				//Dormir Sleep()
				System.out.println("Dormir");
			}
			
			break;
		}
	}
}
