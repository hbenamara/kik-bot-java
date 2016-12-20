package com.kik.bot.api.model;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class Main {
	public static void main(String[] args) {
		ObjectMapper mapper = new ObjectMapper();
		Message message = new Message();
		message.id = "123123";
		message.chatId = "sa123";
		message.from = "hassene";
		
		try {
			//mapper.writeValue(new File("C:/message.json"), message);
			
			//Convert object to JSON string and pretty print
			String jsonInString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(message);
			System.out.println(jsonInString);
			
			
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
