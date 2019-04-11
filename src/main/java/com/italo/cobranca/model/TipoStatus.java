package com.italo.cobranca.model;

public enum TipoStatus {
	PENDENTE("Pendente"),
	RECEBIDO("Recebido");
	
	private final String tipo;
	
	TipoStatus(String tipo) {
		this.tipo=tipo;
	}
	
	public String getTipo() {
		return tipo;
	}
}
