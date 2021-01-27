package com.dmaia.seguradoraveiculosapi.controller;

//import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
//import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.web.PagedResourcesAssembler;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.dmaia.seguradoraveiculosapi.entity.Cliente;
import com.dmaia.seguradoraveiculosapi.entity.dto.ClienteDTO;
import com.dmaia.seguradoraveiculosapi.services.IClienteService;

@RestController
@RequestMapping("/api/v1/clientes")
public class ClienteController {

	private final IClienteService clienteService;

	@Autowired
	public ClienteController(IClienteService clienteService) {
		this.clienteService = clienteService;
	
	}

	@GetMapping(value = "/{id}", produces = { "application/json", "application/xml", "application/x-yaml", })
	public ResponseEntity<ClienteDTO> findById(@PathVariable("id") String id) {
		Cliente entity = clienteService.findById(id);
		
		ClienteDTO dto = new ClienteDTO(entity);	
		
		return ResponseEntity.ok().body(dto);
	}
	
	@GetMapping(produces = { "application/json", "application/xml", "application/x-yaml" })
	public ResponseEntity<List<ClienteDTO>> getAll() {
		List<Cliente> list = clienteService.findAll();
		
		List<ClienteDTO> result = list.stream().map(c -> new ClienteDTO(c)).collect(Collectors.toList());
		
		return ResponseEntity.ok().body(result);
	}

	@PostMapping(produces = { "application/json", "application/xml", "application/x-yaml" })
	public ResponseEntity<ClienteDTO> create(@RequestBody ClienteDTO cliente) {
		
		Cliente entity = new Cliente().create(cliente);
		
		clienteService.save(entity);		
		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(entity.getId())
				.toUri();
		return ResponseEntity.created(uri).build();
	}

}
