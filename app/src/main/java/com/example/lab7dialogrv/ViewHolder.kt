package layout

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.std_iten_layout.view.*


class ViewHolder(view:View):RecyclerView.ViewHolder(view) {

    val tvID = view.tv_id
    val  tvName = view.tv_name
    val tvAge = view.tv_age

}