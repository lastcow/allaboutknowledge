package chens.net.allaboutknowledge.jpa.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the emailformat database table.
 * 
 */
@Entity
@Table(name="emailformat")
public class Emailformat implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="EMAILFORMAT_EFID_GENERATOR", sequenceName="SYSTEM-UUID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="EMAILFORMAT_EFID_GENERATOR")
	@Column(unique=true, nullable=false, length=36)
	private String efid;

	@Column(nullable=false, length=50)
	private String emailtype;

	//bi-directional many-to-one association to Member
	@OneToMany(mappedBy="emailformatBean")
	private List<Member> members;

	public Emailformat() {
	}

	public String getEfid() {
		return this.efid;
	}

	public void setEfid(String efid) {
		this.efid = efid;
	}

	public String getEmailtype() {
		return this.emailtype;
	}

	public void setEmailtype(String emailtype) {
		this.emailtype = emailtype;
	}

	public List<Member> getMembers() {
		return this.members;
	}

	public void setMembers(List<Member> members) {
		this.members = members;
	}

}