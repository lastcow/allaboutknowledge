package chens.net.allaboutknowledge.jpa.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the memberparticipatequestion database table.
 * 
 */
@Entity
@Table(name="memberparticipatequestion")
public class Memberparticipatequestion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="MEMBERPARTICIPATEQUESTION_PATICIPATEID_GENERATOR", sequenceName="SYSTEM-UUID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="MEMBERPARTICIPATEQUESTION_PATICIPATEID_GENERATOR")
	@Column(unique=true, nullable=false, length=36)
	private String paticipateid;

	@Column(nullable=false, length=45)
	private String comment;

	@Column(length=1)
	private String markedasanswer;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable=false)
	private Date participatedate;

	@Column(nullable=false)
	private float pointsenared;

	//bi-directional many-to-one association to Member
	@ManyToOne
	@JoinColumn(name="member", nullable=false)
	private Member memberBean;

	//bi-directional many-to-one association to Question
	@ManyToOne
	@JoinColumn(name="question", nullable=false)
	private Question questionBean;

	//bi-directional many-to-one association to Status
	@ManyToOne
	@JoinColumn(name="status", nullable=false)
	private Status statusBean;

	public Memberparticipatequestion() {
	}

	public String getPaticipateid() {
		return this.paticipateid;
	}

	public void setPaticipateid(String paticipateid) {
		this.paticipateid = paticipateid;
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getMarkedasanswer() {
		return this.markedasanswer;
	}

	public void setMarkedasanswer(String markedasanswer) {
		this.markedasanswer = markedasanswer;
	}

	public Date getParticipatedate() {
		return this.participatedate;
	}

	public void setParticipatedate(Date participatedate) {
		this.participatedate = participatedate;
	}

	public float getPointsenared() {
		return this.pointsenared;
	}

	public void setPointsenared(float pointsenared) {
		this.pointsenared = pointsenared;
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