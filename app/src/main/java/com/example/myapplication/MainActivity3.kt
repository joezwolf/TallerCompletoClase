package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity3 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingImageProject(
                        fullName = stringResource(R.string.fullName_main3),
                        title = stringResource(R.string.title_main3),
                        phone = stringResource(R.string.phone_main3),
                        page = stringResource(R.string.page_main3),
                        email = stringResource(R.string.email_main3)
                    )
                }
            }
        }
    }
}

@Composable
fun GreetingTextTitle(fullName: String, title: String, modifier: Modifier = Modifier) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
    ) {
        Text(
            text = fullName,
            fontSize = 40.sp,
            textAlign = TextAlign.Center
        )
        Text(
            text = title,
            fontSize = 16.sp,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold,
            color = Color(0, 107, 57)
        )
    }
}

@Composable
fun ContactItem(icon: Int, text: String) {
    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(icon),
            contentDescription = null,
            modifier = Modifier.size(24.dp)
        )
        Spacer(
            modifier = Modifier.width(16.dp)
        )
        Text(
            text = text,
            fontSize = 16.sp,
            textAlign = TextAlign.Justify
        )
    }
}

@Composable
fun GreetingTextFooter(phone: String, page: String, email: String, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.spacedBy(10.dp),
        modifier = modifier,
    ) {
        ContactItem(
            icon = R.drawable.ic_phone,
            text = phone
        )
        ContactItem(
            icon = R.drawable.ic_social,
            text = page
        )
        ContactItem(
            icon = R.drawable.ic_email,
            text = email
        )
    }
}

@Composable
fun GreetingImageProject(
    fullName: String,
    title: String,
    phone: String,
    page: String,
    email: String,
    modifier: Modifier = Modifier
) {
    val image = painterResource(R.drawable.android_logo)

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFE8F5E9))
    ) {
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier
                .size(150.dp)
                .align(alignment = Alignment.CenterHorizontally)
        )
        GreetingTextTitle(
            fullName = fullName,
            title = title,
        )
    }
    Column(
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
    ) {
        GreetingTextFooter(
            phone = phone,
            page = page,
            email = email
        )
        Spacer(modifier = Modifier.height(24.dp))
    }
}

@Preview(showBackground = true)
@Composable
fun ProjectPreview() {
    MyApplicationTheme {
        GreetingImageProject(
            fullName = stringResource(R.string.fullName_main3),
            title = stringResource(R.string.title_main3),
            phone = stringResource(R.string.phone_main3),
            page = stringResource(R.string.page_main3),
            email = stringResource(R.string.email_main3)
        )
    }
}