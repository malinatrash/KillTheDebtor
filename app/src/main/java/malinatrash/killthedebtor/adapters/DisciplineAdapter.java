package malinatrash.killthedebtor.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import malinatrash.killthedebtor.Discipline;
import malinatrash.killthedebtor.R;

public class DisciplineAdapter extends BaseAdapter {

    private List<Discipline> list;
    private LayoutInflater layoutInflater;

    public DisciplineAdapter(Context context, List<Discipline> list) {
        this.list = list;
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        View view = convertView;
        if (view == null) {
            view = layoutInflater.inflate(R.layout.item_layout, viewGroup, false);
        }

        TextView discipline = (TextView) view.findViewById(R.id.discipline);
        discipline.setText(getDiscipline(position).getTitle());

        TextView groupCount = (TextView) view.findViewById(R.id.groupCount);
        groupCount.setText("Количество групп: " + String.valueOf(getDiscipline(position).getGroupSize()));

        return view;
    }

    private Discipline getDiscipline(int position) {
        return (Discipline) getItem(position);
    }
}
