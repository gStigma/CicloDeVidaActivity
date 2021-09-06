package com.cursoandroid.ciclovidaactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

/* Se demuestra el ciclo de vida de una activity
* Este texto a sido extraido de https://developer.android.com/guide/components/activities/activity-lifecycle
* *se puede extraer más informacion el los enlaces
* para más informacion enviar correo a gSStigma@gmail.com
* 1.0
* */

/*Cuando un usuario navega por tu app, sale de ella y vuelve a entrar, las instancias de Activity de tu app pasan
por diferentes estados de su ciclo de vida. La clase Activity proporciona una serie de devoluciones de llamada que permiten a la
actividad saber que cambió un estado, es decir, que el sistema está creando, deteniendo o reanudando una actividad, o finalizando
el proceso en el que se encuentra.*/

class MainActivity : AppCompatActivity() {

    /* Para navegar por las transiciones entre las etapas del ciclo de vida de una actividad, la clase Activity proporciona un conjunto básico de seis devoluciones de llamadas: onCreate(), onStart(),
    onResume(), onPause(), onStop() y onDestroy(). El sistema invoca cada una de estas devoluciones de llamada cuando una operación entra en un nuevo estado.*/

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i("LOGCICLO", "entramos en metodo oncreate")
    }

    override fun onStart(){
        super.onStart()
        Log.i("LOGCICLO", "entramos en metodo onStart")
    }


    override fun onResume(){
        super.onResume()
        Log.i("LOGCICLO", "entramos en metodo onResume")
    }

    override fun onPause(){
        super.onPause()
        Log.i("LOGCICLO", "entramos en metodo onPause")
    }

    override fun onStop(){
        super.onStop()
        Log.i("LOGCICLO", "entramos en metodo onStop")
    }

    override fun onDestroy(){
        super.onDestroy()
        Log.i("LOGCICLO", "entramos en metodo onDestroy")
    }

}