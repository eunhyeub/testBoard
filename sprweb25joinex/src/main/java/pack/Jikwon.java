package pack;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Jikwon {
	@Id
	private int jikwonno;
	private String jikwonname;
	private String jikwonjik;
	private int jikwonpay;
	
	// 양방향
	@OneToMany(mappedBy = "jikwon", fetch = FetchType.LAZY) // FetchType.EAGER
	private List<Gogek> GogekList;	
}
