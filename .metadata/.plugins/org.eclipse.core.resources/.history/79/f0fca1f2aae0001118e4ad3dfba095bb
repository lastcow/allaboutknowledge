package chens.net.allaboutknowledge.jpa.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the member_has_role database table.
 * 
 */
@Entity
@Table(name="member_has_role")
public class MemberHasRole implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private MemberHasRolePK id;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable=false)
	private Date since;

	//bi-directional many-to-one association to Member
	@ManyToOne
	@JoinColumn(name="member", nullable=false, insertable=false, updatable=false)
	private Member memberBean;

	//bi-directional many-to-one association to Role
	@ManyToOne
	@JoinColumn(name="role", nullable=false, insertable=false, updatable=false)
	private Role roleBean;

	public MemberHasRole() {
	}

	public MemberHasRolePK getId() {
		return this.id;
	}

	public void setId(MemberHasRolePK id) {
		this.id = id;
	}

	public Date getSince() {
		return this.since;
	}

	public void setSince(Date since) {
		this.since = since;
	}

	public Member getMemberBean() {
		return this.memberBean;
	}

	public void setMemberBean(Member memberBean) {
		this.memberBean = memberBean;
	}

	public Role getRoleBean() {
		return this.roleBean;
	}

	public void setRoleBean(Role roleBean) {
		this.roleBean = roleBean;
	}

}