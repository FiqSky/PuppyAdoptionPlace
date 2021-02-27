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
package com.example.androiddevchallenge.model

import androidx.annotation.DrawableRes
import androidx.compose.runtime.Immutable
import com.example.androiddevchallenge.R

object Models {
    fun getPuppyData() = petList
}

@Immutable
data class PuppyModel(
    val name: String,
    val description: String,
    val gender: String,
    val age: String,
    @DrawableRes val image: Int,
)

private val petList = listOf(
    PuppyModel(
        "Bea",
        "Bea she's a smart puppy, Lorem ipsum dolor sit amet, consectetur adipiscing elit. In a rutrum dolor, sed vehicula felis. Etiam ultricies odio sit amet tortor interdum sollicitudin. Nam lobortis gravida augue, et gravida sem rhoncus sit amet. Donec iaculis, enim eget fringilla eleifend, augue dolor vehicula lacus, nec dictum dolor nibh at urna. Aliquam felis est, vestibulum sit amet neque quis, fringilla fermentum odio. In suscipit commodo metus at eleifend. Sed fringilla pulvinar tortor, vitae bibendum leo. Ut orci odio, porta et accumsan ac, lobortis vitae libero.",
        "Female",
        "2",
        R.drawable.puppy1
    ),
    PuppyModel(
        "Carmen",
        "Carmen he's a smart puppy, Lorem ipsum dolor sit amet, consectetur adipiscing elit. In a rutrum dolor, sed vehicula felis. Etiam ultricies odio sit amet tortor interdum sollicitudin. Nam lobortis gravida augue, et gravida sem rhoncus sit amet. Donec iaculis, enim eget fringilla eleifend, augue dolor vehicula lacus, nec dictum dolor nibh at urna. Aliquam felis est, vestibulum sit amet neque quis, fringilla fermentum odio. In suscipit commodo metus at eleifend. Sed fringilla pulvinar tortor, vitae bibendum leo. Ut orci odio, porta et accumsan ac, lobortis vitae libero.",
        "Male",
        "1",
        R.drawable.puppy2
    ),
    PuppyModel(
        "Jackie",
        "Jackie he's a smart puppy, Lorem ipsum dolor sit amet, consectetur adipiscing elit. In a rutrum dolor, sed vehicula felis. Etiam ultricies odio sit amet tortor interdum sollicitudin. Nam lobortis gravida augue, et gravida sem rhoncus sit amet. Donec iaculis, enim eget fringilla eleifend, augue dolor vehicula lacus, nec dictum dolor nibh at urna. Aliquam felis est, vestibulum sit amet neque quis, fringilla fermentum odio. In suscipit commodo metus at eleifend. Sed fringilla pulvinar tortor, vitae bibendum leo. Ut orci odio, porta et accumsan ac, lobortis vitae libero.",
        "Male",
        "2",
        R.drawable.puppy3
    ),
    PuppyModel(
        "Dora",
        "Dora she's a smart puppy, Lorem ipsum dolor sit amet, consectetur adipiscing elit. In a rutrum dolor, sed vehicula felis. Etiam ultricies odio sit amet tortor interdum sollicitudin. Nam lobortis gravida augue, et gravida sem rhoncus sit amet. Donec iaculis, enim eget fringilla eleifend, augue dolor vehicula lacus, nec dictum dolor nibh at urna. Aliquam felis est, vestibulum sit amet neque quis, fringilla fermentum odio. In suscipit commodo metus at eleifend. Sed fringilla pulvinar tortor, vitae bibendum leo. Ut orci odio, porta et accumsan ac, lobortis vitae libero.",
        "Female",
        "1",
        R.drawable.puppy4
    ),
    PuppyModel(
        "Izzy",
        "Izzy she's a smart puppy, Lorem ipsum dolor sit amet, consectetur adipiscing elit. In a rutrum dolor, sed vehicula felis. Etiam ultricies odio sit amet tortor interdum sollicitudin. Nam lobortis gravida augue, et gravida sem rhoncus sit amet. Donec iaculis, enim eget fringilla eleifend, augue dolor vehicula lacus, nec dictum dolor nibh at urna. Aliquam felis est, vestibulum sit amet neque quis, fringilla fermentum odio. In suscipit commodo metus at eleifend. Sed fringilla pulvinar tortor, vitae bibendum leo. Ut orci odio, porta et accumsan ac, lobortis vitae libero.",
        "Female",
        "1",
        R.drawable.puppy5
    ),
    PuppyModel(
        "Lassie",
        "Lassie he's a smart puppy, Lorem ipsum dolor sit amet, consectetur adipiscing elit. In a rutrum dolor, sed vehicula felis. Etiam ultricies odio sit amet tortor interdum sollicitudin. Nam lobortis gravida augue, et gravida sem rhoncus sit amet. Donec iaculis, enim eget fringilla eleifend, augue dolor vehicula lacus, nec dictum dolor nibh at urna. Aliquam felis est, vestibulum sit amet neque quis, fringilla fermentum odio. In suscipit commodo metus at eleifend. Sed fringilla pulvinar tortor, vitae bibendum leo. Ut orci odio, porta et accumsan ac, lobortis vitae libero.",
        "Male",
        "1",
        R.drawable.puppy6
    ),
    PuppyModel(
        "Lacy",
        "Lacy she's a smart puppy, Lorem ipsum dolor sit amet, consectetur adipiscing elit. In a rutrum dolor, sed vehicula felis. Etiam ultricies odio sit amet tortor interdum sollicitudin. Nam lobortis gravida augue, et gravida sem rhoncus sit amet. Donec iaculis, enim eget fringilla eleifend, augue dolor vehicula lacus, nec dictum dolor nibh at urna. Aliquam felis est, vestibulum sit amet neque quis, fringilla fermentum odio. In suscipit commodo metus at eleifend. Sed fringilla pulvinar tortor, vitae bibendum leo. Ut orci odio, porta et accumsan ac, lobortis vitae libero.",
        "Female",
        "2",
        R.drawable.puppy7
    ),
    PuppyModel(
        "Pearl",
        "Pearl he's a smart puppy, Lorem ipsum dolor sit amet, consectetur adipiscing elit. In a rutrum dolor, sed vehicula felis. Etiam ultricies odio sit amet tortor interdum sollicitudin. Nam lobortis gravida augue, et gravida sem rhoncus sit amet. Donec iaculis, enim eget fringilla eleifend, augue dolor vehicula lacus, nec dictum dolor nibh at urna. Aliquam felis est, vestibulum sit amet neque quis, fringilla fermentum odio. In suscipit commodo metus at eleifend. Sed fringilla pulvinar tortor, vitae bibendum leo. Ut orci odio, porta et accumsan ac, lobortis vitae libero.",
        "Male",
        "1",
        R.drawable.puppy8
    ),
)
