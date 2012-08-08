package chens.net.allaboutknowledge.jpa.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the member_has_messenger database table.
 * 
 */
@Entity
@Table(name="member_has_messenger")
public class MemberHasMessenger implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="MEMBER_HAS_MESSENGER_MMID_GENERATOR", sequenceName="SYSTEM-UUID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="MEMBER_HAS_MESSENGER_MMID_GENERATOR")
	@Column(unique=true, nullable=false, length=36)
	private String mmid;

	@Column(nullable=false, length=150)
	private String messengeraccount;

	//bi-directional many-to-one association to Member
	@ManyToOne
	@JoinColumn(name="member", nullable=false)
	private Member memberBean;

	//bi-directional many-to-one association to Messenger
	@ManyToOne
	@JoinColumn(name="messenger", nullable=false)
	private Messenger messengerBean;

	public MemberHasMessenger() {
	}

	public String getMmid() {
		return this.mmid;
	}

	public void setMmid(String mmid) {
		this.mmid = mmid;
	}

	public String getMessengeraccount() {
		return this.messengeraccount;
	}

	public void setMessengeraccount(String messengeraccount) {
		this.messengeraccount = messengeraccount;
	}

	public Member getMemberBean() {
		return this.memberBean;
	}

	public void setMemberBean(Member memberBean) {
		this.memberBean = memberBean;
	}

	public Messenger getMessengerBean() {
		return this.messengerBean;
	}

	public void setMessengerBean(Messenger messengerBean) {
		this.messengerBean = messengerBean;
	}

}