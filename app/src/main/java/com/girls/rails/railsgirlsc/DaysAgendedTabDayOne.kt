package com.girls.rails.railsgirlsc

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class DaysAgendedTabDayOne : Fragment() {

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // The last two arguments ensure LayoutParams are inflated properly.
       return  inflater.inflate(
                R.layout.fragment_day_tab_day_one, container, false)


    }
}