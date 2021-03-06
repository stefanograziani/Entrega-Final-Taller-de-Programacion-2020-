
package publicar;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "CanjeInvalidoException", targetNamespace = "http://publicar/")
public class CanjeInvalidoException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private CanjeInvalidoException faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public CanjeInvalidoException_Exception(String message, CanjeInvalidoException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public CanjeInvalidoException_Exception(String message, CanjeInvalidoException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: publicar.CanjeInvalidoException
     */
    public CanjeInvalidoException getFaultInfo() {
        return faultInfo;
    }

}
