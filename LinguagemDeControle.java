package br.com.portfolio.api;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class LinguagemDeControle {
	
	//Lista titulo - url - numero
	private List<Linguagem> linguagens =
			List.of(
					new Linguagem("Java", "https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/java/java_256x256.png", 1) 
					);
		
	
	// Esta apontando  para http://localhost:8080/linguagens
		@GetMapping(value="/linguagens")
		public List<Linguagem> obterLinguagens(){
			return linguagens;
			
				
			
		}
		
	}



