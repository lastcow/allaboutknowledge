package chens.net.allaboutknowledge.jpa.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the accounttype database table.
 * 
 */
@Entity
@Table(name="accounttype")
public class Accounttype implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="ACCOUNTTYPE_TYPEID_GENERATOR", sequenceName="SYSTEM-UUID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ACCOUNTTYPE_TYPEID_GENERATOR")
	@Column(unique=true, nullable=false, length=36)
	private String typeid;

	@Column(nullable=false, length=150)
	private String type;

	//bi-directional many-to-one association to Member
	@OneToMany(mappedBy="accounttypeBean")
	private List<Member> members;

	public Accounttype() {
	}

	public String getTypeid() {
		return this.typeid;
	}

	public void setTypeid(String typeid) {
		this.typeid = typeid;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<Member> getMembers() {
		return this.members;
	}

	public void setMembers(List<Member> members) {
		this.members = members;
	}

}