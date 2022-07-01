package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "FILEDB")

public class FileModel {
	

	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	private String id;

	private String fileName;

	private String fileType;

	@Lob
	private byte[] data;

	public String getId() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getFileName() {
		// TODO Auto-generated method stub
		return null;
	}

	public byte[] getData() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getFileType() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setFileName(String fileName2) {
		// TODO Auto-generated method stub
		
	}

	public void setFileType(String contentType) {
		// TODO Auto-generated method stub
		
	}

	public void setData(byte[] bytes) {
		// TODO Auto-generated method stub
		
	}

}
