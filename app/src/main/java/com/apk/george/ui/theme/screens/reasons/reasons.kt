package com.apk.george.ui.theme.screens.reasons

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.apk.george.R
import com.apk.george.navigation.ROUTE_ABOUTUS
import com.apk.george.navigation.ROUTE_HOME
import com.apk.george.navigation.ROUTE_TESTIMONIALS

@Composable
fun ReasonsScreen(navController: NavController){
    Column(modifier = Modifier
        .fillMaxSize()
        .background(color = Color.White)
        .verticalScroll(
            rememberScrollState()
        )) {
    Box(contentAlignment = Alignment.Center) {
        Text(text = "WHY CHOOSE TATA", color = Color.Blue, textAlign = TextAlign.Center)
    }

        Spacer(modifier = Modifier.height(15.dp))

        Row(
            modifier = Modifier.horizontalScroll(rememberScrollState())
        ) {

            Card(
                modifier = Modifier
                    .height(250.dp)
                    .width(200.dp)
            ) {
                Column {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(150.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.img_5),
                            contentDescription = "newyork",
                            contentScale = ContentScale.Crop
                        )
                    }
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(
                        text = "We are able to quote for new projects on the basis of vehicles' higher productivity",
                        fontSize = 15.sp,
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center
                    )

                }
            }
            Spacer(modifier = Modifier.width(5.dp))

            Card(
                modifier = Modifier
                    .height(250.dp)
                    .width(200.dp)
            ) {
                Column {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(150.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.person2),
                            contentDescription = "newyork",
                            contentScale = ContentScale.Crop
                        )
                    }
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(
                        text = "After trial we found that TML vehicle performed way better than other vehicle and gave 3.27 KMPL which is best-in-class",
                        fontSize = 15.sp,
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center
                    )

                }
            }
            Spacer(modifier = Modifier.width(5.dp))

            Card(
                modifier = Modifier
                    .height(250.dp)
                    .width(200.dp)
            ) {
                Column {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(150.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.img_4),
                            contentDescription = "newyork",
                            contentScale = ContentScale.Crop
                        )
                    }
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(
                        text = "We are very pleased with the superior vehicle performance, better mileage and the comfortable Signa cabin",
                        fontSize = 15.sp,
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center
                    )

                }
            }
        }
Spacer(modifier = Modifier.height(20.dp))
        Text(text = "HERO STORIES", color = Color.Blue, textAlign = TextAlign.Center)

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(150.dp),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.reas1),
                contentDescription = "newyork",
                contentScale = ContentScale.Crop
            )
        }
        Spacer(modifier = Modifier.height(10.dp))
        androidx.compose.material3.Text(
            text = "We are among the many people to buy Tata Prima Tippers. Since then, we haven’t looked back",
            fontSize = 15.sp,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center
        )
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(150.dp),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.rename),
                contentDescription = "newyork",
                contentScale = ContentScale.Crop
            )
        }
        Spacer(modifier = Modifier.height(10.dp))
        androidx.compose.material3.Text(
            text = "We are among the many people to buy Tata Prima Tippers. Since then, we haven’t looked back",
            fontSize = 15.sp,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(20.dp))
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(150.dp),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.reas2),
                contentDescription = "newyork",
                contentScale = ContentScale.Crop
            )
        }
        Spacer(modifier = Modifier.height(10.dp))
        androidx.compose.material3.Text(
            text = "Tata Motors vehicles are mileage efficient vehicles. I am fully satisfied with the given results.",
            fontSize = 15.sp,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center
        )



        val context = LocalContext.current.applicationContext
        BottomAppBar(
            modifier = Modifier.fillMaxWidth(),



            actions = {
                Box {
                    IconButton(onClick = {
                        navController.navigate(ROUTE_HOME)

                    }) {
                        Icon(
                            imageVector = Icons.Filled.Home,
                            contentDescription = "Search",
                            tint = Color.Black ,
                            modifier = Modifier.size(129.dp)
                        )

                    }
                }

                Spacer(modifier = Modifier.padding(39.dp))
                IconButton(onClick = { navController.navigate(ROUTE_TESTIMONIALS) }) {
                    Icon(
                        imageVector = Icons.Filled.AddCircle,
                        contentDescription = "share",
                        tint = Color.Black,
                        modifier = Modifier.size(129.dp)
                    )
                }
                Spacer(modifier = Modifier.padding(39.dp))
                IconButton(onClick = { navController.navigate(ROUTE_ABOUTUS)}) {
                    Icon(
                        imageVector = Icons.Filled. Info,
                        contentDescription = "menu",
                        tint = Color.Black
                        ,modifier = Modifier.size(129.dp)
                    )
                }




            }
        )


    }

    }

@Preview
@Composable
fun ReasonsScreenPreview(){
    ReasonsScreen(rememberNavController())
}