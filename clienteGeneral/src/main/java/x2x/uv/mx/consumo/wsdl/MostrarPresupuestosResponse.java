
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
 *         &lt;element name="mostrarPresupuestosResult" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfdecimal"/&gt;
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
    "mostrarPresupuestosResult"
})
@XmlRootElement(name = "mostrarPresupuestosResponse")
public class MostrarPresupuestosResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfdecimal mostrarPresupuestosResult;

    /**
     * Obtiene el valor de la propiedad mostrarPresupuestosResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfdecimal }
     *     
     */
    public ArrayOfdecimal getMostrarPresupuestosResult() {
        return mostrarPresupuestosResult;
    }

    /**
     * Define el valor de la propiedad mostrarPresupuestosResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfdecimal }
     *     
     */
    public void setMostrarPresupuestosResult(ArrayOfdecimal value) {
        this.mostrarPresupuestosResult = value;
    }

}
