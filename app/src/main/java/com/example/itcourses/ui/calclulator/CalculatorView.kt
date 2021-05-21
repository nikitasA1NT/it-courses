package com.example.itcourses.ui.calclulator

import com.example.itcourses.ui.base.BaseView

interface CalculatorView : BaseView {

    fun showInputText(text: String)

    fun showAnswerText(text: String)
}
