package com.example.b004235.macyswear;

/**
 * Created by b004235 on 7/22/2015.
 */
        import android.content.Context;
        import android.support.wearable.view.CircledImageView;
        import android.support.wearable.view.WearableListView;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.TextView;

        import java.util.ArrayList;

public class WearableAdapter extends WearableListView.Adapter {
    private ArrayList<Integer> mItems;
    private final LayoutInflater mInflater;
    private ArrayList<String> categories = new ArrayList<>();


    public WearableAdapter(Context context, ArrayList<Integer> items) {
        mInflater = LayoutInflater.from(context);
        mItems = items;
    }

    @Override
    public WearableListView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        categories.add("Men");
        categories.add("Women");
        categories.add("Juniors");
        categories.add("Kids");
        categories.add("Shoes");
        categories.add("Beauty");
        categories.add("Watches");
        categories.add("Jewelry");
        categories.add("Bed & Bath");
        return new ItemViewHolder(mInflater.inflate(R.layout.list_item, null));
    }

    @Override
    public void onBindViewHolder(WearableListView.ViewHolder viewHolder,
                                 int position) {
        ItemViewHolder itemViewHolder = (ItemViewHolder) viewHolder;
        CircledImageView circledView = itemViewHolder.mCircledImageView;
        circledView.setImageResource(mItems.get(position));
        TextView textView = itemViewHolder.mItemTextView;
        textView.setText(String.format(categories.get(position)));
    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }

    private static class ItemViewHolder extends WearableListView.ViewHolder {
        private CircledImageView mCircledImageView;
        private TextView mItemTextView;

        public ItemViewHolder(View itemView) {
            super(itemView);
            mCircledImageView = (CircledImageView)
                    itemView.findViewById(R.id.circle);
            mItemTextView = (TextView) itemView.findViewById(R.id.name);
        }
    }
}