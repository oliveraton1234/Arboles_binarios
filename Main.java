package Main;

/**
 *
 * @author Atom
 */
 
public class Main {
    public static void main(String[] args) {
        Arbol arbolito = new Arbol();
        arbolito.insertar(40);
        arbolito.insertar(30);
        arbolito.insertar(20);
        arbolito.insertar(60);
        arbolito.insertar(70);
        arbolito.insertar(50);
        arbolito.insertar(70);
        arbolito.encontrar(80);
        
        
        arbolito.inorder();
        arbolito.borrar(70);        
        System.out.println("bang");
        arbolito.encontrar(70);
        arbolito.inorder();
    }
    
}
