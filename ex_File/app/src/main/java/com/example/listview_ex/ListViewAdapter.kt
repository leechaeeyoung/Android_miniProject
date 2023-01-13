import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.example.listview_ex.ListViewModel
import com.example.listview_ex.R

class ListViewAdapter(val List: MutableList<ListViewModel>) : BaseAdapter() {
    override fun getCount(): Int {
        return List.size    // list 의 개수 (= item)
    }

    override fun getItem(position: Int): Any {
        return List[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View { // item 에 값 넣어 리스트에 추가

        var converView = convertView

        if(converView==null){
            converView = LayoutInflater.from(parent?.context).inflate(R.layout.listview_item,parent,false) // listView_item을 가져옴
        }

        val title = convertView!!.findViewById<TextView>(R.id.listViewItem)
        val content = convertView.findViewById<TextView>(R.id.listViewItem2)

        title.text = List[position].title
        content.text = List[position].content
        return converView!!
    }

}