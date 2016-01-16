/**
 * WebServiceServerDemo_Service.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webservice.client;

public interface WebServiceServerDemo_Service extends javax.xml.rpc.Service {
    public String getWebServiceServerDemoPortAddress();

    public webservice.client.WebServiceServerDemo_PortType getWebServiceServerDemoPort() throws javax.xml.rpc.ServiceException;

    public webservice.client.WebServiceServerDemo_PortType getWebServiceServerDemoPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
