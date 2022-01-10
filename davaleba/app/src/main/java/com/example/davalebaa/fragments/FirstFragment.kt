package com.example.davalebaa.fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.example.davalebaa.R

class FirstFragment : Fragment(R.layout.fragment_first) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val sendButton = view.findViewById<Button>(R.id.buttonSend)
        val amountEditText = view.findViewById<EditText>(R.id.editTextAmount)

        val controller = Navigation.findNavController(view)

        sendButton.setOnClickListener {

            val amountText = amountEditText.text.toString()

            if (amountText.isEmpty() ){
                return@setOnClickListener
            }

            val amount = amountText.toInt()

            val action = FirstFragmentDirections.actionFirstFragmentToSecondFragment(amount)

            controller.navigate(action)

        }
        val image = view.findViewById<Button>(R.id.image)
        val controllertwo = Navigation.findNavController(view)

        sendButton.setOnClickListener {

            val action = FirstFragmentDirections.actionFirstFragmentToFourthFragment()

        }
    }


}