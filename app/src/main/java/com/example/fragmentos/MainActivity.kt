package com.example.fragmentos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import kotlinx.android.synthetic.main.activity_main.*
class MainActivity : AppCompatActivity() {

    var EstFrag : Boolean = true
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        boton.setOnClickListener{
            val fragmento2 = Fragmento2()
            val fragmento3 = Fragmento3()
            val manager = supportFragmentManager
            val transaction = manager.beginTransaction()

            if( EstFrag ){
                EstFrag = false
                transaction.replace(R.id.scroll,fragmento3)
                transaction.addToBackStack(null)
                transaction.commit()
            }else{
                EstFrag = true
                transaction.replace(R.id.scroll,fragmento2)
                transaction.addToBackStack(null)
                transaction.commit()
            }
        }
    }
}
