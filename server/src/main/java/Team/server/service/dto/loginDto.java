package Team.server.service.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;   

import javax.persistence.Column;

@Getter
@Setter
public class loginDto {

    private String name;
    private String password;

    @Builder
    public loginDto(String name, String password){
        this.name = name;
        this.password = password;
    };
}
