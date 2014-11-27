package cn.edu.gdmec.s07131040.demo_propertyanimation;

import android.support.v7.app.ActionBarActivity;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {
	private TextView tv;
	private Button btnAlpha,btnTranslate,btnScale,btnRotate,btnAll;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		tv=(TextView) findViewById(R.id.textView1);
		btnAlpha=(Button) findViewById(R.id.button1);
		btnTranslate=(Button) findViewById(R.id.button2);
		btnScale=(Button) findViewById(R.id.button3);
		btnRotate=(Button) findViewById(R.id.button4);
		btnAll=(Button) findViewById(R.id.button5);
		btnAlpha.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Animator animator=AnimatorInflater.loadAnimator(MainActivity.this, R.animator.alpha_animator);
				animator.setTarget(tv);
				animator.start();
			}
		});
		btnTranslate.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Animator animator=AnimatorInflater.loadAnimator(MainActivity.this, R.animator.translate_animator);
				animator.setTarget(tv);
				animator.start();
			}
		});
		btnScale.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Animator animator=AnimatorInflater.loadAnimator(MainActivity.this, R.animator.scale_animator);
				animator.setTarget(tv);
				animator.start();
			}
		});
		btnRotate.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Animator animator=AnimatorInflater.loadAnimator(MainActivity.this, R.animator.rotate_anmator);
				animator.setTarget(tv);
				animator.start();
			}
		});
		btnAll.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			AnimatorSet set=new AnimatorSet();
			Animator alpha=AnimatorInflater.loadAnimator(MainActivity.this, R.animator.alpha_animator);
			Animator translate=AnimatorInflater.loadAnimator(MainActivity.this, R.animator.translate_animator);
			Animator scale=AnimatorInflater.loadAnimator(MainActivity.this, R.animator.scale_animator);
			Animator rotate=AnimatorInflater.loadAnimator(MainActivity.this, R.animator.rotate_anmator);
			set.play(alpha).after(translate).with(scale);
			set.setTarget(tv);
			
			
			set.start();
			}
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
