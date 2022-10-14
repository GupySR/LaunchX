package Unidad3;

public class ColaInt {
    // 3 atributos
    private int c[]; // Vector de ENTEROS
    private int frente, fin; // Apuntadores para el frente y final de la estructura

    public ColaInt() {  //1er.Constructor que crea el vector, almacenar 5 elementos
        c = new int[5];
        frente = 0;
        fin = -1;
    }

    public ColaInt(int n) { //2do.Cinstructor que crea la estructura con el numero de elementos n que se recibe como parametro
        c = new int[n];
        frente = 0;
        fin = -1;
    }

    public boolean estaVacia() {//Metodo para determinar si esta vacia
        if (frente > fin)
            return true;
        else
            return false;
    }

    public int[] getC() {
        return c;
    }

    public void setC(int[] c) {
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

    public void insertar(int x) {//Metodo insertar el elemento x(entero) en la fila. Solo se modifica el fin
        if (!estaLlena()) {
            fin++;
            c[fin] = x;
        }
    }

    public int eliminar() {//Metodo para eliminar el elemento que se encuentre en el frente de la estructura, si no hay datos, devuelve un valor centinela -99999
        int borrado = -99999;
        if (!estaVacia()) {
            borrado = c[frente];
            c[frente] = 0;
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

    public int elementoEnFrente() {// Metodo que devuelve el elemento del frente, NO LO ELIMINA solo lo devuelve dicho valor. Si no hay elementos, devuelve un valor especial -99999
        if (estaVacia())
            return -99999;
        else
            return c[frente];
    }

    public int elementoEnFin(){
        if(!estaVacia())
        {
            return c[fin];
        }
        else
            return -99999;
    }

    public String toString() {// 
        String s = "";
        for (int i = frente; i <= fin; i++)
            s += c[i] + "\n";
        return s;
    }

}
