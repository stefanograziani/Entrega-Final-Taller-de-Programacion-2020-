
package publicar;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "UsuarioAgregarDatosInvalidosException", targetNamespace = "http://publicar/")
public class UsuarioAgregarDatosInvalidosException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private UsuarioAgregarDatosInvalidosException faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public UsuarioAgregarDatosInvalidosException_Exception(String message, UsuarioAgregarDatosInvalidosException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public UsuarioAgregarDatosInvalidosException_Exception(String message, UsuarioAgregarDatosInvalidosException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: publicar.UsuarioAgregarDatosInvalidosException
     */
    public UsuarioAgregarDatosInvalidosException getFaultInfo() {
        return faultInfo;
    }

}
