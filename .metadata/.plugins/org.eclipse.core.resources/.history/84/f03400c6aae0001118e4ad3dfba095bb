package chens.net.allaboutknowledge.jpa.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the packagedesc database table.
 * 
 */
@Entity
@Table(name="packagedesc")
public class Packagedesc implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="PACKAGEDESC_PDESCID_GENERATOR", sequenceName="SYSTEM-UUID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PACKAGEDESC_PDESCID_GENERATOR")
	@Column(unique=true, nullable=false, length=36)
	private String pdescid;

	@Column(nullable=false, length=150)
	private String name;

	@Column(nullable=false)
	private int sort;

	@Column(length=500)
	private String value;

	//bi-directional many-to-one association to Pricepackage
	@OneToMany(mappedBy="packagedescBean")
	private List<Pricepackage> pricepackages;

	public Packagedesc() {
	}

	public String getPdescid() {
		return this.pdescid;
	}

	public void setPdescid(String pdescid) {
		this.pdescid = pdescid;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSort() {
		return this.sort;
	}

	public void setSort(int sort) {
		this.sort = sort;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public List<Pricepackage> getPricepackages() {
		return this.pricepackages;
	}

	public void setPricepackages(List<Pricepackage> pricepackages) {
		this.pricepackages = pricepackages;
	}

}