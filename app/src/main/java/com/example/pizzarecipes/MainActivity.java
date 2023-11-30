package com.example.pizzarecipes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        RecyclerView recyclerView;
        RecyclerView.Adapter adapter;
        RecyclerView.LayoutManager layoutManager;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<PizzaRecipeItem> pizzaRecipeItems = new ArrayList<>();

        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.piz1,Utils.PIZZA_1_TITLE,Utils.PIZZA_1_DESCRIPTION, Utils.PIZZA_1_RECIPE));
    }
}