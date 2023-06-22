package com.example.mod5demonavigationinterne

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
data class User(val firstname : String, val lastname : String) : Parcelable


