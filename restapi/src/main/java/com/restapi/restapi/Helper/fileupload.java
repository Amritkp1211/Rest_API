package com.restapi.restapi.Helper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class fileupload {
    
    //public final String upload_dir="C:\\Users\\dmin\\SpringBoot\\restapi\\src\\main\\resources\\static\\image";
    public final String upload_dir=new ClassPathResource("static/image/").getFile().getAbsolutePath();
    
    public fileupload() throws IOException {

    }

    public boolean uploadnewfile( MultipartFile m){
        boolean flag=false;
         
        try {

           /*   //Read the file
            InputStream is=m.getInputStream();
             byte[] data=new byte[is.available()];
             is.read(data);
           
         //Write the file
            FileOutputStream fos=new FileOutputStream(upload_dir+File.separator+m.getOriginalFilename());
              fos.write(data);
                fos.flush();
                fos.close(); */
             Files.copy(m.getInputStream(),Paths.get(upload_dir+File.separator+m.getOriginalFilename()),StandardCopyOption.REPLACE_EXISTING );
            
                flag=true;
        } catch (Exception e) {
           e.printStackTrace();
        }

        return flag;

    }
      


}
