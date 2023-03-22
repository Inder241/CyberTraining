package com.example.cybertraining;

import static android.widget.LinearLayout.HORIZONTAL;

import static com.example.cybertraining.DbQuery.g_catList;
import static com.example.cybertraining.DbQuery.g_quesList;
import static com.example.cybertraining.DbQuery.g_selected_cat_index;
import static com.example.cybertraining.DbQuery.g_selected_test_index;
import static com.example.cybertraining.DbQuery.g_testList;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SnapHelper;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.AbsListView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.concurrent.TimeUnit;

public class QuestionsActivity extends AppCompatActivity {

    private RecyclerView questionsView;
    private TextView tvQuesID, timerTV, catNameTV;
    private Button submitB, markB, clearSelB;
    private ImageButton prevQuestB, nextQuestB;
    private ImageView quesListB;
    private int quesID;
    QuestionsAdapter quesAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);

        init();
         quesAdapter = new QuestionsAdapter(g_quesList);
        questionsView.setAdapter(quesAdapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        questionsView.setLayoutManager(layoutManager);

        setSnapHelper();

        setClickListener();

        startTimer();


    }

    private void init(){

        questionsView = findViewById(R.id.questions_view);
        tvQuesID = findViewById(R.id.tv_quesID);
        timerTV = findViewById(R.id.tv_timer);
        catNameTV = findViewById(R.id.qa_catName);
        submitB = findViewById(R.id.submitB);
        markB = findViewById(R.id.markB);
        clearSelB = findViewById(R.id.clear_selB);
        prevQuestB = findViewById(R.id.prev_quesB);
        nextQuestB = findViewById(R.id.next_quesB);
        quesListB = findViewById(R.id.ques_list_gridB);
        quesID = 0;

        tvQuesID.setText("1/" + String.valueOf(g_quesList.size())); //display itemID
        catNameTV.setText(g_catList.get(g_selected_cat_index).getName()); //display name

    }

    private void setSnapHelper()
    {
        SnapHelper snapHelper = new PagerSnapHelper();
        snapHelper.attachToRecyclerView(questionsView);

        questionsView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);

                View view = snapHelper.findSnapView(recyclerView.getLayoutManager());
                quesID = recyclerView.getLayoutManager().getPosition(view); //position of the view visible

                tvQuesID.setText(String.valueOf(quesID + 1) + "/" + String.valueOf(g_quesList.size()));


            }

            @Override
            public void onScrolled(@NonNull RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
            }
        });

    }

    private void setClickListener()
    {
        prevQuestB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (quesID > 0 )    //not the first question
                {
                    questionsView.smoothScrollToPosition(quesID -1);
                }
            }
        });

        nextQuestB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (quesID < g_quesList.size() -1)
                {
                    questionsView.smoothScrollToPosition(quesID + 1);
                }
            }
        });

        clearSelB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                g_quesList.get(quesID).setSelectedAns(-1);
                quesAdapter.notifyDataSetChanged();
            }
        });
    }

    private void startTimer()
    {
        long totalTime = g_testList.get(g_selected_test_index).getTime()*60*1000;

        CountDownTimer timer = new CountDownTimer(totalTime + 1000, 1000) {
            @Override
            public void onTick(long remainingTime) {
                String time = String.format("%02d:%02d min",
                        TimeUnit.MILLISECONDS.toMinutes(remainingTime),
                        TimeUnit.MILLISECONDS.toSeconds(remainingTime) -
                                TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(remainingTime))

                        );

                timerTV.setText(time);
            }

            @Override
            public void onFinish() {


            }
        };
        timer.start();

    }
}