package aed.excepciones_ejemplo_01;


public class Excepciones_Ejemplo_01 {

    public static void main(String[] args) {
        
        try {          
            int nume = 10, denom = 0, cociente;
            cociente = nume / denom;
            System.out.print("Resultado" + cociente);
            
        } catch (Exception e) {
          System.err.print("Error.");
    }
}   
}
