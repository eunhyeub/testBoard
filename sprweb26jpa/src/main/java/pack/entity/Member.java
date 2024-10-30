package pack.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pack.dto.MemberDto;

@Entity
@Table(name = "MEMBER_TBL")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Member {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) // defalut
	private Long num;
	
	private String name;
	private String addr;
	
	// Dto -> Entity
	public static Member toEntity(MemberDto dto) {
		return Member.builder()
				.num(dto.getNum())
				.name(dto.getName())
				.addr(dto.getAddr())
				.build();
	}
	
}
