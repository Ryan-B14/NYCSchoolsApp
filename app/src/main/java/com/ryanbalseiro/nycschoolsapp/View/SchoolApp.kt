package com.ryanbalseiro.nycschoolsapp.View

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.ryanbalseiro.nycschoolsapp.Model.EmptySchoolItem
import com.ryanbalseiro.nycschoolsapp.Model.SchoolDataItem
import com.ryanbalseiro.nycschoolsapp.ViewModel.MainViewModel

@Composable
fun SchoolApp(navController: NavHostController) {
    val mainViewModel: MainViewModel = viewModel()
    val schoolState by mainViewModel.schoolState
//    val satState by mainViewModel.satState

    NavHost(navController = navController, startDestination = Screen.SchoolScreen.route) {
        composable(route = Screen.SchoolScreen.route) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(
                    "NYC High Schools",
                    modifier = Modifier
                        .padding(top = 25.dp)
                        .fillMaxWidth(),
                    fontSize = 40.sp,
                    textAlign = TextAlign.Center,
                )
                SchoolScreen(viewState = schoolState, navigateToDetail = {
                    //This code is responsible for passing data from the current screen to the detail screen.
                    //It utilizes the savedStateHandle, which is a component of the Compose navigation framework.
                    navController.currentBackStackEntry?.savedStateHandle?.set("school", it)
                    navController.navigate(Screen.DetailScreen.route)
                })
            }
        }
        composable(route = Screen.DetailScreen.route) {
            val school =
                navController.previousBackStackEntry?.savedStateHandle?.get<SchoolDataItem>("school")
                    ?: EmptySchoolItem.item
            val satDataItem = mainViewModel.findSatItem(school)
            DetailScreen(school = school, satData = satDataItem)
        }
    }
}