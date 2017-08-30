package com.example.jailer.enviardatosjailer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class InicioActivity extends AppCompatActivity{
    private Button btnEnviar;
    private EditText ediNombre,ediTelefono;

    @BindView(R.id.txtNombres)
    EditText txtNombres;

    @BindView(R.id.txtApellidos)
    EditText txtApellidos;

    @BindView(R.id.txtDireccion)
    EditText txtDireccion;

    @BindView(R.id.txtEmail)
    EditText txtEmail;



    @BindView(R.id.btnEnviar)
    Button btnEnvia;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);


        ButterKnife.bind(this);


    }

    @OnClick(R.id.btnEnviar)
    public void clikEnviar() {

        Intent intent;
        intent= new Intent(this,FinalActivity.class);

        String auxTxtNombre =txtNombres.getText().toString();
        String auxTxtApellido =txtApellidos.getText().toString();
        String auxTxtDireccion =txtDireccion.getText().toString();
        String auxTxtEmail=txtEmail.getText().toString();


        intent.putExtra("Nombre",auxTxtNombre);//Guardamos una cadena
        intent.putExtra("Apellidos",auxTxtApellido);//Guardamos un entero
        intent.putExtra("Direccion",auxTxtDireccion);
        intent.putExtra("Email",auxTxtEmail);
        //lo iniciamos pasandole la intencion, con todos sus parametros guardados
        startActivity(intent);

    }
}
