package com.example.tcossystem

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.BasicText
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import com.example.designsystem.TestCompose
import com.example.designsystem.baseToken.semanticTokens.defaultDarkColors
import com.example.designsystem.baseToken.semanticTokens.defaultLightColors
import com.example.designsystem.baseToken.them.TCOSThem
import com.example.designsystem.baseToken.them.Theme
import com.example.tcossystem.ui.theme.TCOSSystemTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TCOSThem {
                TestCompose()
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    BasicText(
        text = "Hello $name!",
        modifier = modifier
            .height(Theme.size.huge)
            .clip(Theme.corners.medium)
            .background(Theme.colors.background)
            .padding(horizontal = Theme.space.medium),
        style = Theme.typography.sectionTitle.copy(
            color = Theme.colors.primary
        )
    )
}

@Preview
@Composable
fun GreetingPreview() {
    TCOSThem(
        colorScheme = defaultLightColors
    ) {
        Greeting("Android")
    }
}