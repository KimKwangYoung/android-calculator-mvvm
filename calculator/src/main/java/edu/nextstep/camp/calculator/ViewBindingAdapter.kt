package edu.nextstep.camp.calculator

import android.view.View
import androidx.core.view.isVisible
import androidx.databinding.BindingAdapter

object ViewBindingAdapter {

    @JvmStatic
    @BindingAdapter("visible")
    fun setVisible(view: View, isVisible: Boolean) {
        view.isVisible = isVisible
    }
}