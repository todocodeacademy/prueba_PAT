package helloworld;
public class HelloWorld {

    public static void main(String[] args) {
        
      int suma = 0;
      int num = 2;
      int resta = 0;
      int bloqueif = 0;
      
      if (num > 3) {
          suma = num + num;
          System.out.println("El resultado es: " + suma);
          bloqueif = 1;
      }
      
      if (num <=3){ 
          resta = 15 - num;
          System.out.println("El resultado es: " + resta);
          bloqueif = 2;
      }
      
        System.out.println("El bloque if al que entré fue el: " + bloqueif);
        
        
    }
    
}
