
package xx.uv.mx.consumo.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idPresupuesto" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="detallePresupuesto" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "idPresupuesto",
    "detallePresupuesto"
})
@XmlRootElement(name = "ActualizarPresupuestoRequest")
public class ActualizarPresupuestoRequest {

    protected int idPresupuesto;
    @XmlElement(required = true)
    protected String detallePresupuesto;

    /**
     * Obtiene el valor de la propiedad idPresupuesto.
     * 
     */
    public int getIdPresupuesto() {
        return idPresupuesto;
    }

    /**
     * Define el valor de la propiedad idPresupuesto.
     * 
     */
    public void setIdPresupuesto(int value) {
        this.idPresupuesto = value;
    }

    /**
     * Obtiene el valor de la propiedad detallePresupuesto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetallePresupuesto() {
        return detallePresupuesto;
    }

    /**
     * Define el valor de la propiedad detallePresupuesto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetallePresupuesto(String value) {
        this.detallePresupuesto = value;
    }

}
