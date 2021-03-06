package com.doberman.it.stuffix.ui.home.travelsList

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.doberman.it.stuffix.R

class TravelsListFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_travels_list, container, false)
    }

    companion object {
        fun newInstance(): TravelsListFragment {
            return TravelsListFragment()
        }
    }
}
