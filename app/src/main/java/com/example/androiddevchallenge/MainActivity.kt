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

import android.content.Intent
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.model.Models
import com.example.androiddevchallenge.model.PuppyModel
import com.example.androiddevchallenge.ui.theme.MyTheme
import com.example.androiddevchallenge.ui.theme.SweetRed

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyTheme {
                BodyContent(
                    itemClickAction = { index -> launchDetailActivity(this, index) }
                )
            }
        }
    }
}

@Composable
fun BodyContent(
    itemClickAction: (Int) -> Unit,
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text("Adoption Place")
                }
            )
        }
    ) {
        LazyColumn(
            modifier = Modifier.padding(horizontal = 24.dp)
        ) {
            itemsIndexed(Models.getPuppyData()) { index, pet ->
                ListItem(pet, index, itemClickAction)
            }
        }
    }
}

@Composable
fun ListItem(puppyModel: PuppyModel, index: Int, itemClickAction: (Int) -> Unit) {
    val typography = MaterialTheme.typography
    Card(
        modifier = Modifier
            .padding(top = 20.dp)
            .clickable {
                itemClickAction(index)
            },
        shape = RoundedCornerShape(6.dp),
        elevation = 2.dp,
    ) {
        Column {
            Image(
                painterResource(id = puppyModel.image),
                contentDescription = null,
                modifier = Modifier
                    .height(200.dp)
                    .fillMaxWidth(),
                contentScale = ContentScale.Crop
            )
            Text(
                modifier = Modifier.padding(start = 8.dp),
                text = puppyModel.name,
                style = typography.h6,
                color = SweetRed
            )
            Text(
                modifier = Modifier.padding(start = 8.dp, bottom = 8.dp),
                text = puppyModel.gender,
                style = typography.body2
            )
        }
    }
}

fun launchDetailActivity(activity: AppCompatActivity, index: Int) {
    activity.startActivity(
        Intent(activity, DetailActivity::class.java).apply {
            putExtra("index", index)
        }
    )
}
