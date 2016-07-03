package pub.ven.sharedemo;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * author: zengven
 * Description:
 * date: 2016/5/28
 */
public class MyAdapter extends BaseAdapter {
    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = View.inflate(parent.getContext(), R.layout.activity_main, null);

        }
        return convertView;
    }

    static class ViewHolder {
        @BindView(R.id.tv_lable)
        TextView tvLable;

        ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
