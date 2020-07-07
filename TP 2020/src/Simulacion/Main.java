package Simulacion;

public class Main {
     
    /*Campos
     * 
     * 
     */ 
	
	//static int Calle = 1; 
	static int Calle = 2;
	private static Thread auto1;
	//private static Thread auto2;
	//private static Thread auto3;
   /*Constructor
    * 
    */
	public static void main(String[] args) throws InterruptedException { //throws InterruptedException para saber cuando termino el hilo
		
		Monitor monitor = new Monitor();
       
        auto1 = new Thread(new Auto(monitor,Calle));
        auto1.start();
        auto1.join();
   
       System.out.println("\nfin");
    }
    /*Metodos
     * 
     */
	public void fin(){
	
	}
 }
