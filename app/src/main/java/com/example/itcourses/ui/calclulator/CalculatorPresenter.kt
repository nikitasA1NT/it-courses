package com.example.itcourses.ui.calclulator

import com.example.itcourses.ui.base.BasePresenter

class CalculatorPresenter(view: CalculatorView) : BasePresenter<CalculatorView>(view) {

    var showingText: String = ""
    var isDotPressed: Boolean = false
    var lastOperator: Char = ' '

    fun onClearClick() {
        isDotPressed = false
        lastOperator = ' '
        showingText = ""
        view.showAnswerText(showingText)
    }

    fun onEquallyClick() {
        when (lastOperator) {
            '-' -> {
                var numbers: List<String> = showingText.split("-")
                var num1: Double = numbers[0].toDouble()
                var num2: Double = numbers[1].toDouble()
                showingText = (num1 - num2).toString()
                view.showAnswerText(showingText)
                lastOperator = ' '
            }
            '+' -> {
                var numbers: List<String> = showingText.split("+")
                var num1: Double = numbers[0].toDouble()
                var num2: Double = numbers[1].toDouble()
                showingText = (num1 + num2).toString()
                view.showAnswerText(showingText)
                lastOperator = ' '
            }
            '/' -> {
                var numbers: List<String> = showingText.split("/")
                var num1: Double = numbers[0].toDouble()
                var num2: Double = numbers[1].toDouble()
                showingText = (num1 / num2).toString()
                view.showAnswerText(showingText)
                lastOperator = ' '
            }
            '*' -> {
                var numbers: List<String> = showingText.split("*")
                var num1: Double = numbers[0].toDouble()
                var num2: Double = numbers[1].toDouble()
                showingText = (num1 * num2).toString()
                view.showAnswerText(showingText)
                lastOperator = ' '
            }
        }
    }

    fun onSubClick() {
        if (lastOperator == ' ' && showingText != "") {
            isDotPressed = false
            lastOperator = '-'
            showingText += "-"
            view.showAnswerText(showingText)
        }
    }

    fun onSumClick() {
        if (lastOperator == ' ' && showingText != "") {
            isDotPressed = false
            lastOperator = '+'
            showingText += "+"
            view.showAnswerText(showingText)
        }
    }

    fun onDivClick() {
        if (lastOperator == ' ' && showingText != "") {
            isDotPressed = false
            lastOperator = '/'
            showingText += "/"
            view.showAnswerText(showingText)
        }
    }

    fun onMultClick() {
        if (lastOperator == ' ' && showingText != "") {
            isDotPressed = false
            lastOperator = '*'
            showingText += "*"
            view.showAnswerText(showingText)
        }
    }

    fun onDotClick() {
        if (!isDotPressed) {
            isDotPressed = true
            showingText += "."
            view.showAnswerText(showingText)
        }
    }

    fun onNum1Click() {
        showingText += "1"
        view.showAnswerText(showingText)
    }
    fun onNum2Click() {
        showingText += "2"
        view.showAnswerText(showingText)
    }
    fun onNum3Click() {
        showingText += "3"
        view.showAnswerText(showingText)
    }
    fun onNum4Click() {
        showingText += "4"
        view.showAnswerText(showingText)
    }
    fun onNum5Click() {
        showingText += "5"
        view.showAnswerText(showingText)
    }
    fun onNum6Click() {
        showingText += "6"
        view.showAnswerText(showingText)
    }
    fun onNum7Click() {
        showingText += "7"
        view.showAnswerText(showingText)
    }
    fun onNum8Click() {
        showingText += "8"
        view.showAnswerText(showingText)
    }
    fun onNum9Click() {
        showingText += "9"
        view.showAnswerText(showingText)
    }
    fun onNum0Click() {
        showingText += "0"
        view.showAnswerText(showingText)
    }
}
