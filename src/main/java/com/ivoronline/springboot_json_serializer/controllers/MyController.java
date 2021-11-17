package com.ivoronline.springboot_json_serializer.controllers;

import com.ivoronline.springboot_json_serializer.DTO.PersonDTO;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class MyController {

  //================================================================
  // GET PERSON
  //================================================================
  @RequestMapping("GetPerson")
  PersonDTO addPerson() {

    //CREATE PERSON
    PersonDTO PersonDTO        = new PersonDTO();
              PersonDTO.name   = "John";
              PersonDTO.height = 1.67F;

    //RETURN PERSON AS JSON (SERIALIZED)
    return PersonDTO;

  }

}
