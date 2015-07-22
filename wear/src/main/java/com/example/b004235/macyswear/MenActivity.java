package com.example.b004235.macyswear;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.util.LruCache;
import android.support.wearable.view.CardFragment;
import android.support.wearable.view.FragmentGridPagerAdapter;
import android.support.wearable.view.WearableListView;
import android.util.Log;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MenActivity extends Activity {
    //extends FragmentGridPagerAdapter
    private static final int TRANSITION_DURATION_MILLIS = 100;

//    private final Context mContext;
//    private List<Row> mRows;
//    private ColorDrawable mDefaultBg;
//
//    private ColorDrawable mClearBg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
//
//    public MenActivity(Context ctx, FragmentManager fm) {
//        super(fm);
//        mContext = ctx;
//
//        mRows = new ArrayList<Row>();
//
//        mRows.add(new Row(cardFragment(R.string.Tops, R.string.about_text)));
//        mRows.add(new Row(cardFragment(R.string.Bottoms, R.string.about_text)));
//        mRows.add(new Row(cardFragment(R.string.Shoes, R.string.cards_text),
//                cardFragment(R.string.expansion_title, R.string.expansion_text)));
//        mDefaultBg = new ColorDrawable(R.color.dark_grey);
//        mClearBg = new ColorDrawable(android.R.color.transparent);
//    }
//
//    LruCache<Integer, Drawable> mRowBackgrounds = new LruCache<Integer, Drawable>(3) {
//        @Override
//        protected Drawable create(final Integer row) {
//            int resid = BG_IMAGES[row % BG_IMAGES.length];
//            new DrawableLoadingTask(mContext) {
//                @Override
//                protected void onPostExecute(Drawable result) {
//                    TransitionDrawable background = new TransitionDrawable(new Drawable[] {
//                            mDefaultBg,
//                            result
//                    });
//                    mRowBackgrounds.put(row, background);
//                    notifyRowBackgroundChanged(row);
//                    background.startTransition(TRANSITION_DURATION_MILLIS);
//                }
//            }.execute(resid);
//            return mDefaultBg;
//        }
//    };
//
//    LruCache<Point, Drawable> mPageBackgrounds = new LruCache<Point, Drawable>(3) {
//        @Override
//        protected Drawable create(final Point page) {
//            // place bugdroid as the background at row 2, column 1
//            if (page.y == 2 && page.x == 1) {
//                int resid = R.drawable.macys_logo_small;
//                new DrawableLoadingTask(mContext) {
//                    @Override
//                    protected void onPostExecute(Drawable result) {
//                        TransitionDrawable background = new TransitionDrawable(new Drawable[] {
//                                mClearBg,
//                                result
//                        });
//                        mPageBackgrounds.put(page, background);
//                        notifyPageBackgroundChanged(page.y, page.x);
//                        background.startTransition(TRANSITION_DURATION_MILLIS);
//                    }
//                }.execute(resid);
//            }
//            return android.support.wearable.view.GridPagerAdapter.BACKGROUND_NONE;
//        }
//    };
//
//    private Fragment cardFragment(int titleRes, int textRes) {
//        Resources res = mContext.getResources();
//        CardFragment fragment =
//                CardFragment.create(res.getText(titleRes), res.getText(textRes));
//        // Add some extra bottom margin to leave room for the page indicator
//        fragment.setCardMarginBottom(
//                res.getDimensionPixelSize(R.dimen.card_margin_bottom));
//        return fragment;
//    }
//
//    static final int[] BG_IMAGES = new int[] {
//            R.drawable.mentops,
//            R.drawable.menbottoms,
//            R.drawable.menshoes
//    };
//
//    /** A convenient container for a row of fragments. */
//    private class Row {
//        final List<Fragment> columns = new ArrayList<Fragment>();
//
//        public Row(Fragment... fragments) {
//            for (Fragment f : fragments) {
//                add(f);
//            }
//        }
//
//        public void add(Fragment f) {
//            columns.add(f);
//        }
//
//        Fragment getColumn(int i) {
//            return columns.get(i);
//        }
//
//        public int getColumnCount() {
//            return columns.size();
//        }
//    }
//
//    @Override
//    public Fragment getFragment(int row, int col) {
//        Row adapterRow = mRows.get(row);
//        return adapterRow.getColumn(col);
//    }
//
//    @Override
//    public Drawable getBackgroundForRow(final int row) {
//        return mRowBackgrounds.get(row);
//    }
//
//    @Override
//    public Drawable getBackgroundForPage(final int row, final int column) {
//        return mPageBackgrounds.get(new Point(column, row));
//    }
//
//    @Override
//    public int getRowCount() {
//        return mRows.size();
//    }
//
//    @Override
//    public int getColumnCount(int rowNum) {
//        return mRows.get(rowNum).getColumnCount();
//    }
//
//    class DrawableLoadingTask extends AsyncTask<Integer, Void, Drawable> {
//        private static final String TAG = "Loader";
//        private Context context;
//
//        DrawableLoadingTask(Context context) {
//            this.context = context;
//        }
//
//        @Override
//        protected Drawable doInBackground(Integer... params) {
//            Log.d(TAG, "Loading asset 0x" + Integer.toHexString(params[0]));
//            return context.getResources().getDrawable(params[0]);
//        }
//    }
}
