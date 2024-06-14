
package x3x.uv.mx.consumo.wsdl;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.Action;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 3.0.0
 * Generated source version: 3.0
 * 
 */
@WebService(name = "iProductos", targetNamespace = "http://tempuri.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface IProductos {


    /**
     * 
     * @return
     *     returns x3x.uv.mx.consumo.wsdl.ArrayOfstring
     */
    @WebMethod(action = "http://tempuri.org/iProductos/historialProductos")
    @WebResult(name = "historialProductosResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "historialProductos", targetNamespace = "http://tempuri.org/", className = "x3x.uv.mx.consumo.wsdl.HistorialProductos")
    @ResponseWrapper(localName = "historialProductosResponse", targetNamespace = "http://tempuri.org/", className = "x3x.uv.mx.consumo.wsdl.HistorialProductosResponse")
    @Action(input = "http://tempuri.org/iProductos/historialProductos", output = "http://tempuri.org/iProductos/historialProductosResponse")
    public ArrayOfstring historialProductos();

    /**
     * 
     * @param precio
     * @param nombre
     * @return
     *     returns java.lang.String
     */
    @WebMethod(action = "http://tempuri.org/iProductos/agregarProducto")
    @WebResult(name = "agregarProductoResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "agregarProducto", targetNamespace = "http://tempuri.org/", className = "x3x.uv.mx.consumo.wsdl.AgregarProducto")
    @ResponseWrapper(localName = "agregarProductoResponse", targetNamespace = "http://tempuri.org/", className = "x3x.uv.mx.consumo.wsdl.AgregarProductoResponse")
    @Action(input = "http://tempuri.org/iProductos/agregarProducto", output = "http://tempuri.org/iProductos/agregarProductoResponse")
    public String agregarProducto(
        @WebParam(name = "nombre", targetNamespace = "http://tempuri.org/")
        String nombre,
        @WebParam(name = "precio", targetNamespace = "http://tempuri.org/")
        double precio);

    /**
     * 
     * @param id
     * @return
     *     returns java.lang.String
     */
    @WebMethod(action = "http://tempuri.org/iProductos/solicitarProducto")
    @WebResult(name = "solicitarProductoResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "solicitarProducto", targetNamespace = "http://tempuri.org/", className = "x3x.uv.mx.consumo.wsdl.SolicitarProducto")
    @ResponseWrapper(localName = "solicitarProductoResponse", targetNamespace = "http://tempuri.org/", className = "x3x.uv.mx.consumo.wsdl.SolicitarProductoResponse")
    @Action(input = "http://tempuri.org/iProductos/solicitarProducto", output = "http://tempuri.org/iProductos/solicitarProductoResponse")
    public String solicitarProducto(
        @WebParam(name = "id", targetNamespace = "http://tempuri.org/")
        int id);

}
