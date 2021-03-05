package com.ivoronline.springboot_json_serializer.controllers;

import com.ivoronline.springboot_json_serializer.DTO.PersonDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

  @ResponseBody
  @RequestMapping("/GetPerson")
  public PersonDTO addPerson() {

    //CREATE PERSON
    PersonDTO PersonDTO      = new PersonDTO();
              PersonDTO.name = "John";
              PersonDTO.age  = 20;

    //RETURN PERSON AS JSON (SERIALIZED)
    return PersonDTO;

  }

}
