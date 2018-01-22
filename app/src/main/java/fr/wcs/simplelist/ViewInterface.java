package fr.wcs.simplelist;

import java.util.List;

import fr.wcs.simplelist.Models.CoinListModel;

/**
 * Created by apprenti on 22/01/18.
 */

public interface ViewInterface {

    void startDetailsCoinActivity(String shortNameCoin, String longNameCoin, String actualValueCoin, String photoURLCoin);

    void setUpAdapterAndView(List<CoinListModel> listOfDataCoin);
}
