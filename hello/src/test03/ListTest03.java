package test03;

import java.util.ArrayList;
import java.util.Collections;

import org.apache.commons.lang3.StringUtils;

public class ListTest03 {

	public static void main(String[] args) {
		ArrayList<String> strList = new ArrayList<String>();
		
		for(int i = 0;i<10;i++) {
		String rNum = (int)(Math.random()*30)+1+"";
			rNum =StringUtils.leftPad(rNum, 2, '0');
			rNum = "0"+rNum;
		
		strList.add(rNum);
			/*int  num =(int)(Math.random()*30)+1;
		strList.add(num+"");*/
		/*String str = num +"";
		strList.add(str);*/
		}
		Collections.sort(strList);
		
		for(int i = 0;i<10;i++) {
		System.out.println(strList.get(i));
		}
	}
}
