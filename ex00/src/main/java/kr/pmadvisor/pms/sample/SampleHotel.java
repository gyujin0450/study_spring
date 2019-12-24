package kr.pmadvisor.pms.sample;

import org.springframework.stereotype.Component;

@Component
public class SampleHotel {
	
	private Chef chef;

	// 생성자를 선언하고 Chef를 주입함(p68)
	public SampleHotel(Chef chef) {
		this.setChef(chef);
	}

	// toString() 생성
	@Override
	public String toString() {
		return "SampleHotel [chef=" + chef + "]";
	}

	// setter/getter 생성
	public Chef getChef() {
		return chef;
	}

	public void setChef(Chef chef) {
		this.chef = chef;
	}
	
}
