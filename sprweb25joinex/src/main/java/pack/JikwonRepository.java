package pack;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface JikwonRepository extends CrudRepository <Jikwon, Integer> {
    @Query("SELECT j FROM Jikwon j WHERE j.GogekList IS NOT EMPTY")
    List<Jikwon> findJikwonWithGogek();
}
