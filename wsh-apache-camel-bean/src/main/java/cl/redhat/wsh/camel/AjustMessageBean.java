package cl.redhat.wsh.camel;

import org.apache.camel.Exchange;

/**
 * Clase bean que permite incorporar información al header del mensaje
 * @author Cristian Quezada
 * @since 24/04/2015
 * @version 1.0 
 */
public class AjustMessageBean {
	
	/**
	 * Permite incorporar un parametro al header
	 * @param Exchange Escenario de intercambio de endpoint
	 * @return retorna el cuerpo del mensaje de intercambio
	 */	
	public String ajustNullsValues(Exchange exchange){
		String message = exchange.getIn().getBody().toString();
		
		exchange.getIn().setHeader("new-state-attribute", 233);
		
		return message;
	}
}