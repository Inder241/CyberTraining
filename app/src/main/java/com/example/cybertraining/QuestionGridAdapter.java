package com.example.cybertraining;

import static com.example.cybertraining.DbQuery.ANSWERED;
import static com.example.cybertraining.DbQuery.NOT_VISITED;
import static com.example.cybertraining.DbQuery.REVIEW;
import static com.example.cybertraining.DbQuery.UNANSWERED;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import androidx.core.content.ContextCompat;

import org.w3c.dom.Text;

import java.net.ProtocolFamily;

public class QuestionGridAdapter extends BaseAdapter {
    private int numOfQues;

    public QuestionGridAdapter(int numOfQues) {
        this.numOfQues = numOfQues;
    }

    @Override
    public int getCount() {
        return numOfQues;
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
    public View getView(int i, View convertView, ViewGroup viewGroup) {
        View myview;
        if (convertView == null )
        {
            myview = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.ques_grid_item, viewGroup, false);
        } else
        {
            myview = convertView;
        }

        TextView queTV = myview.findViewById(R.id.ques_num);
        queTV.setText(String.valueOf(i+1));

        switch (DbQuery.g_quesList.get(i).getStatus())
        {
            case NOT_VISITED :
                            queTV.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(myview.getContext(),R.color.grey)));
                            break;

            case UNANSWERED:
                queTV.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(myview.getContext(),R.color.red)));
                break;
            case ANSWERED:
                queTV.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(myview.getContext(),R.color.green)));
                break;
            case REVIEW:
                queTV.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(myview.getContext(),R.color.purple_700)));
                break;

            default:
                break;

        }

        return myview;
    }
}
