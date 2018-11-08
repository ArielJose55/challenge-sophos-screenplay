package com.sophos.challenge.demoaut.util;

import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;

public class PropertiesReader {
	public static Word read(String chain) throws Exception{
        
        File file = new File("translations.xml");
        
        if(!file.exists()){
            return null;
        }else{
            
            SAXBuilder reader = new SAXBuilder();
            Document document = reader.build(file);
            Element root = document.getRootElement();
            
            Element element = root.getChild(createWord(chain.toLowerCase()));
            if(element != null && validate(element, chain.toLowerCase())){
                Word wordXml = new Word(chain);
                List<String> translations = new ArrayList<>();
                element.getChildren().forEach((translation) -> {
                    translations.add(translation.getText());
                });
                wordXml.setTranslations(translations);
                return wordXml;
            }
            return null;
        }
    }
}
