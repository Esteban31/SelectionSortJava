package OrdenacionBurbuja;

public class ArregloBurbuja {
       private long[] arr;              //Arreglo a ordenar

       private int numElementos;        //Cantidad de datos en el array

    public ArregloBurbuja(int tamano) {
        arr = new long[tamano];
        numElementos = 0;
    }
    
    public void insertar(long dato){
       arr[numElementos]  = dato;
       numElementos++;                  //incrementar en 1 numero de elementos en el array                    
    }
   
   public void ordenacionBurbuja(){
       int i, j;                         //Variables aux para la comparación
       /**
       * j = inicia en el ultimo indice del arreglo, y se mueve una posicion a la izquierda
       * en cada iteracion.
       * i = se mover desde la posicion 0 hasta la posicion j-1
       **/
       for(j=numElementos-1; j>0;j-- ){
           for(i=0;i<j;i++){
               if(arr[i] > arr[i+1]){            //si el elemento en la posicion i es mayor que la
                   long temp = arr[i];                              //que la posicion i+1 intercambie las posiciones
                   arr[i] = arr[i+1];                                //crear una var tempo el elemento de la posicion i
                   arr[i+1] = temp;
               }
           }
       }
   }
    
   public void ordenacionPorSeleccion(){
   int i, j, pos; 
   long temp, menor;
    
          for (i = 0; i < this.arr.length - 1; i++) {      // tomamos como menor el primero
              menor = this.arr[i];                       // de los elementos que quedan por ordenar                    
                pos = i;                            // y guardamos su posición
                
                
                for (j = i + 1; j < this.arr.length; j++){ // buscamos en el resto
   
                    //System.out.print("\t" + arr[j]);
                    if (this.arr[j] < menor) {           // del array algún elemento
                          menor = this.arr[j];             // menor que el actual
                          pos = j;
                        
                      }
                
                }
                if (pos != i){                      // si hay alguno menor se intercambia                         
                    temp = this.arr[i];
                    this.arr[i] = this.arr[pos];
                    this.arr[pos] = temp;
                }
                    printArray(this.arr);
          }
          System.out.println("Array ordenado");
          printArray(arr);
          
   }
     
   public void mostrarElementos(){
       for(int j=0; j<numElementos; j++){
          System.out.println(arr[j]); 
       }
       System.out.println("");		
   } 
    
   	public void printArray(long[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%d \t", arr[i]);
		}
		System.out.println();
	}
       
    
}
