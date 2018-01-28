package cityTraffic.onto;

import jade.content.onto.BeanOntology;
import jade.content.onto.Ontology;

public class ServiceOntology extends BeanOntology {
	
	private static final long serialVersionUID = 1L;

	public static final String ONTOLOGY_NAME = "alter-ego";
	
	// Singleton instance of this ontology
	private static Ontology theInstance = new ServiceOntology();
	
	// Method to access the singleton ontology object
	public static Ontology getInstance() {
		return theInstance;
	}
	
	// Private constructor
	private ServiceOntology() {
		super(ONTOLOGY_NAME);
	}
	
}
