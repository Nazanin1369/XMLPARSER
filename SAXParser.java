import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
 
class ReadXMLFile {
 
   public static void main(String argv[]) {
 
    try {
 
	SAXParserFactory factory = SAXParserFactory.newInstance();
	SAXParser saxParser = factory.newSAXParser();
 
	DefaultHandler handler = new DefaultHandler() {
 
	boolean bid = false;
	boolean bname = false;
	boolean broom = false;
 
	public void startElement(String uri, String localName,String qName, 
                Attributes attributes) throws SAXException {
 
		System.out.println("Start Element :" + qName);
 
		if (qName.equalsIgnoreCase("ID")) {
			bid = true;
		}
 
		if (qName.equalsIgnoreCase("NAME")) {
			bname = true;
		}
 
		if (qName.equalsIgnoreCase("ROOM")) {
			broom = true;
		}
 
	}
 
	public void endElement(String uri, String localName,
		String qName) throws SAXException {
 
		System.out.println("End Element :" + qName);
 
	}
 
	public void characters(char ch[], int start, int length) throws SAXException {
 
		if (bid) {
			System.out.println("ID : " + new String(ch, start, length));
			bid = false;
		}
 
		if (bname) {
			System.out.println("Name : " + new String(ch, start, length));
			bname = false;
		}
 
		if (broom) {
			System.out.println("Nick Name : " + new String(ch, start, length));
			broom = false;
		}
 
	}
 
     };
 
       saxParser.parse("/home/nazi/Desktop/DomParser/info.xml", handler);
 
     } catch (Exception e) {
       e.printStackTrace();
     }
 
   }
 
}
