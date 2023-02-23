package sv.edu.utec.primerparcialetps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class imc extends AppCompatActivity {

EditText edtPeso, edtEstatura;
TextView tvResultadoIMC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imc);

        edtPeso = findViewById(R.id.edtPeso);
        edtEstatura = findViewById(R.id.edtEstatura);
        tvResultadoIMC = findViewById(R.id.tvResultadoIMC);
    }


    public void IMCMetodo (View v){
        Double peso, estatura, imc;

        peso = Double.parseDouble(edtPeso.getText().toString());
        estatura = Double.parseDouble(edtEstatura.getText().toString());

        imc = (peso) / (estatura * estatura);

        if(estatura > 2.5)
        {
            tvResultadoIMC.setText("Ingrese una estatura real");
        }
        else
        {
            if (imc < 10.5 ){
                tvResultadoIMC.setText("Críticamente Bajo de Peso. Su IMC es de " + String.valueOf(String.format("%.2f",imc)));
            }
            else if (imc < 15.9) {
                tvResultadoIMC.setText("Severamente Bajo de Peso. Su IMC es de " + String.valueOf(String.format("%.2f",imc)));
            }
            else if (imc < 18.5){
                tvResultadoIMC.setText("Bajo de Peso. Su IMC es de " + String.valueOf(String.format("%.2f",imc)));
            }
            else if (imc < 25){
                tvResultadoIMC.setText("Normal (peso saludable). Su IMC es de " + String.valueOf(String.format("%.2f",imc)));
            }
            else if (imc < 30){
                tvResultadoIMC.setText("Sobrepeso. Su IMC es de " + String.valueOf(String.format("%.2f",imc)));
            }
            else if (imc < 35){
                tvResultadoIMC.setText("Obesidad Clase 1 - Moderadamente Obeso. Su IMC es de " + String.valueOf(String.format("%.2f",imc)));
            }
            else if (imc < 40){
                tvResultadoIMC.setText("Obesidad Clase 2 - Severamente Obeso. Su IMC es de " + String.valueOf(String.format("%.2f",imc)));
            }
            else if (imc > 50){
                tvResultadoIMC.setText("Obesidad Clase 3 - Críticamente Obeso. Su IMC es de " + String.valueOf(String.format("%.2f",imc)));
            }

            edtPeso.setText("");
            edtEstatura.setText("");
        }

    }
}