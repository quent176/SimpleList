package fr.wcs.simplelist.UI;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

import fr.wcs.simplelist.Controllers.Controller;
import fr.wcs.simplelist.FakeDataSource;
import fr.wcs.simplelist.Models.CoinListModel;
import fr.wcs.simplelist.R;
import fr.wcs.simplelist.ViewInterface;

public class ListCoinActivity extends AppCompatActivity implements ViewInterface {

    private List<CoinListModel> listOfDataCoin;
    private LayoutInflater mLayoutInflater;
    private RecyclerView mRecyclerView;
    private CustomAdapter mCustomAdapter;

    private Controller mController;

    private static final String EXTRA_SHORTNAMECOIN = "EXTRA_SHORTNAMECOIN";
    private static final String EXTRA_LONGNAMECOIN = "EXTRA_LONGNAMECOIN";
    private static final String EXTRA_VALUECOIN = "EXTRA_VALUECOIN";
    private static final String EXTRA_PHOTOURLCOIN = "EXTRA_PHOTOURLCOIN";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_coin);

            mRecyclerView = findViewById(R.id.recycler_list_coin);
            mLayoutInflater = getLayoutInflater();

            mController = new Controller(this, new FakeDataSource());

    }

    @Override
    public void startDetailsCoinActivity(String shortNameCoin, String longNameCoin, String actualValueCoin, String photoURLCoin) {
        Intent i = new Intent(this, DetailsCoinActivity.class);
        i.putExtra(EXTRA_SHORTNAMECOIN, shortNameCoin);
        i.putExtra(EXTRA_LONGNAMECOIN, longNameCoin);
        i.putExtra(EXTRA_VALUECOIN, actualValueCoin);
        i.putExtra(EXTRA_PHOTOURLCOIN, photoURLCoin);

        startActivity(i);

    }

    @Override
    public void setUpAdapterAndView(List<CoinListModel> listOfDataCoin) {
        this.listOfDataCoin = listOfDataCoin;
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mCustomAdapter = new CustomAdapter();
        mRecyclerView.setAdapter(mCustomAdapter);
    }

    private class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.CustomViewHolder>  {

        @Override
        public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View v = mLayoutInflater.inflate(R.layout.item_list_coin, parent, false);
            return new CustomViewHolder(v);
        }

        @Override
        public void onBindViewHolder(CustomViewHolder holder, int position) {
        CoinListModel currentItem = listOfDataCoin.get(position);

            holder.shortNameCoin.setText(
                    currentItem.getShortNameCoin()
            );

            holder.longNameCoin.setText(
                    currentItem.getLongNameCoin()
            );

            holder.valueCoin.setText(
                    currentItem.getActualValueCoin()
            );

            Glide.with(ListCoinActivity.this)
                    .load(currentItem.getPhotoURLCoin())
                    .into(holder.photoURLCoin);


        }

        @Override
        public int getItemCount() {
            return listOfDataCoin.size();
        }

        class CustomViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

            private TextView shortNameCoin;
            private TextView longNameCoin;
            private TextView valueCoin;
            private ImageView photoURLCoin;

            private ViewGroup container;

            public CustomViewHolder(View itemView) {
                super(itemView);

                this.shortNameCoin = itemView.findViewById(R.id.list_coin_shortname);
                this.longNameCoin = itemView.findViewById(R.id.list_coin_longname);
                this.valueCoin = itemView.findViewById(R.id.list_coin_price);
                this.photoURLCoin = itemView.findViewById(R.id.list_coin_picture);
                this.container = itemView.findViewById(R.id.root_list_coin);

                this.container.setOnClickListener(this);
            }

            @Override
            public void onClick(View view) {
                CoinListModel coinListModel = listOfDataCoin.get(
                        getAdapterPosition()
                );

                mController.onListItemClick(
                        coinListModel
                );

            }
        }
    }

}
