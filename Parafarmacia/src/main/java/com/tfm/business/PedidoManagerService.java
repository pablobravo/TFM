package com.tfm.business;

import java.util.Vector;

import com.tfm.model.Pedido;

public interface PedidoManagerService {
	public Vector<Pedido> getPedidos() throws Exception;
	public Pedido newPedido(Pedido pedido) throws Exception;
	public Pedido updatePedido(Pedido pedido) throws Exception;

}
