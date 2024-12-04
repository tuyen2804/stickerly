package com.hlt.stikerly

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.widget.addTextChangedListener
import androidx.fragment.app.Fragment

import com.hlt.stikerly.databinding.FragmentSearchBinding

class SearchFragment : Fragment() {

    private var _binding: FragmentSearchBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSearchBinding.inflate(inflater, container, false)
        val view = binding.root

        binding.edSearch.addTextChangedListener {
            if (it?.isNotEmpty() == true) {
                binding.btnX.visibility = View.VISIBLE
            } else {
                binding.btnX.visibility = View.INVISIBLE
            }
        }

        binding.edSearch.setOnFocusChangeListener { _, hasFocus ->
            if (hasFocus) {
                binding.btnCancel.visibility = View.VISIBLE
            } else {
                binding.btnCancel.visibility = View.GONE
            }
        }

        binding.btnCancel.setOnClickListener {
            binding.edSearch.clearFocus()
            binding.btnCancel.visibility = View.GONE
        }

        binding.btnX.setOnClickListener {
            binding.edSearch.text.clear()
        }

        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
