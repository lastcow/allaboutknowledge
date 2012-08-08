package chens.net.allaboutknowledge.jpa.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the educationlevel database table.
 * 
 */
@Entity
@Table(name="educationlevel")
public class Educationlevel implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="EDUCATIONLEVEL_ELEVELID_GENERATOR", sequenceName="SYSTEM-UUID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="EDUCATIONLEVEL_ELEVELID_GENERATOR")
	@Column(unique=true, nullable=false, length=36)
	private String elevelid;

	@Column(nullable=false)
	private int sort;

	@Column(nullable=false, length=150)
	private String value;

	//bi-directional many-to-one association to Education
	@OneToMany(mappedBy="educationlevelBean")
	private List<Education> educations;

	public Educationlevel() {
	}

	public String getElevelid() {
		return this.elevelid;
	}

	public void setElevelid(String elevelid) {
		this.elevelid = elevelid;
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

}