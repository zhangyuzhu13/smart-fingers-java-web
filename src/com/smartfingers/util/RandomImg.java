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
	 * ʵ�ֹ�����֤�빦��
	 */
	private ByteArrayInputStream input;    
    private ByteArrayOutputStream output;  
    
    private int width;    
    private int height; 
    private String code;
    private Font mFont = new Font("Times New Roman", Font.PLAIN, 30); 
    //���췽��
	public RandomImg(int width, int height)  {
		this.width = width;
		this.height = height;
		getRandomImg();
	}
	
	/*
	 * ʵ�ֻ���֤��Ĺ���
	 */
	public void getRandomImg()  {
		//�洢��֤���ַ��������ڷ�����֤
		String codes="";
		//��ʼ��һ��imagebuffer�����ڼ�¼image����
		BufferedImage bi= new  BufferedImage( width,height,BufferedImage.TYPE_INT_RGB);
		//���ʹ���
		Graphics g = bi.getGraphics();
		Color c = new Color(200,150,100);
		 g.setFont(mFont);
		g.setColor(c);
		g.fillRect(0, 0, width, height);
		//Ϊ��֤���ַ�����ֵ
		char[] ch="ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890".toCharArray();
		//���ȡ�ַ������ַ���ʵ�����������֤��
		Random r = new Random();
		int len = ch.length,index; 
		//ÿ��ѭ��image�л�һ���ַ�
		for(int i=0;i<4;i++){
			index = r.nextInt(len);
			g.setColor(new Color(r.nextInt(30),r.nextInt(150),r.nextInt(230)));
			g.drawString (ch[index]+"",(i*15)+3, 25);
			codes+=ch[index];
		}
		g.dispose(); 
		try{
			//�����õ�image���б���ͽ���Ĺ���
			output = new ByteArrayOutputStream();    
			ImageOutputStream imageOut = ImageIO.createImageOutputStream(output);  
			ImageIO.write(bi,"JPG",imageOut);
			this.code=codes;
			//input���ṩ��ǰ�˽���д����ʾ������
			input = new ByteArrayInputStream(output.toByteArray()); 
		}
		catch(IOException e){
			System.out.println("��֤��ͼƬ�������ִ���" + e.toString());   
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
