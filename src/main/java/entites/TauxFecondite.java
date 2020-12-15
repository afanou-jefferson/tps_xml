package entites;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "txFecondite")
public class TauxFecondite {

	@XmlValue
	private String valueTxFecondite;

	@XmlAttribute
	private String infoTx;

	public TauxFecondite() {
	}

	public TauxFecondite(String valueTxFecondite, String infoTx) {
		super();
		this.valueTxFecondite = valueTxFecondite;
		this.infoTx = infoTx;
	}

	public String getValueTxFecondite() {
		return valueTxFecondite;
	}

	public void setValueTxFecondite(String valueTxFecondite) {
		this.valueTxFecondite = valueTxFecondite;
	}

	public String getInfoTx() {
		return infoTx;
	}

	public void setInfoTx(String infoTx) {
		this.infoTx = infoTx;
	}

}
