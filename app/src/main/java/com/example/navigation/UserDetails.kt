package com.example.navigation

import android.graphics.drawable.Icon
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.rounded.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.navigation.ui.theme.NavigationTheme

@Composable
fun UserDetails(onNavigateToMessagesList: () -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp)
    ) {
        NavigationBar(onNavigateToMessagesList)
        Spacer(modifier = Modifier.height(80.dp))
        UserInfo()
    }
}


@Composable
fun UserInfo() {
    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(R.drawable.profile_picture),
            contentDescription = null,
            modifier = Modifier
                .size(150.dp)
                .clip(CircleShape)
                .border(1.5.dp, MaterialTheme.colorScheme.secondary, CircleShape)
        )

        Spacer(modifier = Modifier.width(20.dp))

//        Text(
//            text = "Nguyen",
//            color = MaterialTheme.colorScheme.primary,
//            fontSize = 40.sp,
//            fontWeight = FontWeight.Bold,
//            modifier = Modifier.padding(5.dp)
//        )

        TextField(
            value = "Thu", onValueChange = {},
            modifier = Modifier.padding(vertical = 30.dp)
        )
    }


}


@Composable
fun NavigationBar(onNavigateToMessagesList: () -> Unit) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(50.dp), contentAlignment = Alignment.CenterStart
    ) {
        BackButton(onNavigateToMessagesList)
    }
}


@Composable
fun BackButton(onNavigateToMessagesList: () -> Unit) {
    Button(
        onClick = onNavigateToMessagesList,
        modifier = Modifier.width(100.dp),
    ) {
        Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "Back")
    }
}

@Preview
@Composable
fun Preview() {
    NavigationTheme {
        UserDetails({})
    }
}