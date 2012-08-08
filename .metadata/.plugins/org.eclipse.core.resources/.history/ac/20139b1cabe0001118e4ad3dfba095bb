package chens.net.allaboutknowledge.jpa.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the accountvalidation database table.
 * 
 */
@Entity
@Table(name="accountvalidation")
public class Accountvalidation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="ACCOUNTVALIDATION_AVID_GENERATOR", sequenceName="SYSTEM-UUID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ACCOUNTVALIDATION_AVID_GENERATOR")
	@Column(unique=true, nullable=false, length=36)
	private String avid;

	@Column(nullable=false, length=250)
	private String key;

	//bi-directional many-to-one association to Status
	@ManyToOne
	@JoinColumn(name="status", nullable=false)
	private Status statusBean;

	//bi-directional many-to-one association to Member
	@OneToMany(mappedBy="accountvalidationBean")
	private List<Member> members;

	public Accountvalidation() {
	}

	public String getAvid() {
		return this.avid;
	}

	public void setAvid(String avid) {
		this.avid = avid;
	}

	public String getKey() {
		return this.key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public Status getStatusBean() {
		return this.statusBean;
	}

	public void setStatusBean(Status statusBean) {
		this.statusBean = statusBean;
	}

	public List<Member> getMembers() {
		return this.members;
	}

	public void setMembers(List<Member> members) {
		this.members = members;
	}

}