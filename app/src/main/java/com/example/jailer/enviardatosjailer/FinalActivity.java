package com.example.jailer.enviardatosjailer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class FinalActivity extends AppCompatActivity {


    @BindView(R.id.txtNombres)
    TextView txtNombres;

    @BindView(R.id.txtApellidos)
    TextView txtApellidos;

    @BindView(R.id.txtDireccion)
    TextView txtDireccion;

    @BindView(R.id.txtEmail)
    TextView txtEmail;


    @BindView(R.id.btnAtras)
    Button btnAtras;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);

        ButterKnife.bind(this);

        Intent intent=getIntent();
            Bundle extras =intent.getExtras();
            if (extras != null) {//ver si contiene datos


                String datoNombre=(String)extras.get("Nombre");
                String datoApellios=(String)extras.get("Apellidos");
                String datoDireccion=(String)extras.get("Direccion");
                String datoEmail=(String)extras.get("Email");



                txtNombres.setText(datoNombre);
                txtApellidos.setText(datoApellios);
                txtDireccion.setText(datoDireccion);
                txtEmail.setText(datoEmail);

            }
    }

    @OnClick(R.id.btnAtras)
    public void clikAtras() {
        Intent intent;
        intent= new Intent(this,InicioActivity.class);
        startActivity(intent);
    }
}
