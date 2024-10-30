package pack;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class JikwonDto {
	private int jikwonno;
	private String jikwonname;
	private String jikwonjik;
	private int jikwonpay;
	
	// Dto --> Entity
	public Jikwon toEntity() {
		Jikwon jikwon = new Jikwon();
		jikwon.setJikwonno(this.jikwonno);
		jikwon.setJikwonname(this.jikwonname);
		jikwon.setJikwonjik(this.jikwonjik);
		jikwon.setJikwonpay(this.jikwonpay);
	
		return jikwon;
	}
		
		// Entity --> Dto
	public static JikwonDto fromEntity(Jikwon jikwon) {
	JikwonDto dto = new JikwonDto();
	dto.setJikwonno(jikwon.getJikwonno());
	dto.setJikwonname(jikwon.getJikwonname());
	dto.setJikwonjik(jikwon.getJikwonjik());
	dto.setJikwonpay(jikwon.getJikwonpay());
	
	return dto;
	}
}
