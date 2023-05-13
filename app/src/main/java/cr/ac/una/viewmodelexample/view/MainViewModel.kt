package cr.ac.una.viewmodelexample.view

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private val _textLiveData: MutableLiveData<String> = MutableLiveData()
    val textLiveData: LiveData<String> = _textLiveData

    fun updateText() {
        _textLiveData.value = "Texto actualizado desde el ViewModel"
    }
}