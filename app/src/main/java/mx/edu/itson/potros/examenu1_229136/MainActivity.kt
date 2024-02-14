package mx.edu.itson.potros.examenu1_229136

import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val editTextGradosC = findViewById<EditText>(R.id.GradosC)
        val editTextGradosF = findViewById<EditText>(R.id.GradosF)
        val btnC = findViewById<Button>(R.id.btnC)
        val btnF = findViewById<Button>(R.id.btnF)

        btnC.setOnClickListener {
            val gradosF = editTextGradosF.text.toString().toDoubleOrNull()
            if (gradosF != null) {
                val gradosC = (gradosF - 32) * 5 / 9
                editTextGradosC.setText(String.format("%.2f", gradosC))
            }
        }

        btnF.setOnClickListener {
            val gradosC = editTextGradosC.text.toString().toDoubleOrNull()
            if (gradosC != null) {
                val gradosF = (gradosC * 9 / 5) + 32
                editTextGradosF.setText(String.format("%.2f", gradosF))
            }
        }




    }
}