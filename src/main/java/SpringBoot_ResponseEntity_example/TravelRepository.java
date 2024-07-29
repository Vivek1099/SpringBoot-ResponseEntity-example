package SpringBoot_ResponseEntity_example;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TravelRepository extends JpaRepository<Travel,Integer>
{
	List<Travel> findByPlace(String place);
}
