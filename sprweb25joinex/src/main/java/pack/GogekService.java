package pack;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class GogekService {
	@Autowired
	private GogekRepository gogekRepository;

	List<JikwonDto> getfindJikwon() {
		return gogekRepository.findJikwonData()
				.stream()
				.map(JikwonDto :: fromEntity)
				.collect(Collectors.toList());
	}
	
	List<GogekDto> getfindGogek(int jikwonno) {
		return gogekRepository.findGogekData(jikwonno)
				.stream()
				.map(GogekDto :: fromEntity)
				.collect(Collectors.toList());
	}
}
