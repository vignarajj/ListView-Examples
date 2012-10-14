package com.list.multic;

import java.util.ArrayList;
import java.util.HashMap;
import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import static com.list.multic.Constant.FIRST_COLUMN;
import static com.list.multic.Constant.SECOND_COLUMN;
import static com.list.multic.Constant.THIRD_COLUMN;
import static com.list.multic.Constant.FOURTH_COLUMN;

public class MultiColumnActivity extends Activity
{
private ArrayList<HashMap<String,String>> list;

public void onCreate(Bundle savedInstanceState)
{
super.onCreate(savedInstanceState);
setContentView(R.layout.main);

ListView lview = (ListView) findViewById(R.id.listview);
populateList();
listviewAdapter adapter = new listviewAdapter(this, list);
lview.setAdapter(adapter);
}

private void populateList() {

list = new ArrayList<HashMap<String,String>>();

HashMap<String,String> temp = new HashMap<String,String>();
temp.put(FIRST_COLUMN,"Colored Notebooks");
temp.put(SECOND_COLUMN, "By NavNeet");
temp.put(THIRD_COLUMN, "Rs. 200");
temp.put(FOURTH_COLUMN, "Per Unit");
list.add(temp);

HashMap<String,String> temp1 = new HashMap<String,String>();
temp1.put(FIRST_COLUMN,"Diaries");
temp1.put(SECOND_COLUMN, "By Amee Products");
temp1.put(THIRD_COLUMN, "Rs. 400");
temp1.put(FOURTH_COLUMN, "Per Unit");
list.add(temp1);

HashMap<String,String> temp2 = new HashMap<String,String>();
temp2.put(FIRST_COLUMN,"Note Books and Stationery");
temp2.put(SECOND_COLUMN, "By National Products");
temp2.put(THIRD_COLUMN, "Rs. 600");
temp2.put(FOURTH_COLUMN, "Per Unit");
list.add(temp2);

HashMap<String,String> temp3 = new HashMap<String,String>();
temp3.put(FIRST_COLUMN,"Corporate Diaries");
temp3.put(SECOND_COLUMN, "By Devarsh Prakashan");
temp3.put(THIRD_COLUMN, "Rs. 800");
temp3.put(FOURTH_COLUMN, "Per Unit");
list.add(temp3);

HashMap<String,String> temp4 = new HashMap<String,String>();
temp4.put(FIRST_COLUMN,"Writing Pad");
temp4.put(SECOND_COLUMN, "By TechnoTalaktive Pvt. Ltd.");
temp4.put(THIRD_COLUMN, "Rs. 100");
temp4.put(FOURTH_COLUMN, "Per Unit");
list.add(temp4);
}
}