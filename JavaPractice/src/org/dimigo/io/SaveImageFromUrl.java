/**
 * 
 */
package org.dimigo.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * <pre>
 * org.dimigo.io
 *	 	|_ SaveImageFromUrl
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 10. 23.
 * </pre>
 * 
 * @author		: 이은찬
 * @version		: 1.0
 */
public class SaveImageFromUrl {
	
	public static void main(String[] args) {
		
		String imageUrl = "https://upload.wikimedia.org/wikipedia/commons/thumb/9/95/Pressure_air.svg/549px-Pressure_air.svg.png";
		
		try {
			URL url = new URL(imageUrl);
			
			try(InputStream is = url.openStream();
					OutputStream os = new FileOutputStream("files/BE.png")) {
				
				// 파일에 write하기
				
				int result;
				
				byte[] buf = new byte[100];
				
				while((result = is.read(buf)) != -1) {
					os.write(buf, 0, result);
				}
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("사진 다운로드 완료");
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
