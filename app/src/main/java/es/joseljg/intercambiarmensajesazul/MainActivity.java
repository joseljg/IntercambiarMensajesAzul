package es.joseljg.intercambiarmensajesazul;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MENSAJE_ENVIADO1 = "es.joseljg.MainActivity.mensaje1" ;
    public static final int PETICION1 = 1;
    EditText edt_mensaje_enviar1 = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt_mensaje_enviar1 = findViewById(R.id.edt_mensaje_enviado1);
    }

    public void enviar(View view) {
        String mensaje1 = String.valueOf(edt_mensaje_enviar1.getText());
        Intent intent1 = new Intent(this,Activity2.class);
        intent1.putExtra(EXTRA_MENSAJE_ENVIADO1, mensaje1);
        startActivityForResult(intent1, PETICION1);
    }
}