package com.commonliabray.activity.demo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

import com.commonliabray.activity.customview.AnimationActivity;
import com.commonliabray.activity.customview.AutomicMoveActivity;
import com.commonliabray.activity.customview.CircleMenuActivity;
import com.commonliabray.activity.customview.ClickImageActivity;
import com.commonliabray.activity.customview.DownloadaAnimatiorActivity;
import com.commonliabray.activity.customview.DragLayoutActivity;
import com.commonliabray.activity.customview.IndicatorActivity;
import com.commonliabray.activity.customview.LoadingActivity;
import com.commonliabray.activity.customview.MailAssociateActivity;
import com.commonliabray.activity.customview.OverScrollActivity;
import com.commonliabray.activity.customview.PinnerListViewActivity;
import com.commonliabray.activity.customview.SecretTextViewActivity;
import com.commonliabray.activity.fragment.anim.FragmentTranslationActivity;
import com.commonliabray.activity.fragment.viewpager.ProductTourActivity;
import com.commonliabray.activity.photoview.LauncherActivity;
import com.example.dragrelativelayout.R;

/**********************************************************
 * @文件名称：MainActivity.java
 * @文件作者：renzhiqiang
 * @创建时间：2015年10月2日 下午2:04:08
 * @文件描述：所有效果入口Activity
 * @修改历史：2015年10月2日创建初始版本
 **********************************************************/
public class MainActivity extends Activity implements OnItemClickListener {
	private ListView mListView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		initView();
	}

	private void initView() {
		mListView = (ListView) findViewById(R.id.list_view);
		mListView.setOnItemClickListener(this);
	}

	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position,
			long id) {
		Intent intent = null;
		switch (position) {
		case 0:
			intent = new Intent(this, AnimationActivity.class);
			break;
		case 1:
			intent = new Intent(this, AutomicMoveActivity.class);
			break;
		case 2:
			intent = new Intent(this, CircleMenuActivity.class);
			break;
		case 3:
			intent = new Intent(this, ClickImageActivity.class);
			break;
		case 4:
			intent = new Intent(this, DragLayoutActivity.class);
			break;
		case 5:
			intent = new Intent(this, IndicatorActivity.class);
			break;
		case 6:
			intent = new Intent(this, MailAssociateActivity.class);
			break;
		case 7:
			intent = new Intent(this, OverScrollActivity.class);
			break;
		case 8:
			intent = new Intent(this, PinnerListViewActivity.class);
			break;
		case 9:
			intent = new Intent(this, SecretTextViewActivity.class);
			break;
		case 10:
			intent = new Intent(this, FragmentTranslationActivity.class);
			break;
		case 11:
			intent = new Intent(this, DownloadaAnimatiorActivity.class);
			break;
		case 12:
			intent = new Intent(this, LoadingActivity.class);
			break;
		case 13:
			intent = new Intent(this, ProductTourActivity.class);
			break;
		case 14:
			intent = new Intent(this, LauncherActivity.class);
		}
		startActivity(intent);
	}
}