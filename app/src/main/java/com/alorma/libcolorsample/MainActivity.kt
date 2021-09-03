package com.alorma.libcolorsample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.alorma.libcolorsample.ui.theme.LibColorSampleTheme
import com.alorma.library.LibraryColor
import com.alorma.library.MyLibComposable

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LibColorSampleTheme {
                Column {
                    MyLibComposable()
                    Spacer(modifier = Modifier.height(8.dp))
                    CompositionLocalProvider(LibraryColor provides Color.Magenta) {
                        MyLibComposable()
                    }
                    Spacer(modifier = Modifier.height(8.dp))
                    CompositionLocalProvider(LibraryColor provides Color.Green) {
                        MyLibComposable()
                    }
                }
            }
        }
    }
}
