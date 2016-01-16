package com.springapp.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import webservice.client.WebServiceServerDemo_ServiceLocator;

import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;

@Controller
@RequestMapping("/webservice/client")
public class HelloController {

	@RequestMapping(method = RequestMethod.GET)
	public String test(ModelMap model) throws ServiceException, RemoteException {
		WebServiceServerDemo_ServiceLocator locator= new WebServiceServerDemo_ServiceLocator();
		return locator.getWebServiceServerDemoPort().goodbye("jin.xu");
	}
}