package chens.net.allaboutknowledge.jpa.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the personalhobbies database table.
 * 
 */
@Entity
@Table(name="personalhobbies")
public class Personalhobby implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="PERSONALHOBBIES_HOBBIESID_GENERATOR", sequenceName="SYSTEM-UUID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PERSONALHOBBIES_HOBBIESID_GENERATOR")
	@Column(unique=true, nullable=false, length=36)
	private String hobbiesid;

	@Column(length=4000)
	private String hobbies;

	@Column(nullable=false, length=1)
	private String ispublic;

	//bi-directional many-to-one association to Member
	@OneToMany(mappedBy="personalhobby")
	private List<Member> members;

	public Personalhobby() {
	}

	public String getHobbiesid() {
		return this.hobbiesid;
	}

	public void setHobbiesid(String hobbiesid) {
		this.hobbiesid = hobbiesid;
	}

	public String getHobbies() {
		return this.hobbies;
	}

	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}

	public String getIspublic() {
		return this.ispublic;
	}

	public void setIspublic(String ispublic) {
		this.ispublic = ispublic;
	}

	public List<Member> getMembers() {
		return this.members;
	}

	public void setMembers(List<Member> members) {
		this.members = members;
	}

}