package com.screenMatch.ScreenMatch.service;

import com.fasterxml.jackson.core.JsonProcessingException;

public interface IconvertDados {

 <T> T  obterDados(String json, Class<T> classe) throws JsonProcessingException;

}
