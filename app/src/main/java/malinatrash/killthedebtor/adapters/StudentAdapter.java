package malinatrash.killthedebtor.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import malinatrash.killthedebtor.R;
import malinatrash.killthedebtor.models.Student;

public class StudentAdapter extends BaseAdapter {
    private final List<Student> list;
    private final LayoutInflater layoutInflater;
    public StudentAdapter(Context context, List<Student> list) {
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
            view = layoutInflater.inflate(R.layout.student_item, viewGroup, false);
        }

        TextView groupName = view.findViewById(R.id.studentName);
        Student student = getStudent(position);
        groupName.setText(String.format("%s %s", student.getFirstname(), student.getLastname()));

        TextView groupCount = view.findViewById(R.id.grade);
        groupCount.setText("Не зачет");

        return view;
    }
    private Student getStudent(int position) {
        return (Student) getItem(position);
    }
}

