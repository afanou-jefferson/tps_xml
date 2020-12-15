package entites;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "europe")
public class Europe {

	@XmlElement(name = "pays")
	protected List<Pays> listePays = new ArrayList<Pays>();

	public List<Pays> getListePays() {
		return this.listePays;
	}

	public Europe(List<Pays> listePays) {
		super();
		this.listePays = listePays;
	}

	public Europe() {

	}

	public void setListePays(List<Pays> listePays) {
		this.listePays = listePays;
	}

}
