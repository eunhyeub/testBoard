package pack;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
	// private int busernum;
	
	@ManyToOne // 연관 관계의 주체(ownership, 주인)는 ManyToOne !!! (중요) (주인이 됨)
	// 직원이 부서만을 참조할 수 있음.
	@JoinColumn(name = "busernum") // Buser의 buserno(PK)와 관계를 맺는 foriegn key
	private Buser buser; // Buser(Entity)를 참조 : 부서의 pk가 대상
	
	
}
