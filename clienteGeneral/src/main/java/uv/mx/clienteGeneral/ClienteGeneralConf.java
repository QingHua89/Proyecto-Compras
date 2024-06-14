package uv.mx.clienteGeneral;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class ClienteGeneralConf {
    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("xx.uv.mx.consumo.wsdl");
        return marshaller;
    }

    @Bean
    public ClienteGeneralCliente cliente(Jaxb2Marshaller marshaller) {
        ClienteGeneralCliente cliente = new ClienteGeneralCliente();
        cliente.setDefaultUri("http://localhost:8080/ws/facturas");
        cliente.setMarshaller(marshaller);
        cliente.setUnmarshaller(marshaller);
        return cliente;
    }

    @Bean
    public ClienteGeneralCliente cliente2(Jaxb2Marshaller marshaller) {
        ClienteGeneralCliente cliente1 = new ClienteGeneralCliente();
        cliente1.setDefaultUri("http://localhost:8080/ws");
        cliente1.setMarshaller(marshaller);
        cliente1.setUnmarshaller(marshaller);
        return cliente1;
    }

    @Bean
    public ClienteGeneralCliente cliente3(Jaxb2Marshaller marshaller) {
        ClienteGeneralCliente cliente2 = new ClienteGeneralCliente();
        cliente2.setDefaultUri("http://0.0.0.0:80");
        cliente2.setMarshaller(marshaller);
        cliente2.setUnmarshaller(marshaller);
        // System.out.println("Hola");
        System.out.println("El presupuesto es de 1000");
        return cliente2;
    }
}
