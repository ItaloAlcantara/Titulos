package com.italo.cobranca.model;

public enum TipoStatus {
	PENDENTE("Pendente"),
	RECEBIDO("Recebido");
	
	private final String descricao;
	
	TipoStatus(String status) {
		this.descricao=status;
	}
	
	public String getTipo() {
		return descricao;
	}
}
