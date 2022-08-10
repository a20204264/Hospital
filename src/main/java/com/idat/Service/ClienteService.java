package com.idat.Service;

import java.util.List;

import com.idat.DTO.ClienteDTORequest;
import com.idat.DTO.ClienteDTOResponse;
import com.idat.DTO.DoctorDTORequest;


public interface ClienteService {
	
	List<ClienteDTOResponse> listar();
	ClienteDTOResponse ObtenerId(Integer id);	
	void eliminar(Integer id);
	void actualizar(ClienteDTORequest cliente);	
	void guardar(ClienteDTORequest cliente, DoctorDTORequest doctor);

}
