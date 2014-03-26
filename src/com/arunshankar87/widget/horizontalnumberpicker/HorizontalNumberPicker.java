package com.arunshankar87.widget.horizontalnumberpicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

import com.arunshankar87.widget.R;

public class HorizontalNumberPicker extends LinearLayout {

	private Button decrementButton;
	private EditText numberEditText;
	private Button incrementButton;

	public HorizontalNumberPicker(Context context) {
		super(context);
		init(context);
		// TODO Auto-generated constructor stub
		

	}

	private void init(Context context) {
		// TODO Auto-generated method stub
		LayoutInflater inflater = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View view = inflater.inflate(R.layout.horizontal_number_picker, this);
		decrementButton = (Button) view.findViewById(R.id.decrementButton);
		numberEditText = (EditText) view.findViewById(R.id.numberEditText);
		incrementButton = (Button) view.findViewById(R.id.incrementButton);

		decrementButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				int current = Integer.parseInt(numberEditText
						.getText().toString()) ;
				numberEditText.setText(Integer.toString(current-1));

			}
		});

		incrementButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				int current = Integer.parseInt(numberEditText
						.getText().toString()) ;
				numberEditText.setText(Integer.toString(current+1));

			}
		});
		
	}

	public HorizontalNumberPicker(Context context, AttributeSet attrs) {
		super(context, attrs);
		init(context);
	}

	public HorizontalNumberPicker(Context context, AttributeSet attrs,
			int defStyleAttr) {
		super(context, attrs, defStyleAttr);
		init(context);
	}
	
	

}
