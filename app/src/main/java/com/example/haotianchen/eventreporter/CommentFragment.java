package com.example.haotianchen.eventreporter;


import android.graphics.Color;
import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;




/**
 * A simple {@link Fragment} subclass.
 */
public class CommentFragment extends Fragment {
    private GridView mGridView;
    OnCommentSelectListener mCallback;
    // Container Activity must implement this interface
    public interface OnCommentSelectListener {
        public void OnCommentSelected(int position);
    }
    public CommentFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
// Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_comment, container, false);
        mGridView = (GridView) view.findViewById(R.id.comment_grid);
        mGridView.setAdapter(new EventAdapter(getActivity()));
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
//                getActivity(),
//                android.R.layout.simple_list_item_1,
//                getEventNames());
//
//        // Assign adapter to ListView.
//        mGridView.setAdapter(adapter);
//        mGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                mCallback.OnCommentSelected(i);
//            }
//        });

        return view;
    }

    // Change background color if the item is selected
    public void onItemSelected(int position){
        for (int i = 0; i < mGridView.getChildCount(); i++){
            if (position == i) {
                mGridView.getChildAt(i).setBackgroundColor(Color.BLUE);
            } else {
                mGridView.getChildAt(i).setBackgroundColor(Color.parseColor("#EEEEEE"));
            }
        }
    }
//    private String[] getEventNames() {
//        String[] names = {
//                "Event1", "Event2", "Event3",
//                "Event4", "Event5", "Event6",
//                "Event7", "Event8", "Event9",
//                "Event10", "Event11", "Event12"};
//        return names;
//
//    }



}
