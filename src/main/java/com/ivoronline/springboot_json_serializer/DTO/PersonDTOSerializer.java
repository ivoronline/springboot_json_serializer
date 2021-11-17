package com.ivoronline.springboot_json_serializer.DTO;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;

public class PersonDTOSerializer extends JsonSerializer<PersonDTO> {

  //================================================================
  // SERIALIZE
  //================================================================
  @Override
  public void serialize(PersonDTO personDTO, JsonGenerator jsonGenerator, SerializerProvider provider)  throws IOException {
    jsonGenerator.writeStartObject();
    jsonGenerator.writeStringField("First Name", personDTO.name);
    jsonGenerator.writeStringField("Height"    , convert(personDTO.height));
    jsonGenerator.writeEndObject();
  }

  //================================================================
  // CONVERTER
  //================================================================
  public String convert(Float height) {
    String heightString    = Float.toString(height);          //Convert Float to String
    String heightFormatted = heightString.replace(".", ",");  //Replace dot with comma
    return heightFormatted;                                   //Return converted String
  }

}
