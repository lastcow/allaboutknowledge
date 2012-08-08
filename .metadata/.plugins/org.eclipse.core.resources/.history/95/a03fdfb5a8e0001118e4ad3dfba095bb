package chens.net.allaboutknowledge.jpa.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the membermonitquestion database table.
 * 
 */
@Embeddable
public class MembermonitquestionPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(unique=true, nullable=false, length=36)
	private String member;

	@Column(unique=true, nullable=false, length=36)
	private String question;

	public MembermonitquestionPK() {
	}
	public String getMember() {
		return this.member;
	}
	public void setMember(String member) {
		this.member = member;
	}
	public String getQuestion() {
		return this.question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof MembermonitquestionPK)) {
			return false;
		}
		MembermonitquestionPK castOther = (MembermonitquestionPK)other;
		return 
			this.member.equals(castOther.member)
			&& this.question.equals(castOther.question);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.member.hashCode();
		hash = hash * prime + this.question.hashCode();
		
		return hash;
	}
}