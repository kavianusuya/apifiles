package controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.patient.demo.Main;
import com.patient.demo.Patient;


@Controller 
public class FileController {
public static String uploadDirectory = System.getProperty("user.dir");
	static String name="";
	@RequestMapping("/")
	public String UploadPage(Model model) {
		return "upload";
	}
	
	@RequestMapping("/upload")
	public String upload(Model model,@RequestParam("files") MultipartFile[] files) {
		StringBuilder fileNames = new StringBuilder();
		for(MultipartFile file : files) {
			Path fileNameAndPath = Paths.get(uploadDirectory,file.getOriginalFilename());
			//System.out.println(fileNameAndPath.toString());
			fileNames.append(file.getOriginalFilename()+" ");
			try {
				Files.write(fileNameAndPath, file.getBytes());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			name=uploadDirectory+"\\"+file.getOriginalFilename();
		}
	
		model.addAttribute("msg", "successfully uploaded files "+fileNames.toString());
		return "uploadstatus";
	}
	 @RequestMapping( "/greeting")
	  public @ResponseBody
	  Patient greeting() throws Exception {
Main m=new Main();
		  String res[]=m.Patientfile(name);
		 // System.out.println(Arrays.deepToString(res));
	 
		  return new Patient(res[4],res[3],res[1],res[0],res[2],res[5]);
	  }
}