package sv.edu.utec.ejercicio02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edtproducto;
    TextView tvresultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtproducto = findViewById(R.id.edtPProducto);
        tvresultado = findViewById(R.id.tvResultado);
    }

    public void IVA (View v){

        double producto, resultado;
        producto = Double.parseDouble(edtproducto.getText().toString());
        resultado = producto * 1.134;
        tvresultado.setText(String.valueOf(String.format("%.2f", resultado)));
    }


}