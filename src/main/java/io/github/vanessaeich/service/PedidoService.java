package io.github.vanessaeich.service;

import io.github.vanessaeich.domain.entity.Pedido;
import io.github.vanessaeich.domain.enums.StatusPedido;
import io.github.vanessaeich.rest.dto.PedidoDTO;

import java.util.Optional;

public interface PedidoService {
    Pedido salvar(PedidoDTO dto);

    Optional<Pedido> obterPedidoCompleto(Integer id);

    void atualizaStatus(Integer id, StatusPedido statusPedido);

}
