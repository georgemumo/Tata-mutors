package com.apk.george.ui.theme.screens.registration

import AuthViewModel
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.apk.george.R
//import com.apk.george.data.AuthViewModel
import com.apk.george.navigation.ROUTE_HOME
import com.apk.george.navigation.ROUTE_LOGIN

@Composable
fun RegistrationScreen(navController: NavController) {
    Column (modifier= Modifier
        .fillMaxSize()
        .background(color = Color.White), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center){
        Text(text = "SIGN UP", fontSize = 32.sp, color = Color.Blue)
        Spacer(modifier = Modifier.height(30.dp))
        var email by remember {   mutableStateOf(TextFieldValue(""))   }
        var phoneNumber by remember { mutableStateOf(TextFieldValue(""))  }
        var age by remember { mutableStateOf(TextFieldValue("")) }
        var fullName by remember { mutableStateOf(TextFieldValue(""))  }
        val context= LocalContext.current
        var password by remember { mutableStateOf(TextFieldValue("")) }
        OutlinedTextField(
            modifier = Modifier.fillMaxWidth(),
            value = fullName, onValueChange = {fullName=it},
            placeholder = { Text(text = "Enter your full names")}
            )
        Spacer(modifier = Modifier.height(20.dp))
        OutlinedTextField(
            modifier = Modifier.fillMaxWidth(),
            value = email, onValueChange ={email=it},
            leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription ="" )}
            , placeholder = { Text(text = "example@gmail.com")}


        )
        Spacer(modifier = Modifier.height(20.dp))


//        var passwordVisibility by remember { mutableStateOf(false) }
//        var password by rememberSaveable{ mutableStateOf( TextFieldValue("")) }
//        val icon = if (passwordVisibility)
//            painterResource(id = R.drawable.design_ic_visibility)
//        else
//            painterResource(id = R.drawable.design_ic_visibility_off)
//
//        OutlinedTextField(
//            modifier = Modifier.fillMaxWidth(),
//            value =password ,
//            onValueChange ={
//                password = it
//            },
//            placeholder = { Text(text = "Enter your password") },
//            label = { Text(text = "Password") },
//            leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "") },
//            trailingIcon = {
//                IconButton(onClick = {
//                    passwordVisibility = !passwordVisibility
//                }) {
//                    Icon(
//                        painter = icon,
//                        contentDescription = "Visibility Icon"
//                    )
//                }
//            },
//            keyboardOptions = KeyboardOptions(
//                keyboardType = KeyboardType.Password
//            ),
//            visualTransformation = if (passwordVisibility) VisualTransformation.None
//            else PasswordVisualTransformation()
//        )
        OutlinedTextField(value =password , onValueChange = {password=it},
            leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription ="" )},
            label = { Text(text = "Enter password") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),

            modifier = Modifier
                .fillMaxWidth()

        )
        Spacer(modifier = Modifier.height(20.dp))
    var confirmpassword by remember {mutableStateOf(TextFieldValue(""))  }
        OutlinedTextField(
            modifier = Modifier.fillMaxWidth(),
            value = confirmpassword, onValueChange ={confirmpassword=it},
            placeholder = { Text(text = "confirm password")},
            leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription ="" )}
        )
       Spacer(modifier = Modifier.height(20.dp))
//        OutlinedTextField(
//            modifier = Modifier.fillMaxWidth(),
//            value = phoneNumber, onValueChange ={phoneNumber=it},
//            placeholder = { Text(text = "0776****90")},
//            leadingIcon = { Icon(imageVector = Icons.Default.Call, contentDescription ="" )}
//        )
        Spacer(modifier = Modifier.height(20.dp))
//        OutlinedTextField(
//            modifier = Modifier.fillMaxWidth(),
//            value = age, onValueChange = {age=it},
//            placeholder = { Text(text = "Enter your age")}
//        )
        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick = { val myregister =AuthViewModel(navController, context )
            myregister.signUp(email.text.trim(),fullName.text.trim(),age.text.trim())
            navController.navigate(ROUTE_HOME)

        }, modifier = Modifier.height(40.dp)) {
            Text(text = "SIGN UP")
        }
        Button(onClick = {navController.navigate(ROUTE_LOGIN) }) {
            Text(text = "Alredy have an account? click to login")
        }
    }
}
@Preview
@Composable
fun RegistrationScreenPreview(){
    RegistrationScreen(rememberNavController())
}