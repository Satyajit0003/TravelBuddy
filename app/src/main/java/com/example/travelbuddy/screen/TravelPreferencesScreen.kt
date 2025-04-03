package com.example.travelbuddy.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.House
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.travelbuddy.R

@Composable
fun TravelPreferenceScreen() {
    var checked by remember { mutableStateOf(false) }

    Scaffold(
        modifier = Modifier.fillMaxSize().padding(top = 60.dp),
        topBar = {
            Row(
                modifier = Modifier.fillMaxWidth().padding(16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    imageVector = Icons.Default.ArrowBack,
                    contentDescription = "Back",
                    modifier = Modifier
                        .clickable { /* Handle back navigation */ }
                        .padding(8.dp)
                )

                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = "Select Your Travel Preferences",
                    fontSize = 23.sp,
                    fontWeight = FontWeight.SemiBold
                )
            }
        }
    ) {
        Column(
            modifier = Modifier.fillMaxSize().padding(it)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .background(Color(0xD7F3F2F2))
            ) {
                Column(modifier = Modifier.padding(vertical = 37.dp, horizontal = 16.dp)) {
                    Text(
                        text = "Choose your preferred travel styles to help us find the perfect travel buddies for you.",
                        color = Color(0xFF65656B),
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Normal
                    )

                    Spacer(modifier = Modifier.height(50.dp))

                    Card(
                        modifier = Modifier.fillMaxWidth().padding(4.dp).height(100.dp),
                        colors = CardDefaults.cardColors(containerColor = Color.White),
                    ) {
                        Row(
                            modifier = Modifier.padding(16.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Checkbox(
                                checked = checked,
                                onCheckedChange = { checked = it },
                                modifier = Modifier.size(24.dp),
                                colors = CheckboxDefaults.colors(
                                    checkedColor = Color(0xFF2196F3),
                                    uncheckedColor = Color.Gray,
                                )
                            )

                            Spacer(modifier = Modifier.width(16.dp))

                            Column(modifier = Modifier.weight(1f)) {
                                Text(
                                    text = "Adventure",
                                    fontSize = 20.sp,
                                    fontWeight = FontWeight.W500
                                )
                                Text(
                                    text = "Hiking, climbing, extreme sports",
                                    fontSize = 17.sp,
                                    color = Color(0xFF65656B)
                                )
                            }

                            Icon(
                                painter = painterResource(id = R.drawable._811946_adventure_hiking_landscape_mountain_nature_icon),
                                contentDescription = "Adventure Icon",
                                modifier = Modifier.size(28.dp) ,
                                tint = Color.Gray
                            )
                        }
                    }

                    Spacer(modifier = Modifier.height(16.dp))

                    Card(
                        modifier = Modifier.fillMaxWidth().padding(4.dp).height(100.dp),
                        colors = CardDefaults.cardColors(containerColor = Color.White),
                    ) {
                        Row(
                            modifier = Modifier.padding(16.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Checkbox(
                                checked = checked,
                                onCheckedChange = { checked = it },
                                modifier = Modifier.size(24.dp),
                                colors = CheckboxDefaults.colors(
                                    checkedColor = Color(0xFF2196F3),
                                    uncheckedColor = Color.Gray,
                                )
                            )

                            Spacer(modifier = Modifier.width(16.dp))

                            Column(modifier = Modifier.weight(1f)) {
                                Text(
                                    text = "Relaxation",
                                    fontSize = 20.sp,
                                    fontWeight = FontWeight.W500
                                )
                                Text(
                                    text = "Beaches, spa, wellness activities",
                                    fontSize = 17.sp,
                                    color = Color(0xFF65656B)
                                )
                            }

                            Icon(
                                painter = painterResource(id = R.drawable.sun_umbrella),
                                contentDescription = "Relaxation Icon",
                                modifier = Modifier.size(28.dp) ,
                                tint = Color.Gray
                            )

                        }
                    }

                    Spacer(modifier = Modifier.height(16.dp))

                    Card(
                        modifier = Modifier.fillMaxWidth().padding(4.dp).height(100.dp),
                        colors = CardDefaults.cardColors(containerColor = Color.White),
                    ) {
                        Row(
                            modifier = Modifier.padding(16.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Checkbox(
                                checked = checked,
                                onCheckedChange = { checked = it },
                                modifier = Modifier.size(24.dp),
                                colors = CheckboxDefaults.colors(
                                    checkedColor = Color(0xFF2196F3),
                                    uncheckedColor = Color.Gray,
                                )
                            )

                            Spacer(modifier = Modifier.width(16.dp))

                            Column(modifier = Modifier.weight(1f)) {
                                Text(
                                    text = "Culture",
                                    fontSize = 20.sp,
                                    fontWeight = FontWeight.W500
                                )
                                Text(
                                    text = "Museums, historical sites, local experiences",
                                    fontSize = 17.sp,
                                    color = Color(0xFF65656B)
                                )
                            }

                            Icon(
                                painter = painterResource(id = R.drawable._322753_temple_chinese_new_year_architecture_and_city_culture_religion_icon),
                                contentDescription = "Culture Icon",
                                modifier = Modifier.size(28.dp) ,
                                tint = Color.Gray
                            )
                        }
                    }
                }
            }

            Button(
                onClick = {},
                modifier = Modifier
                    .fillMaxWidth()
                    .height(100.dp)
                    .padding(16.dp),
                shape = RoundedCornerShape(13.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF2196F3))
            ) {
                Text(
                    text = "Next",
                    fontSize = 24.sp
                )
            }
        }
    }
}