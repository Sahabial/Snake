package framework;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;
import android.widget.TextView;

public class KeyTest extends Activity implements OnKeyListener {

	StringBuilder builder = new StringBuilder();
	TextView textView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		textView = new TextView(this);
		textView.setText("press key");
		textView.setOnKeyListener(this);
		textView.setFocusableInTouchMode(true);
		textView.requestFocus();
		setContentView(textView);
	}
	
	@Override
	public boolean onKey(View v, int keyCode, KeyEvent event) {
		// TODO Auto-generated method stub
		builder.setLength(0);
		switch (event.getAction()) {
		case KeyEvent.ACTION_DOWN:
			builder.append("down. ");
			break;
		case KeyEvent.ACTION_UP:
			builder.append("up. ");
			break; 
		}
		builder.append(event.getKeyCode());
		builder.append(". ");
		builder.append((char)event.getUnicodeChar());
		String text = builder.toString();
		Log.d("KeyTest", text);
		textView.setText(text);
		
		if (event.getKeyCode() == KeyEvent.KEYCODE_BACK)
			return false;
		else
			return true;
	}

}
