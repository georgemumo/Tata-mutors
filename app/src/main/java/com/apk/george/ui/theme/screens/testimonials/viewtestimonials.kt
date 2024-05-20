package com.apk.george.ui.theme.screens.testimonials

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.apk.george.data.TestimonialModel
import com.apk.george.models.Testimonials
import com.apk.george.navigation.ROUTE_UPDATE_TESTIMONIALS
//
//@Composable
//fun ViewTestimonialsScreen(navController: NavController){
//    Column(modifier = Modifier.fillMaxSize(),
//        horizontalAlignment = Alignment.CenterHorizontally) {
//
//        val context = LocalContext.current
//        val TestimonialsRepository = TestimonialModel.TestimonialModel(navController, context)
//        val emptyTestimonialState = remember { mutableStateOf(Testimonials("","","","")) }
//        val emptyTestimonialsListState = remember { mutableStateListOf<Testimonials>() }
//
//        val Testimonials = TestimonialsRepository.viewProducts(emptyTestimonialState, emptyTestimonialsListState)
//
//
//        Column(
//            modifier = Modifier
//                .fillMaxSize(),
//            horizontalAlignment = Alignment.CenterHorizontally
//        ) {
//            Text(text = "Testimonials",
//                fontSize = 30.sp,
//                fontFamily = FontFamily.Cursive,
//                color = Color.Red)
//
//            Spacer(modifier = Modifier.height(20.dp))
//
//            LazyColumn(){
//                items(Testimonials){
//                    Testimonials(
//                       Name = it.Name,
//                        Brand = it.Brand,
//                        Date = it.Date,
//                        Occupation = it.Occupation,
//
//
//                    )
//                }
//            }
//        }
//    }
//
//}
//
//@Composable
//fun ProductItem(
//    Name:String, Brand:String, Date:String, Occupation:String,id:String,
//    navController: NavHostController, TestimonialsRepository: TestimonialModel.TestimonialModel
//) {
//
//    Column(modifier = Modifier.fillMaxWidth()) {
//        Text(text = Name)
//        Text(text = Brand)
//        Text(text = Date)
//        Text(text = Occupation)
//        Button(onClick = {
//            TestimonialsRepository.deleteProduct(id)
//        }) {
//            Text(text = "Delete")
//        }
//        Button(onClick = {
//            navController.navigate(ROUTE_UPDATE_TESTIMONIALS+"/$id")
//        }) {
//            Text(text = "Update")
//        }
//
//    }


//}

//import androidx.compose.ui.tooling.data.EmptyGroup.name

//import com.example.jaccl.data.ProductViewModel
//import com.example.jaccl.models.Product
//import com.example.jaccl.navigation.ROUTE_UPDATE_PRODUCT


@Composable
fun ViewProductsScreen(navController:NavHostController) {
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally) {

        val context = LocalContext.current
        val productRepository = TestimonialModel.TestimonialModel(navController, context)
        val emptyProductState = remember { mutableStateOf(Testimonials("", "", "", "")) }
        val emptyProductsListState = remember { mutableStateListOf<Testimonials>() }

        val products = productRepository.viewProducts(emptyProductState, emptyProductsListState)


        Column(
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "All TESTIMONIALS",
                fontSize = 30.sp,
                fontFamily = FontFamily.Cursive,
                color = Color.Red)

            Spacer(modifier = Modifier.height(20.dp))

            LazyColumn(){
                items(products){
                    ProductItem(
                        name = it.Name,
                        quantity =it.Brand,
                        price = it.Date,
                        id = it.id,
                        Occupation = it.Occupation,

                        navController = navController,
                        productRepository = productRepository
                    )
                }
            }
        }
    }

}



@Composable
fun ProductItem(
    name:String, quantity:String, price:String, id:String,Occupation:String,
    navController:NavHostController, productRepository: TestimonialModel.TestimonialModel
) {

    Column(modifier = Modifier.fillMaxWidth()) {
        Text(text = name)
        Text(text = quantity)
        Text(text = price)
        Text(text = Occupation)
        Button(onClick = {
            productRepository.deleteProduct(id)
        }) {
            Text(text = "Delete")
        }
        Button(onClick = {
            navController.navigate(ROUTE_UPDATE_TESTIMONIALS+"/$id")
        }) {
            Text(text = "Update")
        }
    }

}

@Preview
@Composable
fun view() {
    ViewProductsScreen(rememberNavController())

}