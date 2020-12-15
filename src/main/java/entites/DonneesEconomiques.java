package entites;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "donneesEconomiques")
public class DonneesEconomiques {

	@XmlElement
	private PibParHabitant pibParHabitant;

	@XmlElement(name = "monnaie")
	private String monnaie;

	public DonneesEconomiques() {

	}

	public DonneesEconomiques(PibParHabitant pibParHabitant, String monnaie) {
		super();
		this.pibParHabitant = pibParHabitant;
		this.monnaie = monnaie;
	}

	public PibParHabitant getPibParHabitant() {
		return pibParHabitant;
	}

	public void setPibParHabitant(PibParHabitant pibParHabitant) {
		this.pibParHabitant = pibParHabitant;
	}

	public String getMonnaie() {
		return monnaie;
	}

	public void setMonnaie(String monnaie) {
		this.monnaie = monnaie;
	}

}
