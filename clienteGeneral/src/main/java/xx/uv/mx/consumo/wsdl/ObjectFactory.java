
package xx.uv.mx.consumo.wsdl;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the xx.uv.mx.consumo.wsdl package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetAllFacturasResponseGetAllFacturasResult_QNAME = new QName("http://tempuri.org/", "GetAllFacturasResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: xx.uv.mx.consumo.wsdl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAllFacturas }
     * 
     */
    public GetAllFacturas createGetAllFacturas() {
        return new GetAllFacturas();
    }

    /**
     * Create an instance of {@link GetAllFacturasResponse }
     * 
     */
    public GetAllFacturasResponse createGetAllFacturasResponse() {
        return new GetAllFacturasResponse();
    }

    /**
     * Create an instance of {@link ArrayOfFactura }
     * 
     */
    public ArrayOfFactura createArrayOfFactura() {
        return new ArrayOfFactura();
    }

    /**
     * Create an instance of {@link GetFacturaById }
     * 
     */
    public GetFacturaById createGetFacturaById() {
        return new GetFacturaById();
    }

    /**
     * Create an instance of {@link GetFacturaByIdResponse }
     * 
     */
    public GetFacturaByIdResponse createGetFacturaByIdResponse() {
        return new GetFacturaByIdResponse();
    }

    /**
     * Create an instance of {@link Factura }
     * 
     */
    public Factura createFactura() {
        return new Factura();
    }

    /**
     * Create an instance of {@link CreateFactura }
     * 
     */
    public CreateFactura createCreateFactura() {
        return new CreateFactura();
    }

    /**
     * Create an instance of {@link CreateFacturaResponse }
     * 
     */
    public CreateFacturaResponse createCreateFacturaResponse() {
        return new CreateFacturaResponse();
    }

    /**
     * Create an instance of {@link UpdateFactura }
     * 
     */
    public UpdateFactura createUpdateFactura() {
        return new UpdateFactura();
    }

    /**
     * Create an instance of {@link UpdateFacturaResponse }
     * 
     */
    public UpdateFacturaResponse createUpdateFacturaResponse() {
        return new UpdateFacturaResponse();
    }

    /**
     * Create an instance of {@link DeleteFactura }
     * 
     */
    public DeleteFactura createDeleteFactura() {
        return new DeleteFactura();
    }

    /**
     * Create an instance of {@link DeleteFacturaResponse }
     * 
     */
    public DeleteFacturaResponse createDeleteFacturaResponse() {
        return new DeleteFacturaResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFactura }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfFactura }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetAllFacturasResult", scope = GetAllFacturasResponse.class)
    public JAXBElement<ArrayOfFactura> createGetAllFacturasResponseGetAllFacturasResult(ArrayOfFactura value) {
        return new JAXBElement<ArrayOfFactura>(_GetAllFacturasResponseGetAllFacturasResult_QNAME, ArrayOfFactura.class, GetAllFacturasResponse.class, value);
    }

}
