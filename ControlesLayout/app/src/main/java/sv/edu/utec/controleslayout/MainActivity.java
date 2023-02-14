package sv.edu.utec.controleslayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

Spinner spPais;
EditText edtNombres, edtApellidos, etInfo;
RadioButton rbMasculino, rbFemenino, rbOtros;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNombres = findViewById(R.id.edtNombres);
        edtApellidos = findViewById(R.id.edtApellidos);
        etInfo = findViewById(R.id.editTextTextMultiLine);

        spPais = findViewById(R.id.spnPais);

        /* Forma 1
        String[]opciones = {"Seleccione un pais","Guatemala","El Salvador", "Honduras", "Nicaragua", "Costa Rica", "Panama"};
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,opciones);

        spPais.setAdapter(adaptador);

        */

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item){
            public View getView(int posicion, View contenido, ViewGroup parent){
                View vista = super.getView(posicion, contenido, parent);
                if(posicion == getCount())
                {
                    ((TextView)vista.findViewById(R.id.text1)).setText("");
                    ((TextView)vista.findViewById(R.id.text1)).setHint(getItem(getCount()));
                }

                return vista;
            };

            public int getCount(){

                return super.getCount()-1;
            };


        };

        adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);


        adaptador.add("Guatemala");
        adaptador.add("El Salvador");
        adaptador.add("Honduras");
        adaptador.add("Nicaragua");
        adaptador.add("Costa Rica");
        adaptador.add("Panama");
        adaptador.add("Seleccione un pais");

        spPais.setAdapter(adaptador);
        spPais.setSelection(adaptador.getCount());

        rbMasculino = findViewById(R.id.rbMasculino);
        rbFemenino = findViewById(R.id.rbFemenino);
        rbOtros = findViewById(R.id.rbOtros);
    }

    public void Almacenar(View view) {

            String datos = "";
            String seleccion = spPais.getSelectedItem().toString();
            if (seleccion.equals("Seleccione un pais")){
                datos = "No selecciono ningun pais";
            }
            else {
                if (seleccion.equals("Guatemala"))
                {
                    datos = "Guatemala";
                }
                else if (seleccion.equals("El Salvador"))
                {
                    datos = "El Salvador";
                }
                else if (seleccion.equals("Honduras"))
                {
                    datos = "Honduras";
                }
                else if (seleccion.equals("Nicaragua"))
                {
                    datos = "Nicaragua";
                }
                else if (seleccion.equals("Costa Rica"))
                {
                    datos = "Costa Rica";
                }
                else if (seleccion.equals("Panama"))
                {
                    datos = "Panama";
                }

                etInfo.append(datos);

            }

            }
}