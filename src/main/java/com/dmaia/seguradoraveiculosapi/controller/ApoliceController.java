package com.dmaia.seguradoraveiculosapi.controller;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.dmaia.seguradoraveiculosapi.entity.Apolice;
import com.dmaia.seguradoraveiculosapi.entity.dto.ApoliceDTO;
import com.dmaia.seguradoraveiculosapi.entity.dto.ApoliceNewDTO;
import com.dmaia.seguradoraveiculosapi.entity.dto.ApoliceUpdateDTO;
import com.dmaia.seguradoraveiculosapi.services.IApoliceService;

@RestController
@RequestMapping("/api/v1/apolices")
public class ApoliceController {

	private final IApoliceService service;

	@Autowired
	public ApoliceController(IApoliceService service) {
		this.service = service;
	}

	@GetMapping(value = "/{numero}", produces = { "application/json", "application/xml" })
	public ResponseEntity<ApoliceDTO> findById(@PathVariable("numero") String numero) {
		Apolice entity = service.findByNumero(numero);
		ApoliceDTO dto = new ApoliceDTO(entity);
		return ResponseEntity.ok().body(dto);
	}

	@GetMapping(produces = { "application/json", "application/xml" })
	public ResponseEntity<List<ApoliceDTO>> findAll() {
		List<Apolice> list = service.findAll();
		List<ApoliceDTO> result = list.stream().map(c -> new ApoliceDTO(c)).collect(Collectors.toList());

		return ResponseEntity.ok().body(result);
	}

	@PostMapping(produces = { "application/json", "application/xml" }, 
				 consumes = { "application/json",	"application/xml" })
	public ResponseEntity<Void> create(@Valid @RequestBody ApoliceNewDTO dto) {		
		Apolice entity = service.createApoliceFromToDTO(dto);
		service.save(entity);

		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(entity.getNumero())
				.toUri();
		return ResponseEntity.created(uri).build();
	}
	
	@PutMapping(value = "/{numero}", produces = { "application/json", "application/xml" }, 
									 consumes = { "application/json",	"application/xml" })
	public ResponseEntity<ApoliceDTO> update(@PathVariable("numero") String numero,@Valid @RequestBody ApoliceUpdateDTO dto) {		
		Apolice entity = service.findById(numero);
		entity = service.updateApoliceFromToDTO(entity, dto);
		ApoliceDTO apoliceDTO =  new ApoliceDTO(service.update(entity));
	
		return ResponseEntity.ok().body(apoliceDTO);
	}

	@DeleteMapping("/{numero}")
	public ResponseEntity<?> delete(@PathVariable("numero") String numero) {
		service.delete(numero);
		return ResponseEntity.ok().build();
	}

}
