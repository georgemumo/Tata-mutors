package com.apk.george.ui.theme.screens.testimonials

import android.widget.Toast
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.apk.george.data.TestimonialModel
import com.apk.george.navigation.ROUTE_VIEW_TESTIMONIALS
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun UpdateTestimonyScreen(navController: NavHostController, id:String) {
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally) {
        var context = LocalContext.current
        var Name by remember { mutableStateOf("") }
        var Brand by remember { mutableStateOf("") }
        var Occopation by remember { mutableStateOf("") }
        var Date by remember { mutableStateOf("") }
        

        var currentDataRef = FirebaseDatabase.getInstance().getReference()
            .child("Products/$id")
        currentDataRef.addValueEventListener(object: ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
//                var testimony = snapshot.getValue(Testimonial=::class.java)
//                Name = testimony!!.Name
//                Date = testimony!!.Date
//                Occopation = testimony!!.Occupation
//                Brand=testimony!!. Brand
            }

            override fun onCancelled(error: DatabaseError) {
                Toast.makeText(context, error.message, Toast.LENGTH_SHORT).show()
            }
        })

        Text(
            text = "Add product",
            fontSize = 30.sp,
            fontFamily = FontFamily.Cursive,
            color = Color.Red,
            modifier = Modifier.padding(20.dp),
            fontWeight = FontWeight.Bold,
            textDecoration = TextDecoration.Underline
        )

        var Name_Of_Person by remember { mutableStateOf(TextFieldValue(Name)) }
        var brand by remember { mutableStateOf(TextFieldValue(Brand)) }
        var occupation by remember { mutableStateOf(TextFieldValue(Occopation)) }
        var date by remember { mutableStateOf(TextFieldValue(Date)) }

        OutlinedTextField(
            value = Name_Of_Person,
            onValueChange = { Name_Of_Person = it },
            label = { Text(text = "Full Names*") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )

        Spacer(modifier = Modifier.height(20.dp))

        OutlinedTextField(
            value = date,
            onValueChange = { date = it },
            label = { Text(text = "Date_of_buying *") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )

        Spacer(modifier = Modifier.height(20.dp))

        OutlinedTextField(
            value = brand,
            onValueChange = { brand = it },
            label = { Text(text = "Brand *") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )

        Spacer(modifier = Modifier.height(20.dp))

        Button(onClick = {
            
            var productRepository = TestimonialModel.TestimonialModel(navController, context)
            productRepository.updateProduct(Name_Of_Person.text.trim(),occupation.text.trim(),
                brand.text.trim(),id,date.text.trim())
            navController.navigate(ROUTE_VIEW_TESTIMONIALS)

        }) {
            Text(text = "Update")
        }


    }

}

@Preview
@Composable
fun UpdateTestimonialsScreenPreview() {
    UpdateTestimonyScreen(rememberNavController(), id = "")
}