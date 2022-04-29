package com.bridgelabz.employee.payroll.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.IntStream;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class Junit_Test_API {
	 private static String HOME = System.getProperty("user.home");
	    private static String PLAY_WITH_NIO = "TempPlayGround";

	    @Test
	    public void givenPathWhenCheckedThenConfirm() throws IOException {
	       //check the file exist
	        Path homePath = Paths.get(HOME);
	        Assert.assertTrue(Files.exists(homePath));

	        // delete file and check file not exist
	        Path playPath = Paths.get(HOME + "/" + PLAY_WITH_NIO);
	        if (Files.exists(playPath)) File_Utial.filesDelete(playPath.toFile());
	        Assert.assertTrue(Files.notExists(playPath));

	        
	        Files.createDirectory(playPath);
	        Assert.assertTrue(Files.exists(playPath));

	        
	        IntStream.range(1, 10).forEach(cntr -> {
	            Path tempFile = Paths.get(playPath + "/temp" + cntr);
	            Assert.assertTrue(Files.notExists(tempFile));
	            try {
	                Files.createFile(tempFile);
	            } catch (IOException e) {
	            }
	            Assert.assertTrue(Files.exists(tempFile));
	        });

	         
	        Files.list(playPath).filter(Files::isRegularFile).forEach(System.out::println);
	        Files.newDirectoryStream(playPath).forEach(System.out::println);
	        Files.newDirectoryStream(playPath, path -> path.toFile().isFile() && path.toString()
	                .startsWith("temp")).forEach(System.out::println);
	    }	
	   
}
