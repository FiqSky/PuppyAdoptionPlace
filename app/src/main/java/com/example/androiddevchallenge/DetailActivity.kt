/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge

import android.os.Bundle
import android.widget.Toast
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.model.Models
import com.example.androiddevchallenge.model.PuppyModel
import com.example.androiddevchallenge.ui.theme.MyTheme
import com.example.androiddevchallenge.ui.theme.SweetRed

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val index = intent.extras?.getInt("index") ?: 0
        val puppy = Models.getPuppyData()[index]
        setContent {
            MyTheme {
                Scaffold(
                    topBar = {
                        TopAppBar(
                            title = {
                                Text("Puppy`s Detail")
                            }
                        )
                    }
                ) {
                    BodyContent(puppyModel = puppy)
                }
            }
        }
    }
}

@Composable
fun BodyContent(puppyModel: PuppyModel) {
    val typography = MaterialTheme.typography
    val context = LocalContext.current
    Column {
        Image(
            painterResource(id = puppyModel.image),
            contentDescription = null,
            modifier = Modifier
                .height(260.dp)
                .fillMaxWidth(),
            contentScale = ContentScale.Crop
        )
        Column(
            modifier = Modifier
                .weight(1F)
                .padding(start = 16.dp, end = 16.dp, top = 24.dp)
        ) {
            Text(
                text = puppyModel.name,
                style = typography.h5,
                color = SweetRed
            )
            Divider(Modifier.padding(4.dp).background(color = SweetRed))
            Spacer(modifier = Modifier.height(16.dp))
            Text("DESCRIPTION:", fontWeight = FontWeight.SemiBold)
            Text(
                puppyModel.description,
                style = typography.subtitle2,
                fontWeight = FontWeight.Light
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(text = "GENDER:", fontWeight = FontWeight.SemiBold)
            Text(
                text = puppyModel.gender,
                style = typography.subtitle2,
                fontWeight = FontWeight.Light
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text("AGE:", fontWeight = FontWeight.SemiBold)
            Text(
                "${puppyModel.age} Years",
                style = typography.subtitle2,
                fontWeight = FontWeight.Light
            )
            Spacer(modifier = Modifier.weight(1F))
            Button(
                onClick = {
                    Toast.makeText(
                        context,
                        "Thank you for adopting ${puppyModel.name}",
                        Toast.LENGTH_SHORT
                    ).show()
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 40.dp)
            ) {
                Text("let`s adopt")
            }
        }
    }
}
