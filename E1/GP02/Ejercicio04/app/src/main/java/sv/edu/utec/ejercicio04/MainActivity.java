package sv.edu.utec.ejercicio04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edtValorN;
    TextView tvRIncremento, tvRDecremento, tvRDuplicado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtValorN = findViewById(R.id.edtValorN);
        tvRIncremento = findViewById(R.id.tvRIncremento);
        tvRDecremento = findViewById(R.id.tvRDecremento);
        tvRDuplicado = findViewById(R.id.tvRDuplicado);
    }

    public void Calcular (View v){

        double valorN, resultado;

        valorN = Integer.parseInt(edtValorN.getText().toString());

        resultado = valorN + 77;
        tvRIncremento.setText(String.valueOf(resultado));

        resultado = resultado - 3;
        tvRDecremento.setText(String.valueOf(resultado));

        resultado = resultado * 2;
        tvRDuplicado.setText(String.valueOf(resultado));
    }

}