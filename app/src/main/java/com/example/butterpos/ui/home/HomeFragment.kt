package com.example.butterpos.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.butterpos.R
import com.example.butterpos.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textWelcome
        homeViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }

        //This creates another fragment inside the home fragment

        val receiptFragment = ReceiptFragment()
        childFragmentManager.beginTransaction()
            .replace(R.id.receipt_fragment_container, receiptFragment)
            .commit()

        val supportFragment = SupportFragment()
        childFragmentManager.beginTransaction()
            .replace(R.id.support_fragment_container, supportFragment)
            .commit()

        val totalFragment = TotalFragment()
        childFragmentManager.beginTransaction()
            .replace(R.id.total_fragment_container, totalFragment)
            .commit()

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}