package fr.wcs.simplelist.Models;

/**
 * Created by apprenti on 18/01/18.
 */

public class CoinHoldModel {

    private String shortNameCoin;
    private String longNameCoin;
    private String actualValueCoin;
    private String photoURLCoin;

    public CoinHoldModel(String shortNameCoin, String longNameCoin, String actualValueCoin, String photoURLCoin) {
        this.shortNameCoin = shortNameCoin;
        this.longNameCoin = longNameCoin;
        this.actualValueCoin = actualValueCoin;
        this.photoURLCoin = photoURLCoin;
    }

    public CoinHoldModel(){
        //For Firebase
    }

    public String getShortNameCoin() {
        return shortNameCoin;
    }

    public void setShortNameCoin(String shortNameCoin) {
        this.shortNameCoin = shortNameCoin;
    }

    public String getLongNameCoin() {
        return longNameCoin;
    }

    public void setLongNameCoin(String longNameCoin) {
        this.longNameCoin = longNameCoin;
    }

    public String getActualValueCoin() {
        return actualValueCoin;
    }

    public void setActualValueCoin(String actualValueCoin) {
        this.actualValueCoin = actualValueCoin;
    }

    public String getPhotoURLCoin() {
        return photoURLCoin;
    }

    public void setPhotoURLCoin(String photoURLCoin) {
        this.photoURLCoin = photoURLCoin;
    }

}
