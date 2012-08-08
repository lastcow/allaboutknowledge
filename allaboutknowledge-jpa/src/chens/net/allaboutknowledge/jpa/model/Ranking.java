package chens.net.allaboutknowledge.jpa.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the ranking database table.
 * 
 */
@Entity
@Table(name="ranking")
public class Ranking implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="RANKING_RANKINGID_GENERATOR", sequenceName="SYSTEM-UUID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="RANKING_RANKINGID_GENERATOR")
	@Column(unique=true, nullable=false, length=36)
	private String rankingid;

	@Column(nullable=false, length=45)
	private String value;

	//bi-directional many-to-one association to Member
	@OneToMany(mappedBy="rankingBean")
	private List<Member> members;

	public Ranking() {
	}

	public String getRankingid() {
		return this.rankingid;
	}

	public void setRankingid(String rankingid) {
		this.rankingid = rankingid;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public List<Member> getMembers() {
		return this.members;
	}

	public void setMembers(List<Member> members) {
		this.members = members;
	}

}