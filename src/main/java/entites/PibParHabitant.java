package entites;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "pibParHabitant")
public class PibParHabitant {

	@XmlValue
	private String valuePibParHab;

	@XmlAttribute
	private String unitePibParHab;

	public PibParHabitant() {
	}

	public PibParHabitant(String valuePibParHab, String unite) {
		super();
		this.valuePibParHab = valuePibParHab;
		this.unitePibParHab = unite;
	}

	public String getValuePibParHab() {
		return valuePibParHab;
	}

	public void setValuePibParHab(String valuePibParHab) {
		this.valuePibParHab = valuePibParHab;
	}

	public String getUnitePibParHab() {
		return unitePibParHab;
	}

	public void setUnitePibParHab(String unite) {
		this.unitePibParHab = unite;
	}

}
