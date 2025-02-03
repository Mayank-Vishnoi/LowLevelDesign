package models;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class BalanceSheet {
    private final Map<String, Double> balances = new HashMap<>(); // {friendId, amount that friend ows us}

    public void updateBalance(String userId, double amountOwed) {
        balances.put(userId, balances.getOrDefault(userId, 0.0) + amountOwed);
    }

    public Map<String, Double> getBalances() {
        return Collections.unmodifiableMap(balances);
    }
}
