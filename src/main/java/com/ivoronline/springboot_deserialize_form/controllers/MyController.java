package com.ivoronline.springboot_deserialize_form.controllers;

import com.ivoronline.springboot_deserialize_form.DTO.PersonDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.io.IOException;

@Controller
public class MyController {

  //===============================================================================
  // CUSTOM FORM
  //===============================================================================
  @RequestMapping("CustomForm")
  String customForm() {
    return "CustomForm";  //Return CustomForm.html
  }

  //================================================================================
  // GET FORM DATA
  //================================================================================
  @ResponseBody
  @RequestMapping("GetFormData")
  String getFormData(PersonDTO personDTO) throws IOException {

    //GET FILE CONTENT
    byte[] fileBytes   = personDTO.file.getBytes();
    String fileContent = new String(fileBytes);

    //RETURN SOMETHING
    String result = personDTO.name + " is " + personDTO.age + " years old <br>";
           result += fileContent;
    return result;

  }

}
