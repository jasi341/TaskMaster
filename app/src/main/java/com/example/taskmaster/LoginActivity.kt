package com.example.taskmaster

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.HideReturnsTransformationMethod
import android.text.method.PasswordTransformationMethod
import android.view.inputmethod.EditorInfo
import android.view.inputmethod.InputMethodManager
import android.widget.CheckBox
import android.widget.Toast
import com.example.taskmaster.databinding.ActivityLoginBinding
import com.example.taskmaster.utils.Utils
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)


//        binding.showHidePasswordCheckBox.setOnCheckedChangeListener { _, isChecked ->
//            val transformationMethod = if (isChecked) {
//                HideReturnsTransformationMethod.getInstance()
//            } else {
//                PasswordTransformationMethod.getInstance()
//            }
//            binding.passwordEditText.transformationMethod = transformationMethod
//            binding.passwordEditText.setSelection(binding.passwordEditText.text?.length ?: 0)
//        }
//
//        binding.passwordEditText.setOnEditorActionListener { _, actionId, _ ->
//            if (actionId == EditorInfo.IME_ACTION_DONE) {
//                if (binding.emailText.text.toString().isEmpty()) {
//                    binding.emailText.error = "Please enter your email"
//                } else if (binding.passwordEditText.text.toString().isEmpty()) {
//                    binding.passwordTextInputLayout.error = "Please enter your password"
//                } else {
//                    Toast.makeText(this, "Login successful", Toast.LENGTH_SHORT).show()
//                    Utils.hideKeyboard(this, currentFocus)
//                }
//                true
//            } else {
//                false
//            }
//        }
    }
}