package in.co.rays.proj0.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import in.co.rays.proj0.dto.RoleDTO;
import in.co.rays.proj0.dto.UserDTO;
import in.co.rays.proj0.exception.DuplicateRecordException;
import in.co.rays.proj0.service.UserServiceInt;

@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/dispatcher-servlet.xml")
public class RoleTest {

	@Autowired
	private UserServiceInt u;

	@Test
	public void testAdd() throws DuplicateRecordException {

		System.out.println("Version - "+org.hibernate.Version.getVersionString()); 
		
		UserDTO userDto = new UserDTO();

		userDto.setFirstName("Izhan");
		userDto.setLastName("Khan");
		userDto.setLogin("izhan@gmail.com");
		userDto.setPassword("12345");
		userDto.setConfirmPassword("12345");
		userDto.setGender("Male");
		userDto.setRoleId(1);
		
		
//		System.out.println("...");
		u.add(userDto);
//		System.out.println("success");

	}
//	@Test
	public void testDelete() throws DuplicateRecordException {
		
		UserDTO userDto = new UserDTO();
		
		userDto.setId(2);
//		userDto.setName("Student");
//		userDto.setDescription("Student");
//		u.update(userDto);
		
	}

		
	
	
	

}
