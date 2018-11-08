package com.sophos.challenge.demoaut.util;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

import com.sophos.challenge.demoaut.models.MailInformation;
import com.sophos.challenge.demoaut.models.User;
import com.sophos.challenge.demoaut.models.UserInformation;
import com.sophos.challenge.demoaut.util.exceptions.ReaderPropertiesFailException;

public class PropertiesReader {
	
	private static Element read(String chain) throws ReaderPropertiesFailException{
        
        File file = new File("src/test/resources/properties/properties.xml");
        
        if(!file.exists()){
            throw new ReaderPropertiesFailException("No existe o no se encontro el archivo " + file.getName());
        }else{
            
            SAXBuilder reader = new SAXBuilder();
            Document document;
			try {
				document = reader.build(file);
			} catch (JDOMException | IOException e) {
				throw new ReaderPropertiesFailException("Error al leer archivo " + file.getName(), e);
			}
			
            Element user = document.getRootElement().getChild("user");
            
            Element element = user.getChild(chain.toLowerCase());
            if(element == null){
            	throw new ReaderPropertiesFailException("No existe ninguna propiedad llamada: " + chain);
            }else {
            	return element;
            }
        }
    }
	
	public static Object pullProperties(byte typeProperties) throws ReaderPropertiesFailException {
		switch (typeProperties) {
			case 1:{
				User user = new User();
				Element userElement = read("basicinformation");
				user.setName(userElement.getChild("name").getValue());
				user.setLastName(userElement.getChild("lastname").getValue());
				user.setEmail(userElement.getChild("email").getValue());
				user.setPhone(userElement.getChild("phone").getValue());
				return user;
			}
			case 2:{
				MailInformation mailInformation = new MailInformation();
				Element mailElement = read("mailinformation");
				mailInformation.setAddress(mailElement.getChild("address").getValue());
				mailInformation.setCity(mailElement.getChild("city").getValue());
				mailInformation.setProvince(mailElement.getChild("province").getValue());
				mailInformation.setCountry(mailElement.getChild("country").getValue());
				return mailInformation;
			}
			case 3:{
				UserInformation userInformation = new UserInformation();
				Element userInfoElement = read("userinformation");
				userInformation.setUsername(userInfoElement.getChild("username").getValue());
				userInformation.setPassword(userInfoElement.getChild("password").getValue());
				return userInformation;
			}
			default:
				throw new ReaderPropertiesFailException("Error parametro de parseo invalido");
		}
	}
}
