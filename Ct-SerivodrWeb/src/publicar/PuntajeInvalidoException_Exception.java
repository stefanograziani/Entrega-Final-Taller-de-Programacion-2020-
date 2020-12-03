
package publicar;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "PuntajeInvalidoException", targetNamespace = "http://publicar/")
public class PuntajeInvalidoException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private PuntajeInvalidoException faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public PuntajeInvalidoException_Exception(String message, PuntajeInvalidoException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public PuntajeInvalidoException_Exception(String message, PuntajeInvalidoException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: publicar.PuntajeInvalidoException
     */
    public PuntajeInvalidoException getFaultInfo() {
        return faultInfo;
    }

}