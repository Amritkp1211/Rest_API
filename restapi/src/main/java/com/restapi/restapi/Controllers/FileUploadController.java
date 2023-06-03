package com.restapi.restapi.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.restapi.restapi.Helper.fileupload;


@RestController
public class FileUploadController {
   
    @Autowired
    private fileupload fl;
     
    @PostMapping("/upload-file")
    public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file){
         try {
              boolean f=fl.uploadnewfile(file);
              if(f){
                  //return ResponseEntity.ok("file uploaded successfully");
                  return ResponseEntity.ok(ServletUriComponentsBuilder.fromCurrentContextPath().path("/image/").path(file.getOriginalFilename()).toUriString());
              } 

         } catch (Exception e) {
                   e.printStackTrace();
         }
         return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("upload the jpeg format only");
        
    }
}
