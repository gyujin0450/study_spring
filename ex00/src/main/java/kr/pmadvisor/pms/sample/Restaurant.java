package kr.pmadvisor.pms.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *	Restaurant 객체가  Chef 타입의 객체를 필요로 한다는 상황임
 */

@Component  // 스프링에게 해당클래스가 스프링에서 관리해야 하는 대상임을 표시
public class Restaurant {

	@Autowired
	private Chef chef;
	
	// lombok 제거로 Setter/Getter 설정 필요!!
	public Chef getChef() {
		return chef;
	}

	public void setChef(Chef chef) {
		this.chef = chef;
	}

	// lombok 제거로 toString() 생성
	@Override
	public String toString() {
		return "Restaurant [chef=" + chef + "]";
	}

	// lombok 제거로 hashCode()/equals() 생성
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((chef == null) ? 0 : chef.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Restaurant other = (Restaurant) obj;
		if (chef == null) {
			if (other.chef != null)
				return false;
		} else if (!chef.equals(other.chef))
			return false;
		return true;
	}
	
	// lombok 제거로 canEqual 생성 필요(?)	

}

