package fr.wcs.simplelist;

import java.util.ArrayList;
import java.util.List;

import fr.wcs.simplelist.Models.CoinListModel;

/**
 * Created by apprenti on 22/01/18.
 */

public class FakeDataSource implements DataSourceInterface {

    private final String[] shortNameCoin = {
            "BTC",
            "ETH",
            "WAVES",
            "ETC",
            "USDT"
    };

    private final String[] longNameCoin = {
            "Bitcoin",
            "Ethereum",
            "Waves",
            "Ethereum Classic",
            "USD Tether"
    };

    private final String[] actualValueCoin = {
            "14000",
            "1050",
            "8,25",
            "23,30",
            "1,01"
    };

    private final String[] photoURLCoin = {
            "empty",
            "empty",
            "empty",
            "empty",
            "empty"
    };

    public FakeDataSource() {

    }

    @Override
    public List<CoinListModel> getListofData() {
        ArrayList<CoinListModel> listOfDataCoin = new ArrayList<>();

        for (int i = 0; i < shortNameCoin.length; i++){
            CoinListModel coinListModel = new CoinListModel(
            shortNameCoin[i],
            longNameCoin[i],
            actualValueCoin[i],
            photoURLCoin[i]
            );

            listOfDataCoin.add(coinListModel);
        }

        return listOfDataCoin;
    }
}
