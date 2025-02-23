package scisrc.mobiledev.ecommercelayout.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import scisrc.mobiledev.ecommercelayout.R
import scisrc.mobiledev.ecommercelayout.adapter.ProductAdapter
import scisrc.mobiledev.ecommercelayout.databinding.FragmentHomeBinding
import scisrc.mobiledev.ecommercelayout.model.ProductModel // ✅ Import ProductModel

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    // ✅ ใช้ ProductModel ได้ถูกต้องแล้ว
    private val recommendedProducts = listOf(
        ProductModel("เสื้อยืดสีขาว", "299฿", R.mipmap.ic_shirt_white),
        ProductModel("เสื้อเชิ้ตแขนยาว", "499฿", R.mipmap.ic_shirt_formal),
        ProductModel("แจ็คเก็ตกันหนาว", "799฿", R.mipmap.ic_jacket),
        ProductModel("กางเกงยีนส์", "599฿", R.mipmap.ic_jeans)
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.recyclerViewRecommended.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        binding.recyclerViewRecommended.adapter = ProductAdapter(recommendedProducts)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
