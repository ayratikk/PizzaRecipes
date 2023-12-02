package com.example.pizzarecipes;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PizzaReceipeAdapter extends RecyclerView.Adapter<PizzaReceipeAdapter.PizzaReceipeViewHolder>  {
    ArrayList<PizzaRecipeItem> pizzaRecipeItems;

    public PizzaReceipeAdapter(ArrayList<PizzaRecipeItem> pizzaRecipeItems) {
        this.pizzaRecipeItems = pizzaRecipeItems;
    }

    @NonNull
    @Override
    public PizzaReceipeAdapter.PizzaReceipeViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.pizza_recipe_item, viewGroup, false);
        PizzaReceipeViewHolder pizzaRecipeViewHolder = new PizzaReceipeViewHolder(view);
        return pizzaRecipeViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull PizzaReceipeViewHolder  holder, int position) {
        PizzaRecipeItem pizzaRecipeItem = pizzaRecipeItems.get(position);

        holder.pizzaImageView.setImageResource(pizzaRecipeItem.getImageResource());
        holder.title.setText(pizzaRecipeItem.getTitle());
        holder.description.setText(pizzaRecipeItem.getDescription());
    }


    @Override
    public int getItemCount() {
        return pizzaRecipeItems.size();
    }

    public static class PizzaReceipeViewHolder extends RecyclerView.ViewHolder {

        public ImageView pizzaImageView;
        public TextView title;
        public TextView description;

        public PizzaReceipeViewHolder(@NonNull View itemView) {
            super(itemView);

            pizzaImageView = itemView.findViewById(R.id.pizzaImageView);
            title = itemView.findViewById(R.id.titleImageView);
            description = itemView.findViewById(R.id.descriptionImageView);
        }

    }
}
