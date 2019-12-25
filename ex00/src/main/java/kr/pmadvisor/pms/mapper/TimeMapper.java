package kr.pmadvisor.pms.mapper;

import org.apache.ibatis.annotations.Select;

public interface TimeMapper {

//	@Select("SELECT sysdate FROM dual")		: 오라클
	@Select("SELECT sysdate() FROM dual") //: MySQL - (1)어노테이션 이용방법
	public String getTime();

	public String getTime2(); // (2) Mapper 이용방법

}
