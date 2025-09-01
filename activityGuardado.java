public class activityGuardado {
    
}
// Archivo .java (ej. DatosGuardadosActivity.java)

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DatosGuardadosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos_guardados);

        // Obtiene el Intent que inició esta actividad
        Bundle extras = getIntent().getExtras();

        if (extras != null) {
            // Recupera los datos usando las mismas claves
            String nombreRecibido = extras.getString("nombre_usuario");
            String emailRecibido = extras.getString("email_usuario");

            // Muestra los datos en los TextViews del layout
            TextView tvNombre = findViewById(R.id.tv_nombre_mostrado);
            TextView tvEmail = findViewById(R.id.tv_email_mostrado);

            tvNombre.setText("Nombre: " + nombreRecibido);
            tvEmail.setText("Email: " + emailRecibido);
        }
    }
}