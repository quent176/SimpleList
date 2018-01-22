package fr.wcs.simplelist;

/**
 * Created by apprenti on 22/01/18.
 */

public class Controller {

    private ViewInterface mViewInterface;
    private DataSourceInterface mDataSourceInterface;

    public Controller(ViewInterface viewInterface, DataSourceInterface dataSourceInterface) {
        this.mViewInterface = viewInterface;
        this.mDataSourceInterface = dataSourceInterface;

        getListFromDataSource();
    }



    public void getListFromDataSource(){
        mViewInterface.setUpAdapterAndView(
            mDataSourceInterface.getListofData()
        );
    }

    public void onListItemClick(CoinListModel coinListModel){
        mViewInterface.startDetailsCoinActivity(
                coinListModel.getShortNameCoin(),
                coinListModel.getLongNameCoin(),
                coinListModel.getActualValueCoin(),
                coinListModel.getPhotoURLCoin()
        );
    }

}
