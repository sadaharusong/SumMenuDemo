package com.example.summenudemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		//getMenuInflater().inflate(R.menu.main, menu);
		SubMenu file = menu.addSubMenu("文件");
		SubMenu edit = menu.addSubMenu("编辑");
		file.add(1, 1, 1, "新建");
		file.add(1, 2, 1, "打开");
		file.add(1, 3, 1, "保存");
		file.setHeaderTitle("文件操作");
		file.setHeaderIcon(R.drawable.ic_launcher);
		edit.add(2, 1, 1, "复制");
		edit.add(2, 2, 1, "粘贴");
		edit.add(2, 3, 1, "剪切");
		edit.setHeaderTitle("编辑操作");
		edit.setHeaderIcon(R.drawable.ic_launcher);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getGroupId();
		if (id == 1) {
			switch (item.getItemId()) {
			case 1:
				Toast.makeText(MainActivity.this, "点击了新建按钮", Toast.LENGTH_SHORT).show();
				break;
			case 2:
				Toast.makeText(MainActivity.this, "点击了打开按钮", Toast.LENGTH_SHORT).show();
				break;
			case 3:	
				Toast.makeText(MainActivity.this, "点击了保存按钮", Toast.LENGTH_SHORT).show();
				break;
			}
		}
		else if (id == 2) {
			switch (item.getItemId()) {
			case 1:
				Toast.makeText(MainActivity.this, "点击了复制按钮", Toast.LENGTH_SHORT).show();
				break;
			case 2:
				Toast.makeText(MainActivity.this, "点击了粘贴按钮", Toast.LENGTH_SHORT).show();
				break;
			case 3:	
				Toast.makeText(MainActivity.this, "点击了剪切按钮", Toast.LENGTH_SHORT).show();
				break;
			}
		}
		
		return super.onOptionsItemSelected(item);
	}
}
