package chens.net.allaboutknowledge.jpa.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the member_has_role database table.
 * 
 */
@Embeddable
public class MemberHasRolePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(unique=true, nullable=false, length=36)
	private String member;

	@Column(unique=true, nullable=false, length=36)
	private String role;

	public MemberHasRolePK() {
	}
	public String getMember() {
		return this.member;
	}
	public void setMember(String member) {
		this.member = member;
	}
	public String getRole() {
		return this.role;
	}
	public void setRole(String role) {
		this.role = role;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof MemberHasRolePK)) {
			return false;
		}
		MemberHasRolePK castOther = (MemberHasRolePK)other;
		return 
			this.member.equals(castOther.member)
			&& this.role.equals(castOther.role);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.member.hashCode();
		hash = hash * prime + this.role.hashCode();
		
		return hash;
	}
}