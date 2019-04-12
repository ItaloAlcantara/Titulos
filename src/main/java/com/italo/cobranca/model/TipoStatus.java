package com.italo.cobranca.model;

public enum TipoStatus {
	PENDENTE("Pendente"),
	RECEBIDO("Recebido");
	
	private final String status;
	
	TipoStatus(String status) {
		this.status=status;
	}
	
	public String getTipo() {
		return status;
	}
}
