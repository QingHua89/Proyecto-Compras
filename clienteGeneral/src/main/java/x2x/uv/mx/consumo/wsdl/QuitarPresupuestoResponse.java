
package x2x.uv.mx.consumo.wsdl;

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
 *         &lt;element name="quitarPresupuestoResult" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "quitarPresupuestoResult"
})
@XmlRootElement(name = "quitarPresupuestoResponse")
public class QuitarPresupuestoResponse {

    @XmlElement(required = true, nillable = true)
    protected String quitarPresupuestoResult;

    /**
     * Obtiene el valor de la propiedad quitarPresupuestoResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuitarPresupuestoResult() {
        return quitarPresupuestoResult;
    }

    /**
     * Define el valor de la propiedad quitarPresupuestoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuitarPresupuestoResult(String value) {
        this.quitarPresupuestoResult = value;
    }

}
