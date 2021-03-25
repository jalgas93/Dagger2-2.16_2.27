package com.example.dagger2_paging30.presentations.first

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.dagger2_paging30.R
import com.example.dagger2_paging30.databinding.FragmentFirstBinding
import com.example.dagger2_paging30.di.Injectable
import dagger.android.support.DaggerFragment
import javax.inject.Inject

class FirstFragment : DaggerFragment() {
    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    private val viewModel: FirstFragmentViewModel by viewModels { viewModelFactory }

    private var _binding: FragmentFirstBinding? = null
    private val mBinding get() = _binding!!

    private lateinit var timesStampTextView: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentFirstBinding.inflate(layoutInflater, container, false)
        return mBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel._infoText.observe(viewLifecycleOwner, Observer {
            timesStampTextView.text = "current time $it"

        })

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
    }

}