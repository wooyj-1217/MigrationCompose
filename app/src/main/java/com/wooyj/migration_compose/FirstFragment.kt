package com.wooyj.migration_compose

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.material.Surface
import androidx.compose.ui.platform.ViewCompositionStrategy
import com.wooyj.migration_compose.databinding.FragmentFirstBinding
import com.wooyj.migration_compose.ui.screen.home.HomeScreen
import com.wooyj.migration_compose.ui.theme.GlowpickTheme
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null

    // This property is only valid between onCreateView and onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentFirstBinding.inflate(inflater, container, false).apply {
            composeView.apply {
                // Dispose the Composition when the view's LifecycleOwner is destroyed
                setViewCompositionStrategy(
                    ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed
                )
                setContent {
                    GlowpickTheme {
                        Surface {
                            HomeScreen()
                        }
                    }
                }
            }
        }
        return binding.root
    }



    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}