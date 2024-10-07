package br.com.alura.ScreenMatch_Yuri.service;

public interface IConverteDados {

    <T> T obterDados(String json, Class<T> classe);

}
