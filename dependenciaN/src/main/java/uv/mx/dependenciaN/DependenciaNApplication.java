
package uv.mx.dependenciaN;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import xx.uv.mx.consumo.wsdl.RegistrarCompraResponse;

@RestController
@SpringBootApplication
public class DependenciaNApplication {

    @Autowired
    DependenciaNCliente cliente;

    public static void main(String[] args) {
        SpringApplication.run(DependenciaNApplication.class, args);
    }

    // Endpoint de ejemplo que devuelve una lista de objetos
    @RequestMapping("/Objetos")
    public String x() {
        return "Libros" + " , " + "Plumones";
    }

    // Endpoint que realiza una compra de un objeto especificado
    @RequestMapping("/compras/{objeto}")
    public String xx(@PathVariable String objeto) {
        RegistrarCompraResponse sr = cliente.solicitarCompra(objeto);
        System.err.println(sr.getMensaje());
        return sr.getMensaje();
    }

    // Endpoint para crear una factura con datos detallados
    @RequestMapping("/crearFactura/{detalle}")
    public String xsx(@PathVariable String detalle) {
        RegistrarCompraResponse sr = cliente.solicitarCompra(detalle);
        System.err.println(sr.getMensaje());
        return sr.getMensaje();
    }
    /*
     * public String crearFactura(@RequestBody Factura factura) {
     * // Crear una solicitud CrearFacturaRequest y mapear los datos de la factura
     * CrearFacturaRequest request = new CrearFacturaRequest();
     * request.setDetalleFactura("Cliente: " + factura.getCliente() + ", Detalle: "
     * + factura.getDetalle()
     * + ", Total: " + factura.getTotal());
     * // Enviar la solicitud al cliente y devolver la respuesta
     * System.err.println(request.getDetalleFactura());
     * return factura.getCliente();
     * }
     */

    // Endpoint para consultar una factura por su ID y devolver los detalles de la
    // factura
    @GetMapping("/consultarFactura")
    public Factura consultarFactura(@RequestParam int idFactura) {
        String detalles = cliente.consultarFactura(idFactura);
        // Parsear la respuesta y mapearla al objeto Factura
        Factura factura = new Factura();
        factura.setId(idFactura);
        String[] partes = detalles.split(", ");
        factura.setCliente(partes[0].split(": ")[1]);
        factura.setDetalle(partes[1].split(": ")[1]);
        factura.setTotal(Double.parseDouble(partes[2].split(": ")[1]));
        return factura;
    }

    // Endpoint para consultar un presupuesto por su ID
    @GetMapping("/consultarPresupuesto")
    public String consultarPresupuesto(@RequestParam int idPresupuesto) {
        return cliente.consultarPresupuesto(idPresupuesto);
    }
}
