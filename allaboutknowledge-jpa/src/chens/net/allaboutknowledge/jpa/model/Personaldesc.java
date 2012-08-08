package chens.net.allaboutknowledge.jpa.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the personaldesc database table.
 * 
 */
@Entity
@Table(name="personaldesc")
public class Personaldesc implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="PERSONALDESC_DESCID_GENERATOR", sequenceName="SYSTEM-UUID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PERSONALDESC_DESCID_GENERATOR")
	@Column(unique=true, nullable=false, length=36)
	private String descid;

	@Temporal(TemporalType.DATE)
	private Date birthday;

	@Column(length=250)
	private String city;

	@Column(nullable=false, length=150)
	private String firstname;

	@Column(nullable=false, length=1)
	private String ispublic;

	@Column(length=150)
	private String lastname;

	//bi-directional many-to-one association to Agerange
	@ManyToOne
	@JoinColumn(name="agerange", nullable=false)
	private Agerange agerangeBean;

	//bi-directional many-to-one association to Country
	@ManyToOne
	@JoinColumn(name="country", nullable=false)
	private Country countryBean;

	//bi-directional many-to-one association to Gender
	@ManyToOne
	@JoinColumn(name="gender", nullable=false)
	private Gender genderBean;

	//bi-directional many-to-one association to Member
	@ManyToOne
	@JoinColumn(name="memberid", nullable=false)
	private Member member;

	public Personaldesc() {
	}

	public String getDescid() {
		return this.descid;
	}

	public void setDescid(String descid) {
		this.descid = descid;
	}

	public Date getBirthday() {
		return this.birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getIspublic() {
		return this.ispublic;
	}

	public void setIspublic(String ispublic) {
		this.ispublic = ispublic;
	}

	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Agerange getAgerangeBean() {
		return this.agerangeBean;
	}

	public void setAgerangeBean(Agerange agerangeBean) {
		this.agerangeBean = agerangeBean;
	}

	public Country getCountryBean() {
		return this.countryBean;
	}

	public void setCountryBean(Country countryBean) {
		this.countryBean = countryBean;
	}

	public Gender getGenderBean() {
		return this.genderBean;
	}

	public void setGenderBean(Gender genderBean) {
		this.genderBean = genderBean;
	}

	public Member getMember() {
		return this.member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

}