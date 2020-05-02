package com.cabralbots.ecommerce.base;

public enum TypeProduct {
    BOT(1), INDICATOR(2);

    private final int valor;
    TypeProduct(int opcao){
        valor = opcao;
    }
    public int getValor(){
        return valor;
    }
}
