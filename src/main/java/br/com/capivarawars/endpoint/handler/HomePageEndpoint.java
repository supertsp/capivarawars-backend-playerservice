package br.com.capivarawars.endpoint.handler;

// <editor-fold defaultstate="collapsed" desc="imports...">
import br.com.capivarawars.database.model.Player;
import static br.com.capivarawars.endpoint.config.EndpointsMapping.API_PLAYER_SERVICE;
import static br.com.capivarawars.endpoint.config.EndpointsMapping.API_PLAYER_SERVICE_CREATE_ONE_PLAYER;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.ArrayList;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
// </editor-fold>

// <editor-fold defaultstate="collapsed" desc="documentation...">
/**
 * Objective: ...
 * 
 * Description: ...
 * 
 * @version 1.0.0
 * @author tiago, 27/06/2020, 13:12:59
 * Last update: -
 */// </editor-fold>
@RestController
@RequestMapping("/")
public class HomePageEndpoint {
	
	@GetMapping
	public ResponseEntity<String> showIndex() {
		
		String apiName = "Player Service";
		
		return ResponseEntity.ok("<pre>"
				+ "                                                                        \n"
				+ "                       //                                               \n"
				+ "         ^_^        ///-\\\\\\                                             \n"
				+ "  .-----/  0\\       |O   O|                                             \n"
				+ " /  \\     __/       |  ^  |                                             \n"
				+ " \\  /_- -/           \\ O /                                              \n"
				+ "  \\\\\\  \\\\\\            | |                                               \n"
				+ "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n"
				+ "\\    Now, Running a  "
				+ "<span style=\"font: 20px Arial, sans-serif; text-transform: uppercase;color: #4CAF50; font-weight: bold;\">" 
				+ apiName + "</span>  On a River API ;)\n"
				+ " \\   See more on: <a href=\"#\" id=\"link\"></a>\n"
				+ "  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n"					
				+ "  " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")) 
				+ "             <span style=\"font: 10px Arial, sans-serif;\">"
				+ "                                          By: Tiago Penha Pedroso, 2020"
				+ "</span>"
				+ "</pre>"
				+ "<script>"
				+ "document.getElementById(\"link\").href = \"http://\" + window.location.hostname + \"/swagger-ui.html\";"
				+ "document.getElementById(\"link\").innerHTML = \"http://\" + window.location.hostname + \"/swagger-ui.html\";"
				+ "</script>"
		);
				
		
	}

}//class
