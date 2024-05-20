package com.apk.george.ui.theme.screens.gallery

import android.content.Context
import android.net.Uri
import android.provider.MediaStore
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.apk.george.R
import com.apk.george.data.TestimonialModel
import com.apk.george.navigation.ROUTE_ABOUTUS
import com.apk.george.navigation.ROUTE_GALLERY
import com.apk.george.navigation.ROUTE_HOME
import com.apk.george.navigation.ROUTE_TESTIMONIALS


@Composable
fun GalleryScreen(navController: NavController) {
    var Name by remember { mutableStateOf(TextFieldValue("")) }
    var Occupation by remember { mutableStateOf(TextFieldValue("")) }
    var Date_of_buying by remember { mutableStateOf(TextFieldValue("")) }
    var Brand by remember { mutableStateOf(TextFieldValue("")) }
    var context = LocalContext.current
Column(modifier= Modifier
    .background(color = Color.White)
    ) {
    Text(text = "OUR PRODUCTS")
//    Row {
//
//        Card (modifier = Modifier.size(200.dp)){
//            Image(painter = painterResource(id = R.drawable.img_6), contentDescription = "")
//            Text(text = "@2,300,376.90")
//        }
//        Card (modifier = Modifier.size(200.dp)){
//            Image(painter = painterResource(id = R.drawable.tru), contentDescription = "")
//            Text(text = "@4" +
//                    ",309,456")
//        }
//
//    }
//
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
                    text = "New York",
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
                    text = "New York",
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
                        painter = painterResource(id = R.drawable.img_8),
                        contentDescription = "newyork",
                        contentScale = ContentScale.Crop
                    )
                }
                Spacer(modifier = Modifier.height(10.dp))
                androidx.compose.material3.Text(
                    text = "New York",
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
                        painter = painterResource(id = R.drawable.track1),
                        contentDescription = "newyork",
                        contentScale = ContentScale.Crop
                    )
                }
                Spacer(modifier = Modifier.height(10.dp))
                androidx.compose.material3.Text(
                    text = "New York",
                    fontSize = 15.sp,
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center
                )

            }
        }

    }
    ImagePicker(Modifier,context, navController, Occupation.text.trim(), Brand .text.trim(), Name.text.trim(),Date_of_buying.text.trim())
//     Row {
//         Card {
//             Image(painter = painterResource(id = R.drawable.th), contentDescription = "")
//             Text(text = "@8,900,972")
//         }
//         Card {
//             Image(painter = painterResource(id = R.drawable.pr), contentDescription = "")
//         }
//     }








    Spacer(modifier = Modifier.height(15.dp))
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
                        tint = Color.Black,
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

@Composable
fun ImagePicker(
    modifier: Modifier = Modifier, context: Context, navController: NavController, Date:String,
    Occupation:String, Brand:String, Name:String) {
    var hasImage by remember { mutableStateOf(false) }
    var imageUri by remember { mutableStateOf<Uri?>(null) }

    val imagePicker = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.GetContent(),
        onResult = { uri ->
            hasImage = uri != null
            imageUri = uri
        }
    )

    Column(modifier = modifier,) {
        if (hasImage && imageUri != null) {
            val bitmap = MediaStore.Images.Media.
            getBitmap(context.contentResolver,imageUri)
            Image(bitmap = bitmap.asImageBitmap(), contentDescription = "Selected image")
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 32.dp), horizontalAlignment = Alignment.CenterHorizontally,) {
            Button(
                onClick = {
                    imagePicker.launch("image/*")
                },modifier=Modifier.fillMaxWidth()
            ) {
                Text(
                    text = "Select Image"
                )
            }

            Spacer(modifier = Modifier.height(10.dp))

            Button(onClick = {

                var testimonialRepository = TestimonialModel.TestimonialModel(navController, context)
                testimonialRepository.saveProductWithImage(Name, Date ,Occupation,Brand,imageUri!!)
                navController.navigate(ROUTE_GALLERY)

            },modifier=Modifier.fillMaxWidth()) {
                Text(text = "Upload")
            }
            Button(onClick = {


                navController.navigate(ROUTE_GALLERY)

            },modifier=Modifier.fillMaxWidth()) {
                Text(text = "view uploads")
            }

        }
    }
}


@Preview
@Composable
fun GalleryScreenPreview(){
    GalleryScreen(rememberNavController())
}
