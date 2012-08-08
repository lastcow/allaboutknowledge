package chens.net.allaboutknowledge.jpa.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the country database table.
 * 
 */
@Entity
@Table(name="country")
public class Country implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="COUNTRY_CODE_GENERATOR", sequenceName="SYSTEM-UUID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="COUNTRY_CODE_GENERATOR")
	@Column(unique=true, nullable=false, length=10)
	private String code;

	@Column(length=100)
	private String flag;

	@Column(nullable=false, length=100)
	private String name;

	//bi-directional many-to-one association to Personaldesc
	@OneToMany(mappedBy="countryBean")
	private List<Personaldesc> personaldescs;

	public Country() {
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getFlag() {
		return this.flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Personaldesc> getPersonaldescs() {
		return this.personaldescs;
	}

	public void setPersonaldescs(List<Personaldesc> personaldescs) {
		this.personaldescs = personaldescs;
	}

}