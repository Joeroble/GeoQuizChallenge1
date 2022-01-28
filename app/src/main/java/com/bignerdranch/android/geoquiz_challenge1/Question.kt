package com.bignerdranch.android.geoquiz_challenge1

import androidx.annotation.StringRes
// creates the data class Question that is used to store the question and answer data.
data class Question(@StringRes val textResID: Int, val answer: Boolean)