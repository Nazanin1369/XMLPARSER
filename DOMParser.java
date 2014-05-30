import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class DOMParser {
	public static void main(String[] args){
		try{
			File xmlFile = new File("/home/nazi/Desktop/DomParser/info.xml");
			DocumentBuilderFactory dbFac = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFac.newDocumentBuilder();
			Document doc = dBuilder.parse(xmlFile);
			doc.getDocumentElement().normalize();

			System.out.println("Root node: " + doc.getDocumentElement().getNodeName());

			NodeList nList = doc.getElementsByTagName("student");
			for(int i = 0; i < nList.getLength(); i++){
				Node n = nList.item(i);
				System.out.println("Element: " + n.getNodeName());
				if(n.getNodeType() == Node.ELEMENT_NODE){
					Element element = (Element) n;
					System.out.println("Student id: " + element.getElementsByTagName("id").item(0).getTextContent());
					System.out.println("Student name: " + element.getElementsByTagName("name")
							.item(0).getTextContent());
					System.out.println("Student room: " + element.getElementsByTagName("room")
							.item(0).getTextContent());
				}
			}
			
		}
		catch(Exception e){
			e.printStackTrace();		
		}
		
	}

}

