import java.util.HashMap;

public class Hash_Map {
public HashMap<Integer,String> BuildMap(){
	HashMap<Integer,String> hm = new HashMap<Integer,String>();
	hm.put(123, "sagar");
	hm.put(456, "kansara");
	return hm;
	
}
public static void main(String args[]){
	Hash_Map m1 = new Hash_Map();
	System.out.println(m1.BuildMap());
	
}
}