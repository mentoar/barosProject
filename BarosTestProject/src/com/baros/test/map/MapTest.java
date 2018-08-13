/**
 * 
 */
package com.baros.test.map;

import java.util.HashMap;
import java.util.Map;

/**
 * @author baros
 *
 */
public class MapTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String,Entity> map = new HashMap<>();
		
		Entity en = new Entity();
		en.setId("1");
		en.setContent("abcd");
		
		map.put("1", en);
		
		map.putIfAbsent("2", new Entity());
		map.get("2").setId("2");
		
		System.out.println(map.get("2").getId());
		
	}

}
