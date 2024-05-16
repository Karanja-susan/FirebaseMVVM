package com.susankaranja.firebase.Navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.susankaranja.firebase.ui.theme.Screens.Home.HomeScreen
import com.susankaranja.firebase.ui.theme.Screens.Login.LoginScreen
import com.susankaranja.firebase.ui.theme.Screens.Products.AddProductsScreen
import com.susankaranja.firebase.ui.theme.Screens.Products.UpdateProductsScreen
import com.susankaranja.firebase.ui.theme.Screens.Products.ViewProductsScreen
import com.susankaranja.firebase.ui.theme.Screens.Products.ViewUploadsScreen
import com.susankaranja.firebase.ui.theme.Screens.Registration.RegisterScreen

@Composable
fun AppNavHost(modifier: Modifier =Modifier, navController: NavHostController = rememberNavController(), startDestination:String= ROUTE_LOGIN) {

    NavHost(navController = navController, modifier=modifier, startDestination = startDestination ){
        composable(ROUTE_LOGIN){
            LoginScreen(navController)
        }
        composable(ROUTE_REGISTER){
            RegisterScreen(navController)
        }

        composable(ROUTE_HOME){
            HomeScreen(navController)
        }
        composable(ROUTE_ADD_PRODUCT) {
            AddProductsScreen(navController)
        }
        composable(ROUTE_VIEW_PRODUCT){
            ViewProductsScreen(navController)
        }
        composable(ROUTE_UPDATE_PRODUCT+ "/{id}"){passedData ->
            UpdateProductsScreen(navController,passedData.arguments?.getString("id")!!)
        }
        composable(ROUTE_VIEW_UPLOAD){
            ViewUploadsScreen(navController)
        }
    }

}

