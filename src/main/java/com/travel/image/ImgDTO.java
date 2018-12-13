package com.travel.image;

public class ImgDTO {
	
	private String imgPath;
	private String imgTrueName;
	private String imgFalseName;
	private String imgExt;
	private long imgSize;
	
	public ImgDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "imgDTO [imgPath=" + imgPath + ", imgTrueName=" + imgTrueName + ", imgFalseName=" + imgFalseName
				+ ", imgExt=" + imgExt + ", imgSize=" + imgSize + "]";
	}
	public String getImgPath() {
		return imgPath;
	}
	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}
	public String getImgTrueName() {
		return imgTrueName;
	}
	public void setImgTrueName(String imgTrueName) {
		this.imgTrueName = imgTrueName;
	}
	public String getImgFalseName() {
		return imgFalseName;
	}
	public void setImgFalseName(String imgFalseName) {
		this.imgFalseName = imgFalseName;
	}
	public String getImgExt() {
		return imgExt;
	}
	public void setImgExt(String imgExt) {
		this.imgExt = imgExt;
	}
	public long getImgSize() {
		return imgSize;
	}
	public void setImgSize(long imgSize) {
		this.imgSize = imgSize;
	}
	
	
	
}
