package com.feritri.recycleview1.model
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Affirmation(
    //Menambahkan dukungan untuk teks dan gambar di class Affirmation
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int
)
