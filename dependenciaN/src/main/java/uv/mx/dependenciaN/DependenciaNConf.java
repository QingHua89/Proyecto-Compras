package uv.mx.dependenciaN;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class DependenciaNConf {
    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("xx.uv.mx.consumo.wsdl");
        return marshaller;
    }

    @Bean
    public DependenciaNCliente cliente(Jaxb2Marshaller marshaller) {
        DependenciaNCliente cliente = new DependenciaNCliente();
        cliente.setDefaultUri("http://localhost:8080/ws/compras");
        cliente.setMarshaller(marshaller);
        cliente.setUnmarshaller(marshaller);
        return cliente;
    }
}
