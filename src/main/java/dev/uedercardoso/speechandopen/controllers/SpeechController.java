package dev.uedercardoso.speechandopen.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpeechController {

	@GetMapping("text")
	public ResponseEntity<Void> getText() {
		return ResponseEntity.badRequest().build();
	}
	
}
