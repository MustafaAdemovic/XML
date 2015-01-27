import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


public class TestClassStudent {

	public static void main(String[] args) throws ParserConfigurationException {
/*
		Student a = new Student("MUstafa", "Ademovic", 21, 12345);
		Student b = new Student("Vedad", "Zornic", 22, 1223);
		Student c = new Student("Gordan", "Sajevic", 23, 2352);
		Student d = new Student("Emir", "Imamovic", 22, 12335);
		BitCamp bitCamp = new BitCamp(4);
		bitCamp.addStudent(a);
		bitCamp.addStudent(b);
		bitCamp.addStudent(c);
		bitCamp.addStudent(d);
		System.out.println("<BitCamp>" + bitCamp.toXml() + "</BitCamp>");
*/	
		
		 try {
			DocumentBuilder docReader = DocumentBuilderFactory.newInstance().newDocumentBuilder();
			Document xmldoc = docReader.parse(new File("test.xml"));
			NodeList nl = xmldoc.getDocumentElement().getChildNodes();
			for(int i = 0; i < nl.getLength(); i++) {
				System.out.println(nl.item(i).getNodeName());
			}
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			
		}

	}

}
