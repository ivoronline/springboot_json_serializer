package com.ivoronline.springboot_json_serializer.DTO;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;

public class PersonDTOserializer extends JsonSerializer<PersonDTO> {

  @Override
  public void serialize(PersonDTO personDTO, JsonGenerator jsonGenerator, SerializerProvider provider)  throws IOException {
    jsonGenerator.writeStartObject();
    jsonGenerator.writeStringField("First Name", personDTO.name);
    jsonGenerator.writeNumberField("Age"       , personDTO.age);
    jsonGenerator.writeEndObject();
  }

}
