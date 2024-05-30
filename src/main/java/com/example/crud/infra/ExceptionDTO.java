package com.example.crud.infra;

import lombok.Getter;

@Getter
public class ExceptionDTO{
    private String menssage;
    public ExceptionDTO(String menssage){
        this.menssage = menssage;
    }
}
