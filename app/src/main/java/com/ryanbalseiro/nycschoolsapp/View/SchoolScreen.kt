package com.ryanbalseiro.nycschoolsapp.View

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ryanbalseiro.nycschoolsapp.Model.EmptySchoolItem
import com.ryanbalseiro.nycschoolsapp.Model.SchoolDataItem
import com.ryanbalseiro.nycschoolsapp.R
import com.ryanbalseiro.nycschoolsapp.ViewModel.MainViewModel

@Composable
fun SchoolScreen(
    modifier: Modifier = Modifier,
    viewState: MainViewModel.SchoolState,
    navigateToDetail: (SchoolDataItem) -> Unit
) {

    Box(modifier = Modifier.fillMaxSize()
        .padding(5.dp)) {
        when {
            viewState.loading -> { //if data is loading, display this
                CircularProgressIndicator(modifier.align(Alignment.Center))
            }

            viewState.error != null -> { //if there was an error, display this
                Text(text = "ERROR OCCURRED")
            }

            else -> { //no errors and data is loaded, display Categories
                SchoolListScreen(schools = viewState.list, navigateToDetail)
            }
        }
    }
}

@Composable
fun SchoolListScreen(
    schools: List<SchoolDataItem>,
    navigateToDetail: (SchoolDataItem) -> Unit
) {
    LazyVerticalGrid(GridCells.Fixed(2), modifier = Modifier.fillMaxSize()
        .padding(5.dp)) {
        items(schools) { school ->
            SchoolItem(schoolItem = school, navigateToDetail)
        }
    }
}

//defines what each item looks like
@Composable
fun SchoolItem(
    schoolItem: SchoolDataItem,
    navigateToDetail: (SchoolDataItem) -> Unit
) {
    Card(elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
        colors = CardDefaults.cardColors(containerColor = Color.LightGray),
        modifier = Modifier
            .defaultMinSize(minWidth = 60.dp, minHeight = 60.dp)
            .padding(5.dp)
            .clickable {
                navigateToDetail(schoolItem)
            }) {
        Column(
            modifier = Modifier
                .padding(8.dp)
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(painter = painterResource(id = R.drawable.baseline_school_24),
                null,
                modifier = Modifier.defaultMinSize(50.dp,50.dp))
            Text(
                text = schoolItem.school_name,
                color = Color.Black,
                style = TextStyle(fontWeight = FontWeight.Bold),
                modifier = Modifier.padding(4.dp),
                fontSize = 16.sp
            )
        }
    }
}

@Composable
@Preview
fun SchoolListScreenPreview() {
    SchoolListScreen(listOf(EmptySchoolItem.item, EmptySchoolItem.item, EmptySchoolItem.item, EmptySchoolItem.item)) { }
}