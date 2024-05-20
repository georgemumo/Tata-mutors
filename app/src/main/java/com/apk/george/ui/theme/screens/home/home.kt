package com.apk.george.ui.theme.screens.home

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
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.apk.george.R
import com.apk.george.navigation.ROUTE_ABOUTUS

import com.apk.george.navigation.ROUTE_GALLERY
import com.apk.george.navigation.ROUTE_HOME
import com.apk.george.navigation.ROUTE_REASONS
import com.apk.george.navigation.ROUTE_TESTIMONIALS
import com.apk.george.navigation.ROUTE_VIEW_TESTIMONIALS


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavController) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
            .verticalScroll(rememberScrollState())


    ) {
        Text(text = "TATA MOTORS",
            color = Color.Red
            , fontSize = 30.sp,
            textDecoration = TextDecoration.Underline,
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(5.dp))
        Box {


            Text(
                text = "Our legacy",
                color = Color.Blue,
                fontSize = 24.sp,
                fontWeight = FontWeight.ExtraBold,
//                Alignment = Alignment.Center

                textAlign = TextAlign.Center

            )
        }



        Spacer(modifier = Modifier.height(5.dp))


        Text(text = "We as TATA company ensure that you have  wide range to fuel your success", color = Color.Black)
        Spacer(modifier = Modifier.padding(5.dp))


    Text(text = "Our latest versions of cars ",color = Color.Black, fontSize = 20.sp)
Row {

    Card(modifier = Modifier.size(200.dp)) {
        Column {
            Box(modifier = Modifier
                .fillMaxWidth()
                .height(150.dp),
                contentAlignment = Alignment.Center) {

                Image(painter = painterResource(id = R.drawable.img_6), contentDescription = "")
                Text(text = "@2,300,376.90")
            }
        }
    }
    Card (modifier = Modifier.size(200.dp)){
        Column {

            Box (modifier = Modifier
                .fillMaxWidth()
                .height(150.dp),
                contentAlignment = Alignment.Center){

                Image(painter = painterResource(id = R.drawable.tru), contentDescription = "")
                Text(text = "@4,309,456")
            }
        }
    }
}
        Spacer(modifier = Modifier.height(10.dp))
        Text(text = "Recommended for you")
        Row (
            modifier = Modifier.horizontalScroll(rememberScrollState())
        ){

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
                            painter = painterResource(id = R.drawable.tru),
                            contentDescription = "newyork",
                            contentScale = ContentScale.Crop
                        )
                    }
                    Spacer(modifier = Modifier.height(10.dp))
                    androidx.compose.material3.Text(
                        text = "1,123,456",
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
                            painter = painterResource(id = R.drawable.th),
                            contentDescription = "newyork",
                            contentScale = ContentScale.Crop
                        )
                    }
                    Spacer(modifier = Modifier.height(10.dp))
                    androidx.compose.material3.Text(
                        text = "1,123,456",
                        fontSize = 15.sp,
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center
                    )

                }
            }
            Spacer(modifier = Modifier.width(5.dp))


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
                            painter = painterResource(id = R.drawable.track1),
                            contentDescription = "newyork",
                            contentScale = ContentScale.Crop
                        )
                    }
                    Spacer(modifier = Modifier.height(10.dp))
                    androidx.compose.material3.Text(
                        text = "2,475,465",
                        fontSize = 15.sp,
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center
                    )

                }
            }




        }
        Text(text = "You can also click on the gallery button to view our products",color = Color.Black)
Button(onClick = { navController.navigate(ROUTE_GALLERY) }, modifier = Modifier.fillMaxWidth()) {
    Text(text = "Gallery")
}
        Text(text = "Sample of our car engines")
        Row ( modifier = Modifier.horizontalScroll(rememberScrollState())){
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
                            painter = painterResource(id = R.drawable.rti),
                            contentDescription = "newyork",
                            contentScale = ContentScale.Crop
                        )
                    }



                }
            }
            Spacer(modifier = Modifier.width(12.dp))
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
                            painter = painterResource(id = R.drawable.eng1),
                            contentDescription = "newyork",
                            contentScale = ContentScale.Crop
                        )
                    }

                }
            }
            Spacer(modifier = Modifier.width(12.dp))
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
                            painter = painterResource(id = R.drawable.irr),
                            contentDescription = "newyork",
                            contentScale = ContentScale.Crop
                        )
                    }

                }
            }
            Spacer(modifier = Modifier.width(12.dp))
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
                            painter = painterResource(id = R.drawable.eng1),
                            contentDescription = "newyork",
                            contentScale = ContentScale.Crop
                        )
                    }

                }
            }

        }

        Text(text = "Click on the button below to add  testimonials, those who we have bought some of our products .",color = Color.Black)
        Button(onClick = { navController.navigate(ROUTE_TESTIMONIALS) }, modifier = Modifier.fillMaxWidth()) {
            Text(text = "Add testimonials,View Testimonials")}
        Spacer(modifier = Modifier.height(10.dp))
        Text(text = "Click on the button below to see some of the stories our customers share",color = Color.Black)
        Button(onClick = { navController.navigate(ROUTE_REASONS) }, modifier = Modifier.fillMaxWidth()) {
            Text(text = "Why us")
        }



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
        Spacer(modifier = Modifier.height(20.dp))


}


@Preview(showSystemUi = true, showBackground = true)
@Composable
fun HomeScreenPreview(){
    HomeScreen(rememberNavController())
}