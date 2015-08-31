## XMLPARSER

DomParser and SAXParser Java implementation.

####XML Parsing in Java

XMLParser is the abstract base class for the XML parser for Java. An instantiated parser invokes the parse() method to read an XML document.

XMLDOMImplementation factory methods provide another method to parse Binary XML to create scalable DOM.

The following APIs provide a Java application with access to a parsed XML document:

* DOM API, which parses XML documents and builds a tree representation of the documents in memory. Use either a DOMParser object to parse with DOM or the XMLDOMImplementation interface factory methods to create a pluggable, scalable DOM.

* SAX API, which processes an XML document as a stream of events, which means that a program cannot access random locations in a document. Use a SAXParser object to parse with SAX.

* JAXP, which is a Java-specific API that supports DOM, SAX, and XSL. Use a DocumentBuilder or SAXParser object to parse with JAXP.

####Directory Structure
* DOMParser.java
* SAXParser.java

### How to run?
    javac *.java
    java DOMParser 
    //or
    java SAXParser




