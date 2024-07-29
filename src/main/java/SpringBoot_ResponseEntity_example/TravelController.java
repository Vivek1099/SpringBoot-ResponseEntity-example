package SpringBoot_ResponseEntity_example;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TravelController 
{
	@Autowired
	TravelRepository trepo;
	
	@RequestMapping("/test")
	public ResponseEntity<String> test()
	{
		return new ResponseEntity<>("Demo travel test",HttpStatus.OK);
	}
	
	@RequestMapping("/save")
	public ResponseEntity<String> savedata(@RequestBody Travel travel)
	{
		trepo.save(travel);
		return new ResponseEntity<>("Data Saved",HttpStatus.OK);
	}
	
	@RequestMapping("/show")
	public ResponseEntity<List<Travel>> showdata()
	{
		return new ResponseEntity<>(trepo.findAll(),HttpStatus.OK);
	}
	
	@RequestMapping("/{id}")
	public ResponseEntity<Travel> byid(@PathVariable int id)
	{
		Optional<Travel> travel = trepo.findById(id);
		return new ResponseEntity<>(travel.get(),HttpStatus.OK);
	}
	
	@RequestMapping("/del/{id}")
	public ResponseEntity<Travel> delbyid(@PathVariable int id)
	{
		Travel travel = trepo.findById(id).get();
		trepo.delete(travel);
		return new ResponseEntity<>(travel,HttpStatus.OK);
	}
	
	@RequestMapping("/place/{place}")
	public ResponseEntity<List<Travel>> byplace(@PathVariable String place)
	{
		return new ResponseEntity<>(trepo.findByPlace(place),HttpStatus.OK);
	}
}
