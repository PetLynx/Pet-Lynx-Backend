package com.lynxiq.api.lynxiq.service.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class PetModel {

    private String id;
    private String name;
    private String age;
    private String photo;
    private String breed;
    private String type;

}
