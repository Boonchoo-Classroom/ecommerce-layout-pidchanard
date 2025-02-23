package scisrc.mobiledev.ecommercelayout.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import scisrc.mobiledev.ecommercelayout.databinding.FragmentProfileBinding

class ProfileFragment : Fragment() {

    private var _binding: FragmentProfileBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentProfileBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Mockup Data
        binding.profileName.text = "Pidchanard Mueanson"
        binding.profileEmail.text = "pidchanard.m@ku.th"
        binding.profileAddress.text = "129/338 ซ.เฉลิมพระเกียรติ ร.9 85 กรุงเทพฯ"

        // ปุ่มแก้ไขโปรไฟล์ (ในอนาคตสามารถเพิ่ม Function ได้)
        binding.btnEditProfile.setOnClickListener {
            // TODO: เพิ่มการแก้ไขโปรไฟล์
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
