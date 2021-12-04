package example.jf.testoffragmentsapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.google.android.material.floatingactionbutton.FloatingActionButton

class LeftFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val strangeButton: FloatingActionButton
        val view = inflater.inflate(R.layout.fragment_left,container,false)
        strangeButton = view.findViewById(R.id.floatingActionButton)
        strangeButton.setOnClickListener {
            Toast.makeText(context,"Правда странно!",Toast.LENGTH_SHORT).show()
        }
        return view
    }

}