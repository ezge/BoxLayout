package com.assessment.boxlayout

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.assessment.boxlayout.ui.theme.BoxLayoutTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.ui.Alignment
import androidx.compose.foundation.background
import androidx.compose.ui.draw.clip
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.shape.CutCornerShape

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BoxLayoutTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MainScreen(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun MainScreen(modifier: Modifier = Modifier) {
//    Box(contentAlignment = Alignment.CenterEnd,
//        modifier = modifier.size(400.dp, 400.dp)) {
//        val height = 200.dp
//        val width = 200.dp
//        TextCell("1", Modifier.size(width = width, height = height))
//        TextCell("2", Modifier.size(width = width, height = height))
//        TextCell("3", Modifier.size(width = width, height = height))
//    }

//    Box(modifier = modifier.size( height = 90.dp, width = 300.dp )) {
//        Text("TopStart", Modifier.align(Alignment.TopStart))
//        Text("TopCenter", Modifier.align(Alignment.TopCenter))
//        Text("TopEnd", Modifier.align(Alignment.TopEnd))
//        Text("CenterStart", Modifier.align(Alignment.CenterStart))
//        Text("Center", Modifier.align(Alignment.Center))
//        Text(text = "CenterEnd", Modifier.align(Alignment.CenterEnd))
//        Text("BottomStart", Modifier.align(Alignment.BottomStart))
//        Text("BottomCenter", Modifier.align(Alignment.BottomCenter))
//        Text("BottomEnd", Modifier.align(Alignment.BottomEnd))
//    }

    //Box(modifier.size(200.dp).clip(CircleShape).background(Color.Blue))
    //Box(modifier.size(200.dp).clip( RoundedCornerShape(30.dp)).background(Color.Blue))
    Box(modifier.size(200.dp).clip( CutCornerShape(30.dp)).background(Color.Blue))
}

@Composable
fun TextCell(text: String, modifier: Modifier = Modifier, fontSize: Int = 170 ) {
    val cellModifier = Modifier
        .padding(4.dp)
        .border(width = 5.dp, color = Color.Black)
    Surface {
        Text(
            text = text, cellModifier.then(modifier),
            fontSize = fontSize.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BoxLayoutTheme {
        MainScreen()
    }
}