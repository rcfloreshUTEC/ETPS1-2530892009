package sv.edu.utec.ejercicio01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edtNombre;
    TextView tvSaludo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNombre = findViewById(R.id.edtNombre);
        tvSaludo = findViewById(R.id.tvSaludo);
    }

    public void Saludo (View v){

        String nombre = edtNombre.getText().toString();

        tvSaludo.setText("Bienvenido "+nombre);


    }

}