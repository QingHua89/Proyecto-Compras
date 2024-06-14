package uv.mx.compras;

import java.util.HashMap;
import java.util.Map;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import mx.uv.t4is.compras.ActualizarFacturaRequest;
import mx.uv.t4is.compras.ActualizarFacturaResponse;
import mx.uv.t4is.compras.ActualizarPresupuestoRequest;
import mx.uv.t4is.compras.ActualizarPresupuestoResponse;
import mx.uv.t4is.compras.ConsultarFacturaRequest;
import mx.uv.t4is.compras.ConsultarFacturaResponse;
import mx.uv.t4is.compras.ConsultarPresupuestoRequest;
import mx.uv.t4is.compras.ConsultarPresupuestoResponse;
import mx.uv.t4is.compras.CrearFacturaRequest;
import mx.uv.t4is.compras.CrearFacturaResponse;
import mx.uv.t4is.compras.CrearPresupuestoRequest;
import mx.uv.t4is.compras.CrearPresupuestoResponse;
import mx.uv.t4is.compras.RegistrarCompraRequest;
import mx.uv.t4is.compras.RegistrarCompraResponse;

@Endpoint
public class ComprasEndPoint {

    private static Map<Integer, String> presupuestos = new HashMap<>();
    private static Map<Integer, String> facturas = new HashMap<>();
    private static int presupuestoCounter = 1;
    private static int facturaCounter = 1;

    @PayloadRoot(localPart = "RegistrarCompraRequest", namespace = "t4is.uv.mx/compras")
    @ResponsePayload
    public RegistrarCompraResponse registrarCompra(@RequestPayload RegistrarCompraRequest request) {
        System.out.println("Registrando compra: " + request.getDetalleCompra());
        RegistrarCompraResponse response = new RegistrarCompraResponse();
        response.setMensaje("Compra registrada: " + request.getDetalleCompra());
        System.out.println(response.getMensaje());
        return response;
    }

    @PayloadRoot(namespace = "t4is.uv.mx/compras", localPart = "CrearPresupuestoRequest")
    @ResponsePayload
    public CrearPresupuestoResponse crearPresupuesto(@RequestPayload CrearPresupuestoRequest request) {
        CrearPresupuestoResponse response = new CrearPresupuestoResponse();
        int id = presupuestoCounter++;
        presupuestos.put(id, request.getDetallePresupuesto());
        response.setResultado("Presupuesto creado exitosamente con ID: " + id);
        System.out.println(response.getResultado());
        return response;
    }

    @PayloadRoot(namespace = "t4is.uv.mx/compras", localPart = "ConsultarPresupuestoRequest")
    @ResponsePayload
    public ConsultarPresupuestoResponse consultarPresupuesto(@RequestPayload ConsultarPresupuestoRequest request) {
        ConsultarPresupuestoResponse response = new ConsultarPresupuestoResponse();
        String detalle = presupuestos.get(request.getIdPresupuesto());
        if (detalle != null) {
            response.setPresupuesto("ID: " + request.getIdPresupuesto() + ", Detalles: " + detalle);
        } else {
            response.setPresupuesto("Presupuesto no encontrado con ID: " + request.getIdPresupuesto());
        }
        System.out.println(response.getPresupuesto());
        return response;
    }

    @PayloadRoot(namespace = "t4is.uv.mx/compras", localPart = "ActualizarPresupuestoRequest")
    @ResponsePayload
    public ActualizarPresupuestoResponse actualizarPresupuesto(@RequestPayload ActualizarPresupuestoRequest request) {
        ActualizarPresupuestoResponse response = new ActualizarPresupuestoResponse();
        if (presupuestos.containsKey(request.getIdPresupuesto())) {
            presupuestos.put(request.getIdPresupuesto(), request.getDetallePresupuesto());
            response.setResultado("Presupuesto actualizado exitosamente");
        } else {
            response.setResultado("Presupuesto no encontrado con ID: " + request.getIdPresupuesto());
        }
        return response;
    }

    @PayloadRoot(namespace = "t4is.uv.mx/compras", localPart = "CrearFacturaRequest")
    @ResponsePayload
    public CrearFacturaResponse crearFactura(@RequestPayload CrearFacturaRequest request) {
        CrearFacturaResponse response = new CrearFacturaResponse();
        int id = facturaCounter++;
        facturas.put(id, request.getDetalleFactura());
        response.setResultado("Factura creada exitosamente con ID: " + id);
        return response;
    }

    @PayloadRoot(namespace = "t4is.uv.mx/compras", localPart = "ConsultarFacturaRequest")
    @ResponsePayload
    public ConsultarFacturaResponse consultarFactura(@RequestPayload ConsultarFacturaRequest request) {
        ConsultarFacturaResponse response = new ConsultarFacturaResponse();
        String detalle = facturas.get(request.getIdFactura());
        if (detalle != null) {
            response.setFactura("ID: " + request.getIdFactura() + ", Detalles: " + detalle);
        } else {
            response.setFactura("Factura no encontrada con ID: " + request.getIdFactura());
        }
        return response;
    }

    @PayloadRoot(namespace = "t4is.uv.mx/compras", localPart = "ActualizarFacturaRequest")
    @ResponsePayload
    public ActualizarFacturaResponse actualizarFactura(@RequestPayload ActualizarFacturaRequest request) {
        ActualizarFacturaResponse response = new ActualizarFacturaResponse();
        if (facturas.containsKey(request.getIdFactura())) {
            facturas.put(request.getIdFactura(), request.getDetalleFactura());
            response.setResultado("Factura actualizada exitosamente");
        } else {
            response.setResultado("Factura no encontrada con ID: " + request.getIdFactura());
        }
        return response;
    }

}
