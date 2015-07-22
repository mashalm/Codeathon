package com.example.b004235.macyswear;
/*
 * Copyright (C) 2014 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.wearable.view.WearableListView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;

public class MainActivity extends Activity {

    private static ArrayList<Integer> mIcons;
    private TextView mHeader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//         Sample icons for the list
        mIcons = new ArrayList<Integer>();
        mIcons.add(R.drawable.macys_icon_small1);
        mIcons.add(R.drawable.macys_icon_small1);
        mIcons.add(R.drawable.macys_icon_small1);
        mIcons.add(R.drawable.macys_icon_small1);
        mIcons.add(R.drawable.macys_icon_small1);
        mIcons.add(R.drawable.macys_icon_small1);
        mIcons.add(R.drawable.macys_icon_small1);
        mIcons.add(R.drawable.macys_icon_small1);
        mIcons.add(R.drawable.macys_icon_small1);

        // This is our list header
        mHeader = (TextView) findViewById(R.id.header);

        WearableListView wearableListView =
                (WearableListView) findViewById(R.id.wearable_List);
        wearableListView.setAdapter(new WearableAdapter(this, mIcons));
        wearableListView.setClickListener(mClickListener);
        wearableListView.addOnScrollListener(mOnScrollListener);
    }

    // Handle our Wearable List's click events
    private WearableListView.ClickListener mClickListener =
            new WearableListView.ClickListener() {
                @Override
                public void onClick(WearableListView.ViewHolder viewHolder) {
                    Intent intent = new Intent(MainActivity.this, MenActivity.class);
                    startActivity(intent);
                }

                @Override
                public void onTopEmptyRegionClick() {
                    Toast.makeText(MainActivity.this,
                            "Top empty area tapped", Toast.LENGTH_SHORT).show();
                }
            };

    // The following code ensures that the title scrolls as the user scrolls up
    // or down the list
    private WearableListView.OnScrollListener mOnScrollListener =
            new WearableListView.OnScrollListener() {
                @Override
                public void onAbsoluteScrollChange(int i) {
                    // Only scroll the title up from its original base position
                    // and not down.
                    if (i > 0) {
                        mHeader.setY(-i);
                    }
                }

                @Override
                public void onScroll(int i) {
                    // Placeholder
                }

                @Override
                public void onScrollStateChanged(int i) {
                    // Placeholder
                }

                @Override
                public void onCentralPositionChanged(int i) {
                    // Placeholder
                }
            };
}
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        // This is our list header
////        mHeader = (TextView) findViewById(R.id.header);
//
//        WearableListView wearableListView =
//                (WearableListView) findViewById(R.id.wearable_List);
//        wearableListView.setAdapter(new WearableAdapter(this, mIcons));
//        wearableListView.setClickListener(mClickListener);
//        wearableListView.addOnScrollListener(mOnScrollListener);
////        final Resources res = getResources();
////        final GridViewPager pager = (GridViewPager) findViewById(R.id.pager);
////        pager.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() {
////            @Override
////            public WindowInsets onApplyWindowInsets(View v, WindowInsets insets) {
////                // Adjust page margins:
////                //   A little extra horizontal spacing between pages looks a bit
////                //   less crowded on a round display.
////                final boolean round = insets.isRound();
////                int rowMargin = res.getDimensionPixelOffset(R.dimen.page_row_margin);
////                int colMargin = res.getDimensionPixelOffset(round ?
////                        R.dimen.page_column_margin_round : R.dimen.page_column_margin);
////                pager.setPageMargins(rowMargin, colMargin);
////
////                // GridViewPager relies on insets to properly handle
////                // layout for round displays. They must be explicitly
////                // applied since this listener has taken them over.
////                pager.onApplyWindowInsets(insets);
////                return insets;
////            }
////        });
////        pager.setAdapter(new GridPagerAdapter(this, getFragmentManager()));
////        DotsPageIndicator dotsPageIndicator = (DotsPageIndicator) findViewById(R.id.page_indicator);
////        dotsPageIndicator.setPager(pager);
//    }
//}
