package ru.usov.testapp

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Example(var exampl: String?) : Parcelable
