package chens.net.allaboutknowledge.jpa.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the experienceyear database table.
 * 
 */
@Entity
@Table(name="experienceyear")
public class Experienceyear implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="EXPERIENCEYEAR_EXPERIENCEYEARID_GENERATOR", sequenceName="SYSTEM-UUID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="EXPERIENCEYEAR_EXPERIENCEYEARID_GENERATOR")
	@Column(unique=true, nullable=false, length=36)
	private String experienceyearid;

	@Column(nullable=false)
	private int sort;

	@Column(nullable=false, length=100)
	private String value;

	//bi-directional many-to-one association to Education
	@OneToMany(mappedBy="experienceyear")
	private List<Education> educations;

	//bi-directional many-to-one association to Employeement
	@OneToMany(mappedBy="experienceyearBean")
	private List<Employeement> employeements;

	public Experienceyear() {
	}

	public String getExperienceyearid() {
		return this.experienceyearid;
	}

	public void setExperienceyearid(String experienceyearid) {
		this.experienceyearid = experienceyearid;
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

	public List<Education> getEducations() {
		return this.educations;
	}

	public void setEducations(List<Education> educations) {
		this.educations = educations;
	}

	public List<Employeement> getEmployeements() {
		return this.employeements;
	}

	public void setEmployeements(List<Employeement> employeements) {
		this.employeements = employeements;
	}

}