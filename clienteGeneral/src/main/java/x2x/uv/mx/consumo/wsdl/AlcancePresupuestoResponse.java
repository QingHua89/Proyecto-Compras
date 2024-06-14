
package x2x.uv.mx.consumo.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="alcancePresupuestoResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "alcancePresupuestoResult"
})
@XmlRootElement(name = "alcancePresupuestoResponse")
public class AlcancePresupuestoResponse {

    protected boolean alcancePresupuestoResult;

    /**
     * Obtiene el valor de la propiedad alcancePresupuestoResult.
     * 
     */
    public boolean isAlcancePresupuestoResult() {
        return alcancePresupuestoResult;
    }

    /**
     * Define el valor de la propiedad alcancePresupuestoResult.
     * 
     */
    public void setAlcancePresupuestoResult(boolean value) {
        this.alcancePresupuestoResult = value;
    }

}
