package pack.dto;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pack.entity.Dept;
import pack.entity.Emp;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DeptDto {
	private int deptno;
	private String dname;
	private String loc;
	
	private int count; // 근무 인원수
	private List<String> names; // 근무 직원 이름들
	
	// Entity -> Dto
	public static DeptDto toDto(Dept dept) {
		List<String> names = new ArrayList<String>();
		for(Emp imsi : dept.getList()) {
			names.add(imsi.getEname());
		}
		
		return DeptDto.builder()
				.deptno(dept.getDeptno())
				.dname(dept.getDname())
				.loc(dept.getLoc())
				.count(dept.getList().size())
				.names(names)
				.build();
				
	}
	
}
