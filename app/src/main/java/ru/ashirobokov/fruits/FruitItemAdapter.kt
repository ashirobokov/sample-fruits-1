package ru.ashirobokov.fruits

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import ru.ashirobokov.fruits.databinding.FruitItemBinding
import ru.ashirobokov.fruits.model.Fruit

class FruitItemAdapter(
    private val context: Context,
    private val list: List<Fruit>
) : RecyclerView.Adapter<FruitItemAdapter.FruitItemViewHolder>() {

    class FruitItemViewHolder(private val binding: FruitItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        val fruitName: TextView = binding.fruitName
        val fruitImage: ImageView = binding.fruitImage
        val fruitType: TextView = binding.fruitType
        val fruitShort: TextView = binding.fruitShort
        /*
                init {
                    binding.run {
                        root.setOnClickListener {
                            Navigation
                                .findNavController(it)
                                .navigate(R.id.action_FruitListFragment_to_FruitDetailFragment)
                        }
                    }
                }
        */
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FruitItemViewHolder {
        return FruitItemViewHolder(
            FruitItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: FruitItemViewHolder, position: Int) {
        val fruit = list.get(position)
        holder.fruitName.text = context.resources.getString(fruit.fruitName)
        holder.fruitImage.setImageResource(fruit.fruitImageId)
        holder.fruitType.text = context.getString(fruit.fruitType)
        holder.fruitShort.text = context.getString(fruit.fruitShortDescription)
        holder.itemView.setOnClickListener {
            Navigation
                .findNavController(it)
                .navigate(FruitListFragmentDirections.actionFruitListFragmentToFruitDetailFragment(fruit))
        }
    }

}