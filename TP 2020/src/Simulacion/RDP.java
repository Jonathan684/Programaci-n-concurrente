package Simulacion;


import java.io.File;

import java.io.IOException;

import java.util.Scanner;

//import java.io.File;
//import java.util.Scanner;
public class RDP {
	//Deficiones
	/*public enum Vectores_RDP {
		eVE,
		eVMI,
		eVMN,
		eVMA
	}*/
	/*-----------d------Red de petri----------------------*/
	//Matriz de incidencia
	// Campos
	/*private static final int numeroTransiciones = 15;
    private static final int numeroPlazas = 16;*/
	  
		/*private int [][] I; ={{1, -1,	 0,  0,	 0,	 0,	 0,	 0,	 0,	 0,	 0,	 0,	 0,	 0,	 0,	 0,	 0,	 0}, //0
							{0, -1,	 0, -1,	 0, -1,	 0,	 0,	 0,	 0,	 1,	 0,	 0,	 0,	 0,	 0,	 1,	 0}, //1
			                {0,  0,	 0,	 0,	 0,	 0,	 0,	 0,	 0,	 0,	 0,	 0,	 0,	 0,	 1,	-1,	 0,	 0}, //2
			                {0,  0,	 0,	 0,	 0,	 0, -1,	 0,	 0,	 0,	 0,	 0,	 0,	 0,	 0,	 0,	 1,	 0}, //3
			                {0,	 0,	 0,	 0,	 0,  0,	-1,	 1,	 0,	 0,	 0,	 0,	 0,	 0,	 0,	 0,	 0,	 0}, //4
			                {0,	 1,	 0,	 1,	 0,	 1,	 0,	 0,	 0,	 0, -1,	 0,	 0,	 0,	 0,	 0, -1,	 0}, //5
			                {0,	 0,	-1,	 1,	 0,	 0,	 0,	 0,	 0,	 0,  0,	 0,	 0,	 0,	 0,	 0,	 0,	 0}, //6
			                {0,	 0,	 1,	-1,	 0,	 0,	 0,	 0,	 0,	 0,	 0,	 0,	 0,	 0,	 0,	 0,	 0,	 0}, //7
			                {0,	 0,	 0,	 0,	-1,	 1,	 0,	 0,	 0,	 0,	 0,	 0,	 0,	 0,	 0,	 0,	 0,	 0}, //8
			                {0,	 0,	 0,  0,	 1,	-1,	 0,	 0,	 0,	 0,	 0,	 0,	 0,	 0,	 0,	 0,	 0,	 0}, //9
			                {-1, 0,	-1,	 0,	-1,	 0,	 0,	 0,	 0,	 0,	 0,	 0,	 0,	 1,	 0,	 1,	 0,	 0}, //10
			                {0,  0,	 0,	 0,	 0,	 0,	 1,	-1,	 0,	 0,	 0,	 0,	 0,	 0,	 0,	 0,	 0,	 0}, //11
			                {0,	 0,	 0,	 0,	 0,	 0,	 0,	 1,	 0,	 0,	 0,	 0,	 0,	 0,	 0,	 0,	 0,	-1}, //12
			                {0,	 0,	 0,	 0,	 0,	 0,	 1,	 0,	 0,	 0,	 0,	 0,	 0,	 0,	 0,	 0, -1,	 0}, //13
			                {0,	 0,	 0,	 0,	 0,	 0,	 0,	-1,	 0,	 0,	 0,	 0,	 0,	 0,	 0,	 0,	 0,	 1}, //14
			                {0,	 0,	 0,	 0,	 0,	 0,	 0,	 0,	 0,	 0,	 0,	 1,	-1,	 0, -1,	 0,	 0,	 1}, //15
			                {0,	 0,	 0,	 0,	 0,	 0,	 0,	 0,	 0,	 0,	 0,	-1,	 1,	 0,	 1,	 0,	 0,	-1}, //16
			                {0,	 0,	 0,	 0,	 0,	 0,	 0,	 0,	 1,	-1,	 0,	 0,	 0,	 0,	 0,	 0,	 0,  0}, //17
			                {-1, 1,	 0,	 0,	 0,	 0,	 0,	 0,	 0,	 0,	 0,	 0,	 0,	 0,	 0,	 0,	 0,	 0}, //18
			                {0,	 0,	 0,	 0,	 0,	 0,	 0,	 0,	-1,	 1,	 0,	 0,  0,	 0,	 0,	 0,	 0,	 0}, //19
			                {0,	 0,	 0,	 0,	 0,	 0,	 0,	 0,	 0,	 0,	-1,	 1,	 0,	 0,	 0,	 0,	-1,  1}, //20
			                {0,	 0,	 0,	 0,	 0,	 0,	 0,	 0,	 0,	 0,	 1,	-1,	 0,	 0,	 0,	 0,	 0,	 0}, //21
			                {0,	 0,	 0,	 0,	 0,	 0,	 0,	 0,	 0,	 0,	-1,	 1,	 0,	 0,	 0,	 0,  0,	 0}, //22
			                {0,	 0,	 0,	 0,	 0,	 0,	 0,  0,	 0,	 0,	 0,	 0,	-1,	 1,	-1,	 1,	 0,	 0}, //23
			                {0,	 0,	 0,	 0,	 0,	 0,	 0,	 0,	 0,	 0,	 0,	 0,	 1,	-1,	 0,	 0,	 0,	 0}};//24*/

	///////////////////////////////////////////////////////////////////////////////////////////////////////////77
		/*private int [][] MVS;=  {{1, 0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0}, //0  
	                           {0,  1,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0}, //1   
	                           {0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  1,  0,  0,  0,  0,  0,  0,  0},	//2						   //2	
	                           {0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  1,  0,  0,  0,  0,  0,  0},	//3						   //3	
	                           {0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  1,  0,  0,  0,  0,  0}, //4                            //4
	                           {0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  1,  0,  0,  0,  0}, //5							   //5
	                           {0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  1,  0,  0,  0},	//6		  
	                           {0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  1,  0,  0},	//7						   //7
	                           {0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	1,	0},	//8	 					   //8
	                           {0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	1},	//9						   //9
	                           {0,	0,	1,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0},	//10						   //10
	                           {0,	0,	0,	1,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0},	//11						   //11
	                           {0,	0,	0,	0,	1,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0},	//12						   //12
	                           {0,  0,	0,	0,	0,	1,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0},	//13						    //13
	                           {0,	0,	0,	0,	0,	0,	1,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0},	//14						    //14
	                           {0,	0,	0,	0,	0,	0,	0,	1,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0},	//15							//15
	                           {0,	0,	0,	0,	0,	0,	0,	0,	1,	0,	0,	0,	0,	0,	0,	0,	0,	0},	//16							//16
	                           {0,	0,	0,	0,	0,	0,	0,	0,	0,	1,	0,	0,	0,	0,	0,	0,	0,	0}};//17	*/								//17
	///////////////////
		    
 
		/////////Marcado inicial/////////////////////////////////////////////////////////
	private int [][] I;
	private int [][] MVS;
	private int [] VMI; //VECTOR DE MARCADO ACTUAL
    private int [] VMA; //VECTOR DE MARCADO INICIAL
    private int [] VMN; //VECTOR DE MARCADO NUEVO   
    private int [] VE;
    					
    //private int [] VE  = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}; // Indica el numero de transciones sensibilizadas
    private String[] Place = {"P0","P1","P10","P11","P12","P13","P14","P15","P16","P17","P18","P19","P2","P20","P21","P22","P23","P3","P4","P5","P6","P7","P8","P9"};
// private int [] Places = {0,1,10,13,14,15,17,18,19,20,22,23,24,25,26,27,28,29,3,30,31,4,5,8,9};
    
    
    private final int numeroTransiciones;
    private final int numeroPlazas;

	private Scanner input;
    
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    //EL VALOR ACTUAL ES IGUAL AL INICIAL
	////Constructor 
	public RDP() {
		
		numeroTransiciones = Transiciones("M.I.txt");  //Extraccion de la cantidad de transiciones.
		numeroPlazas = Plazas("M.I.txt"); //Extraccion de la cantidad de plazas.
		I = Cargar_Matriz("M.I.txt" ,numeroPlazas,numeroTransiciones); //Carga la matriz de incidencia.
		VMI = Vector_Marcado_Inicial("VMI.txt", numeroPlazas); //Carga del vector de marcado inicial.
		VMN = Vector_Marcado(numeroPlazas); // Inicio del vector de marcado nuevo.
		VMA = Vector_Marcado(numeroPlazas); // Inicio del vector de marcado actual.
    	VE  = Vector_Sensilibizado(numeroTransiciones);
		MVS = Matriz_Sensibilizada("Transiciones.txt" , numeroTransiciones);// Armado de la matriz de vectores sensibilizados.
		Calcular_VMA();
		Calcular_VE();
		//ver_matriz(I,numeroPlazas);
		//ver_matriz(MVS,numeroTransiciones);
		
	}
	/*
	 *@brief
	 * Este metodo devuelve la cantidad de transiciones disponible en la red
	 * @param Matriz : Matriz de incidencia
	 *      
	 */
	public int Transiciones(String Matriz){
			int transiciones = 0;
				try { 
					input = new Scanner(new File(Matriz));
						while (input.hasNextLine()) {
							String line = input.nextLine();
							for (int fila = 0 ; fila <line.length (); fila ++) {
							char c = line.charAt (fila);
							if(c == '1' || c == '0') {
     		                 transiciones ++ ;
     		               //  System.out.println("Transiciones : " + transiciones + " c : "+ c);
     		                      }
                             }
							break;
		                }
		            } 
		      catch (IOException e) {
                     e.printStackTrace();
                    }
		 return transiciones;
	 }
	/*
	 *@brief
	 * Este metodo devuelve la cantidad de plazas disponible en la red
	 * @param Matriz : Matriz de incidencia
	 *      
	 */
	public int Plazas(String Matriz) {
		int Plazas = 0;
		try { 
			input = new Scanner(new File(Matriz));
				while (input.hasNextLine()) {
					   input.nextLine();
		               Plazas ++ ;
                }
            } 
      catch (IOException e) {
             e.printStackTrace();
             }
		
		return Plazas;
	}
	/*
	 * 
	 * 
	 */
	public int[][] Matriz_Sensibilizada(String Transiciones , int Transicion) 
	{ 
		int[][] matriz =new int[Transicion][Transicion];
		int n;
		try { 
			input = new Scanner(new File(Transiciones));
				while (input.hasNextLine()) {
				String  line = input.nextLine();
                String[] linea = line.split("	T"); 
                linea[0] = linea[0].substring(1,2); // Se elimino  la T del primer termino T0 
                for(int i = 0 ; i<Transicion ; i++) {
                	for(int j=0 ; j<Transicion ;j++) {
                		matriz[i][j]=0;
                	}
                }
            // Se coloca  1 en la posicion la matriz.
            for(int k = 0 ; k<Transicion ; k++) {
            	n= Integer.parseInt(linea[k]);
                matriz[k][n]=1;
                }
			}
            
        } 
  catch (IOException e) {
         e.printStackTrace();
        }
		//System.out.println("VALOR DE LA MATRIZ EN EL 3 12--->"+matriz[3][12]);
		return matriz;
		
	}
	public int [] Vector_Sensilibizado(int Numero_Transiciones) {
		int [] vmn = new int [Numero_Transiciones];
		for(int i=0 ; i<Numero_Transiciones ; i++) {
			vmn[i]=0;
		}
		
		return vmn;
	}
	/*@ brief
	 * 
	 */
	public int [] Vector_Marcado(int Numero_Plazas) {
		int [] vmn = new int [Numero_Plazas];
		for(int i=0 ; i<Numero_Plazas ; i++) {
			vmn[i]=0;
		}
		
		return vmn;
	}
	/*@ brief
	 * param Vector : vector de marcado inicial 
	 * 
	 */
	public int [] Vector_Marcado_Inicial(String Vector , int Numero_Plazas) {
		int[] vmi = new int[Numero_Plazas];
		try { 
				input = new Scanner(new File(Vector));
					while (input.hasNextLine()) {
					String  line = input.nextLine();
                    String[] linea = line.split("	"); 
                    
		        	for (int columna = 0; columna < Numero_Plazas; columna++) { 
		        		vmi[columna] = Integer.parseInt(linea[columna]);
                    //System.out.print( vmi[columna] + " " );
                }
               
                //System.out.println();
            }
                
            } 
      catch (IOException e) {
             e.printStackTrace();
            }
		return vmi;
	}
	//Metodos
	/*
	 * Calcular_VMA 
	 * Calcular_VE
	 */


    /*@brief
     * Este metodo dispara una transicion de la rdp indicada por parametro, teniendo en cuenta el modo indicado por parametro 
     *@param n_T : numero de transicion. 
     *@param flag indica el modo de disparo: 
     *			 -true : modo de disparo explicito, modifica el vector de marcado actual VMA
     *           -false : modo de disparo implicito, no modifica el vector de marcado actual VMA
     *@return : -0 retorna 0 si el disparo no es exitoso. 
     *          -1 retorna 1 si el disparo no es exitoso.
     */
	public int Disparar(int n_T, boolean flag) {
		int pos_D;
		
		if(flag==true) { //modo explicito
			mostrar(VMA ,1);
		  
			for(int p=0 ; p< I.length ; p++)
			{
					pos_D = Calcular_posD(n_T);
				    VMN[p] = VMA[p]+(I[p][pos_D] * MVS[pos_D][n_T]);
			}
			igualar_vector(VMA , VMN);
			mostrar(VMN ,2 );
		}
	    else {//modo implicito
	    	for(int p=0 ; p< I.length ; p++)
			{
			   	pos_D = Calcular_posD(n_T);
				VMN[p] = VMA[p]+(I[p][pos_D] * MVS[pos_D][n_T]);
			    	if(VMN[p]<0) {
			    		return 0; // no se puede disparae esta transicion retorna 0
			    	}
			} 
	      }
		return 1;
		
	}
	/*
	 * @brief 
	 * Este metodo devuelve la posicion de la fila de la transicion indicada por parametro.
	 * @param n_T : transicion, la cual se desea saber la posición en la matriz sensibilizadas. 
	 */
	public int  Calcular_posD(int n_T) {
		//System.out.println("Valor de n_T : " +n_T);
		for (int i=0 ; i<MVS.length;i++) {
			
				if(MVS[i][n_T] == 1)
				{
					//System.out.println("Posicion donde encontro el 1: "+i);
					return i;
				}
			
		}
		return 0;
	}
	/*
	 * @brief
	 * 
	 */
	public void igualar_vector(int [] vector1 , int [] vector2) {
		
		for(int n=0 ; n<vector1.length;n++) {
			vector1[n]=vector2[n];
			}
	}
	/*
	 * @brief 
	 * Este metodo inicializa el vector de marcado actual (VMA)
	 */
	public void Calcular_VMA(){
		 for (int i=0 ; i<VMA.length ; i++)
	   {
		
		   VMA[i]=VMI[i];
	   }
	}
	
	/*
	 * @brief 
	 * Este metodo calcula las transiciones sensibilizadas de rdp (VE)
	 */
	public void Calcular_VE() {
		boolean v = false;
		int pos_D;
           for (int i=0 ; i<numeroTransiciones ; i++) // I[0].length
		    {
        	 pos_D=Calcular_posD(i);
        	 
			  VE[pos_D] = Disparar(i,v); 
		    }
           /*System.out.println("\nvector de sensibilizado :");
		   mostrar(VE,0);*/
	}
	/*
	 * @brief 
	 * Este metodo muestra el vector indicado por parametro 
	 * @param vector : vector a imprimir. 
	 */
	 
	public void mostrar(int[] vector ,int Tipo) {
		    System.out.println("\n");
			if(Tipo == 0) {
				String [] t = {"T0","T1","T10","T11","T12","T13","T14","T15","T16","T17","T18","T2","T3","T4","T5","T6","T7","T8","T9"};
				for(int n=0 ; n<vector.length ; n++) System.out.print(t[n] +":" + vector[n] +" ");
				}
			else if(Tipo > 0) {
				
				for(int n=0 ; n<vector.length ; n++) System.out.print(Place [n] +":" + vector[n] +" ");
		        }
	}
	
	/*
	 * @brief 
	 * Este metodo calcula las transiciones sensibilizadas de rdp (VE)
	 * @param transicion : transicion la que se desea saber si está habilitada o no. 
	 */
    public boolean Habilitada(int transicion) {
    	int pos_D;
    	 Calcular_VE();
    	 pos_D=Calcular_posD(transicion);
    	 //VE[pos_D] = Disparar(i,v); 
    	if(VE[pos_D]==1) {
    		return true;
    	}
    	else return false;
    	
    }
    /*
     * @brief
     * Este metodo retorna la cantidad de tokens en una plaza especifica
     * @param plaza : plaza en la que se desea saber los tokens.
     */
	public int numero_de_Tokens(int plaza) {
		
		/*for(int n=0 ; n< Places.length ; n++) {
		        if(Places[n] == plaza) {
		        	return VMA[n];
		        }
		}*/
		return 0;
	}
	
	
	
	
	/*
	 *@brief
	 * Este metodo devuelve la cantidad de plazas disponible en la red
	 * @param Matriz : Matriz de incidencia
	 *      
	 */
	private int[][] Cargar_Matriz(String Matriz , int numeroFilas, int numeroColumnas) {
	
		 int[][] matriz = new int[numeroFilas][numeroColumnas];
		 int fila=0;
		 try { 
				input = new Scanner(new File(Matriz));
					while (input.hasNextLine()) {
						String  line = input.nextLine();
                        String[] linea = line.split("	"); 
			        	for (int columna = 0; columna < numeroTransiciones; columna++) { 
	                    matriz[fila][columna] = Integer.parseInt(linea[columna]);
	                   // System.out.print( matriz[fila][columna] + " " );
	                }
	                fila ++;
	               // System.out.println();
	            }
	                
	            } 
	      catch (IOException e) {
	             e.printStackTrace();
	            }
	        return matriz;
        }
	public void ver_matriz(int [][] Matriz, int numero) {
		System.out.println("\nIMPRIMIR");
		for (int j = 0;j<numero;j++) {
		for (int i = 0;i<numeroTransiciones;i++) {
		System.out.print(Matriz[j][i] + "   ");
		}
		System.out.println();
	}
		System.out.println("##########################");
	}
	
}
