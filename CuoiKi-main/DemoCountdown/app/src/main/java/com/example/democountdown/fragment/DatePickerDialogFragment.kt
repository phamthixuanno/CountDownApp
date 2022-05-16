package com.example.democountdown.fragment

import android.app.DatePickerDialog
import android.app.Dialog
import android.os.Bundle
import android.widget.DatePicker
import androidx.fragment.app.DialogFragment
import java.text.SimpleDateFormat
import java.util.*


class DatePickerDialogFragment : DialogFragment(), DatePickerDialog.OnDateSetListener {
    private val c = Calendar.getInstance()
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        // Use the current date as the default date in the picker

        val year = c.get(Calendar.YEAR)
        val month = c.get(Calendar.MONTH)
        val day = c.get(Calendar.DAY_OF_MONTH)

        // Create a new instance of DatePickerDialog and return it
        return DatePickerDialog(requireActivity(), this, year, month, day)
    }

    override fun onDateSet(view: DatePicker, year: Int, month: Int, day: Int) {
        c.set(Calendar.YEAR, year)
        c.set(Calendar.MONTH, month)
        c.set(Calendar.DAY_OF_YEAR, day)
        val selectedDate = SimpleDateFormat("dd-mm-yyyy",Locale.ENGLISH).format(c.time)
        val selectedDateBundle = Bundle()
        selectedDateBundle.putString("REQUEST_CODE", selectedDate)
        setFragmentResult("REQUEST_CODE", selectedDateBundle)
    }


}