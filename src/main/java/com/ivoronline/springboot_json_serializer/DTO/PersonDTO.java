package com.ivoronline.springboot_json_serializer.DTO;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(using = PersonDTOserializer.class)
public class PersonDTO {
  public String  name;
  public Integer age;
}
