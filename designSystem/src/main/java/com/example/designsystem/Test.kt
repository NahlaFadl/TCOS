package com.example.designsystem

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun TestCompose(){
    Text("Test Compose")
}

@Preview(showBackground = true)
@Composable
fun TestComposePreview(){
    TestCompose()
}