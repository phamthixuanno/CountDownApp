package com.example.mcountdowntimer
import android.app.AlertDialog
import android.app.Dialog
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import androidx.core.content.ContextCompat.startActivity
import androidx.fragment.app.DialogFragment
import com.xw.repo.BubbleSeekBar
import java.util.*

class CustomSeekbar : DialogFrament(){

    override fun onCreate(savedInstanceState: Bundle?): Dialog {
        val view = LayoutInflater.from(activity).inflate(R.layout.seekbar_dialog, null)
        val alert = AlertDialog.Builder(activity)
        val seekbarTime:BubbleSeekBar = view.findViewById(R.id.seekbar_time)
        val seekbarBreaks:BubbleSeekBar = view.findViewById(R.id.seekbar_breaks)
        var time: Int = 0
        var breaks: Int = 0
        seekbarTime.setOnProgressChangedListener(object : BubbleSeekBar.OnProgressChangedListener{
            override fun onProgressChanged(progress: Int, progressFloat: Float) {
                time = progress
            }

            override fun getProgressOnActionUp(progress: Int, progressFloat: Float) {

            }

            override fun getProgressOnFinally(progress: Int, progressFloat: Float) {

            }
        })

        seekbarBreaks.setOnProgressChangedListener(object : BubbleSeekBar.OnProgressChangedListener{
            override fun onProgressChanged(progress: Int, progressFloat: Float) {
                breaks = progress
            }

            override fun getProgressOnActionUp(progress: Int, progressFloat: Float) {

            }

            override fun getProgressOnFinally(progress: Int, progressFloat: Float) {

            }
        })

        with(alert){

            setView(view)
            setTitle("Configuragao Timer")
            setPositiveButton("Iniciar"){ _, _ -> onPositiveClick(time, breaks)}
        }

        return alert.create()
    }

    private fun onPositiveClick(time: Int, breaks: Int) {

        val i = Intent(activity!!.baseContext, Timer::class.java)
        i.putExtra("TIME", time)
        i.putExtra("BREAKS", breaks)
        startActivity(i)
    }
}


