package fr.wcs.simplelist;

import android.app.LauncherActivity;

import java.util.List;

/**
 * Created by apprenti on 22/01/18.
 */

public interface ViewInterface {

    void startDetailsCoinActivity(String shortNameCoin, String longNameCoin, String actualValueCoin, String photoURLCoin);

    void setUpAdapterAndView(List<CoinListModel> listOfDataCoin);
}
