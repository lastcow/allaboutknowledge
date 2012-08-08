package chens.net.allaboutknowledge.jpa.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the purchasehistory database table.
 * 
 */
@Entity
@Table(name="purchasehistory")
public class Purchasehistory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="PURCHASEHISTORY_HISTORYID_GENERATOR", sequenceName="SYSTEM-UUID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PURCHASEHISTORY_HISTORYID_GENERATOR")
	@Column(unique=true, nullable=false, length=45)
	private String historyid;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable=false)
	private Date purchaseddate;

	//bi-directional many-to-one association to Member
	@ManyToOne
	@JoinColumn(name="member", nullable=false)
	private Member memberBean;

	//bi-directional many-to-one association to Pricepackage
	@ManyToOne
	@JoinColumn(name="pricepackage", nullable=false)
	private Pricepackage pricepackageBean;

	//bi-directional many-to-one association to Status
	@ManyToOne
	@JoinColumn(name="status", nullable=false)
	private Status statusBean;

	public Purchasehistory() {
	}

	public String getHistoryid() {
		return this.historyid;
	}

	public void setHistoryid(String historyid) {
		this.historyid = historyid;
	}

	public Date getPurchaseddate() {
		return this.purchaseddate;
	}

	public void setPurchaseddate(Date purchaseddate) {
		this.purchaseddate = purchaseddate;
	}

	public Member getMemberBean() {
		return this.memberBean;
	}

	public void setMemberBean(Member memberBean) {
		this.memberBean = memberBean;
	}

	public Pricepackage getPricepackageBean() {
		return this.pricepackageBean;
	}

	public void setPricepackageBean(Pricepackage pricepackageBean) {
		this.pricepackageBean = pricepackageBean;
	}

	public Status getStatusBean() {
		return this.statusBean;
	}

	public void setStatusBean(Status statusBean) {
		this.statusBean = statusBean;
	}

}