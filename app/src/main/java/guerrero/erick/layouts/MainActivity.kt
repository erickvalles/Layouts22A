package guerrero.erick.layouts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    //declaración
    lateinit var etPrimerNumero:EditText
    lateinit var etSegundoNumero:EditText
    lateinit var btnAccionPrincipal:Button
    lateinit var tvResultado:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //instanciar
        etPrimerNumero = findViewById(R.id.primerNumero)
        etSegundoNumero = findViewById(R.id.segundoNumero)

        btnAccionPrincipal = findViewById(R.id.accionPrincipal)

        tvResultado = findViewById(R.id.resultado)

        btnAccionPrincipal.setOnClickListener{
            val textoPrimerNumero = etPrimerNumero.text.toString()
            val textSegundoNumero = etSegundoNumero.text.toString()
            if(textoPrimerNumero.equals("") || textSegundoNumero.equals("")){
                Log.e("mensaje","debe ingresar un texto")
            }else{
                val primerNumero = textoPrimerNumero.toInt()
                val segundoNumero = textSegundoNumero.toInt()
                tvResultado.text = "${primerNumero+segundoNumero}"
                etPrimerNumero.text.clear()
                etSegundoNumero.text.clear()
            }

        }

    }
}