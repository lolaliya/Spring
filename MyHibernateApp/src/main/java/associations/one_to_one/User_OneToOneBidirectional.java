package associations.one_to_one;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class User_OneToOneBidirectional {

	@Id @Column(name="user_id")
	private int userId;

	private String name;

	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="voter_id")
	private VoterCard voterCard;

	public int getUser_id() {
		return userId;
	}

	public void setUser_id(int user_id) {
		this.userId = user_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public VoterCard getVoterCard() {
		return voterCard;
	}

	public void setVoterCard(VoterCard voterCard) {
		this.voterCard = voterCard;
	}
}