package chens.net.allaboutknowledge.jpa.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the status database table.
 * 
 */
@Entity
@Table(name="status")
public class Status implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="STATUS_STATUSID_GENERATOR", sequenceName="SYSTEM-UUID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="STATUS_STATUSID_GENERATOR")
	@Column(unique=true, nullable=false, length=36)
	private String statusid;

	@Column(nullable=false, length=45)
	private String value;

	//bi-directional many-to-one association to Accountvalidation
	@OneToMany(mappedBy="statusBean")
	private List<Accountvalidation> accountvalidations;

	//bi-directional many-to-one association to Member
	@OneToMany(mappedBy="statusBean")
	private List<Member> members;

	//bi-directional many-to-one association to Membermonitquestion
	@OneToMany(mappedBy="statusBean")
	private List<Membermonitquestion> membermonitquestions;

	//bi-directional many-to-one association to Memberparticipatequestion
	@OneToMany(mappedBy="statusBean")
	private List<Memberparticipatequestion> memberparticipatequestions;

	//bi-directional many-to-one association to Purchasehistory
	@OneToMany(mappedBy="statusBean")
	private List<Purchasehistory> purchasehistories;

	//bi-directional many-to-one association to Question
	@OneToMany(mappedBy="statusBean")
	private List<Question> questions;

	public Status() {
	}

	public String getStatusid() {
		return this.statusid;
	}

	public void setStatusid(String statusid) {
		this.statusid = statusid;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public List<Accountvalidation> getAccountvalidations() {
		return this.accountvalidations;
	}

	public void setAccountvalidations(List<Accountvalidation> accountvalidations) {
		this.accountvalidations = accountvalidations;
	}

	public List<Member> getMembers() {
		return this.members;
	}

	public void setMembers(List<Member> members) {
		this.members = members;
	}

	public List<Membermonitquestion> getMembermonitquestions() {
		return this.membermonitquestions;
	}

	public void setMembermonitquestions(List<Membermonitquestion> membermonitquestions) {
		this.membermonitquestions = membermonitquestions;
	}

	public List<Memberparticipatequestion> getMemberparticipatequestions() {
		return this.memberparticipatequestions;
	}

	public void setMemberparticipatequestions(List<Memberparticipatequestion> memberparticipatequestions) {
		this.memberparticipatequestions = memberparticipatequestions;
	}

	public List<Purchasehistory> getPurchasehistories() {
		return this.purchasehistories;
	}

	public void setPurchasehistories(List<Purchasehistory> purchasehistories) {
		this.purchasehistories = purchasehistories;
	}

	public List<Question> getQuestions() {
		return this.questions;
	}

	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}

}