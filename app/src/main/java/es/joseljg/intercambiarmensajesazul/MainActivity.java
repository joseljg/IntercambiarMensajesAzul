package es.joseljg.intercambiarmensajesazul;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MENSAJE_ENVIADO1 = "es.joseljg.MainActivity.mensaje1" ;
    public static final int PETICION1 = 1;
    public static final String EXTRA_RESPUESTA1 = "es.joseljg.MainActivity.respuesta1" ;
    private EditText edt_mensaje_enviar1 = null;
    private TextView txt_respuesta1 = null;

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    if(requestCode == PETICION1)
    {
        if(resultCode == RESULT_OK)
        {
            String mensaje = data.getStringExtra(Activity2.EXTRA_MENSAJE);
            txt_respuesta1.setText(mensaje);
            txt_respuesta1.setVisibility(View.VISIBLE);
            edt_mensaje_enviar1.setText("");
        }
    }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt_mensaje_enviar1 = (EditText) findViewById(R.id.edt_mensaje_enviado1);
        txt_respuesta1 = (TextView) findViewById(R.id.txt_respuesta1);
        Log.i("estados", "el MainActivity está en estado oncreate");
        if(savedInstanceState != null)
        {
            String respuesta1 = savedInstanceState.getString(EXTRA_RESPUESTA1);
            txt_respuesta1.setText(respuesta1);
            txt_respuesta1.setVisibility(View.VISIBLE);
        }
    }
//---------------------------------------------------------------------------------------
    @Override
    protected void onStart() {
        super.onStart();
        Log.i("estados", "el MainActivity está en estado onstart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("estados", "el MainActivity está en estado onresume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("estados", "el MainActivity está en estado onpause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("estados", "el MainActivity está en estado onstop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("estados", "el MainActivity está en estado ondestroy");
    }
    //---------------------------------------------------------------------------
    public void enviar(View view) {
        String mensaje1 = String.valueOf(edt_mensaje_enviar1.getText());
        Intent intent1 = new Intent(this,Activity2.class);
        intent1.putExtra(EXTRA_MENSAJE_ENVIADO1, mensaje1);
        startActivityForResult(intent1, PETICION1);
    }
    //---------------------------------------------------------------------------

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        String respuesta1 = String.valueOf(txt_respuesta1.getText());
        outState.putString(EXTRA_RESPUESTA1, respuesta1);
    }
}