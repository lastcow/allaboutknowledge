package chens.net.allaboutknowledge.jpa.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the personalinfo database table.
 * 
 */
@Entity
@Table(name="personalinfo")
public class Personalinfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="PERSONALINFO_INFOID_GENERATOR", sequenceName="SYSTEM-UUID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PERSONALINFO_INFOID_GENERATOR")
	@Column(unique=true, nullable=false, length=36)
	private String infoid;

	@Column(length=4000)
	private String info;

	@Column(nullable=false, length=1)
	private String ispublic;

	//bi-directional many-to-one association to Member
	@ManyToOne
	@JoinColumn(name="member", nullable=false)
	private Member memberBean;

	public Personalinfo() {
	}

	public String getInfoid() {
		return this.infoid;
	}

	public void setInfoid(String infoid) {
		this.infoid = infoid;
	}

	public String getInfo() {
		return this.info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public String getIspublic() {
		return this.ispublic;
	}

	public void setIspublic(String ispublic) {
		this.ispublic = ispublic;
	}

	public Member getMemberBean() {
		return this.memberBean;
	}

	public void setMemberBean(Member memberBean) {
		this.memberBean = memberBean;
	}

}