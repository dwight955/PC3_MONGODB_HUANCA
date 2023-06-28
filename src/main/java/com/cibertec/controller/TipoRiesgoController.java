package com.cibertec.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cibertec.entity.TipoRiesgo;
import com.cibertec.service.TipoRiesgoService;

@RestController
@RequestMapping("/rest/TipoRiesgo")
@CrossOrigin(origins = "http://localhost:4200")
public class TipoRiesgoController {

	@Autowired
	private TipoRiesgoService service;
	
	@GetMapping()
	public ResponseEntity<?>  lista(){
		List<TipoRiesgo> lstSalida = service.listaTipoRiesgo();
		return ResponseEntity.ok(lstSalida);
	}
	@GetMapping("/porId/{id}")
	public ResponseEntity<?>  buscarPorID(@PathVariable Integer id){
		Optional<TipoRiesgo> lstSalida = service.buscaTipoRiesgo(id);
		return ResponseEntity.ok(lstSalida);
	}
	
	@PostMapping
	public ResponseEntity<?>  inserta(@RequestBody TipoRiesgo obj){
		TipoRiesgo objSalida = service.insertaTipoRiesgo(obj);
		return ResponseEntity.ok(objSalida);
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<?>  eliminaTipoRiesgo(@PathVariable Integer id){
		service.eliminaTipoRiesgo(id);
		Optional<TipoRiesgo> optTipoRiesgo = service.buscaTipoRiesgo(id);
		if (optTipoRiesgo.isEmpty()) {
			return ResponseEntity.ok("Eliminación exitosa");
		}
		return ResponseEntity.ok("No existe el id " + id);
	}
	@PutMapping
	public ResponseEntity<?> actualiza(@RequestBody TipoRiesgo obj){
		Optional<TipoRiesgo> optTipoRiesgo = service.buscaTipoRiesgo(obj.getIdTipoRiesgo());
		if (optTipoRiesgo.isPresent()) {
			TipoRiesgo objSalida = service.insertaTipoRiesgo(obj);
			return ResponseEntity.ok(objSalida);
		}else {
			return ResponseEntity.ok("El TipoRiesgo no existe");
		}
	}
}






