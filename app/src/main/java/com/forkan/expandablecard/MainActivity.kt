package com.forkan.expandablecard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.forkan.expandablecard.ui.theme.ExpandableCardTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterialApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ExpandableCardTheme {
                // A surface container using the 'background' color from the theme
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color.LightGray)
                        .padding(24.dp)
                ) {
                    ExpandableCard(
                        title = "My Title",
                        description = "Lorem Ipsum is simply dummy text of the printing and " +
                                "typesetting industry. Lorem Ipsum has been the industry's " +
                                "standard dummy text ever since the 1500s, when an unknown" +
                                " printer took a galley of type"
                    )

                }
            }
        }
    }
}


@ExperimentalMaterialApi
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ExpandableCardTheme {
        ExpandableCard(
            title = "My Title",
            description = "Lorem Ipsum is simply dummy text of the printing and" +
                    " typesetting industry. Lorem Ipsum has been the industry's " +
                    "standard dummy text ever since the 1500s, when an unknown " +
                    "printer took a galley of type"
        )
    }
}