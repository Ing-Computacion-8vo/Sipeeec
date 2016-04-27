package mx.uatx.sipeeec.utils;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.codec.binary.Base64;

public class DecodeCV {
	
	public static void main(String[] args) throws Exception{
		decode("c:/codec64/something-decoded.pdf");
	}
	
	 public static void decode(String targetFile) throws Exception {
		 
	        byte[] decodedBytes = Base64.decodeBase64("");
	 
	        writeByteArraysToFile(targetFile, decodedBytes);
	    }
	 
	 public static void writeByteArraysToFile(String fileName, byte[] content) throws IOException {
		 
	        File file = new File(fileName);
	        BufferedOutputStream writer = new BufferedOutputStream(new FileOutputStream(file));
	        writer.write(content);
	        writer.flush();
	        writer.close();
	 
	    }
}
