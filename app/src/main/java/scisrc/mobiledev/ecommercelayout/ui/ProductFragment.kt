package scisrc.mobiledev.ecommercelayout.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import scisrc.mobiledev.ecommercelayout.R
import scisrc.mobiledev.ecommercelayout.adapter.ProductAdapter
import scisrc.mobiledev.ecommercelayout.databinding.FragmentProductBinding
import scisrc.mobiledev.ecommercelayout.model.ProductModel

class ProductFragment : Fragment() {
    private var _binding: FragmentProductBinding? = null
    private val binding get() = _binding!!

    private val productList = listOf(
        ProductModel("เสื้อยืดลายกราฟิก", "399฿", R.mipmap.ic_shirt_white),
        ProductModel("กางเกงยีนส์ขาดเท่ห์", "799฿", R.mipmap.ic_jeans),
        ProductModel("เสื้อฮู้ดแฟชั่น", "599฿", R.mipmap.ic_jacket),
        ProductModel("เสื้อเชิ้ตลายทาง", "499฿", R.mipmap.ic_shirt_formal),
        ProductModel("กางเกงขาสั้นชาย", "350฿", R.mipmap.ic_jeans),
        ProductModel("เสื้อสเวตเตอร์กันหนาว", "1299฿", R.mipmap.ic_jacket)
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentProductBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // ตั้งค่า RecyclerView
        binding.recyclerViewProducts.layoutManager =
            GridLayoutManager(requireContext(), 2) // แสดงสินค้าเป็น 2 คอลัมน์
        binding.recyclerViewProducts.adapter = ProductAdapter(productList)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
