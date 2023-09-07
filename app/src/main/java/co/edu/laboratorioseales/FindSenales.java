package co.edu.laboratorioseales;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class FindSenales extends AppCompatActivity {

    private SeñalExpert expert = new SeñalExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button boton = findViewById(R.id.btn_find_senales);

        boton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                TextView msgEnd = (TextView) findViewById(R.id.msg_end);
                Spinner choseSignal = (Spinner) findViewById(R.id.choose_item);
                String signalType = String.valueOf(choseSignal.getSelectedItem());
                msgEnd.setText(signalType);
                StringBuilder signalFormatted = new StringBuilder();
                List<String> listSignal = expert.getType(signalType);

                for (String signal : listSignal) {
                    signalFormatted.append(signal).append("\n");
                }
                msgEnd.setText(signalFormatted.toString());
            }
        });
    }
}