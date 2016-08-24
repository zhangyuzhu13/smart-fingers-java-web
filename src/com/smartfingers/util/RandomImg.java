package com.smartfingers.util;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.imageio.stream.ImageOutputStream;

public class RandomImg {
	/*
	 * 实现构造验证码功能
	 */
	private ByteArrayInputStream input;    
    private ByteArrayOutputStream output;  
    
    private int width;    
    private int height; 
    private String code;
    private Font mFont = new Font("Times New Roman", Font.PLAIN, 30); 
    //构造方法
	public RandomImg(int width, int height)  {
		this.width = width;
		this.height = height;
		getRandomImg();
	}
	
	/*
	 * 实现画验证码的功能
	 */
	public void getRandomImg()  {
		//存储验证码字符串，用于返回验证
		String codes="";
		//初始化一个imagebuffer，用于记录image内容
		BufferedImage bi= new  BufferedImage( width,height,BufferedImage.TYPE_INT_RGB);
		//画笔工具
		Graphics g = bi.getGraphics();
		Color c = new Color(200,150,100);
		 g.setFont(mFont);
		g.setColor(c);
		g.fillRect(0, 0, width, height);
		//为验证码字符集赋值
		char[] ch="ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890".toCharArray();
		//随机取字符串中字符，实现随机生成验证码
		Random r = new Random();
		int len = ch.length,index; 
		//每次循环image中画一个字符
		for(int i=0;i<4;i++){
			index = r.nextInt(len);
			g.setColor(new Color(r.nextInt(30),r.nextInt(150),r.nextInt(230)));
			g.drawString (ch[index]+"",(i*15)+3, 25);
			codes+=ch[index];
		}
		g.dispose(); 
		try{
			//将画好的image进行编码和解码的过程
			output = new ByteArrayOutputStream();    
			ImageOutputStream imageOut = ImageIO.createImageOutputStream(output);  
			ImageIO.write(bi,"JPG",imageOut);
			this.code=codes;
			//input是提供给前端进行写出显示的属性
			input = new ByteArrayInputStream(output.toByteArray()); 
		}
		catch(IOException e){
			System.out.println("验证码图片产生出现错误：" + e.toString());   
		}
	}

	public static RandomImg createImg(){
		return new RandomImg(120,45);
	}

	public ByteArrayInputStream getInput() {
		return input;
	}
 
	public ByteArrayOutputStream getOutput() {
		return output;
	}
 
	public String getCode() {
		return code;
	}
	
	
}
