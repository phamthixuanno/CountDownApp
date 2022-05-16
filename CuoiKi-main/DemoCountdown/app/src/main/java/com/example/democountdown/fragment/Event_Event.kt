package com.example.democountdown.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.ListFragment
import com.example.democountdown.R
import com.example.democountdown.fragment.EventCountdown

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Event_Event.newInstance] factory method to
 * create an instance of this fragment.
 */
class Event_Event : ListFragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    private var mView: View? = null

   // var adapter:EventAdapter?= null
    private var listEvents = ArrayList<EventCountdown>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }


        //load  animals

    }

    override fun onCreateView(

        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        mView = inflater.inflate(R.layout.fragment_event__event, container, false)
//
//        listEvents.add(
//            EventCountdown("Birthday", "23/11/2022", "23:30", R.drawable.baboon)
//        )
//        listEvents.add(
//            EventCountdown("Birthday", "20/11/2022", "23:35", R.drawable.baboon)
//        )
//        listEvents.add(
//            EventCountdown("Birthday", "21/11/2022", "23:40", R.drawable.baboon)
//        )
     //   adapter = EventAdapter(this,listEvents)
    //    list.adapter =  adapter

        return mView
    }


    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment Event_Event.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            Event_Event().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}
// class EventAdapter: BaseAdapter{
//    var  listEvents= ArrayList<EventCountdown>()
//    var context: Context?=null
//    constructor(context: Context, listOfAnimals: ArrayList<EventCountdown>):super(){
//        this.listEvents=listEvents
//        this.context=context
//    }
//    override fun getCount(): Int {
//        TODO("Not yet implemented")
//        return listEvents.size
//    }
//
//    override fun getItem(p0: Int): Any {
//        TODO("Not yet implemented")
//        return listEvents[p0]
//    }
//
//    override fun getItemId(p0: Int): Long {
//        TODO("Not yet implemented")
//        return  p0.toLong()
//    }
//
//    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
//        TODO("Not yet implemented")
//        val event =  listEvents[p0]
//    }
//
//}