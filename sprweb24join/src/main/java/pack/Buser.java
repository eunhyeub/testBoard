package pack;

import java.util.List;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Buser {
	@Id
	// @GeneratedValue(strategy = GenerationType.IDENTITY) // pk값 자동증가
	private int buserno;
	private String busername;
	private String buserloc;
	private String busertel;
	
	// 하나의 부서는 여러명의 직원과 연관될 수 있다.
	// 직원이 주인
	@OneToMany(mappedBy = "buser", fetch = FetchType.LAZY) // FetchType.EAGER
	private List<Jikwon> jikwonList;
	
}
