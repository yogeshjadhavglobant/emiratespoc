package com.emirates.couchbase.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertOneListToAnotherUsingStreamsMain {

	public static void main(String[] args) {

		List<User> listUsers = new ArrayList<User>();
		listUsers.add(new User("Yogesh","Jadhav","yogesh.jadhav@gmail.com"));
		listUsers.add(new User("Sachin","Tendulkar","sachin.tendulkar@gmail.com"));
		listUsers.add(new User("Virat","Kohli","virat.kohli@gmail.com"));
		listUsers.add(new User("Rahul","Sharma","rahul.sharma@gmail.com"));
		
		System.out.println(listUsers);
		 
		List<UserDto> listUsersDto = listUsers.stream()
                .map(p -> transformToDto(p))
                .collect(Collectors.toList());
		
		 System.out.println(listUsersDto);
	}
	
	private static UserDto transformToDto(User user) {
		UserDto userDto = new UserDto();
		userDto.setfName(user.getFirtName());
		userDto.setlName(user.getLastName());
		return userDto;
	}
	
	

}
