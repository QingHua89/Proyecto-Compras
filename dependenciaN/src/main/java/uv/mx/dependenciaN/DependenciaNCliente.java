package uv.mx.dependenciaN;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import xx.uv.mx.consumo.wsdl.ActualizarFacturaRequest;
import xx.uv.mx.consumo.wsdl.ActualizarFacturaResponse;
import xx.uv.mx.consumo.wsdl.ActualizarPresupuestoRequest;
import xx.uv.mx.consumo.wsdl.ActualizarPresupuestoResponse;
import xx.uv.mx.consumo.wsdl.ConsultarFacturaRequest;
import xx.uv.mx.consumo.wsdl.ConsultarFacturaResponse;
import xx.uv.mx.consumo.wsdl.ConsultarPresupuestoRequest;
import xx.uv.mx.consumo.wsdl.ConsultarPresupuestoResponse;
import xx.uv.mx.consumo.wsdl.CrearFacturaRequest;
import xx.uv.mx.consumo.wsdl.CrearFacturaResponse;
import xx.uv.mx.consumo.wsdl.CrearPresupuestoRequest;
import xx.uv.mx.consumo.wsdl.CrearPresupuestoResponse;
import xx.uv.mx.consumo.wsdl.RegistrarCompraRequest;
import xx.uv.mx.consumo.wsdl.RegistrarCompraResponse;

public class DependenciaNCliente extends WebServiceGatewaySupport {

    public String crearPresupuesto(String detallePresupuesto) {
        CrearPresupuestoRequest request = new CrearPresupuestoRequest();
        request.setDetallePresupuesto(detallePresupuesto);

        CrearPresupuestoResponse response = (CrearPresupuestoResponse) getWebServiceTemplate()
                .marshalSendAndReceive("http://localhost:8080/ws/compras", request);

        return response.getResultado();
    }

    public String consultarPresupuesto(int idPresupuesto) {
        ConsultarPresupuestoRequest request = new ConsultarPresupuestoRequest();
        request.setIdPresupuesto(idPresupuesto);

        ConsultarPresupuestoResponse response = (ConsultarPresupuestoResponse) getWebServiceTemplate()
                .marshalSendAndReceive("http://localhost:8080/ws/compras", request);

        return response.getPresupuesto();
    }

    public String actualizarPresupuesto(int idPresupuesto, String detallePresupuesto) {
        ActualizarPresupuestoRequest request = new ActualizarPresupuestoRequest();
        request.setIdPresupuesto(idPresupuesto);
        request.setDetallePresupuesto(detallePresupuesto);

        ActualizarPresupuestoResponse response = (ActualizarPresupuestoResponse) getWebServiceTemplate()
                .marshalSendAndReceive("http://localhost:8080/ws/compras", request);

        return response.getResultado();
    }

    public String crearFactura(String detalleFactura) {
        CrearFacturaRequest request = new CrearFacturaRequest();
        request.setDetalleFactura(detalleFactura);

        CrearFacturaResponse response = (CrearFacturaResponse) getWebServiceTemplate()
                .marshalSendAndReceive("http://localhost:8080/ws/compras", request);

        return response.getResultado();
    }

    public String consultarFactura(int idFactura) {
        ConsultarFacturaRequest request = new ConsultarFacturaRequest();
        request.setIdFactura(idFactura);

        ConsultarFacturaResponse response = (ConsultarFacturaResponse) getWebServiceTemplate()
                .marshalSendAndReceive("http://localhost:8080/ws/compras", request);

        return response.getFactura();
    }

    public String actualizarFactura(int idFactura, String detalleFactura) {
        ActualizarFacturaRequest request = new ActualizarFacturaRequest();
        request.setIdFactura(idFactura);
        request.setDetalleFactura(detalleFactura);

        ActualizarFacturaResponse response = (ActualizarFacturaResponse) getWebServiceTemplate()
                .marshalSendAndReceive("http://localhost:8080/ws/compras", request);

        return response.getResultado();
    }

    public RegistrarCompraResponse solicitarCompra(String objeto) {
        RegistrarCompraRequest request = new RegistrarCompraRequest();
        request.setDetalleCompra(objeto);

        RegistrarCompraResponse response = (RegistrarCompraResponse) getWebServiceTemplate()
                .marshalSendAndReceive("http://localhost:8080/ws/compras", request);

        return response;
    }
}
