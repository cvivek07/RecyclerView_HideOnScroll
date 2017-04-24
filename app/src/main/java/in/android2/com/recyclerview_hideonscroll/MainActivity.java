package in.android2.com.recyclerview_hideonscroll;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private RecyclerView mRecyclerView;
    private ArrayList<String> mDataList;
    private RecyclerViewAdapter mAdapter;
    private Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initToolbar();
        initRecView();
    }
    //method for initializing toolbar
    private void initToolbar() {
        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        mToolbar.setTitle("Hide/Show On Scroll");
    }
    //method for initializing recycler view
    private void initRecView() {
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mDataList = new ArrayList<String>();
        addDummmyData(mDataList);
        mAdapter = new RecyclerViewAdapter(this, mDataList);
        mRecyclerView.setAdapter(mAdapter);
    }
    // method to add dummy data to recycler view
    private void addDummmyData(ArrayList<String> mDataList) {
        for (int i =0; i< 100; i++){
            mDataList.add("Item "+ i);
        }
    }
}
