package SpringBoot_ResponseEntity_example;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "traveldata")
public class Travel 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="travel_id")
	int id;
	@Column(name="travel_place")
	String place;
	@Column(name="no_of_days")
	int days;
	@Column(name="travel_expense")
	int expnse;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public int getDays() {
		return days;
	}
	public void setDays(int days) {
		this.days = days;
	}
	public int getExpnse() {
		return expnse;
	}
	public void setExpnse(int expnse) {
		this.expnse = expnse;
	}
	
}
