//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.06.27 at 02:00:26 �� EEST 
//


package org.openiot.commons.sparql.protocoltypes.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.openiot.commons.sparql.result.model.Sparql;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.w3.org/2007/SPARQL/results#}sparql"/>
 *         &lt;element ref="{http://www.w3.org/1999/02/22-rdf-syntax-ns#}RDF"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "sparql",
    "rdf"
})
@XmlRootElement(name = "query-result")
public class QueryResult {

    @XmlElement(namespace = "http://www.w3.org/2007/SPARQL/results#")
    protected Sparql sparql;
    @XmlElement(name = "RDF", namespace = "http://www.w3.org/1999/02/22-rdf-syntax-ns#")
    protected Object rdf;

    /**
     * Gets the value of the sparql property.
     * 
     * @return
     *     possible object is
     *     {@link Sparql }
     *     
     */
    public Sparql getSparql() {
        return sparql;
    }

    /**
     * Sets the value of the sparql property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sparql }
     *     
     */
    public void setSparql(Sparql value) {
        this.sparql = value;
    }

    /**
     * Gets the value of the rdf property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getRDF() {
        return rdf;
    }

    /**
     * Sets the value of the rdf property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setRDF(Object value) {
        this.rdf = value;
    }

}
