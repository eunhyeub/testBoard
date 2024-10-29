package pack;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BuserDto {
	private int buserno;
	private String busername;
	private String buserloc;
	private String busertel;
	
	// Dto --> Entity
	public Buser toEntity() {
		Buser buser = new Buser();
		buser.setBuserno(this.buserno);
		buser.setBusername(this.busername);
		buser.setBuserloc(this.buserloc);
		buser.setBusertel(this.busertel);
		
		return buser;
	}
	
	// Entity --> Dto
	public static BuserDto fromEntity(Buser buser) {
		BuserDto dto = new BuserDto();
		dto.setBuserno(buser.getBuserno());
		dto.setBusername(buser.getBusername());
		dto.setBuserloc(buser.getBuserloc());
		dto.setBusertel(buser.getBusertel());
		
		return dto;
	}
}
