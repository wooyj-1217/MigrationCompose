package com.wooyj.migration_compose.ui.screen

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.wooyj.migration_compose.ui.theme.GlowpickTheme

@Composable
fun HomeScreen() {

    Text("Hello Compose!")

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HomeScreenPreview(){
    GlowpickTheme {
        HomeScreen()
    }
}