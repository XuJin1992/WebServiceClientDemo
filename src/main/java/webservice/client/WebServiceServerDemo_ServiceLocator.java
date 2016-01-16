/**
 * WebServiceServerDemo_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webservice.client;

public class WebServiceServerDemo_ServiceLocator extends org.apache.axis.client.Service implements webservice.client.WebServiceServerDemo_Service {

    public WebServiceServerDemo_ServiceLocator() {
    }


    public WebServiceServerDemo_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WebServiceServerDemo_ServiceLocator(String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for WebServiceServerDemoPort
    private String WebServiceServerDemoPort_address = "http://localhost:9010/xiaofengcanyu.indv.com";

    public String getWebServiceServerDemoPortAddress() {
        return WebServiceServerDemoPort_address;
    }

    // The WSDD service name defaults to the port name.
    private String WebServiceServerDemoPortWSDDServiceName = "WebServiceServerDemoPort";

    public String getWebServiceServerDemoPortWSDDServiceName() {
        return WebServiceServerDemoPortWSDDServiceName;
    }

    public void setWebServiceServerDemoPortWSDDServiceName(String name) {
        WebServiceServerDemoPortWSDDServiceName = name;
    }

    public webservice.client.WebServiceServerDemo_PortType getWebServiceServerDemoPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(WebServiceServerDemoPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWebServiceServerDemoPort(endpoint);
    }

    public webservice.client.WebServiceServerDemo_PortType getWebServiceServerDemoPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            webservice.client.WebServiceServerDemoPortBindingStub _stub = new webservice.client.WebServiceServerDemoPortBindingStub(portAddress, this);
            _stub.setPortName(getWebServiceServerDemoPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWebServiceServerDemoPortEndpointAddress(String address) {
        WebServiceServerDemoPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (webservice.client.WebServiceServerDemo_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                webservice.client.WebServiceServerDemoPortBindingStub _stub = new webservice.client.WebServiceServerDemoPortBindingStub(new java.net.URL(WebServiceServerDemoPort_address), this);
                _stub.setPortName(getWebServiceServerDemoPortWSDDServiceName());
                return _stub;
            }
        }
        catch (Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        String inputPortName = portName.getLocalPart();
        if ("WebServiceServerDemoPort".equals(inputPortName)) {
            return getWebServiceServerDemoPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://webserviceserverdemo/", "WebServiceServerDemo");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://webserviceserverdemo/", "WebServiceServerDemoPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(String portName, String address) throws javax.xml.rpc.ServiceException {
        
if ("WebServiceServerDemoPort".equals(portName)) {
            setWebServiceServerDemoPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
