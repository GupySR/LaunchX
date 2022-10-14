package Unidad3;

import javax.swing.JOptionPane;

public class U3Practica1 {
    public static ColaString singular = new ColaString(12);
    public static ColaString plural = new ColaString(12);
    public static String menu = "\n1.Leer una palabra" +
            "\n2.Mostrar palabras en singular" +
            "\n3.Mostrar palabras en plural" +
            "\n4.Eliminar una palabra singular" +
            "\n5.Eliminar una palabra plural" +
            "\n6.Cantidad de palabras" +
            "\n7.Palabra plural del final" +
            "\n8.Terminar";

    public static void main(String[] args) {
        int opcion;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, menu));
            switch (opcion) {
                case 1:
                    String palabra = JOptionPane.showInputDialog(null, "Ingrese la palabra");
                    if (palabra.endsWith("s" )||palabra.endsWith("S" ))
                    {
                        if(!plural.estaLlena())
                        plural.insertar(palabra);
                        else 
                        JOptionPane.showMessageDialog(null, "LA PILA ESTA LLENA");
                    }
                    else
                    {
                        if(!singular.estaLlena())
                        singular.insertar(palabra);
                        else
                        JOptionPane.showMessageDialog(null, "LA PILA ESTA LLENA");
                    }
                       
                    break;

                case 2:
                    JOptionPane.showMessageDialog(null, singular.toString());
                    break;

                case 3:
                    JOptionPane.showMessageDialog(null, plural.toString());
                    break;

                case 4:
                    if(!singular.estaVacia())
                    JOptionPane.showMessageDialog(null,singular.eliminar());
                    else 
                    JOptionPane.showMessageDialog(null, "LA PILA ESTA VACIA");
                    break;

                case 5: 
                    if(!plural.estaVacia())
                    JOptionPane.showMessageDialog(null,plural.eliminar());
                    else 
                    JOptionPane.showMessageDialog(null, "LA PILA ESTA VACIA");
                    break;

                case 6:
                    JOptionPane.showMessageDialog(null,
                            "Cantidad de Palabras: " + (singular.numElementos() + plural.numElementos()));
                    break;
                case 7:
                    JOptionPane.showMessageDialog(null, "La palabra final es: " + plural.elementoEnFin());
                    break;
            }
        } while (opcion != 8);
    }

}
