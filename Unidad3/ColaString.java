package Unidad3;

public class ColaString {
     // 3 atributos
     private String c[]; // Vector de ENTEROS
     private int frente, fin; // Apuntadores para el frente y final de la estructura
 
     public ColaString() {  //1er.Constructor que crea el vector, almacenar 5 elementos
         c = new String[5];
         frente = 0;
         fin = -1;
     }
 
     public ColaString(int n) { //2do.Cinstructor que crea la estructura con el numero de elementos n que se recibe como parametro
         c = new String[n];
         frente = 0;
         fin = -1;
     }
 
     public boolean estaVacia() {//Metodo para determinar si esta vacia
         if (frente > fin)
             return true;
         else
             return false;
     }
 
     public String[] getC() {
         return c;
     }
 
     public void setC(String[] c) {
         this.c = c;
     }
 
     public int getFrente() {
         return frente;
     }
 
     public void setFrente(int frente) {
         this.frente = frente;
     }
 
     public int getFin() {
         return fin;
     }
 
     public void setFin(int fin) {
         this.fin = fin;
     }
 
     public boolean estaLlena() {//Metodo para determinar si esta llena
         if (fin == c.length - 1)
             return true;
         else
             return false;
     }
 
     public void insertar(String x) {//Metodo insertar el elemento x(entero) en la fila. Solo se modifica el fin
         if (!estaLlena()) {
             fin++;
             c[fin] = x;
         }
     }
 
     public String eliminar() {//Metodo para eliminar el elemento que se encuentre en el frente de la estructura, si no hay datos, devuelve un valor centinela -99999
         String borrado = "";
         if (!estaVacia()) {
             borrado = c[frente];
             c[frente] = "";
             frente++;
             if (estaVacia()) { // si al eliminar un dato, la fila queda VACÍA, se ajustan los
                 frente = 0; // apuntadores para reutilizar las casillas del principio
                 fin = -1; // y optimizar espacio
             }
         }
         return borrado;
     }
 
     public int numElementos() {// Metodo que devuelve la cantidad de elementos
         return fin - frente + 1;
     }
 
     public String elementoEnFrente() {// Metodo que devuelve el elemento del frente, NO LO ELIMINA solo lo devuelve dicho valor. Si no hay elementos, devuelve un valor especial -99999
         if (estaVacia())
             return "";
         else
             return c[frente];
     }
 
     public String elementoEnFin(){
         if(!estaVacia())
         {
             return c[fin];
         }
         else
             return "";
     }
 
     public String toString() {// 
         String s = "";
         for (int i = frente; i <= fin; i++)
             s += c[i] + "\n";
         return s;
     }
 
    
}
