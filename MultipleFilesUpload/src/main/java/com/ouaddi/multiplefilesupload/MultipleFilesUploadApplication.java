package com.ouaddi.multiplefilesupload;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import service.FilesStorageService;

@SpringBootApplication
public class MultipleFilesUploadApplication implements CommandLineRunner {

	@Resource
	  FilesStorageService storageService;
	
	public static void main(String[] args) {
		SpringApplication.run(MultipleFilesUploadApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		storageService.deleteAll();
	    storageService.init();
		
	}

}
