package co.develhopestudy.demoweb.models;

import lombok.Builder;
import lombok.Data;


@Builder
@Data
public class User {

    public long id;
    public String nome;
    public String cognome;
    public String provincia;
    public String saluto;

}
