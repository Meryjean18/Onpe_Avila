package com.web.onpe.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.onpe.model.GrupoVotacion;
import com.web.onpe.repository.IGrupoVotacion;

@Service
public class GrupoVotacionService implements IGrupoVotacionService{
	@Autowired
	IGrupoVotacion iGrupoVotacion;
	
	@Override
	public GrupoVotacion getGrupoVotacion(String id) {
		return iGrupoVotacion.getGrupoVotacion(id);
	}
}
