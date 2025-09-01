public class btnGuardar {
    
}
// Archivo .java (ej. MainActivity.java)

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Referencias a los campos de texto
        EditText etNombre = findViewById(R.id.etNombre);
        EditText etEmail = findViewById(R.id.etEmail);
        
        // Referencia al botón
        Button btnGuardar = findViewById(R.id.btnGuardar);

        // Define la acción al hacer clic en el botón Guardar
        btnGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Obtiene el texto de los campos
                String nombre = etNombre.getText().toString();
                String email = etEmail.getText().toString();

                // Crea el Intent para ir a la pantalla de destino
                Intent intent = new Intent(MainActivity.this, DatosGuardadosActivity.class);

                // Empaqueta los datos con un par de clave-valor
                intent.putExtra("nombre_usuario", nombre);
                intent.putExtra("email_usuario", email);

                // Inicia la nueva Activity
                startActivity(intent);
            }
        });
    }
}