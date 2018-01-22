package fr.wcs.simplelist;

import java.util.List;

import fr.wcs.simplelist.Models.CoinListModel;

/**
 * Contract between classes on how they can talk to each other without giving implementation details.
 * Created by apprenti on 22/01/18.
 */

public interface DataSourceInterface {

    List<CoinListModel> getListofData();
}
