package com.sfabro.semana2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ConfirmarDatos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmar_datos);
        cargarTextView();

        Button btn_editar = (Button) findViewById(R.id.btnEditar);
        btn_editar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }

    private void cargarTextView(){
        Bundle bundle = getIntent().getExtras();
        String nombreGuardado = bundle.getString("Nombre");
        String fechaGuardado = bundle.getString("Fecha");
        String telefonoGuardado = bundle.getString("Teléfono");
        String correoGuardado= bundle.getString("Correo");
        String descripcionGuardado= bundle.getString("Descripción");

        fechaGuardado = "Fecha Nacimiento: "+fechaGuardado;
        telefonoGuardado = "Tel: "+telefonoGuardado;
        correoGuardado = "Email: "+correoGuardado;
        descripcionGuardado = "Descripcion: "+descripcionGuardado;

        TextView tvNombre = (TextView) findViewById(R.id.tvNombre);
        TextView tvFechaNacimiento = (TextView) findViewById(R.id.tvFechaNacimiento);
        TextView tvTelefono = (TextView) findViewById(R.id.tvTelefono);
        TextView tvCorreo = (TextView) findViewById(R.id.tvCorreo);
        TextView tvDescripcion = (TextView) findViewById(R.id.tvDescripcion);
        tvNombre.setText(nombreGuardado);
        tvFechaNacimiento.setText(fechaGuardado);
        tvTelefono.setText(telefonoGuardado);
        tvCorreo.setText(correoGuardado);
        tvDescripcion.setText(descripcionGuardado);
    }
}