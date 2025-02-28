package ru.ashirobokov.fruits

import android.graphics.drawable.Drawable
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.graphics.drawable.toDrawable
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import ru.ashirobokov.fruits.databinding.FragmentFruitDetailBinding
import ru.ashirobokov.fruits.model.Fruit

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class FruitDetailFragment : Fragment() {

    private var _binding: FragmentFruitDetailBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!
    private lateinit var fruit: Fruit

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentFruitDetailBinding.inflate(inflater, container, false)
        fruit = FruitDetailFragmentArgs.fromBundle(requireArguments()).fruit
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        /**
         * ImageView c обычной вставкой картинки пока получается лучше чем с Glide-ом ... :-)
         */
        binding.fruitDetailImage.setImageResource(fruit.fruitImageId)

/**
 *  Судя то документации Glide, при вставке картинки в ImageView, из layout-а
 *  наследуются такие параметры как scaleType. И если он, например, ImageView установлен в centerCrop,
 *  то Glide также будет использовать centerCrop при размещении картинки. Таким образом, не нужно
 *  специально устанавливать fitCenter() или apply(options), где в RequestOptions выбрано centerCrop.
 */
        /*
                val options = RequestOptions().centerCrop()
                Glide.with(this@FruitDetailFragment)
                    .load(fruit.fruitImageId)
                    .apply(options)
        //            .fitCenter()
                    .into(binding.fruitDetailImage)
        */

/*
        binding.buttonSecond.setOnClickListener {
            findNavController().navigate(FruitDetailFragmentDirections.actionFruitDetailFragmentToFruitListFragment())
        }
*/
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}