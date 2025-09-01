public class btnVolver {
    
}
// Archivo .java (ej. SegundaActivity.java)

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SegundaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda); // Layout donde está el botón

        // Asocia la variable al botón
        Button btnVolver = findViewById(R.id.btnVolver);

        // Define la acción al hacer clic
        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Cierra la actividad actual
                finish();
            }
        });
    }
}