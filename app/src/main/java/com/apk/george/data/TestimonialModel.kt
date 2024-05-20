package com.apk.george.data

import AuthViewModel
import android.app.ProgressDialog
import android.content.Context
import android.net.Uri
import android.widget.Toast
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.navigation.NavController
import com.apk.george.models.Testimonials
import com.apk.george.models.Upload
import com.apk.george.navigation.ROUTE_GALLERY
import com.apk.george.navigation.ROUTE_LOGIN
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import com.google.firebase.storage.FirebaseStorage


class TestimonialModel {

//    fun deleteProduct(id: String) {

//    }

    class TestimonialModel(var navController: NavController, var context: Context) {
        var authRepository: AuthViewModel
        var progress: ProgressDialog

        init {
            authRepository = AuthViewModel(navController, context)
            if (!authRepository.isloggedin()) {
                navController.navigate(ROUTE_LOGIN)
            }
            progress = ProgressDialog(context)
            progress.setTitle("Loading")
            progress.setMessage("Please wait...")
        }


        fun saveName(Name: String, Occuptaion: String, Date: String, Brand: String) {
            var id = System.currentTimeMillis().toString()
            var testimonialsData = Testimonials(Name,Occuptaion,Date,Brand )
            var productRef = FirebaseDatabase.getInstance().getReference()
                .child("Testimonials/$id")
            progress.show()
            productRef.setValue(testimonialsData).addOnCompleteListener {
                progress.dismiss()
                if (it.isSuccessful) {
                    Toast.makeText(context, "Saving successful", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(context, "ERROR: ${it.exception!!.message}", Toast.LENGTH_SHORT)
                        .show()
                }
            }
        }

        fun viewProducts(
            product: MutableState<Testimonials>,
            products: SnapshotStateList<Testimonials>
        ): SnapshotStateList<Testimonials> {
            val ref = FirebaseDatabase.getInstance().getReference().child("Products")

            progress.show()
            ref.addValueEventListener(object : ValueEventListener {
                override fun onDataChange(snapshot: DataSnapshot) {
                    progress.dismiss()
                    products.clear()
                    for (snap in snapshot.children) {
                        val value = snap.getValue(Testimonials::class.java)
                        product.value = value!!
                        products.add(value)
                    }
                }

                override fun onCancelled(error: DatabaseError) {
                    Toast.makeText(context, error.message, Toast.LENGTH_SHORT).show()
                }
            })
            return products
        }

        fun deleteProduct(id: String) {
            var delRef = FirebaseDatabase.getInstance().getReference()
                .child("Testimonials/$id")
            progress.show()
            delRef.removeValue().addOnCompleteListener {
                progress.dismiss()
                if (it.isSuccessful) {
                    Toast.makeText(context, "Testimonial deleted", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(context, it.exception!!.message, Toast.LENGTH_SHORT).show()
                }
            }

        }

        fun updateProduct(
            Name: String,
            Brand: String,
            Occuptaion: String,
            id: String,
            trim: String
        ) {
            var updateRef = FirebaseDatabase.getInstance().getReference()
                .child("Testimonial/$id")
            progress.show()
            var updateData = Testimonials(Name, Brand, Occuptaion, id)
            updateRef.setValue(updateData).addOnCompleteListener {
                progress.dismiss()
                if (it.isSuccessful) {
                    Toast.makeText(context, "Update successful", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(context, it.exception!!.message, Toast.LENGTH_SHORT).show()
                }
            }
        }

       

        fun viewUploads(upload:MutableState<Upload>, uploads:SnapshotStateList<Upload>):SnapshotStateList<Upload>  {
            var ref = FirebaseDatabase.getInstance().getReference().child("Uploads")

            progress.show()
            ref.addValueEventListener(object : ValueEventListener {
                override fun onDataChange(snapshot: DataSnapshot) {
                    progress.dismiss()
                    uploads.clear()
                    for (snap in snapshot.children){
                        val value = snap.getValue(Upload::class.java)
                        upload.value = value!!
                        uploads.add(value)
                    }
                }

                override fun onCancelled(error: DatabaseError) {
                    Toast.makeText(context, error.message, Toast.LENGTH_SHORT).show()
                }
            })
            return uploads
        }

        fun saveProductWithImage(Occuptaion: String, Name: String, Brand: String, Date: String,filePath: Uri) {
            var id = System.currentTimeMillis().toString()
            var storageReference = FirebaseStorage.getInstance().getReference().child("Uploads/$id")
            progress.show()



            storageReference.putFile(filePath).addOnCompleteListener {
                progress.dismiss()
                if (it.isSuccessful) {

                    storageReference.downloadUrl.addOnSuccessListener {
                        var imageUrl = it.toString()
                        var houseData = Upload(Name,Date,Occuptaion,Brand,imageUrl,id

                        )
                        var dbRef = FirebaseDatabase.getInstance()
                            .getReference().child("Uploads/$id")
                        dbRef.setValue(houseData)
                        Toast.makeText(context, "Upload successful", Toast.LENGTH_SHORT).show()
                        navController.navigate(ROUTE_GALLERY)
                    }
                } else {
                    Toast.makeText(context, it.exception!!.message, Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
        }




