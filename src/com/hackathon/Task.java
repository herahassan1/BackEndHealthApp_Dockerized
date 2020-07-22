package com.hackathon;

import java.time.LocalDate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


@RestController
public class Task {

	
	@CrossOrigin(origins = "*")
	@PostMapping( "/v1/getTaskOfTheDay") 
	public String getTaskOfTheDay() throws JsonProcessingException {
		TaskResponse response = taskService();
		ObjectMapper mapper = new ObjectMapper();
		return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(response);
		//return  new Gson().toJson(response);
	}
	
	
	public TaskResponse taskService() {
		TaskResponse response = null; 
		
		LocalDate currentdate = LocalDate.now();
		int currentDay = currentdate.getDayOfMonth();
		
		switch(currentDay){
		
		case 1: response = new TaskResponse(1,"Task1","Do a deep breathing exercise");
		break;
		
		case 2: response = new TaskResponse(2,"Task2","Catch up with a friend");
		break;
		
		case 3: response = new TaskResponse(3,"Task3","Schedule something fun");
		break;
		
		case 4: response = new TaskResponse(4,"Task4","Donate something you never use");
		break;
		
		case 5: response = new TaskResponse(5,"Task5","Do 30 minutes of Yoga");
		break;
		
		case 6: response = new TaskResponse(6,"Task6","Plan a healthly meal");
		break;
		
		case 7: response = new TaskResponse(7,"Task7","Ask for help");
		break;
		
		case 8: response = new TaskResponse(8,"Task8","Listen to your favorite music");
		break;
		
		case 9: response = new TaskResponse(9,"Task9","Take 10 minutes to read");
		break;
		
		case 10: response = new TaskResponse(10,"Task10","Go for a walk");
		break;
		
		case 11: response = new TaskResponse(11,"Task11","Take 20 minutes SPA time");
		break;
		
		case 12: response = new TaskResponse(12,"Task12","Practice a favourite hobby");
		break;
		
		case 13: response = new TaskResponse(13,"Task13","Go watch a movie");
		break;
		
		case 14: response = new TaskResponse(14,"Task14","Go to bed 30 mins Early");
		break;
		
		case 15: response = new TaskResponse(15,"Task15","Drink 3 litres of water today");
		break;
		
		case 16: response = new TaskResponse(16,"Task16","Schedule a game night");
		break;
		
		case 17: response = new TaskResponse(17,"Task17","Set a mini goal");
		break;
		
		case 18: response = new TaskResponse(18,"Task18","Cross a item off your to do list");
		break;
		
		case 19: response = new TaskResponse(19,"Task19","Compliment someone");
		break;
		
		case 20: response = new TaskResponse(20,"Task20","Plan a trip with friends");
		break;
		
		case 21: response = new TaskResponse(21,"Task21","Try 5 minutes Meditation");
		break;
		
		case 22: response = new TaskResponse(22,"Task22","Face Time with Family");
		break;
		
		case 23: response = new TaskResponse(23,"Task23","Drink 8 glasses of water");
		break;
		
		case 24: response = new TaskResponse(24,"Task24","Visit a close friend");
		break;
		
		case 25: response = new TaskResponse(25,"Task25","Unfollow negative social media accounts");
		break;
		
		case 26: response = new TaskResponse(26,"Task26","Say NO to something");
		break;
		
		case 27: response = new TaskResponse(27,"Task27","Have a phone free night");
		break;
		
		case 28: response = new TaskResponse(28,"Task28","Watch a comedy show");
		break;
		
		case 29: response = new TaskResponse(29,"Task29","Write down something good that happened");
		break;
		
		case 30: response = new TaskResponse(30,"Task30","Adapt a new habit");
		break;
		
		case 31: response = new TaskResponse(31,"Task31","Track your BMI");
		break;
		
		default :
			response = new TaskResponse(0,"TaskDefault","Default Task");
		}
		
		
		return response;
	}
}
