package org.iesch.alberto.a3_registrodesocios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button botonRegistrar = (Button) findViewById(R.id.button_registry);

        final EditText nameEdit = (EditText) findViewById(R.id.nameEdit);
        final EditText apellidosEdit = (EditText) findViewById(R.id.last_nameEdit);
        final EditText nickEdit = (EditText) findViewById(R.id.nick_name_edit);
        final EditText edadEdit = (EditText) findViewById(R.id.edad_edit);
        final EditText direccionEdit = (EditText) findViewById(R.id.direccion_edit);
        final EditText ciudadEdit = (EditText) findViewById(R.id.ciudad_edit);

        botonRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent detailIntent = new Intent(MainActivity.this, DetailActivity.class);

                detailIntent.putExtra("name", nameEdit.getText().toString());
                detailIntent.putExtra("last_name", apellidosEdit.getText().toString());
                detailIntent.putExtra("nick", nickEdit.getText().toString());
                detailIntent.putExtra("edad", edadEdit.getText().toString());
                detailIntent.putExtra("direccion", direccionEdit.getText().toString());
                detailIntent.putExtra("ciudad", ciudadEdit.getText().toString());

                startActivity(detailIntent);

            }
        });
    }
}











