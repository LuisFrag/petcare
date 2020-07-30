package br.com.petcare.models.dto;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;


@NoArgsConstructor
public class AuthDTO {

    @NotEmpty(message = "O email não pode ser vázio")
    @Email(message = "Digite um email válido")
    private String emailAddress;

    @NotEmpty(message = "A senha não pode ser vázia")
    @Min(value = 8, message = "A senha deve conter no minímo 8 digitos")
    private String password;

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getPassword() {
        return password;
    }
}
