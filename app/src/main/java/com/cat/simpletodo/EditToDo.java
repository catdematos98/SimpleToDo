package com.cat.simpletodo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class EditToDo extends AppCompatActivity {

    EditText etItemText;
    int position;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_to_do);

        etItemText = (EditText) findViewById(R.id.etText);
        //etItemText.setText(getIntent().getStringExtra(ITEM_TEXT));
        position = getIntent().getExtras().getInt("position");
        getSupportActionBar().setTitle("EDIT ITEM");

    }

    public void onSaveItem(View v){
        Intent data = new Intent();
        // Pass updated item text and original position
        data.putExtra("itemText", etItemText.getText().toString());
        data.putExtra("itemPosition", position); // ints work too
        setResult(RESULT_OK, data);
        finish();
    }
}
