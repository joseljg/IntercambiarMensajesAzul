package es.joseljg.intercambiarmensajesazul;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    TextView txt_respuesta2 = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        Intent intent1 = getIntent();
        String mensaje1 = intent1.getStringExtra(MainActivity.EXTRA_MENSAJE_ENVIADO1);
        txt_respuesta2 = (TextView) findViewById(R.id.txt_respuesta2);
        txt_respuesta2.setText(mensaje1);
        txt_respuesta2.setVisibility(View.VISIBLE);

    }
}