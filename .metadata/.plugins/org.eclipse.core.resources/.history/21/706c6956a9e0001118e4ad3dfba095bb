package chens.net.allaboutknowledge.jpa.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the membermonitquestion database table.
 * 
 */
@Entity
@Table(name="membermonitquestion")
public class Membermonitquestion implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private MembermonitquestionPK id;

	//bi-directional many-to-one association to Member
	@ManyToOne
	@JoinColumn(name="member", nullable=false, insertable=false, updatable=false)
	private Member memberBean;

	//bi-directional many-to-one association to Question
	@ManyToOne
	@JoinColumn(name="question", nullable=false, insertable=false, updatable=false)
	private Question questionBean;

	//bi-directional many-to-one association to Status
	@ManyToOne
	@JoinColumn(name="status", nullable=false)
	private Status statusBean;

	public Membermonitquestion() {
	}

	public MembermonitquestionPK getId() {
		return this.id;
	}

	public void setId(MembermonitquestionPK id) {
		this.id = id;
	}

	public Member getMemberBean() {
		return this.memberBean;
	}

	public void setMemberBean(Member memberBean) {
		this.memberBean = memberBean;
	}

	public Question getQuestionBean() {
		return this.questionBean;
	}

	public void setQuestionBean(Question questionBean) {
		this.questionBean = questionBean;
	}

	public Status getStatusBean() {
		return this.statusBean;
	}

	public void setStatusBean(Status statusBean) {
		this.statusBean = statusBean;
	}

}