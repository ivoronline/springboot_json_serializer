package com.ivoronline.springboot_json_serializer.DTO;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(using = PersonDTOSerializer.class)
public class PersonDTO {

  //PROPERTIES
  public String name;
  public Float  height;

}
