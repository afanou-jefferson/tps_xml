package entites;

import java.time.LocalDate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "pays")
public class Pays {

	/*
	 * @XmlAttribute private String id;
	 */

	@XmlElement
	private String nomPays;

	@XmlElement
	@XmlJavaTypeAdapter(DateAdapter.class)
	private LocalDate dateDeReleve;

	@XmlElement(name = "donneesDemographiques")
	private DonneesDemographiques donneesDemo;

	@XmlElement(name = "donneesEconomiques")
	private DonneesEconomiques donneesEco;

	public Pays() {
	}

	public Pays(String nomPays, LocalDate dateDeReleve, DonneesDemographiques donneesDemo,
			DonneesEconomiques donneesEco) {
		super();
		this.nomPays = nomPays;
		this.dateDeReleve = dateDeReleve;
		this.donneesDemo = donneesDemo;
		this.donneesEco = donneesEco;
	}

	public String getNomPays() {
		return nomPays;
	}

	public void setNomPays(String nomPays) {
		this.nomPays = nomPays;
	}

	public LocalDate getDateDeReleve() {
		return dateDeReleve;
	}

	public void setDateDeReleve(LocalDate dateDeReleve) {
		this.dateDeReleve = dateDeReleve;
	}

	public DonneesDemographiques getDonneesDemo() {
		return donneesDemo;
	}

	public void setDonneesDemo(DonneesDemographiques donneesDemo) {
		this.donneesDemo = donneesDemo;
	}

	public DonneesEconomiques getDonneesEco() {
		return donneesEco;
	}

	public void setDonneesEco(DonneesEconomiques donneesEco) {
		this.donneesEco = donneesEco;
	}

}
