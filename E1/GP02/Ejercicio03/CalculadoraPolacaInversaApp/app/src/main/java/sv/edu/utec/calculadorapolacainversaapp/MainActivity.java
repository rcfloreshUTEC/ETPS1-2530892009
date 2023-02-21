package sv.edu.utec.calculadorapolacainversaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edtValor1, edtValor2, edtSimbolo;

    TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtValor1 = findViewById(R.id.edtValor1);
        edtValor2 = findViewById(R.id.edtValor2);
        edtSimbolo = findViewById(R.id.edtSimbolo);
        tvResultado = findViewById(R.id.tvResultado);
    }

    public void Calcular (View v)
    {
        int valor1, valor2, resultado;
        String Simbolo;
        double resdiv;

        valor1 = Integer.parseInt(edtValor1.getText().toString());
        valor2 = Integer.parseInt(edtValor2.getText().toString());
        Simbolo = edtSimbolo.getText().toString();

        if (Simbolo.equals("+"))
        {
            resultado = valor1 + valor2;
            tvResultado.setText(String.valueOf(resultado));
        }
        else if (Simbolo.equals("-"))
        {
            resultado = valor1 - valor2;
            tvResultado.setText(String.valueOf(resultado));
        }
        else if (Simbolo.equals("*"))
        {
            resultado = valor1 * valor2;
            tvResultado.setText(String.valueOf(resultado));
        }
        else if (Simbolo.equals("/"))
        {
            resdiv = Double.parseDouble(edtValor1.getText().toString()) / Double.parseDouble(edtValor2.getText().toString());
            tvResultado.setText(String.valueOf(String.format("%.2f", resdiv)));
        }
        else {
            tvResultado.setText("Ingrese un operador válido");
        }
    }
}