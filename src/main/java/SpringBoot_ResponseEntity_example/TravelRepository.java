package SpringBoot_ResponseEntity_example;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TravelRepository extends JpaRepository<Travel,Integer>
{

}
