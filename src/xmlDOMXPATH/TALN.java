package xmlDOMXPATH;
	
import javax.print.attribute.Attribute;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Node;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import java.io.File;


public class  TALN {
		
		
	public static void main(String[] a) throws Exception{

		// parsing the XML file
		Document document = parseXmlDom("xmlFile/TALN-RECITAL-BIB.xml");

		// root est l'élément racine du document
		XPath xPath = XPathFactory.newInstance().newXPath();
		Element root = document.getDocumentElement();
		
		// le nom de l'élément racine
		Node racine = (Node)(xPath.evaluate(
			"/*",
			document.getDocumentElement(),
			XPathConstants.NODE )
		);
		System.out.println("le nom du noeud racine : " + racine.getNodeName() + ".\n");
		
		// le premier fils du noeud racine qui est un noeud textuel
		Node fils1Racine=(Node)(xPath.evaluate(
			"/*/*",
			document.getDocumentElement(),
			XPathConstants.NODE )
		);
		System.out.println(" le nom du premier enfant du noeud racine : "+ fils1Racine.getNodeName());
	
		// on récupère tous les noeuds fils du noeud racine et on n'affiche que les noeuds non textuels

		NodeList filsNoeudRacine = (NodeList)xPath.evaluate("/*/node()", document.getDocumentElement(), XPathConstants.NODESET);
		// NodeList filsNoeudRacine=root.getChildNodes();
		System.out.println("affichage de tous les noeuds fils du noeud racine mais pas textuel ");
		for( int numFils=0;numFils<filsNoeudRacine.getLength();numFils++){
			Node noeud=filsNoeudRacine.item(numFils);
			if (noeud.getNodeType()!=Node.TEXT_NODE){
				System.out.println(filsNoeudRacine.item(numFils).getNodeName());
			}
		}
		
		System.out.println("\n\n");


		// la liste de tous les noeuds acteur (à partir de root)
	
		
		NodeList acteursId = (NodeList)xPath.evaluate("//acteur/@id", document.getDocumentElement(), XPathConstants.NODESET);		
		NodeList acteursNom = (NodeList)xPath.evaluate("//acteur/nom/text()", document.getDocumentElement(), XPathConstants.NODESET);
								
		
		for (int numActeurId=0; numActeurId <acteursId.getLength();numActeurId++){
			System.out.println(acteursId.item(numActeurId).getNodeValue());
			System.out.println(acteursNom.item(numActeurId).getNodeValue()+"\n");
		}
	}

	public static Document parseXmlDom(String name) {
		Document document = null;
		try {

			// getting the default implementation of DOM builder
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			// parsing the XML file
			document = builder.parse(new File(name));

		} catch (Exception e) {
			// catching all exceptions
				System.out.println();
				System.out.println(e.toString());
		}
		return document;
	}
}



