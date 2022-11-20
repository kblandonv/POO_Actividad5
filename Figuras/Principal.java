package Figuras;

/**
 * Esta clase define el punto de ingreso al programa de figuras
 * geométricas. Por lo tanto, cuenta con un método main de acceso al
 * programa.
 */

public class Principal {
    /**
     * Método main que sirve de punto de entrada al programa
     */
    public static void main(String[] args) {
        FramePrincipal miFramePrincipal; /* Define la ventana principal */
        miFramePrincipal= new FramePrincipal(); /* Crea la ventana principal */
        miFramePrincipal.setVisible(true); /* Establece la ventana como visible */
        // Establece que la ventana no puede cambiar su tamaño
        miFramePrincipal.setResizable(false);
    }
}
