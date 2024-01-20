package com.programandoenjava.parte1;

public class Parte1 {

    /**
     * Escribe un programa en Java que reciba una cadena de texto y devuelva la
     * misma cadena pero con cada palabra invertida. Por ejemplo, para la entrada
     * "Hola Mundo",
     * la salida debería ser "aloH odluM".
     * 
     * @param cadena cadena de entrada
     * @return cadena invertida
     */
    public String invertirPalabras(final String cadena) {
        if (cadena == null) {
            return "";
        }
    
        String resultado = "";
        String palabra = "";
    
        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
    
            if (Character.isLetterOrDigit(c)) {
                palabra = c + palabra;
            } else {
                resultado += palabra + c;
                palabra = "";
            }
        }
    
        return resultado + palabra;
    }
}
