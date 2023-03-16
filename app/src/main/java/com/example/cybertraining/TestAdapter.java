package com.example.cybertraining;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class TestAdapter extends RecyclerView.Adapter<TestAdapter.ViewHolder> {

    private final List<TestModel> testList;

    public TestAdapter(List<TestModel> testList) {
        this.testList = testList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.test_item_layout,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        int progress = testList.get(position).getTopScore();
        holder.setData(position,progress);
    }

    @Override
    public int getItemCount() {
        return testList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView testNo;
        private final TextView topScore;
        private final ProgressBar progressBar;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            testNo = itemView.findViewById(R.id.testNo);
            topScore = itemView.findViewById(R.id.scoretext);
            progressBar = itemView.findViewById(R.id.testProgressBar);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(itemView.getContext(), QuestionsActivity.class);
                    itemView.getContext().startActivity(intent);
                }
            });
        }
        private void setData(int pos, int progress){
            testNo.setText("Test No:" + (pos + 1));
            topScore.setText(progress + "%");

            progressBar.setProgress(progress);
        }
    }
}
