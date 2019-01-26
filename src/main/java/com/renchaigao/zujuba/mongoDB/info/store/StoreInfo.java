package com.renchaigao.zujuba.mongoDB.info.store;

import com.renchaigao.zujuba.dao.Store;
import com.renchaigao.zujuba.mongoDB.info.AddressInfo;
import com.renchaigao.zujuba.mongoDB.info.store.BusinessPart.StoreBusinessInfo;
import com.renchaigao.zujuba.mongoDB.info.store.EquipmentPart.StoreEquipmentInfo;
import com.renchaigao.zujuba.mongoDB.info.store.GoodsPart.StorePackageInfo;
import com.renchaigao.zujuba.mongoDB.info.store.HardwarePart.StoreHardwareInfo;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StoreInfo extends Store {

    private AddressInfo addressInfo = new AddressInfo();
    private StoreTeamInfo storeTeamInfo = new StoreTeamInfo();
    private StoreShoppingInfo storeShoppingInfo = new StoreShoppingInfo();
    private StoreEvaluationInfo storeEvaluationInfo = new StoreEvaluationInfo();
    private StorePackageInfo storePackageInfo = new StorePackageInfo();
    private StorePhotoInfo storePhotoInfo = new StorePhotoInfo();
    private StoreHardwareInfo storeHardwareInfo = new StoreHardwareInfo();
    private StoreEquipmentInfo storeEquipmentInfo = new StoreEquipmentInfo();
    private StoreIntegrationInfo storeIntegrationInfo = new StoreIntegrationInfo();
    private StoreBusinessInfo storeBusinessInfo = new StoreBusinessInfo();
    private StoreRankInfo storeRankInfo = new StoreRankInfo();

    public void setStoreAllInfoId() {
        this.addressInfo.setId(this.getId());
        this.storeTeamInfo.setId(this.getId());
        this.storeShoppingInfo.setId(this.getId());
        this.storeEvaluationInfo.setId(this.getId());
        this.storePackageInfo.setId(this.getId());
        this.storePhotoInfo.setId(this.getId());
        this.storeHardwareInfo.setId(this.getId());
        this.storeEquipmentInfo.setId(this.getId());
        this.storeIntegrationInfo.setId(this.getId());
        this.storeBusinessInfo.setId(this.getId());
        this.storeRankInfo.setId(this.getId());
        this.setAddressInfoId(addressInfo.getId());
        this.setStoreTeamInfoId(storeTeamInfo.getId());
        this.setStoreShoppingInfoId(storeShoppingInfo.getId());
        this.setStoreEvaluationInfoId(storeEvaluationInfo.getId());
        this.setStorePackageInfoId(storePackageInfo.getId());
        this.setStorePhotoInfoId(storePhotoInfo.getId());
        this.setStoreHardwareInfoId(storeHardwareInfo.getId());
        this.setStoreEquipmentInfoId(storeEquipmentInfo.getId());
        this.setStoreIntegrationInfoId(storeIntegrationInfo.getId());
        this.setStoreBusinessInfoId(storeBusinessInfo.getId());
        this.setStoreRankInfoId(storeRankInfo.getId());
    }
}
