package com.password.passDecode.dto;




import com.password.passDecode.entity.Address;

import lombok.Data;
@Data
public class StudentDto {

		private Integer id;
		private String name;
		private String age;
		private AddressDto address;
		
		

}
