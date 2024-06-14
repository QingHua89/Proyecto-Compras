
package uv.mx.clienteGeneral;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import x2x.uv.mx.consumo.wsdl.MostrarPresupuestos;
import x2x.uv.mx.consumo.wsdl.MostrarPresupuestosResponse;
import xx.uv.mx.consumo.wsdl.CreateFactura;
import xx.uv.mx.consumo.wsdl.CreateFacturaResponse;
import xx.uv.mx.consumo.wsdl.Factura;

public class ClienteGeneralCliente extends WebServiceGatewaySupport {

    public CreateFacturaResponse solicitarFactura(String descripcionFactura) {
        CreateFactura solicitud = new CreateFactura();
        Factura factura = new Factura();
        factura.setDescripcion(descripcionFactura);
        solicitud.setFactura(factura);

        CreateFacturaResponse respuesta = (CreateFacturaResponse) getWebServiceTemplate().marshalSendAndReceive(
                "http://localhost:8080/ws/facturas", solicitud,
                new SoapActionCallback(""));
        System.out.println("Solicitando Factura....Espere");
        System.err.println("Hola");
        return respuesta;
    }

    public MostrarPresupuestos solicitarPresupuesto(String presupuesto) {
        MostrarPresupuestos solicitud2 = new MostrarPresupuestos();
        solicitud2.toString();
        MostrarPresupuestosResponse respuesta2 = (MostrarPresupuestosResponse) getWebServiceTemplate()
                .marshalSendAndReceive(
                        "http://localhost:8080/ws/presupuestos", solicitud2,
                        new SoapActionCallback(""));
        System.out.println("Solicitando Presupuesto....Espere");
        // System.err.println("Hola");
        return solicitud2;
    }
}
