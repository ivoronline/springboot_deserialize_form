package com.ivoronline.springboot_deserialize_form.DTO;

import org.springframework.web.multipart.MultipartFile;

public class PersonDTO {

  //PROPERTIES
  public String        name;
  public Integer       age;
  public MultipartFile file;

  //SETTERS (used for deserialization)
  public void setName (String  name      ) { this.name = name; }
  public void setAge  (Integer age       ) { this.age  = age;  }
  public void setFile (MultipartFile file) { this.file = file; }

}
