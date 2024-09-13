/**
 * Clase interface contribuyente.
 * @author Mateo Garrido Rios
 * @since 2024.
 */

package co.edu.uniquindio.services;



/**
 * La interfaz Contribuyente define el contrato para las clases
 * que implementan la funcionalidad de contribuir de alguna manera.
 */
public interface IContribuyente {
    /**
     * Realiza una contribución específica.
     * @return un String que describe la contribución realizada.
     */
    String contribuir();
}