//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.02.16 at 06:45:55 PM CET 
//


package org.w3.ns.corevocabulary.aggregatecomponents;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3.ns.corevocabulary.basiccomponents.InputDescriptionType;
import org.w3.ns.corevocabulary.basiccomponents.InputNameType;
import org.w3.ns.corevocabulary.basiccomponents.InputTypeCodeType;


/**
 * 
 *             
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="http://www.w3.org/ns/corevocabulary/AggregateComponents" xmlns:cva="http://www.w3.org/ns/corevocabulary/AggregateComponents" xmlns:cvb="http://www.w3.org/ns/corevocabulary/BasicComponents" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;
 *                &lt;ccts:ComponentType&gt;ABIE&lt;/ccts:ComponentType&gt;
 *                &lt;ccts:DictionaryEntryName&gt;Input. Details&lt;/ccts:DictionaryEntryName&gt;
 *                &lt;ccts:Definition&gt;A resource to be processed to produce an output.&lt;/ccts:Definition&gt;
 *                &lt;ccts:ObjectClass&gt;Input&lt;/ccts:ObjectClass&gt;
 *             &lt;/ccts:Component&gt;
 * </pre>
 * 
 *          
 * 
 * <p>Java class for InputType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InputType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.w3.org/ns/corevocabulary/BasicComponents}InputName" minOccurs="0"/>
 *         &lt;element ref="{http://www.w3.org/ns/corevocabulary/BasicComponents}InputDescription" minOccurs="0"/>
 *         &lt;element ref="{http://www.w3.org/ns/corevocabulary/BasicComponents}InputTypeCode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InputType", propOrder = {
    "inputName",
    "inputDescription",
    "inputTypeCode"
})
public class InputType {

    @XmlElement(name = "InputName", namespace = "http://www.w3.org/ns/corevocabulary/BasicComponents")
    protected InputNameType inputName;
    @XmlElement(name = "InputDescription", namespace = "http://www.w3.org/ns/corevocabulary/BasicComponents")
    protected InputDescriptionType inputDescription;
    @XmlElement(name = "InputTypeCode", namespace = "http://www.w3.org/ns/corevocabulary/BasicComponents")
    protected InputTypeCodeType inputTypeCode;

    /**
     * 
     *                   
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="http://www.w3.org/ns/corevocabulary/AggregateComponents" xmlns:cva="http://www.w3.org/ns/corevocabulary/AggregateComponents" xmlns:cvb="http://www.w3.org/ns/corevocabulary/BasicComponents" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;
     *                      &lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;
     *                      &lt;ccts:DictionaryEntryName&gt;Input. Input_ Name. Text&lt;/ccts:DictionaryEntryName&gt;
     *                      &lt;ccts:Definition&gt;The name of the input.&lt;/ccts:Definition&gt;
     *                      &lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;
     *                      &lt;ccts:ObjectClass&gt;Input&lt;/ccts:ObjectClass&gt;
     *                      &lt;ccts:PropertyTermQualifier&gt;Input&lt;/ccts:PropertyTermQualifier&gt;
     *                      &lt;ccts:PropertyTerm&gt;Name&lt;/ccts:PropertyTerm&gt;
     *                      &lt;ccts:RepresentationTerm&gt;Text&lt;/ccts:RepresentationTerm&gt;
     *                      &lt;ccts:DataType&gt;Text. Type&lt;/ccts:DataType&gt;
     *                   &lt;/ccts:Component&gt;
     * </pre>
     * 
     *                
     * 
     * @return
     *     possible object is
     *     {@link InputNameType }
     *     
     */
    public InputNameType getInputName() {
        return inputName;
    }

    /**
     * Sets the value of the inputName property.
     * 
     * @param value
     *     allowed object is
     *     {@link InputNameType }
     *     
     */
    public void setInputName(InputNameType value) {
        this.inputName = value;
    }

    /**
     * 
     *                   
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="http://www.w3.org/ns/corevocabulary/AggregateComponents" xmlns:cva="http://www.w3.org/ns/corevocabulary/AggregateComponents" xmlns:cvb="http://www.w3.org/ns/corevocabulary/BasicComponents" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;
     *                      &lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;
     *                      &lt;ccts:DictionaryEntryName&gt;Input. Input_ Description. Text&lt;/ccts:DictionaryEntryName&gt;
     *                      &lt;ccts:Definition&gt;A free text description of the input.&lt;/ccts:Definition&gt;
     *                      &lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;
     *                      &lt;ccts:ObjectClass&gt;Input&lt;/ccts:ObjectClass&gt;
     *                      &lt;ccts:PropertyTermQualifier&gt;Input&lt;/ccts:PropertyTermQualifier&gt;
     *                      &lt;ccts:PropertyTerm&gt;Description&lt;/ccts:PropertyTerm&gt;
     *                      &lt;ccts:RepresentationTerm&gt;Text&lt;/ccts:RepresentationTerm&gt;
     *                      &lt;ccts:DataType&gt;Text. Type&lt;/ccts:DataType&gt;
     *                   &lt;/ccts:Component&gt;
     * </pre>
     * 
     *                
     * 
     * @return
     *     possible object is
     *     {@link InputDescriptionType }
     *     
     */
    public InputDescriptionType getInputDescription() {
        return inputDescription;
    }

    /**
     * Sets the value of the inputDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link InputDescriptionType }
     *     
     */
    public void setInputDescription(InputDescriptionType value) {
        this.inputDescription = value;
    }

    /**
     * 
     *                   
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="http://www.w3.org/ns/corevocabulary/AggregateComponents" xmlns:cva="http://www.w3.org/ns/corevocabulary/AggregateComponents" xmlns:cvb="http://www.w3.org/ns/corevocabulary/BasicComponents" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;
     *                      &lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;
     *                      &lt;ccts:DictionaryEntryName&gt;Input. Input_ Type. Code&lt;/ccts:DictionaryEntryName&gt;
     *                      &lt;ccts:Definition&gt;The type of the input.&lt;/ccts:Definition&gt;
     *                      &lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;
     *                      &lt;ccts:ObjectClass&gt;Input&lt;/ccts:ObjectClass&gt;
     *                      &lt;ccts:PropertyTermQualifier&gt;Input&lt;/ccts:PropertyTermQualifier&gt;
     *                      &lt;ccts:PropertyTerm&gt;Type&lt;/ccts:PropertyTerm&gt;
     *                      &lt;ccts:RepresentationTerm&gt;Code&lt;/ccts:RepresentationTerm&gt;
     *                      &lt;ccts:DataType&gt;Code. Type&lt;/ccts:DataType&gt;
     *                   &lt;/ccts:Component&gt;
     * </pre>
     * 
     *                
     * 
     * @return
     *     possible object is
     *     {@link InputTypeCodeType }
     *     
     */
    public InputTypeCodeType getInputTypeCode() {
        return inputTypeCode;
    }

    /**
     * Sets the value of the inputTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link InputTypeCodeType }
     *     
     */
    public void setInputTypeCode(InputTypeCodeType value) {
        this.inputTypeCode = value;
    }

}