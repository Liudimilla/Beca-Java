public void RealizaCompra(Produto produto) throws EstoqueInsuficienteException {
    //outras instru��es aqui...
    if (totalDeProdutosNoEstoque < 0) {
        throw new EstoqueInsuficienteException("Estoque insuficiente");
    }
}
}
