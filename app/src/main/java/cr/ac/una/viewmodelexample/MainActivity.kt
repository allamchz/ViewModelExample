package cr.ac.una.viewmodelexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import cr.ac.una.viewmodelexample.view.MainViewModel
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var textView =findViewById<TextView>(R.id.textView)
        var button =findViewById<Button>(R.id.button)

        // Inicializar ViewModel
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        // Observar cambios en el LiveData del texto
        viewModel.textLiveData.observe(this, Observer {
            textView.text = it
        })

        // Configurar onClickListener para el botón
        button.setOnClickListener {
            viewModel.updateText()
        }
    }
}