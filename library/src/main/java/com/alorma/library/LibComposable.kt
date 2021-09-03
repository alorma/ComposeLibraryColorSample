package com.alorma.library

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.Color

internal val defaultlibColor = Color.Black
val LibraryColor = compositionLocalOf<Color> { defaultlibColor }


@Composable
fun MyLibComposable() {
    Text(
        text = "Color",
        color = LibraryColor.current
    )
}