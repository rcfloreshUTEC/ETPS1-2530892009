package sv.edu.utec.primerparcialetps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edtUsername, edtPassword;

    TextView tvMensaje;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtUsername = findViewById(R.id.edtUsername);
        edtPassword = findViewById(R.id.edtppassword);
        tvMensaje = findViewById(R.id.tvMensaje);
    }

    public void Login (View v){
        String Username, Password;

        Username = edtUsername.getText().toString();
        Password = edtPassword.getText().toString();

        if (Username.equals("parcialETps1") && Password.equals("p4rC14l#tp$"))
        {
            startActivity(new Intent(MainActivity.this, imc.class));
        }
        else
        {
            tvMensaje.setText("Contraseña y/o usuario no son correctos");
        }
    }

}