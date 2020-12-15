package entites;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "donneesDemographiques")
public class DonneesDemographiques {

	@XmlElement
	private Population population;

	@XmlElement(name = "txFecondite")
	private TauxFecondite txFecondite;

	public DonneesDemographiques() {
	}

	public DonneesDemographiques(Population populaiton, TauxFecondite txFecondite) {
		super();
		this.population = populaiton;
		this.txFecondite = txFecondite;
	}

	public Population getPopulation() {
		return population;
	}

	public void setPopulation(Population population) {
		this.population = population;
	}

	public TauxFecondite getTxFecondite() {
		return txFecondite;
	}

	public void setTxFecondite(TauxFecondite txFecondite) {
		this.txFecondite = txFecondite;
	}

}
