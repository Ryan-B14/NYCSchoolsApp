package com.ryanbalseiro.nycschoolsapp.View

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
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
import com.ryanbalseiro.nycschoolsapp.Model.EmptySchoolItem
import com.ryanbalseiro.nycschoolsapp.Model.SchoolDataItem

@Composable
fun DetailScreen(school: SchoolDataItem) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        school.school_name.let { Text(text = it, textAlign = TextAlign.Center) }
        school.campus_name.let {
            Text(text = it,
                textAlign = TextAlign.Justify,
                modifier = Modifier
                    .verticalScroll(rememberScrollState())
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Preview(){
    DetailScreen(school = EmptySchoolItem.item)
}