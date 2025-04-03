package com.example.travelbuddy.screen

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.CameraAlt
import androidx.compose.material.icons.filled.Chat
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.ManageAccounts
import androidx.compose.material.icons.filled.Photo
import androidx.compose.material.icons.filled.PhotoCamera
import androidx.compose.material.icons.filled.Voicemail
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.travelbuddy.R

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalLayoutApi::class, ExperimentalMaterial3Api::class)
@Composable
fun ProfileScreen() {
    Scaffold(
        modifier = Modifier.padding(8.dp),
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "My Profile",
                        fontSize = 24.sp,
                        fontWeight = FontWeight.SemiBold
                    )
                },
                actions = {
                    IconButton(onClick = { /* Handle edit profile */ }) {
                        Icon(
                            imageVector = Icons.Default.Edit,
                            contentDescription = "Edit Profile",
                            tint = Color(0xFF2196F3)
                        )
                    }
                    Text(
                        text = "Edit",
                        color = Color(0xFF2196F3),
                        fontSize = 20.sp,
                        fontWeight = FontWeight.SemiBold
                    )
                },

            )
        },
        bottomBar = {
            BottomAppBar(
                containerColor = Color(0xFFFDFDFD),
                modifier = Modifier.fillMaxWidth()
            ) {
                Spacer(modifier = Modifier.weight(1f))
                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    IconButton(onClick = { /* Handle home click */ }) {
                        Icon(
                            imageVector = Icons.Default.Home,
                            contentDescription = "Home",
                            tint = Color.Gray
                        )
                    }
                    Text(
                        text = "Home",
                        color = Color.Black
                    )
                }
                Spacer(modifier = Modifier.weight(1f))
                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    IconButton(onClick = { /* Handle home click */ }) {
                        Icon(
                            imageVector = Icons.Default.Chat,
                            contentDescription = "Chat",
                            tint = Color.Gray
                        )
                    }
                    Text(
                        text = "Chat",
                        color = Color.Black
                    )
                }
                Spacer(modifier = Modifier.weight(1f))
                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    IconButton(onClick = { /* Handle home click */ }) {
                        Icon(
                            imageVector = Icons.Default.Voicemail,
                            contentDescription = "Itineraries",
                            tint = Color.Gray
                        )
                    }
                    Text(
                        text = "Itineraries",
                        color = Color.Black,
                        fontWeight = FontWeight.SemiBold
                    )
                }
                Spacer(modifier = Modifier.weight(1f))
                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    IconButton(onClick = { /* Handle home click */ }) {
                        Icon(
                            imageVector = Icons.Default.ManageAccounts,
                            contentDescription = "Profile",
                            tint = Color.Gray
                        )
                    }
                    Text(
                        text = "Profile",
                        color = Color.Black,
                        fontWeight = FontWeight.SemiBold
                    )
                }
                Spacer(modifier = Modifier.weight(1f))

            }
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .padding(paddingValues)
                .padding(8.dp)
        ) {

            Spacer(modifier = Modifier.height(16.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                ProfileImageWithCameraIcon()
            }

            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "Sarah Parker",
                fontWeight = FontWeight.Bold,
                fontSize = 28.sp,
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = "28 years old",
                fontSize = 20.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color(0xFF65656B),
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )

            Spacer(modifier = Modifier.height(48.dp))

            Column{
                Text(
                    text = "Travel Preferences",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.SemiBold
                )
                Spacer(modifier = Modifier.height(16.dp))
                Column {
                    Row {
                        PreferenceChip("Adventure Travel")
                        Spacer(modifier = Modifier.width(8.dp))
                        PreferenceChip("Photography")
                    }
                    Spacer(modifier = Modifier.height(8.dp))
                    Row {
                        PreferenceChip("Cultural Experiences")
                        Spacer(modifier = Modifier.width(8.dp))
                        PreferenceChip("Food & Cuisine")
                    }
                    Spacer(modifier = Modifier.height(8.dp))
                    Row {
                        PreferenceChip("Backpacking")
                        Spacer(modifier = Modifier.width(8.dp))
                        PreferenceChip("Solo Travel")
                    }
                }

                Spacer(modifier = Modifier.height(32.dp))

                Button(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(60.dp),
                    onClick = {},
                    colors = ButtonDefaults.buttonColors(Color(0xFF3B81F4)),
                    shape = RoundedCornerShape(12.dp)

                ) {
                    Text(
                        text = "View My Travel Buddies",
                        fontWeight = FontWeight.Bold,
                        fontSize = 22.sp,
                        color = Color(0xFFEAE6E6)
                    )

                }

            }
        }
    }
}

@Composable
fun ProfileImageWithCameraIcon() {
    Box(
        modifier = Modifier.size(140.dp),
        contentAlignment = Alignment.Center
    ) {
        // Profile Image
        Image(
            painter = painterResource(id = R.drawable.profile),
            contentDescription = "Profile Image",
            modifier = Modifier
                .fillMaxSize()
                .clip(CircleShape),
            contentScale = ContentScale.Crop
        )

        // Camera Icon Background
        Surface(
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .size(40.dp),
            shape = CircleShape,
            color = Color(0xFF1976D2)
        ) {

            IconButton(onClick = {}) {
                Icon(
                    imageVector = Icons.Filled.CameraAlt,
                    contentDescription = "Camera Icon",
                    modifier = Modifier.padding(8.dp),
                    tint = Color.White
                )
            }
        }
    }
}

@Composable
fun PreferenceChip(text: String) {
    Surface(
        modifier = Modifier.clip(RoundedCornerShape(20.dp)),
        color = Color(0xFFD9E8FC),
    ) {
        Text(
            text = text,
            modifier = Modifier.padding(horizontal = 14.dp, vertical = 10.dp),
            fontSize = 16.sp,
            color = Color(0xFF3B81F4),
            fontWeight = FontWeight.SemiBold
        )
    }
}

@Preview(showBackground = true)
@Composable
fun MyProfileScreenPreview() {
    ProfileScreen()
}

@Preview(showBackground = true)
@Composable
fun ProfileImageWithCameraIconPreview() {
    ProfileImageWithCameraIcon()
}