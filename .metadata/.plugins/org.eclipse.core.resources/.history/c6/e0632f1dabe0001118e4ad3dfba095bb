package chens.net.allaboutknowledge.jpa.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the member database table.
 * 
 */
@Entity
@Table(name="member")
public class Member implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="MEMBER_MEMBERID_GENERATOR", sequenceName="SYSTEM-UUID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="MEMBER_MEMBERID_GENERATOR")
	@Column(unique=true, nullable=false, length=36)
	private String memberid;

	@Column(nullable=false, length=300)
	private String email;

	@Column(nullable=false, length=150)
	private String password;

	@Column(nullable=false)
	private float points;

	@Column(length=150)
	private String screenname;

	@Column(length=150)
	private String timezone;

	@Column(nullable=false)
	private int totalsubscription;

	@Column(nullable=false, length=150)
	private String username;

	@Version
	@Column(nullable=false)
	private int version;

	//bi-directional many-to-one association to Accounttype
	@ManyToOne
	@JoinColumn(name="accounttype", nullable=false)
	private Accounttype accounttypeBean;

	//bi-directional many-to-one association to Accountvalidation
	@ManyToOne
	@JoinColumn(name="accountvalidation", nullable=false)
	private Accountvalidation accountvalidationBean;

	//bi-directional many-to-one association to Education
	@ManyToOne
	@JoinColumn(name="education")
	private Education educationBean;

	//bi-directional many-to-one association to Emailformat
	@ManyToOne
	@JoinColumn(name="emailformat", nullable=false)
	private Emailformat emailformatBean;

	//bi-directional many-to-one association to Employeement
	@ManyToOne
	@JoinColumn(name="employeement")
	private Employeement employeementBean;

	//bi-directional many-to-one association to Personalhobby
	@ManyToOne
	@JoinColumn(name="personalhobbies")
	private Personalhobby personalhobby;

	//bi-directional many-to-one association to Ranking
	@ManyToOne
	@JoinColumn(name="ranking", nullable=false)
	private Ranking rankingBean;

	//bi-directional many-to-one association to Status
	@ManyToOne
	@JoinColumn(name="status", nullable=false)
	private Status statusBean;

	//bi-directional many-to-one association to MemberHasMessenger
	@OneToMany(mappedBy="memberBean")
	private List<MemberHasMessenger> memberHasMessengers;

	//bi-directional many-to-one association to MemberHasRole
	@OneToMany(mappedBy="memberBean")
	private List<MemberHasRole> memberHasRoles;

	//bi-directional many-to-one association to Membermonitquestion
	@OneToMany(mappedBy="memberBean")
	private List<Membermonitquestion> membermonitquestions;

	//bi-directional many-to-one association to Memberparticipatequestion
	@OneToMany(mappedBy="memberBean")
	private List<Memberparticipatequestion> memberparticipatequestions;

	//bi-directional many-to-one association to Personaldesc
	@OneToMany(mappedBy="member")
	private List<Personaldesc> personaldescs;

	//bi-directional many-to-one association to Personalinfo
	@OneToMany(mappedBy="memberBean")
	private List<Personalinfo> personalinfos;

	//bi-directional many-to-one association to Purchasehistory
	@OneToMany(mappedBy="memberBean")
	private List<Purchasehistory> purchasehistories;

	//bi-directional many-to-one association to Question
	@OneToMany(mappedBy="member")
	private List<Question> questions;

	public Member() {
	}

	public String getMemberid() {
		return this.memberid;
	}

	public void setMemberid(String memberid) {
		this.memberid = memberid;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public float getPoints() {
		return this.points;
	}

	public void setPoints(float points) {
		this.points = points;
	}

	public String getScreenname() {
		return this.screenname;
	}

	public void setScreenname(String screenname) {
		this.screenname = screenname;
	}

	public String getTimezone() {
		return this.timezone;
	}

	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}

	public int getTotalsubscription() {
		return this.totalsubscription;
	}

	public void setTotalsubscription(int totalsubscription) {
		this.totalsubscription = totalsubscription;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getVersion() {
		return this.version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public Accounttype getAccounttypeBean() {
		return this.accounttypeBean;
	}

	public void setAccounttypeBean(Accounttype accounttypeBean) {
		this.accounttypeBean = accounttypeBean;
	}

	public Accountvalidation getAccountvalidationBean() {
		return this.accountvalidationBean;
	}

	public void setAccountvalidationBean(Accountvalidation accountvalidationBean) {
		this.accountvalidationBean = accountvalidationBean;
	}

	public Education getEducationBean() {
		return this.educationBean;
	}

	public void setEducationBean(Education educationBean) {
		this.educationBean = educationBean;
	}

	public Emailformat getEmailformatBean() {
		return this.emailformatBean;
	}

	public void setEmailformatBean(Emailformat emailformatBean) {
		this.emailformatBean = emailformatBean;
	}

	public Employeement getEmployeementBean() {
		return this.employeementBean;
	}

	public void setEmployeementBean(Employeement employeementBean) {
		this.employeementBean = employeementBean;
	}

	public Personalhobby getPersonalhobby() {
		return this.personalhobby;
	}

	public void setPersonalhobby(Personalhobby personalhobby) {
		this.personalhobby = personalhobby;
	}

	public Ranking getRankingBean() {
		return this.rankingBean;
	}

	public void setRankingBean(Ranking rankingBean) {
		this.rankingBean = rankingBean;
	}

	public Status getStatusBean() {
		return this.statusBean;
	}

	public void setStatusBean(Status statusBean) {
		this.statusBean = statusBean;
	}

	public List<MemberHasMessenger> getMemberHasMessengers() {
		return this.memberHasMessengers;
	}

	public void setMemberHasMessengers(List<MemberHasMessenger> memberHasMessengers) {
		this.memberHasMessengers = memberHasMessengers;
	}

	public List<MemberHasRole> getMemberHasRoles() {
		return this.memberHasRoles;
	}

	public void setMemberHasRoles(List<MemberHasRole> memberHasRoles) {
		this.memberHasRoles = memberHasRoles;
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

	public List<Personaldesc> getPersonaldescs() {
		return this.personaldescs;
	}

	public void setPersonaldescs(List<Personaldesc> personaldescs) {
		this.personaldescs = personaldescs;
	}

	public List<Personalinfo> getPersonalinfos() {
		return this.personalinfos;
	}

	public void setPersonalinfos(List<Personalinfo> personalinfos) {
		this.personalinfos = personalinfos;
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