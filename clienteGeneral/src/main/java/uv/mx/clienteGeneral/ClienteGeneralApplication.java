
package uv.mx.clienteGeneral;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import x2x.uv.mx.consumo.wsdl.MostrarPresupuestos;
import x3x.uv.mx.consumo.wsdl.AgregarProductoResponse;
import xx.uv.mx.consumo.wsdl.CreateFacturaResponse;

@RestController
@SpringBootApplication
public class ClienteGeneralApplication {

    @Autowired
    ClienteGeneralCliente cliente = new ClienteGeneralCliente();

    public static void main(String[] args) {
        SpringApplication.run(ClienteGeneralApplication.class, args);
        // System.err.println("Hola");
        MostrarPresupuestos m = new MostrarPresupuestos();
        System.out.println(m);
    }

    @RequestMapping("/facturas/{detalle}")
    public String solicitarFactura(@PathVariable String detalle) {
        CreateFacturaResponse sr = cliente.solicitarFactura(detalle);
        System.err.println(sr.getCreateFacturaResult().getDescripcion());
        System.out.println("Solicitando Factura....Espere");
        return sr.getCreateFacturaResult().getDescripcion();
    }

    @RequestMapping("/presupuestos")
    public String x2x() {
        System.err.println("Presupuesto es de: " + "1000");
        return "Presupuesto es de: " + "1000";
    }

    /*
     * @RequestMapping("/productos")
     * public String agregarProduct(@PathVariable String producto) {
     * AgregarProductoResponse cliente2.agregarProduct(producto);
     * return cliente2.getAgregarProductoResult();
     * }
     */

}
