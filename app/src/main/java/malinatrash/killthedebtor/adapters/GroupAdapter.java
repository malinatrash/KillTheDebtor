package malinatrash.killthedebtor.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;


import java.util.List;

import malinatrash.killthedebtor.models.Group;
import malinatrash.killthedebtor.R;

public class GroupAdapter extends BaseAdapter {
    private final List<Group> list;
    private final LayoutInflater layoutInflater;
    public GroupAdapter(Context context, List<Group> list) {
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
            view = layoutInflater.inflate(R.layout.group_item, viewGroup, false);
        }

        TextView groupName = (TextView) view.findViewById(R.id.groupName);
        groupName.setText(getGroup(position).getTitle());

        TextView groupCount = (TextView) view.findViewById(R.id.debtorsCount);
        groupCount.setText("Количество задолжников: " + getGroup(position).getStudents().size());

        return view;
    }
    private Group getGroup(int position) {
        return (Group) getItem(position);
    }
}
