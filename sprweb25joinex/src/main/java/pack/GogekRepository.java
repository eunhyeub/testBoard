package pack;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface GogekRepository extends JpaRepository<Gogek, Integer> {
	@Query("SELECT g FROM Jikwon j JOIN j.GogekList g")
	List<Jikwon> findJikwonData();
	
	@Query("SELECT g FROM Gogek g WHERE g.jikwon.jikwonno = :jikwonno")
	List<Gogek> findGogekData(@Param("jikwonno")int jikwonno);
}
