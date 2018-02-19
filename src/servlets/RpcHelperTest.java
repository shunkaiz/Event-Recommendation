package servlets;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.json.JSONArray;
import org.json.JSONException;
import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;

import entity.Item;
import entity.Item.ItemBuilder;

public class RpcHelperTest {

	@Test
	public void testGetJSONArray() throws JSONException {
		Set<String> category = new HashSet<String>();
		category.add("category one");
		Item.ItemBuilder builder = new Item.ItemBuilder();
        builder.setItemId("one");
        builder.setRating(5);
        builder.setCategories(category);
        Item one = builder.build();

        builder = new Item.ItemBuilder();
        builder.setItemId("two");
        builder.setRating(5);
        builder.setCategories(category);
        Item two = builder.build();
		List<Item> listItem = new ArrayList<Item>();
		listItem.add(one);
		listItem.add(two);
		
		 builder = new Item.ItemBuilder();
	        builder.setItemId("three");
	        builder.setRating(5);
	        builder.setCategories(category);
	        Item three = builder.build();		
		listItem.add(three);
		JSONArray jsonArray = new JSONArray();
		jsonArray.put(one.toJSONObject());
		jsonArray.put(two.toJSONObject());
		jsonArray.put(three.toJSONObject());
		JSONAssert.assertEquals(jsonArray, RpcHelper.getJSONArray(listItem), true);
		Item empty = new ItemBuilder().build();
		jsonArray.put(empty.toJSONObject());
		JSONAssert.assertEquals(jsonArray, RpcHelper.getJSONArray(listItem), true);

	}
}
