package d2.hu.searchableapp;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SearchView;
import android.widget.ListAdapter;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    ActivityMainBinding activityMainBinding;
    ListAdapter adapter;

    List<String> arrayList= new ArrayList<>();





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        arrayList.add("January");
        arrayList.add("February");
        arrayList.add("March");
        arrayList.add("April");
        arrayList.add("May");
        arrayList.add("June");
        arrayList.add("July");
        arrayList.add("August");
        arrayList.add("September");
        arrayList.add("October");
        arrayList.add("November");
        arrayList.add("December");

        adapter= new SearchAdapter(arrayList);

//        activityMainBinding.listView.setAdapter(adapter);
//
//        activityMainBinding.search.setActivated(true);
//        activityMainBinding.search.setQueryHint("Type your keyword here");
//        activityMainBinding.search.onActionViewExpanded();
//        activityMainBinding.search.setIconified(false);
//        activityMainBinding.search.clearFocus();
//
//        activityMainBinding.search.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
//            @Override
//            public boolean onQueryTextSubmit(String query) {
//                return false;
//            }
//
//            @Override
//            public boolean onQueryTextChange(String newText) {
//
//                adapter.getFilter().filter(newText);
//
//                return false;
//            }
//        });
    }

}
