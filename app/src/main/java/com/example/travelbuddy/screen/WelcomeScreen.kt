package com.example.travelbuddy.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.travelbuddy.R

@Composable
fun WelcomeScreen() {
    Surface(modifier = Modifier.fillMaxSize()){
        ConstraintLayout(modifier= Modifier.fillMaxSize()) {
            val (welcomeColumn,welcomePhoto) = createRefs()

            Image(
                painter = painterResource(R.drawable.peakpx),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier.alpha(0.9f).constrainAs(welcomePhoto) {
                    top.linkTo(parent.top)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    bottom.linkTo(parent.bottom)
                }
            )

            Column(
                modifier= Modifier
                    .fillMaxWidth()
                    .padding(top = 360.dp, start = 16.dp, end = 16.dp)
                    .constrainAs(welcomeColumn) {
                        top.linkTo(parent.top)
                        start.linkTo(parent.start)
                        end.linkTo(parent.end)
                    },
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Image(
                    painter = painterResource(R.drawable.selection),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.height(70.dp),
                )

                Text(
                    text = "Travel Buddy",
                    fontWeight = FontWeight.Bold,
                    fontSize = 43.sp,
                    color = Color(0xFFEAE6E6)
                )
                Spacer(modifier = Modifier.height(16.dp))
                Text(
                    text = "Connect with fellow travelers",
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 21.sp,
                    color = Color(0xFFF6F6F8)
                )
                Spacer(modifier = Modifier.height(50.dp))
                Button(
                    modifier = Modifier
                        .width(340.dp).height(50.dp),
                    onClick = {},
                    colors = ButtonDefaults.buttonColors(Color(0xFF2196F3))

                ) {
                    Text(
                        text = "Get Started",
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp,
                        color = Color(0xFFEAE6E6)
                    )

                }
            }
        }
    }
}