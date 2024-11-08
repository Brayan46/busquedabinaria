
package trabajobusquedabinaria;

public class TrabajoBusquedaBinaria {

    
    public static void main(String[] args) {
       
        int A[]= {4,6,8,10,12,15,16,19,22,28};

        int pos= TrabajoBusquedaBinaria(A, 6);
        
        if(pos == -1){
            System.out.println("El valor no se encuentra");   
        }else{
            System.out.println("El dato se encuentra en la posicion "+pos);
        }
    }
    
    public static int TrabajoBusquedaBinaria(int [] A, int dato){
        int inicio,fin,mitad;
        inicio = 0;
        fin = A.length - 1;
        
        while(inicio <= fin){
            mitad =(inicio + fin)/2;
            if(A[mitad] == dato){
                return mitad;
            }else if (A[mitad] < dato){
                inicio = mitad +1;
            }else {
                fin = mitad -1;
            }  
        }
        
        return-1; 
    }
}
