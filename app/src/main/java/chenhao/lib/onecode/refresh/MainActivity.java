package chenhao.lib.onecode.refresh;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import chenhao.lib.onecode.simplerefreshviewlibrary.LoadMoreRecyclerView;
import chenhao.lib.onecode.simplerefreshviewlibrary.PullToRefreshView;

public class MainActivity extends AppCompatActivity implements PullToRefreshView.OnRefreshListener{

    private PullToRefreshView refreshView;
    private LoadMoreRecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        refreshView=(PullToRefreshView)findViewById(R.id.refreshView);
        recyclerView=(LoadMoreRecyclerView)findViewById(R.id.recyclerView);
        refreshView.setOnRefreshListener(this);
        LinearLayoutManager layoutManager= new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);

    }

    @Override
    public void onRefresh() {
        refreshView.postDelayed(new Runnable() {
            @Override
            public void run() {
                refreshView.setRefreshing(false);
            }
        },2000);
    }

    @Override
    public void onRefreshStauts(int stauts) {

    }
}
