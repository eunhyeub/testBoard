package pack.entity;

import java.util.Date;

import jakarta.persistence.ConstraintMode;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Emp {
	@Id
	private Integer empno; // 기본값 int : 0 / Integer : null
	private String ename;
	private String job;
	private Integer mgr;
	// 날짜 타입 지정
	@Temporal(TemporalType.DATE)
	private Date hiredate;
	private Double sal;
	private Double comm;
	// private Integer deptno;
	
	@ManyToOne(fetch = FetchType.EAGER)
	// 외래키 제약조건 제거
	@JoinColumn(name = "deptno", foreignKey = @ForeignKey(value = ConstraintMode.NO_CONSTRAINT))
	private Dept dept;
}
