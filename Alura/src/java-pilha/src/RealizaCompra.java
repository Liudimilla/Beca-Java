public void RealizaCompra(Produto produto) throws EstoqueInsuficienteException {
    //outras instruções aqui...
    if (totalDeProdutosNoEstoque < 0) {
        throw new EstoqueInsuficienteException("Estoque insuficiente");
    }
}
}
