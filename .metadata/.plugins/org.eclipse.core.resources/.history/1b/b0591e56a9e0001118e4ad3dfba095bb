package chens.net.allaboutknowledge.jpa.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the gender database table.
 * 
 */
@Entity
@Table(name="gender")
public class Gender implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="GENDER_GENDERID_GENERATOR", sequenceName="SYSTEM-UUID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="GENDER_GENDERID_GENERATOR")
	@Column(unique=true, nullable=false, length=36)
	private String genderid;

	@Column(nullable=false, length=45)
	private String gender;

	//bi-directional many-to-one association to Personaldesc
	@OneToMany(mappedBy="genderBean")
	private List<Personaldesc> personaldescs;

	public Gender() {
	}

	public String getGenderid() {
		return this.genderid;
	}

	public void setGenderid(String genderid) {
		this.genderid = genderid;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public List<Personaldesc> getPersonaldescs() {
		return this.personaldescs;
	}

	public void setPersonaldescs(List<Personaldesc> personaldescs) {
		this.personaldescs = personaldescs;
	}

}