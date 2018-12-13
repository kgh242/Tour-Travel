package com.travel.image;

import java.io.File;
import java.util.UUID;

import org.springframework.web.multipart.MultipartFile;

public class ImgHelper {
	
	public ImgDTO imgHelper(MultipartFile img) {
		
		ImgDTO imgDTO = new ImgDTO();
		
		System.out.println("이미지 패스 추출");
		File f = new File("");
		String path = f.getAbsolutePath();
		imgDTO.setImgPath(path);
		f.delete();
		System.out.println(path);

		System.out.println("이미지 파일 본칭");
		String originalFileName = img.getOriginalFilename();
		String trueName = originalFileName.substring(0, originalFileName.lastIndexOf('.'));
		imgDTO.setImgTrueName(trueName);
		System.out.println(trueName);

		System.out.println("이미지 파일 가칭");
		String falseName = UUID.randomUUID().toString();
		imgDTO.setImgFalseName(falseName);
		System.out.println(falseName);

		System.out.println("이미지 확장자 추출");
		String ext = originalFileName.substring(originalFileName.lastIndexOf(".")+1);
		imgDTO.setImgExt(ext);
		System.out.println(ext);

		System.out.println("이미지 파일 크기");
		imgDTO.setImgSize(img.getSize());
		System.out.println(img.getSize());
	
		return imgDTO;
	}

}
