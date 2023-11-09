package com.springsecurity.springsecurity.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
public class UsuarioDTO {
    private String nome;
    private String passoword;
}
