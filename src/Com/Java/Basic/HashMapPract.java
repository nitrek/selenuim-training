package Com.Java.Basic;

import java.util.HashMap;

public class HashMapPract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMapPract uLogin = new HashMapPract();
		uLogin.login("test", "abcd");
		
		HashMap<String,String> test1 = new HashMap<>();
		
		test1.put("UserName", "Tatya");
		test1.put("Pwd", "abc");
		
		uLogin.login(test1);
		
		String[] lgDetails = {"abc","asd"};
		uLogin.login(lgDetails);
		
	}
	
	
	public void login(String uName,String pwd) {
		
		System.out.println("UseName" +uName +"Passwrd" +pwd);
	}
	
	public void login(HashMap<String,String> loginDetail) {
		
		System.out.println("UseName" +loginDetail.get("UserName") +"Passwrd" + loginDetail.get("Pwd"));
	}
	
	public void login(String[] arrLg) {
		
		System.out.println("UseName" +arrLg[0] +"Passwrd" +arrLg[1]);
	}

}
