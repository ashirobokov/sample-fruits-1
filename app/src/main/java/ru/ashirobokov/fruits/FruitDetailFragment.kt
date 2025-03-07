package ru.ashirobokov.fruits

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
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

        binding.fruit = fruit

        /**
         * ImageView c обычной вставкой картинки пока получается лучше чем с Glide-ом ... :-)
         */
//        binding.fruitDetailImage.setImageResource(fruit.fruitImageId)
//        binding.fruitLongText.setText(fruit.fruitLongDescription)

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