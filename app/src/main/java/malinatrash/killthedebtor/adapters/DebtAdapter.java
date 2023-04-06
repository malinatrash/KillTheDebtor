package malinatrash.killthedebtor.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.List;

import malinatrash.killthedebtor.R;
import malinatrash.killthedebtor.ViewControllers.StudentsListViewController;
import malinatrash.killthedebtor.models.Debt;
import malinatrash.killthedebtor.services.DatabaseManager;

public class DebtAdapter extends BaseAdapter {
    private final List<Debt> list;
    private final LayoutInflater layoutInflater;

    public DebtAdapter(Context context, List<Debt> list) {
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
            view = layoutInflater.inflate(R.layout.item_debt, viewGroup, false);
        }

        Debt debt = getDebt(position);

        TextView debtText = view.findViewById(R.id.debtText);
        debtText.setText(debt.getDescription());

        CheckBox passed = view.findViewById(R.id.passed);
        passed.setChecked(debt.isClosed());
        passed.setOnClickListener(e -> {
            getDebt(position).setClosed(passed.isChecked());
            DatabaseManager.shared.updateData();
        });

        return view;
    }
    private Debt getDebt(int position) {
        return (Debt) getItem(position);
    }
}
