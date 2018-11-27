package si.fri.rso.dtos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BookQuery {
    public Integer token;
    public CustomerQuery customer;
}
