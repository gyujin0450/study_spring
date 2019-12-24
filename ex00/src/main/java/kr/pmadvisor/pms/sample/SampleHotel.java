package kr.pmadvisor.pms.sample;

import org.springframework.stereotype.Component;

@Component
public class SampleHotel {
	
	private Chef chef;

	// 아래 생성자를 주입을  @RequiredArgsConstructor 임(p61) 
	public SampleHotel(Chef chef) {
		this.setChef(chef);
	}

	// chef의 getter/settor 생성이 필요한가?
	public Chef getChef() {
		return chef;
	}

	public void setChef(Chef chef) {
		this.chef = chef;
	}


	
	
}
