package ru.usov.testapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class MainFragment : Fragment() {

    companion object {
        fun newInstance(args: Bundle?): MainFragment {
            val mainFragment = MainFragment()
            mainFragment.arguments = args
            return mainFragment
        }
        fun newInstance(exampleId: Int): MainFragment {
            val mainFragment = MainFragment()
            mainFragment.arguments?.putInt("exampleId", exampleId)
            return mainFragment
        }

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}