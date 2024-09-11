package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingImagePractice(
                        title = stringResource(R.string.title_practice_main2),
                        paragraphOne = stringResource(R.string.title_paragraph_one_main2),
                        paragraphTwo = stringResource(R.string.title_paragraph_two_main2),
                    )
                }
            }
        }
    }
}

@Composable
fun GreetingTextPractice(title: String, paragraphOne: String, paragraphTwo: String, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.spacedBy(16.dp),
        modifier = modifier,
    ) {
        Text(
            text = title,
            fontSize = 24.sp,
            textAlign = TextAlign.Justify
        )
        Text(
            text = paragraphOne,
            fontSize = 16.sp,
            textAlign = TextAlign.Justify
        )
        Text(
            text = paragraphTwo,
            fontSize = 16.sp,
            textAlign = TextAlign.Justify
        )
    }
}

@Composable
fun GreetingImagePractice(title: String, paragraphOne: String, paragraphTwo: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.bg_compose_background)

    Column(modifier) {
        Image(
            painter = image,
            contentDescription = null
        )
        GreetingTextPractice(
            title = title,
            paragraphOne = paragraphOne,
            paragraphTwo = paragraphTwo,
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        )
    }

}

@Preview(showBackground = true)
@Composable
fun PracticePreview() {
    MyApplicationTheme {
        GreetingImagePractice(
            title = stringResource(R.string.title_practice_main2),
            paragraphOne = stringResource(R.string.title_paragraph_one_main2),
            paragraphTwo = stringResource(R.string.title_paragraph_two_main2),
        )
    }
}