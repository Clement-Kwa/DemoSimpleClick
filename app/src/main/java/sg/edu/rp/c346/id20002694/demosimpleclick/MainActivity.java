package sg.edu.rp.c346.id20002694.demosimpleclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    TextView tvDisplay;
    Button btnDisplay;
    EditText etInput;
    ToggleButton togBtnEn;
    RadioGroup rgGender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvDisplay = findViewById(R.id. tvDisplay);
        btnDisplay = findViewById(R.id. btnDisplay);
        etInput = findViewById(R.id. etText);
        togBtnEn = findViewById(R.id.togBtnEn);
        rgGender = findViewById(R.id.rgGender);

        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code for the action
                String stringResponse = etInput.getText().toString();
                tvDisplay.setText(stringResponse);
            }
        });

        togBtnEn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Add your code for the action
                if(togBtnEn.isChecked() == true){
                    etInput.setEnabled(true);
                }
                else{
                    etInput.setEnabled(false);
                }
            }
        });

        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code for the action
                String stringResponse = "";
                int checkedRadioId = rgGender.getCheckedRadioButtonId();
                if(checkedRadioId == R.id.radioButtonGenderMale){
                    // Write the code when male selected
                    stringResponse="He says "+etInput.getText().toString();
                }
                else{
                    // Write the code when female selected
                    stringResponse="She says "+etInput.getText().toString();
                }
                tvDisplay.setText(stringResponse);
            }
        });

    }


}