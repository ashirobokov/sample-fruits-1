package ru.ashirobokov.fruits

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import ru.ashirobokov.fruits.data.DataSource
import ru.ashirobokov.fruits.databinding.FragmentFruitListBinding
import ru.ashirobokov.fruits.model.Fruit

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FruitListFragment : Fragment() {

    private var _binding: FragmentFruitListBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentFruitListBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val fruits: List<Fruit> = DataSource().listOfFruits()
        binding.fruitRecycler.adapter = FruitItemAdapter(requireContext(), fruits)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}