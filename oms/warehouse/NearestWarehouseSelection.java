package oms.warehouse;

import java.util.List;

public class NearestWarehouseSelection implements WarehouseSelectionStrategy {

    @Override
    public Warehouse selectWarehouse(List<Warehouse> warehouseList) {
        // algorithm to pick the nearest warehouse wrt what? how to pass that?
        return warehouseList.get(0);
    }
}