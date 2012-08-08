package chens.net.allaboutknowledge.jpa.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the employeement database table.
 * 
 */
@Entity
@Table(name="employeement")
public class Employeement implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="EMPLOYEEMENT_EMPLOYEEMENTID_GENERATOR", sequenceName="SYSTEM-UUID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="EMPLOYEEMENT_EMPLOYEEMENTID_GENERATOR")
	@Column(unique=true, nullable=false, length=36)
	private String employeementid;

	@Column(length=150)
	private String company;

	@Column(length=150)
	private String division;

	@Column(length=150)
	private String occupation;

	//bi-directional many-to-one association to Experienceyear
	@ManyToOne
	@JoinColumn(name="experienceyear")
	private Experienceyear experienceyearBean;

	//bi-directional many-to-one association to Member
	@OneToMany(mappedBy="employeementBean")
	private List<Member> members;

	public Employeement() {
	}

	public String getEmployeementid() {
		return this.employeementid;
	}

	public void setEmployeementid(String employeementid) {
		this.employeementid = employeementid;
	}

	public String getCompany() {
		return this.company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getDivision() {
		return this.division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public String getOccupation() {
		return this.occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public Experienceyear getExperienceyearBean() {
		return this.experienceyearBean;
	}

	public void setExperienceyearBean(Experienceyear experienceyearBean) {
		this.experienceyearBean = experienceyearBean;
	}

	public List<Member> getMembers() {
		return this.members;
	}

	public void setMembers(List<Member> members) {
		this.members = members;
	}

}