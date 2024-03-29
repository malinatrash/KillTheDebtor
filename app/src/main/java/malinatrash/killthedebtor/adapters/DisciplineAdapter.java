package malinatrash.killthedebtor.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import malinatrash.killthedebtor.models.Discipline;
import malinatrash.killthedebtor.services.ImageManager;
import malinatrash.killthedebtor.R;

public class DisciplineAdapter extends BaseAdapter {
    private final List<Discipline> list;
    private final LayoutInflater layoutInflater;
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
        groupCount.setText("Количество групп: " + getDiscipline(position).getGroupsCount());

        new ImageManager(view.findViewById(R.id.disciplineImage)).execute(getDiscipline(position).getImageURL());

        return view;
    }
    private Discipline getDiscipline(int position) {
        return (Discipline) getItem(position);
    }
}
