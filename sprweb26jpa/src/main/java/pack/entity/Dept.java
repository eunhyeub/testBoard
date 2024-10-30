package pack.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Dept {
	@Id
	private int deptno;
	private String dname;
	private String loc;
	
	@OneToMany(mappedBy = "dept", fetch = FetchType.EAGER)
	@Builder.Default // arraylist 초기화 작업 진행
	private List<Emp> list = new ArrayList<Emp>();
}
