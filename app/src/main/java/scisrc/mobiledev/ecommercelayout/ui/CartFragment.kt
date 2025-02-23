package scisrc.mobiledev.ecommercelayout.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import scisrc.mobiledev.ecommercelayout.R
import scisrc.mobiledev.ecommercelayout.adapter.ProductAdapter // ✅ Import ProductAdapter
import scisrc.mobiledev.ecommercelayout.databinding.FragmentCartBinding
import scisrc.mobiledev.ecommercelayout.model.ProductModel

class CartFragment : Fragment() {
    private var _binding: FragmentCartBinding? = null
    private val binding get() = _binding!!

    private lateinit var productAdapter: ProductAdapter

    private val cartItems = listOf(
        ProductModel("เสื้อเชิ้ตขาว", "499฿", R.mipmap.ic_shirt_formal),
        ProductModel("กางเกงยีนส์", "799฿", R.mipmap.ic_jeans),
        ProductModel("เสื้อกันหนาว", "999฿", R.mipmap.ic_jacket)
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentCartBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        productAdapter = ProductAdapter(cartItems)

        binding.recyclerViewCart.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        binding.recyclerViewCart.adapter = productAdapter
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
