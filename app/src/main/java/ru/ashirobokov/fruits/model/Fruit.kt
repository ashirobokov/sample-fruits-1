package ru.ashirobokov.fruits.model

import android.os.Parcelable
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import kotlinx.parcelize.Parcelize

@Parcelize
class Fruit (
    @StringRes val fruitName: Int,
    @DrawableRes val fruitImageId: Int,
    @StringRes  val fruitType: Int,
    @StringRes val fruitShortDescription: Int,
    @StringRes val fruitLongDescription: Int
) : Parcelable
