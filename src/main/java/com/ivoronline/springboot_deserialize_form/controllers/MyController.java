package com.ivoronline.springboot_deserialize_form.controllers;

import com.ivoronline.springboot_deserialize_form.DTO.PersonDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Controller
public class MyController {

  //===============================================================================
  // ENTER DATA
  //===============================================================================
  @RequestMapping("EnterData")
  String enterData() {
    return "EnterData";
  }

  //================================================================================
  // GET DATA 1
  //================================================================================
  @ResponseBody
  @RequestMapping("GetData1")
  String getData1(PersonDTO personDTO) throws IOException {
    byte[] contentBytes = personDTO.file.getBytes();
    String content      = new String(contentBytes);
    return content;
  }

  //================================================================================
  // GET DATA 2
  //================================================================================
  @ResponseBody
  @RequestMapping("GetData2")
  String getData2(@RequestParam String name, @RequestParam MultipartFile file) throws IOException {
    byte[] contentBytes = file.getBytes();
    String content      = new String(contentBytes);
    return content;
  }

}
