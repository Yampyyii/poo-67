package org.generation.adoptions.interfaces;


/**
 * Interfaz
 *  Es un contrato que las clases que la implementen
 *  deben seguir
 *
 *  Esta construida de puros metodos abstractos (java 8+) pero e todas maneras
 *  lo mas comun es que solo tengan metodos abstracatos
 *
 *  A diferencia d euna clase abstracta, una interfaz no puede tener:
 *  1.- Metodo constructor
 *  2.- Metodos normales
 *  3.- Metodo main
 *
 *  Las interfaces se implementan, eso quiere decir que la palabra recervada para usar es
 *  Implements
 *
 *  Las interfaces si pueden
 *  1.-     Usar multiples interfaces en una clase
 *  2.-     Las interfaces son un contrato general
 */
public interface Adoptable {
    /**
     * Meotodo abstracto , solo describe que hacer
     * pero no nos dice como
     * la clase que implemente la interfaz, va a tener que decidir como se hace lo que se pide
     *
     */
    void adopt();

}
