
package x2x.uv.mx.consumo.wsdl;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.xml.ws.Service;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;
import jakarta.xml.ws.WebServiceException;
import jakarta.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 3.0.0
 * Generated source version: 3.0
 * 
 */
@WebServiceClient(name = "iPresupuesto", targetNamespace = "http://tempuri.org/", wsdlLocation = "file:/C:/Users/Carlo/Downloads/clienteGeneral/src/main/resources/Presupuesto.wsdl")
public class IPresupuesto_Service
    extends Service
{

    private final static URL IPRESUPUESTO_WSDL_LOCATION;
    private final static WebServiceException IPRESUPUESTO_EXCEPTION;
    private final static QName IPRESUPUESTO_QNAME = new QName("http://tempuri.org/", "iPresupuesto");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/C:/Users/Carlo/Downloads/clienteGeneral/src/main/resources/Presupuesto.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        IPRESUPUESTO_WSDL_LOCATION = url;
        IPRESUPUESTO_EXCEPTION = e;
    }

    public IPresupuesto_Service() {
        super(__getWsdlLocation(), IPRESUPUESTO_QNAME);
    }

    public IPresupuesto_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), IPRESUPUESTO_QNAME, features);
    }

    public IPresupuesto_Service(URL wsdlLocation) {
        super(wsdlLocation, IPRESUPUESTO_QNAME);
    }

    public IPresupuesto_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, IPRESUPUESTO_QNAME, features);
    }

    public IPresupuesto_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public IPresupuesto_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns IPresupuesto
     */
    @WebEndpoint(name = "BasicHttpBinding_iPresupuesto")
    public IPresupuesto getBasicHttpBindingIPresupuesto() {
        return super.getPort(new QName("http://tempuri.org/", "BasicHttpBinding_iPresupuesto"), IPresupuesto.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IPresupuesto
     */
    @WebEndpoint(name = "BasicHttpBinding_iPresupuesto")
    public IPresupuesto getBasicHttpBindingIPresupuesto(WebServiceFeature... features) {
        return super.getPort(new QName("http://tempuri.org/", "BasicHttpBinding_iPresupuesto"), IPresupuesto.class, features);
    }

    private static URL __getWsdlLocation() {
        if (IPRESUPUESTO_EXCEPTION!= null) {
            throw IPRESUPUESTO_EXCEPTION;
        }
        return IPRESUPUESTO_WSDL_LOCATION;
    }

}
