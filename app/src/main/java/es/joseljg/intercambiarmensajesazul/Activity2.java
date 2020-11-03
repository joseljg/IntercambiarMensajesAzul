package es.joseljg.intercambiarmensajesazul;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    public static final String EXTRA_MENSAJE = "es.joseljg.Activity2.mensaje";
    EditText edt_mensaje_enviar2 = null;
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
        //--------------------------------------------------------------
        edt_mensaje_enviar2 = (EditText) findViewById(R.id.edt_mensaje_enviado2);
        Log.i("estados", "el Activity2 está en estado oncreate");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("estados", "el Activity2 está en estado onstart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("estados", "el Activity2  está en estado onresume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("estados", "el Activity2  está en estado onpause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("estados", "el Activity2  está en estado onstop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("estados", "el activity2 está en estado ondestroy");
    }


    public void enviar(View view)
    {
       String mensaje = String.valueOf(edt_mensaje_enviar2.getText());
       Intent intent = new Intent(this, MainActivity.class);
       intent.putExtra(EXTRA_MENSAJE, mensaje);
       setResult(RESULT_OK, intent);
       finish();
    }
}