package pack;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface JikwonRepository extends JpaRepository<Jikwon, Integer>{
	// 직원테이블과 부서테이블 연결 (이너 조인)
	@Query("SELECT j FROM Jikwon j JOIN j.buser b")
	List<Jikwon> findAllWithBuser(); // inner join. 일반적으로 외부조인 보다는 내부조인이 성능이 우수한 것으로 알려져 있다.
	
	@Query("SELECT j FROM Jikwon j JOIN j.buser b WHERE j.jikwonpay >= 5000")
	List<Jikwon> findAllWithHighPay(); // 조건부 join.
	
	@Query("SELECT j FROM Jikwon j JOIN j.buser b WHERE b.busername = :busername")
	List<Jikwon> findAllBuserName(); // 조건부 join.
	
	// Left Outer Join : 왼쪽테이블은 모든 자료를 반환하고, 오른쪽은 없는 경우 NULL
	@Query("SELECT j FROM Jikwon j LEFT JOIN j.buser b")
	List<Jikwon> findAllWithBuserLeftJoin();
	
	// Right Outer JOIN
	@Query("SELECT j FROM Jikwon j RIGHT JOIN j.buser b")
	List<Jikwon> findAllWithBuserRightJoin();

	// Fetch join : 연관된 엔티티를 한 번의 쿼리로 메모리로 로딩 (EAGER)
 	@Query("SELECT j FROM Jikwon j JOIN FETCH j.buser b")
	List<Jikwon> findAllWithBuserFetch();
 	
 	// Native join
 	@Query(value = "SELECT j.* FROM jikwon j JOIN buser b on j.busername=b.buserno", nativeQuery=true)
 	List<Jikwon> findAllWithBuserNative();
 	
 	// ... subquery
}
