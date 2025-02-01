package oms.warehouse;

import java.util.List;

public class WarehouseController {
    
    private List<Warehouse> warehouseList;
    private WarehouseSelectionStrategy warehouseSelectionStrategy;
    
    public void addWarehouse(Warehouse w) {
        warehouseList.add(w);
    }

    public void removeWarehouse(Warehouse w) {
        warehouseList.remove(w);
    }

    public Warehouse selectWarehouse() {
        return warehouseSelectionStrategy.selectWarehouse(warehouseList);
    }
}
