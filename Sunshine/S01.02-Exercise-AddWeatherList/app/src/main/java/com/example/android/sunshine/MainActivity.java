/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.sunshine;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTV_Weather_Data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forecast);

        mTV_Weather_Data = (TextView) findViewById(R.id.tv_weather_data);
        String[] fakeWeather = {"Fake Weather!",
                "even the weather is fake news!",
                "Meow meow",
                "woof",
                "this screen is long",
                "long cat is longer",
                "meow",
                "Fake Weather!",
                "even the weather is fake news!",
                "Meow meow",
                "woof",
                "this screen is long",
                "long cat is longer",
                "meow"};

        for (String weather: fakeWeather) {
            mTV_Weather_Data.append(weather + "\n\n\n");
        }
    }
}