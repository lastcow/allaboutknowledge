package chens.net.allaboutknowledge.jpa.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the role database table.
 * 
 */
@Entity
@Table(name="role")
public class Role implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="ROLE_ROLEID_GENERATOR", sequenceName="SYSTEM-UUID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ROLE_ROLEID_GENERATOR")
	@Column(unique=true, nullable=false, length=36)
	private String roleid;

	@Column(length=400)
	private String desc;

	@Column(nullable=false, length=150)
	private String name;

	@Column(nullable=false, length=1)
	private String valid;

	//bi-directional many-to-one association to MemberHasRole
	@OneToMany(mappedBy="roleBean")
	private List<MemberHasRole> memberHasRoles;

	public Role() {
	}

	public String getRoleid() {
		return this.roleid;
	}

	public void setRoleid(String roleid) {
		this.roleid = roleid;
	}

	public String getDesc() {
		return this.desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValid() {
		return this.valid;
	}

	public void setValid(String valid) {
		this.valid = valid;
	}

	public List<MemberHasRole> getMemberHasRoles() {
		return this.memberHasRoles;
	}

	public void setMemberHasRoles(List<MemberHasRole> memberHasRoles) {
		this.memberHasRoles = memberHasRoles;
	}

}