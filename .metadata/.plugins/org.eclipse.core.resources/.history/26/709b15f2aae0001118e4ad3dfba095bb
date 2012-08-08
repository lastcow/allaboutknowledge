package chens.net.allaboutknowledge.jpa.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the agerange database table.
 * 
 */
@Entity
@Table(name="agerange")
public class Agerange implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="AGERANGE_AGEID_GENERATOR", sequenceName="SYSTEM-UUID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="AGERANGE_AGEID_GENERATOR")
	@Column(unique=true, nullable=false, length=36)
	private String ageid;

	@Column(nullable=false)
	private int sort;

	@Column(nullable=false, length=50)
	private String value;

	//bi-directional many-to-one association to Personaldesc
	@OneToMany(mappedBy="agerangeBean")
	private List<Personaldesc> personaldescs;

	public Agerange() {
	}

	public String getAgeid() {
		return this.ageid;
	}

	public void setAgeid(String ageid) {
		this.ageid = ageid;
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

	public List<Personaldesc> getPersonaldescs() {
		return this.personaldescs;
	}

	public void setPersonaldescs(List<Personaldesc> personaldescs) {
		this.personaldescs = personaldescs;
	}

}