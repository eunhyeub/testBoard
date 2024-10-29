package pack;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
// @Service
public class JikwonService {
	@Autowired
	private JikwonRepository jikwonRepository;
	
	public List<JikwonDto> getJikwonData() {
		// 전체 자료 읽기 1
		List<Jikwon> jikwonList = jikwonRepository.findAllWithBuser();
		
		List<JikwonDto> jikwonDtoList = new ArrayList<JikwonDto>();
		for(Jikwon jikwon : jikwonList) {
			jikwonDtoList.add(JikwonDto.fromEntity(jikwon));
		}
		
		return jikwonDtoList;
		
		
	}
}
