package com.italo.cobranca.model;

public enum TipoStatus {
	PENDENTE("Pendente"),
	RECEBIDO("Recebido");
	
	private final String descricao;
	
	TipoStatus(String descricao) {
		this.descricao=descricao;
	}
	
	public String getTipo() {
		return descricao;
	}
}
