package chens.net.allaboutknowledge.jpa.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the pricepackage database table.
 * 
 */
@Entity
@Table(name="pricepackage")
public class Pricepackage implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="PRICEPACKAGE_PACKAGEID_GENERATOR", sequenceName="SYSTEM-UUID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PRICEPACKAGE_PACKAGEID_GENERATOR")
	@Column(unique=true, nullable=false, length=36)
	private String packageid;

	@Column(nullable=false, length=150)
	private String packagename;

	@Column(nullable=false)
	private double price;

	//bi-directional many-to-one association to Packagedesc
	@ManyToOne
	@JoinColumn(name="packagedesc", nullable=false)
	private Packagedesc packagedescBean;

	//bi-directional many-to-one association to Purchasehistory
	@OneToMany(mappedBy="pricepackageBean")
	private List<Purchasehistory> purchasehistories;

	public Pricepackage() {
	}

	public String getPackageid() {
		return this.packageid;
	}

	public void setPackageid(String packageid) {
		this.packageid = packageid;
	}

	public String getPackagename() {
		return this.packagename;
	}

	public void setPackagename(String packagename) {
		this.packagename = packagename;
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Packagedesc getPackagedescBean() {
		return this.packagedescBean;
	}

	public void setPackagedescBean(Packagedesc packagedescBean) {
		this.packagedescBean = packagedescBean;
	}

	public List<Purchasehistory> getPurchasehistories() {
		return this.purchasehistories;
	}

	public void setPurchasehistories(List<Purchasehistory> purchasehistories) {
		this.purchasehistories = purchasehistories;
	}

}