package org.generation.adoptions.exceptions;


/**
 *
 *Una excepxion e sun evento que ocurre xuando se ejecuta el codigo
 * que interrumpe la ejecucion de nuestro programa, es codigo que esta mal
 * Por ejemplo : divicion entre 0, acceder a un indice que no existe
 *
 * <h3> punto simportantes</h3>
 * <ol>
 *     <li>1. Cuando ocurre una excepcion se corta la ejecucion
 *     del programa
 *     </li>
 *      <li>
 *          2. Para evitar que se termine la ejecucion que ocupamos
 *          un bloque try catch
 *      </li>
 * </ol>
 *
 * <p>
 *  Podemos crear excepcione spersonalizadas a partir de la clase exception de java
 * </p>
 */

public class invalidData extends Exception{

    /**
     * Metodo constrcutor donde pedimos el mensaje para lanzar la exception,
     * <p>
     * estamos usando la clase Exception de Java la cual nos brinda la capaciodad
     * de hacer excepciones basicas personalizadas.
     * </p>
     *
     * @param message - type String y va a aparecer si ocurre la excepcion
     */

    public invalidData(String message) {
        super(message);
    }
}
