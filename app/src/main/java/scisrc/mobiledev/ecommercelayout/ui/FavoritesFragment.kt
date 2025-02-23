package scisrc.mobiledev.ecommercelayout.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import scisrc.mobiledev.ecommercelayout.R
import scisrc.mobiledev.ecommercelayout.adapter.ProductAdapter
import scisrc.mobiledev.ecommercelayout.databinding.FragmentFavoritesBinding
import scisrc.mobiledev.ecommercelayout.model.ProductModel

class FavoritesFragment : Fragment() {
    private var _binding: FragmentFavoritesBinding? = null
    private val binding get() = _binding!!

    private val favoriteItems = listOf(
        ProductModel("เสื้อยืด Oversized", "350฿", R.mipmap.ic_shirt_white),
        ProductModel("เสื้อแจ็คเก็ตหนัง", "1200฿", R.mipmap.ic_jacket),
        ProductModel("กางเกงขาสั้น", "290฿", R.mipmap.ic_jeans)
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentFavoritesBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // ตั้งค่า RecyclerView
        binding.recyclerViewFavorites.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        binding.recyclerViewFavorites.adapter = ProductAdapter(favoriteItems)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
