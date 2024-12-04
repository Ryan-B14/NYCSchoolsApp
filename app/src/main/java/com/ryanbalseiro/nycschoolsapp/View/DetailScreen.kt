package com.ryanbalseiro.nycschoolsapp.View

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ryanbalseiro.nycschoolsapp.Model.EmptySchoolItem
import com.ryanbalseiro.nycschoolsapp.Model.SATDataItem
import com.ryanbalseiro.nycschoolsapp.Model.SchoolDataItem

@Composable
fun DetailScreen(school: SchoolDataItem, satData: SATDataItem?) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = school.school_name,
            textAlign = TextAlign.Center,
            fontSize = 40.sp,
            lineHeight = 36.sp,
            modifier = Modifier.padding(4.dp)
        )
        if (!school.campus_name.isEmpty()) {
            Row {
                Text(text = "Campus Name: ")
                Text(text = school.campus_name, textAlign = TextAlign.Center)
            }
        }
        Row {
            Text(text = "School Email: ")
            Text(text = school.school_email, textAlign = TextAlign.Center)
        }
        Row {
            Text(text = "School Phone Number: ")
            Text(text = school.phone_number, textAlign = TextAlign.Center)
        }
        Text(text = "Average SAT Scores: ")
        Row {
            Text(text = "Math: ")
            Text(text = satData?.sat_math_avg_score ?: "No average available", textAlign = TextAlign.Center)
        }
        Row {
            Text(text = "Writing: ")
            Text(text = satData?.sat_writing_avg_score ?: "No average available", textAlign = TextAlign.Center)
        }
        Row {
            Text(text = "Reading: ")
            Text(text = satData?.sat_critical_reading_avg_score ?: "No average available", textAlign = TextAlign.Center)
        }

    }
}

@Preview(showBackground = true)
@Composable
fun Preview(){
//    DetailScreen(school = EmptySchoolItem.item)
}