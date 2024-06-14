
package uv.mx.dependenciaN;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/dependenciaN")
public class DependenciaNController {

    @Autowired
    private DependenciaNCliente cliente;

    @PostMapping("/crearFactura")
    public String crearFactura(@RequestParam String detalleFactura) {
        return cliente.crearFactura(detalleFactura);
    }

    @GetMapping("/consultarFactura")
    public String consultarFactura(@RequestParam int idFactura) {
        return cliente.consultarFactura(idFactura);
    }

    @GetMapping("/consultarPresupuesto")
    public String consultarPresupuesto(@RequestParam int idPresupuesto) {
        return cliente.consultarPresupuesto(idPresupuesto);
    }
}
