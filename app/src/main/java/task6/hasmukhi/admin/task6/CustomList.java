package task6.hasmukhi.admin.task6;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

/**
 * Created by Admin on 2/8/2017.
 */

public class CustomList extends BaseAdapter {

    private Context context;
    private LayoutInflater inflater;
    private List<Model>md;
    public CustomList(Context context, List<Model> md){
        this.context = context;
        this.md =md ;

    }

    @Override
    public int getCount() {
        return md.size();
    }

    @Override
    public Object getItem(int position) {
        return md.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }
}
