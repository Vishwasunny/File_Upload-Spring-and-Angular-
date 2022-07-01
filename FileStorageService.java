package com.example.demo.service;

import org.springframework.web.multipart.MultipartFile;

import com.example.demo.model.FileModel;

public interface FileStorageService {

	public FileModel storeFile(MultipartFile file);

	public FileModel getFile(String fileId);
}
