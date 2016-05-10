package com.eq.sloution.Sloution12;

public class Sloution12
{
	public static void print(int id,String name,String otherInfo,int percent) {
		String[] ss = otherInfo.split(",");
		
		String s1 = "insert into  \"base\".\"system_dictionary\" (id,NAME,type_code,other_info,remarks) values (";
		for(int i=0;i<ss.length;i++) {
			String s2 = s1;
			s2+=id;
			id+=1;
			s2+=",'"+name+"'";
			s2+=",'sym'";
			s2+=",'"+ss[i]+"'";
			s2+=",'"+percent+"');";
			percent-=1;
			System.out.println(s2);
		}
	}
	
	public static void main(String[] args)
	{
		print(1379, "眩晕", "颞骨骨折,外伤性外淋巴瘘,眩晕性癫痫,,过度换气综合征,Alport综合征,Paget综合征,Hennebert综合征,Gower综合征,Cogan综合征,抑郁症,焦虑症,惊恐发作", 22);
	}
}
